package codekamp;

public class Dog extends Animals {
    public static Cat c3;
    public static int count = 0;

    public void chaseTail() {
        System.out.println(this.name + " is chaising tail.Dog ");
    }

    public void climbTree() {
        System.out.println(this.name + " is climbing tree.Dog");
    }

    public void xyy() {
        Cat c5 = new Cat();
        Dog.c3.kick(c5);//c3 static hai to dog.c3 and c3.kick(Cat c) c3 variable hai to cat ke non static function and variables
        //compile tym me var ke class compile hoga but at runtime var me jo obj stored hai usko.......
    }

    public void doFavThing() {
        System.out.println("chasing tail");
    }

    //constructor
    //no return type not even void
    //non-static
    //use yeh hai ki jab bhi dog call ho to yeh hamesha chale
    //first line in every constructor must call to parent class ka constructor either ...directly aur indirectly   i.e --- super(); and must return
    //the same datatype as parent class is accepting
    public Dog() {
        this("tom");//yaha obj naya hai to likh sakte hai
        System.out.println("Dog class ka constructor");
        count++;
        //this("tom")--yaha nahi likh sakte obj purana ho gaya

    }

    public Dog(String n1) {
        System.out.println("Dog class ka constructor");
        count++;
        this.name = n1;
        //jab bhi class bnao then string pass karoge then it will enforce that dog ka  nam phadega hi

    }

}//har constructor ki pahli line super();
