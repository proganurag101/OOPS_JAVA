public class Student{
    static String name = "Abc"; //when we declare a data member static it belongs to the class and not any object.
    byte age = 6;
    String grade = "1st";
    
    public void displayDetails(){
        System.out.println("Student "+name+" is "+age+" years old and in "+grade+" grade.");

    }
    public static void doThis(){
        System.out.println("yo i am static!");    }

}
    
