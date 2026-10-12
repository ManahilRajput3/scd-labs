public class ReportUtil {

    /** Returns the average of an array of numeric scores. */
    public static double calculateAverage(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    /** Prints a short summary for an array of scores. */
    public static void printReport(int[] scores) {
        double average = calculateAverage(scores);
        System.out.println("Number of scores: " + scores.length);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        int[] studentScores = {64, 81, 97, 73, 88};
        printReport(studentScores);
    }
}
