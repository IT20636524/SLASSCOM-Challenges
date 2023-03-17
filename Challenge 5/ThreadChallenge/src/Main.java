import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        double perDayPayment;
        int noOfDays;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Per Day Payment: ");
        perDayPayment = scanner.nextDouble();

        System.out.print("Enter Number Of Days: ");
        noOfDays = scanner.nextInt();

        CalculateSalary calculateSalary = new CalculateSalary(perDayPayment, noOfDays);
        calculateSalary.calculate();
        System.out.println("Employer Contribution: "+ calculateSalary.getEmployerContribution());
        System.out.println("Final Salary: " + calculateSalary.getFinalSalary());


    }
}