package Unit1;

public class MypersonMain {
    public static void main(String[] args) {
        Person p=new Person("Ghaziabad");
        p.getAddress();
        SchoolStudent st=new SchoolStudent("Ghaziabad", "Btech");
        st.getAddress();
        st.getCourse();
    }
}
