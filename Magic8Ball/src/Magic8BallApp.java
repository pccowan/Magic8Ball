import java.util.Scanner;



public class Magic8BallApp {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String question = "",answer = "";
		
		
		
		Magic8Ball magic = new Magic8Ball();
		
		do{	
		System.out.println("What question would you like to ask Magic 8 Ball?\n");
		question = keyboard.nextLine();
		
		
		System.out.println("Your question: " +question+"\n "+"\n" +
		magic.shake());
	
		System.out.println("\n"+" Would you like to ask another question? Type Yes/No");
		answer = keyboard.nextLine();
		
		}while(!answer.equals("No"));
	keyboard.close();
	}

}
