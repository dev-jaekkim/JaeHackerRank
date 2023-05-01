import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> finalGrades = new ArrayList<>();

        Integer student = grades.size();

        for (int i = 0; i < student; i++) {

            Integer grade = grades.get(i);

            int throughAwayGrade = grade % 5;

            if (throughAwayGrade > 2) {

                int calculatedGrade = ((grade / 5) + 1) * 5;

                if(calculatedGrade < 40) {
                    calculatedGrade = grade;
                }

                finalGrades.add(calculatedGrade);

            } else {
                finalGrades.add(grade);
            }
        }

        return finalGrades;
    }
}
