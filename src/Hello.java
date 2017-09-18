import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		Calculate cal = new Calculate(number);
		System.out.println(cal.output());
		System.out.println("test");
	}

}
