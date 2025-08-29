public class mybank {
    public static void main(String[] args) {
        Bank b=new Bank();
        try{
            b.withdrawl(12000);
        }
        catch (Insuffisientbalanceexception e){
            System.out.println(e.getMessage());
        }
    }
}
