import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main{
public static void main(String[] args){
	
/*
System.out.println("Hello World");
System.out.println("\tYou are doing good");
*/


/*
System.out.print("Name: Dele Alli");
System.out.print("\"The Weather is cool today\"\n");
System.out.println("\\Good to see you today\\");
*/


/*
int x;
int age = 34;
System.out.println("You are " + age + "Years old");
String info = "You are eligible to enter the hall";
*/




/*
double b = 90.345; // Being precise and doesn't require any letter at the end
float y;
long m = 1234674123L;
y = 5.678f; // Assignment
long u; // Declaration
int v = 67; // Initialization
*/


/*
String Course = JOptionPane.showInputDialog("Enter Your Preferred Course: ");
JOptionPane.showMessageDialog(null,"Course: " + Course);

int Semester = Integer.parseInt(JOptionPane.showInputDialog("Enter the Current Semester in: "));
JOptionPane.showMessageDialog(null,"Semester: " + Semester);

double Amount = Double.parseDouble(JOptionPane.showInputDialog("Amount to be collected: "));
JOptionPane.showMessageDialog(null,"Amount: " + Amount);
*/




	









/*Scanner scanner = new Scanner(System.in);
System.out.println("Enter your name: ");
String name = scanner.nextLine();
	
System.out.println("Enter your age to view your status: ");
int year  = scanner.nextInt();

scanner.nextLine();

System.out.println("Enter your Favourite food: ");
String food = scanner.nextLine();

System.out.println("Date of Birth: ");
int DateOfBirth = scanner.nextInt();

System.out.println("Info Collected ");
System.out.println("Name: "+ name);
System.out.println("Age: "+ year);
System.out.println("Favourite food: " + food);

System.out.println("Date Of Birth: "+ DateOfBirth);
*/


/*
 * String[] animals = {"dog", "cat", "bussy"};
for (String i : animals) {
System.out.println(i);
}
*/


/*
double math = Math.sqrt(105);
System.out.println("The Result is : " + math);
*/






/*	
int student = 2;
student++;
student = student + 1;




int math = Math.max(23, 45);
double j = Math.sqrt(81);



System.out.println(student + "\tStudents");
System.out.println("Maximum Number: "+ math);
System.out.println("Squareroot of 81 : "+ j);
*/







/*
Random random = new Random();
int u = random.nextInt(3)+1;
double l = random.nextDouble();
boolean b = random.nextBoolean();
System.out.println(u);
System.out.println(b); 
*/


/*	
Random random = new Random();
int m = random.nextInt();
System.out.println(m);
Scanner scanner = new Scanner(System.in);
*/





 /*Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the month");
String month = scanner.nextLine();
int age = 45;
int DateOfBirth = 2002;
if ((age >= 45) && (DateOfBirth == 2002) && (month == "December")){

System.out.println("You are eligible to enter");
}
else if (age <= 9)
{
System.out.println("You are a Teenager");
}
else if (age == 12){
System.out.println("You are Twelve Years old");
}
else if (age == 0){
System.out.println("You dont have years count in your age");
}
else {
System.out.println("Press q to exit");
}

}
}
 */
 


/*	String day = "Monday";
switch(day){
	case "Monday":
	System.out.println("Today is Monday");
	break;
	case "Tuesday":
	System.out.println("Today is Tuesday");
	case "Wednesday":
	System.out.println("Today is Wednesday");
	default:
	System.out.println("Invalid Day Choosed");
}
*/



/*
String year = "2002";
switch(year){
	case "2012":
		System.out.println("You are correct");
	default:
		System.out.println("Incorrect Answer");

}

*/

/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a day to know if it is a valid one");
String Day = scanner.next();

if (Day.equals("Monday") || Day.equals("Tuesday"))
{
System.out.println("A good day to start with");
}
else if (Day.equals("Wednesday"))
{
System.out.println("Please Shift it to tomorrow");
}
*/



/*
String name = "Abdulrahman";
String Nickname = "Olamide";
boolean value = Nickname.equalsIgnoreCase("oLamIde");
boolean result = name.equals("bro");
System.out.println(name.equals("bro"));
System.out.println(name.length());
System.out.println(value);
*/


/*int i = 1;
while (i <= 5) {
System.out.println("Hello World " + i);
i++;

}
*/

/*int j = 4;
do {
System.out.println("Hi Earth");
j++;
}

while ( j <= 10);
*/
/* int i = 0, j = 0;
 int num = 0, temp = 0;
 Scanner scanner = new Scanner(System.in);
 System.out.println("How many fibonacco numbers do you want?");
 num = scanner.nextInt();

 System.out.println(i + "," + j);
 for (int k = 0; k <= num-2; k++)
{
temp = i + j;
i = j;
j = temp;

 System.out.println(j);
}


 System.out.println(" ");
*/




/*

String [][] cars = new String[4][4];
cars[0][0] =  "Camaro";

cars[0][1] =  "Toyota";
cars[0][2] =  "Lexus";
cars[0][3] =  "Rover";
cars[1][0] =  "Benz";
cars[1][1] =  "Land Rover";
cars[1][2] =  "Ferrari";
cars[1][3] =  "Lamboghini";

cars[2][0] =  "Lamboghini";
cars[2][1] =  "Lamboghini";
cars[2][2] =  "Lamboghini";

cars[2][3] =  "Lamboghini";

cars[3][0] =  "Lamboghini";
cars[3][1] =  "Lamboghini";
cars[3][2] =  "Lamboghini";
cars[3][3] =  "Lamboghini";

for (int i = 0; i <cars.length; i++)

{
	System.out.println();
for (int j= 0; j < cars[i].length; j++)
	System.out.print(cars[i][j] + " ");
}

System.out.println();
System.out.println();

String [][] phone = {{"Itel","Tecno", "Ann", "Samsung"}, {"Redmi", "Hot 11 Play", "Starcomms", "Motorola"}, {"Ulong", "Redmi", "Temenos", "Infinix"}};

for (int i = 0; i <phone.length; i++)
	
{
System.out.println();

for (int j= 0; j < phone[i].length; j++)

	System.out.print(phone[i][j] + " ")
		;
}




*/
/* 

String name = "Oluwakemi";

boolean result = name.equalsIgnoreCase("OlUwakemi");

System.out.println(result);
char result1 = name.charAt(2);

System.out.println(result1);
int result2 = name.length();

System.out.println(result2);
String result3 = name.trim();

System.out.println(result3);
String result4 = name.replace('o', 'a');

System.out.println(result4);
String result5 = name.toLowerCase();

System.out.println(result5);
String result6 = name.toUpperCase();

System.out.println(result6);
boolean result7 = name.isEmpty();

System.out.println(result7);
int result8 = name.indexOf('a');



System.out.println(result8);
*/



/* 
ArrayList<String> food = new ArrayList<String>();
food.add("Ogbono");
food.add("Eja riro");
food.add("Iyan");
food.add("Isu and Gbegiri");
food.set(0, "Pixzza");
food.remove(2);
food.clear();
for (int i = 0; i < food.size(); i++){
System.out.println(food.get(i));

}*/





/*
ArrayList<String> Network = new ArrayList<String>();
Network.add("M T N ");
Network.add("Glo");
Network.add("Airtel");


ArrayList<String> location = new ArrayList<String>();
location.add("Ibadan");
location.add("Badagry");
location.add("Ilorin");
location.add("Lagos");
ArrayList<ArrayList<String>> All = new ArrayList();
All.add(location);
//All.add(business);
All.add(Network);
System.out.println(All);
System.out.println(All.get(1).get(0));

*/


/*
ArrayList<String> business = new ArrayList<String>();
//ArrayList<int> chairs = new ArrayList<int>();
business.add("Microsoft Limited");
business.add("Heroes Investment Limited");
for (int j = 0 ; j < business.size(); j++)


{

	System.out.println(business.get(j));
}

*/





/*
for (int row = 0; row <= n; row++)
{
	for (int column = 0; column <= row; column++)
	{
		System.out.println("*");

	}
}
*/



/*
Double a  = 50.0;
Integer y = 3;
Character p = 'u';
System.out.println(a );
*/
String name = "AbdulRahman";
int age  = 34;
hello(name, age);
int a = 34;
int b = 456;
int c = 45;
int d = 30;
System.out.println(multiply(a, b));




int u = add(a, b, c, d);
System.out.println(u);


}                





static void hello(String title, int age){
System.out.println("Hello "+ title + " You are " + age + " years old");
}

static int multiply(int d, int c) 
{
int z =  d * c;
return z;

}




static int add(int a, int b) 
{
System.out.println("Using the Overloaded function #1");

return a + b;

}



static int add(int a, int b, int c) 
{
System.out.println("Using the Overloaded function #2");
return a + b + c;

}

static int add(int a, int b, int c, int d) 
{
System.out.println("Using the Overloaded function #3");
return a + b + c + d;

}

static void pattern30(int n) {
for (int row = 1; row <= n; row++)
{
	for (int space = 0; space < n-row; space++){

		System.out.println(" ");
	}
for (	int col = row; col <= 1; col--){
		System.out.println(col);

		for (int col = row; col <=  row; col++) {
			System.out.println(col);
			
		}
		System.out.println();
	}
}

}




}
