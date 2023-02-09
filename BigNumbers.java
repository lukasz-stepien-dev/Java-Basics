import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args)
    {
        BigInteger bigNum = BigInteger.valueOf(100);
        BigInteger constBigNum = BigInteger.TWO;
        BigInteger reallyBigNum = new BigInteger("1000000000000000000000000000000000");
        System.out.println(bigNum);
        System.out.println(constBigNum);
        System.out.println(reallyBigNum);
        System.out.println(bigNum + " + " + constBigNum + " - " + reallyBigNum + " = " + (reallyBigNum.subtract(bigNum.add(constBigNum))));
    }
}
