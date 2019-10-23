package homework02;
import java.util.Scanner;

public class MarksConversions {

    public static void main(String[] args) {

        double percentMarkedTest;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter total tests");
        int totalTest = in.nextInt();

        System.out.println("Enter marked tests");
        float totalMarkedTest = in.nextFloat();

        percentMarkedTest = totalMarkedTest / totalTest *100;
        System.out.println("Result: "+ percentMarkedTest +"%");
    }
}
