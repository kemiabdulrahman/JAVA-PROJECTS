import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToe {
static ArrayList<Integer> userposition = new ArrayList<Integer>();
static ArrayList<Integer> cpuposition = new ArrayList<Integer>();

public static void main(String[] args){

char [][] gameboard = {

	{' ', '|', ' ', '|', ' '},

	{'-', '+', '-', '+', '-'}, 
	{' ', '|', ' ', '|', ' '},


	{'-', '+', '-', '+', '-'},

	{' ', '|', ' ', '|', ' '}};



printGameBoard(gameboard);
while(true) {
	

Scanner scanner = new Scanner(System.in);
//printGameBoard(gameboard);
System.out.println("Enter your placemement: ");
int userpos = scanner.nextInt();
while (userposition.contains(userpos) || cpuposition.contains(userpos)) {
	System.out.println("Position Taken! Enter a Correct Position");
    userpos = scanner.nextInt();
}
placePiece(gameboard, userpos, "player");

String result = whoWins();
if (result.length() > 0){
	System.out.println(result);
	break;

}
Random rand = new Random();
int cpupos = rand.nextInt(9) + 1;
while (userposition.contains(cpupos) || cpuposition.contains(cpupos)) {
	System.out.println("Position Taken! Enter a Correct Position");
    cpupos = rand.nextInt(9) + 1;
}

placePiece(gameboard, cpupos, "cpu");

printGameBoard(gameboard);

result = whoWins();
if (result.length() > 0){
	System.out.println(result);
	break;
}
}

}








public static void printGameBoard(char[][] gameboard) {


for(char [] row: gameboard){
for( char c : row) {

	System.out.print(c);
}
System.out.println();

}

	
}











public static String whoWins() {
List TopRow = Arrays.asList(1, 2, 3);
List middleRow = Arrays.asList(4, 5, 6);
List BottomRow = Arrays.asList(7, 8, 9);
List RightCol = Arrays.asList(1, 4, 7);
List middleCol = Arrays.asList(2, 5, 8);
List LeftCol = Arrays.asList(3, 6, 9);
List CrossDiagA = Arrays.asList(7, 5, 3);
List CrossDiagB = Arrays.asList(1, 5, 9);

		List<List> winning = new ArrayList<List>();
		winning.add(TopRow);

		winning.add(middleRow);
		winning.add(BottomRow);
		winning.add(RightCol);
		winning.add(middleCol);
		winning.add(LeftCol);
		winning.add(CrossDiagA);
		winning.add(CrossDiagB);
		for (List l : winning) {
			if (userposition.containsAll(l)) {
				return "Congratulations! You Won.";
				
			} else if (cpuposition.containsAll(l)) {
				return "CPU wins!";
			}
			else if (userposition.size() + cpuposition.size() == 9) {
				return "CAT!";
			}
			
		}
		
	return "";
}













public static void placePiece(char [][] gameboard, int pos, String user) {
char symbol = ' ';
if (user.equals("player")) {
	symbol = 'X';
	userposition.add(pos);
}
else if (user.equals("cpu")){
symbol = 'O';
cpuposition.add(pos);
}

switch (pos) {
	case 1:
		gameboard[0][0] = symbol;
		break;
	case 2:
		gameboard[0][2] = symbol;
		break;

    case 3:
		gameboard[0][4] = symbol;
		break;
    case 4:
		gameboard[2][0] = symbol;
		break;

    case 5:
		gameboard[2][2] = symbol;
		break;

    case 6:
		gameboard[2][4] = symbol;
		break;

    case 7:
		gameboard[4][0] = symbol;
		break;

    case 8:
		gameboard[4][2] = symbol;
		break;

    case 9:
		gameboard[4][4] = symbol;
		break;

	default:
		break;
	
}
}

}
