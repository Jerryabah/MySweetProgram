import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		System.out.println(s);
		
		int i = 0;
		
		do {
			System.out.println("i is: " + i);
			i++;
		} while(i < 10);
		
		
		
		in.close();

	}

}
