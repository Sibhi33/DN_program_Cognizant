package week1DSA.FinancialForecastApp.code;
public class FinancialForecast {

    public static double forecastValueRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return forecastValueRecursive(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static double forecastValueMemoized(double currentValue, double growthRate, int years) {
        double[] memo = new double[years + 1];
        memo[0] = currentValue;
        for (int i = 1; i <= years; i++) {
            memo[i] = memo[i - 1] * (1 + growthRate);
        }
        return memo[years];
    }

    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.08;
        int years = 5;

        double resultRecursive = forecastValueRecursive(initialValue, growthRate, years);
        double resultMemoized = forecastValueMemoized(initialValue, growthRate, years);

        System.out.println("Recursive Forecast after " + years + " years: $" + resultRecursive);
        System.out.println("Memoized Forecast after " + years + " years: $" + resultMemoized);
    }
}
