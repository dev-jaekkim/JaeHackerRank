package ProblemSolving;

public class DiagonalDifference {
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public void staircase(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0 ; j < n ; j++) {
                if(n-i <= j) {
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
        }


    }
}