package codekamp;

public class Cat extends Animals  implements Xyz{
//do interface implement ho sakti hai but cannot inherit mutiple classes

    public void kick(Cat c) {
        System.out.println(this.name + " is kicking " + c.name);

    }
    public void doFavThing(){
        System.out.println("climbing tree");
    }

    @Override
    public void funct() {
        System.out.println("interface ko body mill gaya");
    }
}
