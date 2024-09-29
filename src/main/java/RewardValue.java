public class RewardValue {

    private double cashValue;
    private double mileValue;
    final private double mileConversionRate = 0.0035;

    public RewardValue(double cash) {
        cashValue = cash;
        mileValue = cashValue * mileConversionRate;

    }

    public RewardValue(int miles) {
        mileValue = miles;
        cashValue = miles / mileConversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return mileValue;
    }

}