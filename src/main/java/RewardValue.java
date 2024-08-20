public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static double rate=0.0035;


    public RewardValue(double cashValue) {
        this.cashValue=cashValue;
        this.milesValue=cashValue/rate;
    }

    public RewardValue(double milesValue,boolean miles) {
        if(miles){
            this.cashValue =milesValue*rate;
            this.milesValue = milesValue;
        }
    }

    public double getMilesValue() {
        return milesValue;
    }
    public double getCashValue(){
        return cashValue;
    }
}