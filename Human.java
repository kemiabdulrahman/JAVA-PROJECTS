public class Human {


String name;
int age;
double weight;


Human(String name, int age, double weight){
this.name = name;
this.age = age;
this.weight = weight;
}

void jog() {

	System.out.println(this.name + " is jogging");
}

void live() {

	System.out.println(this.name + " is still living on this Earth");
}



}
