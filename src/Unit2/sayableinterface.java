package Unit2;

public interface sayableinterface {
    default void sayMore(){
        System.out.println("Hello pretty people!!");
    }
    void say();
    static void sayless(){
        System.out.println("YOOOOOOHOOOOOOOOOOOOOOO!!!");
    }
}


