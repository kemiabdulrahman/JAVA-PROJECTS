


public class Mini {
public static void main(String[] args) {


Bicycle mybicycle = new Bicycle();
Bicycle mybic = new Bicycle();
System.out.println(mybicycle.model);
System.out.println(mybicycle.make);
System.out.println();
mybicycle.gear();
mybic.ride();






System.out.println();
Human human = new Human("James",65, 70 );
Human human2 = new Human("AbdulRahman", 30, 34.00);
System.out.println(human.name);
System.out.println(human.weight);
System.out.println(human2.name);
System.out.println();
human2.jog();
human.live();




Hero hero1 = new Hero("Batman", 34, "$$$");
Hero hero2 = new Hero("AbdulRahman", 21, "$$$");
System.out.println(hero1.name);
System.out.println(hero2.age);
System.out.println(hero2.toString());
}


}
