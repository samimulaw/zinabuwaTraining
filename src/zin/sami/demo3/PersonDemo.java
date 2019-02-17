package zin.sami.demo3;

public class PersonDemo {

    public static void main(String[] args) {
        Sami sam= new Sami();
        Zinabuwa zeni= new Zinabuwa();
        sam.run();
        sam.eat();
        sam.shave();
        zeni.run();
        zeni.eat();
        zeni.giveBirth();
        System.out.println(sam.name);
    }
}
