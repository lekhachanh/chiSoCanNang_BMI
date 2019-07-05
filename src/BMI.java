public class BMI {
    public static void main(String[] args) {
        double weight, height;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Input your weight: ");
        weight = input.nextDouble();
        System.out.println("Input your height: ");
        height = input.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("UnderWeight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("OverWeight");
        } else {
            System.out.println("Obese");
        }
    }
}
