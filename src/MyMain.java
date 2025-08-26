public class MyMain {
    public static void main(String[] args){
        Student s1 = new Student(12, "Krish");
        Student s2 = new Student(s1);
//        Student s2=s1;
//
//        s1.name = "Krish Sh.";
//        s1.roll_no=33;
        s1.display();
//        s1.name = "Abhishek";
        s2.display();
    }
}
