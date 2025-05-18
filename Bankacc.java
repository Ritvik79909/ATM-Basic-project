package project;

public class Bankacc {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    public Bankacc() {
        super();
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getDepositAmount() {
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
    public double getWithdrawAmount() {
        return withdrawAmount;
    }
    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    @Override
    public String toString() {
        return "Bankacc [balance=" + balance + ", depositAmount=" + depositAmount + ", withdrawAmount=" + withdrawAmount
                + "]";
    }
    
    
    
}
