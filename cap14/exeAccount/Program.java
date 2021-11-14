package cap14.exeAccount;

public class Program {
    public static void main(String[] args) {
        
        Account acc = new Account(01, "Mary", 20.0);
        
        //Upcasting
        Account ac1 = new BusinessAccount(02, "Anna", 23.3, 300.0);
        Account ac2 = new SavingsAccount(12, "Joe", 250.0, 0.5);

        //Downcasting
        BusinessAccount ac3 = (BusinessAccount)ac1;
    }
}
