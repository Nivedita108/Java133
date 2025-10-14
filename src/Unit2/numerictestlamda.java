package Unit2;

public class numerictestlamda {
    public static void main(String[] args) {
        Interfacenumerictest isEven = (int n) -> n%2==0;
        System.out.println(isEven.test(12));
    }
}
