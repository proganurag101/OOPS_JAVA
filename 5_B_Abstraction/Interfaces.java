interface Animal{
    int eyes =2;  //will be final(fixed value),static(same for all animals),[public] by default
    void walk();  //by default public and abstract
}

class horse implements Animal{
    public void walk(){  //you have to implement and write public
        System.out.println("I walk on four legs");
    }
}




public class main_oops{

    public static void main(String[] args) {
        horse h =  new horse();
        h.walk();

    }
}
