import java.util.ArrayList;
import java.util.List;

public class mainTest {
    public static void main(String[] args) {

        PlusMinus plusMinus = new PlusMinus();

        List<Integer> arrList = new ArrayList<>();

        //-4 3 -9 0 4 1
        arrList.add(-4);
        arrList.add(3);
        arrList.add(-9);
        arrList.add(0);
        arrList.add(4);
        arrList.add(1);


        plusMinus.solution(arrList);

    }
}