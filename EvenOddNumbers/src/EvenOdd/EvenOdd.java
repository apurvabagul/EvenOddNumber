package EvenOdd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1, i;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("ENTER A NUMBER:");
			no = sc.nextInt();
		}
	
		for (i = 1; i <= no; i++) {
			//System.out.println(i+"Entered number is:");

			if (i % 2 == 0) {

				System.out.println(i + "Is Even");

			} else {
				System.out.println(i + "Is Odd");
			}
		}

	}

}
