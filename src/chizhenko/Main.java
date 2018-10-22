package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		String str;
		int counter;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите строку:");
		str = sc.nextLine();
		sc.close();
		
		char[] charArray = str.toCharArray();
		
		counter = 0;
		for (int i=0; i<charArray.length;i++) {
			if (charArray[i]=='b') {
				counter = counter + 1;
			}
		}
		
		System.out.println(counter);

	}

}
