
class first_proj{




    public static void main(String[] args) {

//Note: Default constructor will always be called if you don't assign any value during object creation!
        Road_Toll car1 = new Road_Toll();
        car1.v_Type = "SUV";
        car1.count = 4;
        car1.calculate_toll();

        Road_Toll car2 = new Road_Toll(); //calls the user-defined default constructor
        car2.calculate_toll();

        Road_Toll car3 = new Road_Toll("Hatchback",4); //calls the user-defined parametertised constructor
        car3.calculate_toll(); 

        Road_Toll car4 = new Road_Toll(car3); //calls the copy contructor and copies the same value as that of assigned object.
        car4.calculate_toll();





    }
}
