import java.util.Comparator;
import java.util.List;

public class BirthdayCakeCandles {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        int countTallest = 0;
        int sizeOfList = candles.size();

        candles.sort(Comparator.naturalOrder());
        int tallestCandle = candles.get(sizeOfList - 1);

        for (Integer candle : candles) {
            if (candle == tallestCandle) {
                countTallest++;
            }
        }

        return countTallest;
    }
}
