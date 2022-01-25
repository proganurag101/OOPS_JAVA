

public class Road_Toll {
    String v_Type;
    int count;

    public void calculate_toll(){
        if(count==2){
            System.out.println(v_Type+" toll cost is:  0"+" tyre: "+count);
        }else if(count==4){
            System.out.println(v_Type+" toll cost is:  10"+" tyre: "+count);
        }else if(count>4){
            System.out.println(v_Type+" toll cost is:  20"+" tyre: "+count);
        }else{
            System.out.println("Incorrect tyre count!");
        }
        
    }
    //
    Road_Toll(){
        System.out.println("Default Constructor called!");
        v_Type = "undefined";
        count = 2;
    }
    Road_Toll(String vtype,int tyres){
        System.out.println("Parameterised Constructor called!");
        v_Type = vtype;     
        count = tyres;
    }
    Road_Toll(Road_Toll cN){ //carN recieves the address of assigned object in main function.
        System.out.println("Copy contructor called!");
        v_Type = cN.v_Type;
        count = cN.count;
    }
    
   



    
    
}
