import java.util.*;
public class StudentMain{
    
    public static void main (String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student's Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter Student's address:");
        String address = sc.nextLine();
        
        boolean isFrom=false;
        String Input = "";
        while(true){
             
             System.out.println("Whether the student is from NIT(Yes/No):");
             Input = sc.nextLine();
             if(Input.equals("Yes") || Input.equals("YES")){
                 isFrom=true;
                 break;
             }else if(Input.equals("No") || Input.equals("NO")){
                 isFrom=false;
                 break;
             }else{
                 System.out.println("Wrong Input");
             }
        }
        Student s1;
       
        if(isFrom){
             s1 = new Student(id,name,address);
        }else{
            System.out.println("Enter the college name:");
            String cName=sc.nextLine();
             s1 = new Student(id,name,address,cName);
        }
    
        System.out.println("Student id:"+s1.getStudentId());
        System.out.println("Student name:"+s1.getStudentName());
        System.out.println("Student Address:"+s1.getStudentAddress());
        System.out.println("College name:"+s1.getCollegeName());
        
        
        
    }
        
        
        
        
        
        
}
