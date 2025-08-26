public final class A {// can never be static
//    static int bread=10;
//    static{
//        System.out.println("hi");
//    }
//    public static void display(){
//        System.out.println("Slices Remaining "+bread);
//    }
//    public static void eat(){
//        bread--;
//    }

//    public static class{
//        protected void display(){
//            System.out.println("Nested class B");
//        }
//    }

    final int x;
    A(){
        x=23;
    }

    public final void display(){
        System.out.println("I am in class A ");
    }
}
