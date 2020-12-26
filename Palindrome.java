import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number to chech if it is palindrome or not");
		int num1=read.nextInt();
		int check=num1;
		int num2=0,remain=0;
		while(check > 0){
			remain=check%10;
			num2=(num2*10)+remain;
			check=check/10;
		}
		if(num2==num1){
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not palindrome");
		}
	}
}
