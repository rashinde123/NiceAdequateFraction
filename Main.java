import java.util.Scanner;

class Main {
  public static void main(String[] args) {
// TODO Auto-generated method stub

		
			Scanner input = new Scanner(System.in);
			
			int num1, num2,other1, other2, lcm, n, n2;
			
			System.out.println("Enter the first integer: ");
			num1 = input.nextInt();
			System.out.println("Enter the second integer: ");
			num2 = input.nextInt();
			input.close();

      other1 = num1; other2 = num2;


			while(num2!=0)
			{
			n = num2;
      num2=num1%num2;
      num1 = n;
	}
  n2 = num1;
  lcm = other1 * other2/n2;
  System.out.println("The LCM is "+lcm);
 
  }
}
