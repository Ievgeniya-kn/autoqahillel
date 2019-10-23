package homework02;

public class MultipleChoiceTestScore {
    public static void main(String[] args) {

        int totalTest = 123;
        double passedTest = 95;
        double failedTest = 28;

        double percentPassedTests;
        double percentFailedTests;

        percentPassedTests = passedTest / totalTest * 100;
        percentFailedTests = failedTest / totalTest * 100;

        System.out.println("Result: passed " + percentPassedTests +
                "%, failed " + percentFailedTests + "%");


    }
}
