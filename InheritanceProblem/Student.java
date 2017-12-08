package InheritanceProblem;

/**
 *
 * @author hrishimane
 */
public class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0, a = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
        }
        a = sum / testScores.length;
        if (a >= 90 && a <= 100) {
            return 'O';
        } else if (a >= 80 && a < 90) {
            return 'E';
        } else if (a >= 70 && a < 80) {
            return 'A';
        } else if (a >= 55 && a < 70) {
            return 'P';
        } else if (a >= 40 && a < 55) {
            return 'D';
        } else {
            return 'T';
        }

    }

}
