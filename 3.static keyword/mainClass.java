
class first_proj{



    public static void main(String[] args) {
        Student sk1 = new Student();
        Student sk2 = new Student();

        sk1.age = 7;
        sk1.grade = "2nd";
        Student.name = "Rob"; //after declaring name data member static it belongs to the class hence we can access it directly by class name.

        Student.doThis();//after declaring static this method belongs to the class and not any object.
        

        sk2.age = 8;
        sk2.grade = "3rd";
        Student.name = "Shyam";
        Student.doThis();

        sk1.displayDetails();
        sk2.displayDetails();





    }
}
