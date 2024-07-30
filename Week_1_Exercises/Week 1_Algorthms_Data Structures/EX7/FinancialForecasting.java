public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        // Base case: if periods are 0, return the current value
        if (periods == 0) {
            return currentValue;
        }
        // Recursive case: calculate the value for the next period
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0; // Example current value
        double growthRate = 0.05; // Example growth rate of 5%
        int periods = 10; // Example number of periods (years)

        double futureValue = calculateFutureValue(currentValue, growthRate, periods);
        System.out.println("The future value is: " + futureValue);
    }
}
