
class work_proj{
   
    public static void main(String[] args) {
        Employee emp1 = new Employee();  //create an object
        emp1.empName = "Guru1";          //call data members/property/attributes of class through their objects and initialise them
        emp1.empId = 01;
        emp1.empSal = 1000;
        System.out.println("name: "+emp1.empName+" Id: "+emp1.empId+" Salary: "+emp1.empSal); //can also be called  through a method in Employee class.
        emp1.disBonus(emp1.empSal);  

        Employee emp2 = new Employee();
        emp2.empName = "Guru2";
        emp2.empId = 02;
        emp2.empSal = 2000;
        System.out.println("name: "+emp2.empName+" Id: "+emp2.empId+" Salary: "+emp2.empSal);
        emp2.disBonus(emp1.empSal);


        




    }
}
