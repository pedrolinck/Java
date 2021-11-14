package cap14.exeAccount;

public class BusinessAccount extends Account {
    
    private double loanLimit;

    public BusinessAccount(){
        
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            deposit(amount);
        }
    }   
}
