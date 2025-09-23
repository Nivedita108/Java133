package Unit3;


import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Studentt> al=new ArrayList<>();
        al.add(new Studentt(20,"Abhi",100));
        al.add(new Studentt(21,"Hari",101));
        al.add(new Studentt(22,"Ravi",102));
        al.add(new Studentt(23,"Raju",103));
        al.add(new Studentt(24,"Nikhil",104));
        Collections.sort(al);
        for(Studentt st: al){
            System.out.println("Name "+st.name+"Age "+st.age+"Roll "+st.roll_no);
        }
    }
}
