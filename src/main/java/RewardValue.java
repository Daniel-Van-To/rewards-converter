public class RewardValue {

    private double cashValue;
    private double mileValue;
    final private double mileConversionRate = 0.0035;

    public RewardValue(double cash) {
        cashValue = cash;
        mileValue = cashValue * mileConversionRate;

    }

    public RewardValue(float miles) {
        mileValue = miles;
        cashValue = 0;
    }

    private double getCashValue() {
        return cashValue * mileConversionRate;
    }

    public double getMilesValue() {
        return mileValue;
    }

}
