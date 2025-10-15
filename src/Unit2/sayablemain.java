package Unit2;

public class sayablemain {
    public static void main(String[] args) {
        sayablemethodreference Sayablemethodreference = new sayablemethodreference();
        sayableinterface sayable = Sayablemethodreference::saySomething;
        sayable.say();
        sayable.sayMore();
        sayableinterface.sayless();
//        sayable.sum();
    }
}
