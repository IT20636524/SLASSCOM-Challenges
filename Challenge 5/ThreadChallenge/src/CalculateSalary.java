public class CalculateSalary {
    private double perDayPayment;
    private int noOfDays;
    private double basicSalary;
    private double allowances;
    private double epf;
    private double finalSalary;
    private double employerContribution;

    public CalculateSalary(double perDayPayment, int noOfDays) {
        this.perDayPayment = perDayPayment;
        this.noOfDays = noOfDays;
    }

    public void calculate() throws InterruptedException {

        basicSalary = perDayPayment * noOfDays; // main thread calculation

        Thread thread2 = new Thread(() -> allowances = basicSalary * 0.05); // thread 2 calculation
        thread2.join();

        Thread thread3 = new Thread(() -> { // thread 3 calculation
            double totalMonthlyEarnings = basicSalary + allowances;
            epf = totalMonthlyEarnings * 0.08;

            employerContribution = totalMonthlyEarnings * 0.12; // calculate employer Contribution
        });
        thread3.start();
        thread3.join();

        finalSalary = basicSalary + allowances + epf; // main thread calculate final Salary
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public double getEmployerContribution() {
        return employerContribution;
    }
}
