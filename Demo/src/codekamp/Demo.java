package codekamp;

public class Demo {
    //public ,private,static ,non-static saare variables hai
    public static void main(String[] args) {
        System.out.println("Heloo world");
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        c1.name = "Mars";
        c2.name = "Pluto";
        c1.kick(c2);
//        c1.climbtree();
        //animal can store var of dog(child)but not viceversa
        Dog d1=new Dog("qwe");
        d1.name="Tommy";

//       d1.climbtree();

Animals a1=new Dog("wer");
a1.name="koi bhi animal";
        //method wahi call hoga jo  var ka datatype ho na ki jo obj create kiya hai.... AT COMPILE TYM
        //method search starts from class of object... AT RUNTIME
//               a1.chaseTail();

        Dog d2=new Dog("Tomy");
        System.out.println(Dog.count);
        System.out.println(d2.name);
// count 3 kyoki uapr dog 3 baar call ho chuka hai
//parameter less constructor inherit hoga majbori hai when child class has no constructor at all(....imp)


        Xyz pqr=new Cat();
        //interface ne Cat ke obj ko store kiya hai

        pqr.funct();
    }

}
//super---lagaya to hardam jiska obj hai uske parent class se start hoga
//this()---jo obj stored hai this me uska constructor call kar rahe hai
//super()----
//constructor hamasha new obj par call hoga and function hamesha existing obj par call hoga