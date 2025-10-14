package Unit2;

public class Messageconstructerreference {
    public static void main(String[] args) {
        Messageinterface hello = Messageclass::new;
        hello.getMessage("Hello!!");
    }
}
