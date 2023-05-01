import java.util.ArrayList;
import java.util.List;

public class mainTest {
    public static void main(String[] args) {

        GradingStudents gradingStudents = new GradingStudents();

        List<Integer> grades = new ArrayList<>();

        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> finalGrades = gradingStudents.gradingStudents(grades);

        for(Integer g : finalGrades) {
            System.out.println(g);
        }

    }
}