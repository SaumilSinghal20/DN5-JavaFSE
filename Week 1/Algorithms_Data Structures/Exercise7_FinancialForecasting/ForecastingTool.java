public class ForecastingTool {

    // Simple recursive function to predict future value
    // Formula roughly: FV = PV * (1 + growthRate)^years
    public static double predictFutureValue(double currentVal, double growthRate, int years) {
        // Base case: 0 years left, value doesn't change
        if (years == 0) {
            return currentVal;
        }
        
        // recursive call: calculate value for 1 year, and pass to remaining years
        double nextYearVal = currentVal + (currentVal * growthRate);
        return predictFutureValue(nextYearVal, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double annualGrowthRate = 0.05; // 5% growth
        int yearsToPredict = 10;
        
        double fv = predictFutureValue(presentValue, annualGrowthRate, yearsToPredict);
        
        System.out.println("Current value: $" + presentValue);
        System.out.println("Predicted value after " + yearsToPredict + " years at 5% growth: $" + String.format("%.2f", fv));
    }
}
