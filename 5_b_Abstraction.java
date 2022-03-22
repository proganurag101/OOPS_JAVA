
abstract class Animal{
    public abstract void walk(); // implementation(body) not needed but this abstract function will be implemented permanently in all the inherited classes.
    public void see(){            //non abstract function implementation not necessary
    }
}

class horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs!");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}


public class main_oops{

    public static void main(String[] args) {
        horse  h = new horse(); //walks on 4 legs
        h.walk();

    }
}
