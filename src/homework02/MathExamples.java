package homework02;

public class MathExamples {
    public static void main(String[] args) {

        double x = 0.4;
        double example23, example26, example17, example21, example19;

        example17 = Math.pow(x, 3) / 3 - Math.pow(Math.E, x) * Math.log(Math.abs(Math.pow(1.3, x) +
                Math.pow(x, 3))) + 4.0 / 3;
        System.out.println("Answer for example 17: " + example17);

        example19 = Math.acos(Math.tan(5 * x / Math.PI)) + Math.pow(x, 3.2) / 28;
        System.out.println("Answer for example 19: " + example19);

        // No valid x for this expression 21
        //limitation log10 is valid for x >1
        //limitation acos(x) is valid for [-1;1]
        example21 = (
                Math.pow(Math.log10(x), 1.0 / 4) + Math.acos(x + 3)
        ) / Math.abs(x + 2 * Math.pow(x, 2));
        System.out.println("Answer for example 21: " + example21);

        example23 = Math.acos(Math.tan((5 * x) / Math.PI)) + (Math.pow(x, 5.7) / 23);
        System.out.println("Answer for example 23: " + example23);

        example26 = Math.log(Math.abs(Math.sin(x))) + 2 * Math.pow(Math.E, x) +
                2 * Math.cos(Math.abs(x)) + 2;
        System.out.println("Answer for example 26: " + example26);
    }
}
