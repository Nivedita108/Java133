
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception {
    public static void main(String[] args){
        int x,y,z=0;
        Scanner sc=new Scanner(System.in);
        try{
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y; //Exception
            System.out.println("Exception not occur");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Result is "+z);
        }
    }
}
