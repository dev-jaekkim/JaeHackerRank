package EliceCoding;

public class EuclideanAlgorithm {

    public int getGreatCommonDivisor(int num1 , int num2) {

        int remain = 1;

        while (remain != 0) {
            remain = num1 % num2;
            num1 = num2;
            num2 = remain;
            System.out.println("remain: " + remain + " num1 : " + num1 + " num2 :" + num2);
        }

        return num1;
    }

    public static void main(String[] args) {
        EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm();

        System.out.println(euclideanAlgorithm.getGreatCommonDivisor(2, 6));
    }

}
