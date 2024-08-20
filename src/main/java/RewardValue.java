public class RewardValue {
    private double cashValue;
    private static double rate=0.0035;


    public RewardValue(double cashValue) {
        this.cashValue=cashValue;

    }
    public RewardValue(int milesValue) {
        this.cashValue=converttoCash(milesValue);

    }
    private static int converttoMiles(double cashValue){
        return (int) (cashValue/rate);
    }
    private static double converttoCash(int milesValue) {
        return milesValue * rate;
    }

    public double getMilesValue() {
        return converttoMiles(cashValue);
    }
    public double getCashValue(){
        return cashValue;
    }
}