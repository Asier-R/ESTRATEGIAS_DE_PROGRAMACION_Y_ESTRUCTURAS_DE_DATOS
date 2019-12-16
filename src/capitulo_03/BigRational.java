package capitulo_03;

import java.math.BigInteger;

public class BigRational {
    /*-- VARIABLES ---------------------------------------------------------------------------------------------------*/
    public static final BigRational ZERO = new BigRational();
    public static final BigRational ONE = new BigRational("1");

    public BigInteger num; // solo esto puede ser negativo
    public BigInteger den; // nunca negativo
    /*----------------------------------------------------------------------------------------------------------------*/
    /*-- CONSTRUCTORES -----------------------------------------------------------------------------------------------*/
    public BigRational(){
        this(BigInteger.ZERO);
    }

    public BigRational(BigInteger n){
        this(n,BigInteger.ONE);
    }

    public BigRational(BigInteger n, BigInteger d){
        num = n;
        den = d;
        check00();
        fixSigns();
        reduce();
    }

    public BigRational(String str){
        if(str.length()==0)
            throw new IllegalArgumentException("Zero-length string");

        // Buscar '/'
        int slashIndex = str.indexOf('/');
        if(slashIndex == -1){
            num = new BigInteger(str.trim());
            den  = BigInteger.ONE; // No hay denominador...usar 1
        }else{
            num = new BigInteger(str.substring(0,slashIndex).trim());
            den = new BigInteger(str.substring( slashIndex + 1).trim());
            check00();
            fixSigns();
            reduce();
        }
    }
    /*----------------------------------------------------------------------------------------------------------------*/
    /*-- METODOS DE CONTROL ------------------------------------------------------------------------------------------*/
    private void check00(){
        if(num.equals(BigInteger.ZERO) && den.equals(BigInteger.ZERO))
            throw new ArithmeticException("ZERO DIVIDED BY ZERO");
    }

    private void fixSigns(){
        if(den.compareTo(BigInteger.ZERO) < 0){
            num = num.negate();
            den = den.negate();
        }
    }

    private void reduce(){
        BigInteger gcd = num.gcd(den);
        num = num.divide(gcd);
        den = den.divide(gcd);
    }
    /*----------------------------------------------------------------------------------------------------------------*/
    /*-- METODOS DE SIGNO ------------------------------------------------------------------------------------------*/
    public BigRational abs(){
        return new BigRational(num.abs(), den);
    }

    public BigRational negate(){
        return new BigRational(num.negate(), den);
    }
    /*----------------------------------------------------------------------------------------------------------------*/
    /*-- METODOS ARITMETICOS -----------------------------------------------------------------------------------------*/
    public BigRational add(BigRational other){
        BigInteger newNumerator = num.multiply(other.den).add(other.num.multiply(den));
        BigInteger newDenominator = den.multiply(other.den);

        return new BigRational(newNumerator, newDenominator);
    }

    public BigRational substract(BigRational other){
        return add(other.negate());
    }

    public BigRational multiply(BigRational other){
        BigInteger newNumer = num.multiply(other.num);
        BigInteger newDenom = den.multiply(other.den);

        return new BigRational(newNumer, newDenom);
    }

    public BigRational divide(BigRational other){
        BigInteger newNumer = num.multiply(other.den);
        BigInteger newDenom = den.multiply(other.num);

        return new BigRational(newNumer, newDenom);
    }
    /*----------------------------------------------------------------------------------------------------------------*/
    /*-- METODOS DE FORMATO ------------------------------------------------------------------------------------------*/
    public boolean equals(Object other){
        if(!(other instanceof BigRational))
            return false;

        BigRational rhs = (BigRational) other;

        return num.equals(rhs.num) && den.equals(rhs.den);
}

    public String toString(){
        if(den.equals(BigInteger.ZERO))
            if(num.compareTo(BigInteger.ZERO) < 0)
                return "-infinity";
            else
                return "infinity";

        if(den.equals(BigInteger.ONE))
            return num.toString();
        else
            return num + "/" + den;
    }
    /*----------------------------------------------------------------------------------------------------------------*/
}
