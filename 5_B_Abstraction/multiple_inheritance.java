interface Animal{
    int eyes =2;  //will be final(fixed value),static(same for all animals),[public]
    void walk();  //by default public and abstract
}

interface Herbivore{
    void eat();
}

class horse implements Animal,Herbivore{ //multiple inheritance- inherited from two classes(interface)
    public void walk(){                  //you have to implement and write public
        System.out.println("I walk on four legs");
    }
    public void eat(){
        System.out.println("I eat grass");
    }
}




public class main_oops{

    public static void main(String[] args) {
        horse h1 =  new horse();
        h1.walk();
        h1.eat();
        

    }
}
