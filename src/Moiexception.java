public class Moiexception {
    public static void main(String[] args) {
        Userdefinedexception udf=new Userdefinedexception();
        try{
            udf.validate(18);
        }
        catch (Invalidexception e) {
            System.out.println(e.getMessage());
        }
    }
}
