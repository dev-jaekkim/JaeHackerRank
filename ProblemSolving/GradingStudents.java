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
        // Write your code here

        // 4 73 67 38 33

        List<Integer> finalGrades = new ArrayList<>();

        Integer student = grades.get(0);

        for(int i = 1 ; i <= student ; i++) {

            Integer grade = grades.get(i);
            //System.out.println("처음 들어가는 grade : "+ grade);

            if (grade  < 40) {
                finalGrades.add(40);
                //System.out.println("40 보다 작아서 40");

            } else {

                int throughAwayGrade = grade % 5;

                if (throughAwayGrade > 2) {
                   finalGrades.add((( grade / 5 ) + 1 ) * 5);
                    //System.out.println(grade);

                } else {
                    finalGrades.add(grade);
                    //System.out.println((( grade / 5 ) + 1 )* 5);

                }
            }


        }

        return finalGrades;
    }
}
