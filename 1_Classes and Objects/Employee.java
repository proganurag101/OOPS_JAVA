public class Employee{
    String empName;
    int empId;
    int empSal;
    public void disBonus(float salary){     //This function can be called from inside as well as outside from another class.
        System.out.println("Bonus: "+salary*0.20);

    }




}
