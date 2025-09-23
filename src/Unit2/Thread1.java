package Unit2;

public class Thread1 extends Thread{
    public void run()
    {
        for(int i=1; i<10;i++){
            try{
                Thread.sleep(10000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            if(i%2==0)
                System.out.println(i);
        }
    }
}
