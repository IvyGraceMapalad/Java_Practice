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
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first Number: ");
		int a = scan.nextInt();
		
		System.out.println("Enter the Second Number: ");
		int b = scan.nextInt();
		
		System.out.println("Enter the Third Number: ");
		int c = scan.nextInt();
		
		System.out.print("The answer is ");
		System.out.println(a + b + c);
	}
}
