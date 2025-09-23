package Unit1;

import java.io.DataInputStream;
import java.io.IOException;

public class Myexception {
        public static void main(String[] args)throws IOException {
            int x,y,z=0;
            //Scanner sc=new Scanner(System.in);
            DataInputStream dis=new DataInputStream(System.in);
//            try{
                x=dis.readInt();
                y=dis.readInt();
                z=x/y; //Exception
                System.out.println("Exception not occur");
            //}

//            catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//            finally{
//                System.out.println("Result is "+z);
//            }
        }
    }
