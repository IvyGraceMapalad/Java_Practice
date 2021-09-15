/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter A Character: ");
		Scanner s1=new Scanner(System.in);
		char ch=s1.next().charAt(0);
		switch (ch){
		    case 'a':
		        System.out.println("The Character is Vowel");
		        break;
		    case 'A':
		        System.out.println("The Character is Vowel" );
		        break;
		    case 'e':
		        System.out.println("The Character is Vowel" );
		        break;
		    case 'E':
		        System.out.println("The Character is Vowel" );
		        break;
		    case 'o':
		        System.out.println("The Character is Vowel");
		        break;
		    case 'O':
		        System.out.println("The Character is Vowel" );
		        break;
		    case 'u':
		        System.out.println("The Character is Vowel" );
		        break;
		    case 'U':
		        System.out.println("The Character is Vowel" );
		        break;
		    default:
		      System.out.println("The Character is Consonant" );
		        break;  
		}
	}
}
