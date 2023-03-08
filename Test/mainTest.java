import java.sql.Time;

public class mainTest {
    public static void main(String[] args) {
        TimeConversion timeConversion = new TimeConversion();

        System.out.println(timeConversion.timeConversion("12:45:54PM"));
    }
}