/* Riam Sangdoung
 * Reverse string, loop to play again
 * 2019
 */

import java.util.Scanner;


public class revString {

	public static void main(String[] args) {


		String answer="";
			do{
				String origin, rev="";
				int i, len;
				Scanner scan = new Scanner(System.in);

				System.out.print("Enter a string: ");
				origin = scan.nextLine();


				len = origin.length();
				for(i=len-1; i>=0; i--){
					rev = rev + origin.charAt(i);
				}
				System.out.print("Reverse of the string is: " +rev + "\n");
				System.out.println("Continue (y/n)?)");
				answer= scan.next();


			}

			while(answer.equalsIgnoreCase("y"));
	}
}
