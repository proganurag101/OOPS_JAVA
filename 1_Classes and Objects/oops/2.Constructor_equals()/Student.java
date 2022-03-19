public class Student{
    private int studentId;
    private  String studentName;
    private String studentAddress;
    private String collegeName;
    
    
    
    //getter studentId
    public int getStudentId(){
        return studentId;
    }
    
     
    
    //getter studentName
    
    public String getStudentName(){
        return studentName;
    }
    
    
    
    //getter studentAddress
    public String getStudentAddress(){
        return studentAddress;
    }
    
    
    //getter collegeName
    public String getCollegeName(){
        return collegeName;
    }
    
    
    
    
       public Student(int id,String sName,String sAddress){
            studentId = id;
            studentName=sName;
            studentAddress = sAddress;
            collegeName = "NIT";
        }
    
    
    public Student(int id,String sName,String sAddress,String cName){
            studentId = id;
            studentName=sName;
            studentAddress = sAddress;
            collegeName = cName;
        }
    
    
    
    
    
    
    
    }
    
    
