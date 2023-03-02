import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {

    public void miniMaxSum(List<Integer> arr) {
        /** given 5 digits, find the sum of four numbers min and max value
         * need to print them in the same line, min value at first and then the max value
         * {1,2,3,4,5}
         */

        arr.sort(Comparator.naturalOrder());

        BigInteger minSum = BigInteger.ZERO;
        BigInteger maxSum = BigInteger.ZERO;

        for ( int i = 0 ; i < 4 ; i ++) {
            minSum = minSum.add(BigInteger.valueOf(arr.get(i)));
        }

        for ( int i = 4 ; i > 0 ; i --) {
            maxSum = maxSum.add(BigInteger.valueOf(arr.get(i)));
        }

        System.out.print(minSum + " " + maxSum);
    }
}
