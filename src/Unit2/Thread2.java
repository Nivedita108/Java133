package Unit2;

public class Thread2 extends Thread{
    public void run() {
        for (int i=1;i<10;i++){
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if(i%2!=0)
                System.out.println(i);
        }
    }
}
