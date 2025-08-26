//abstract class Student1 {
//    String name;
//    int roll_no;
//
//    public Student1(String name, int roll_no) {
//        this.name = name;
//        this.roll_no = roll_no;
//    }
//
//
//    abstract void attend_class();
//    abstract void give_exam();
//
//}

public class Student1{
    private String grade;
    public int roll_no;
    public String name;
    public Student1(String grade, String name, int roo_no) {
        this.grade = grade;
        this.roll_no = roll_no;
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
