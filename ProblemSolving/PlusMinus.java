import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void solution(List<Integer> arr) {
        // Write your code here

        Integer size = arr.size();

        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        List<Integer> zeroes = new ArrayList<>();

        for (int i = 0 ; i < size ; i++) {
            Integer value = arr.get(i);
            if (value > 0 ) {
                positives.add(value);
            }

            if(value < 0) {
                negatives.add(value);
            }

            if(value == 0) {
                zeroes.add(value);
            }

        }

        System.out.println(String.format("%4f",positives.size()/(double)size));
        System.out.println(String.format("%4f",negatives.size()/(double)size));
        System.out.println(String.format("%4f",zeroes.size()/(double)size));

    }
}
