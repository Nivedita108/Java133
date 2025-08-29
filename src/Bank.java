public class Bank {
    private int balance=10000;
    public void withdrawl(int amount){
        if(amount>balance){
            throw new Insuffisientbalanceexception("Cannot withdraw amount greater than Balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawl Successfull, Remaining balance "+balance);
        }
    }
}
