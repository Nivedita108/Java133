package Unit1;

public class Userdefinedexception {
    public void validate(int age) throws Invalidexception{
        if (age<18)
            throw new Invalidexception("Cannot caste vote, Age less than 18!");
        else
            System.out.println("Eligible to vote");
    }
}
