import java.util.Scanner;
public class complexno {
	public static void main(String[] args) {
	double a1,b1,a2,b2,c1,c2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the real part of first\n");
	a1=sc.nextDouble();
	System.out.println("enter the img part of first\n");
	b1=sc.nextDouble();
	System.out.println("enter the real part of second\n");
	a2=sc.nextDouble();
	System.out.println("enter the img part of second\n");
	b2=sc.nextDouble();
	c1=a1+a2;
	c2=b1+b2;
	System.out.println("sum of complex no:"+ c1+ "+" +c2+"i");
	}
}
	
	
