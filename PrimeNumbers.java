import java.util.Scanner;

/*
 * teste de matriz
 * incluir classes para:
 * - debug
  */

public class PrimeNumbers extends Object {
	public static void main(String[] args) {
		final int MAX_NUMBER = 100000001;
		boolean isNatural[];
		int naturalNumber = -1;
		Scanner input = new Scanner(System.in);

		// get a number from user

		while (naturalNumber < 1 || naturalNumber > MAX_NUMBER) {
			System.out.print("Type a Natural Number from 1 to " + MAX_NUMBER + ": ");
			String typedNumber = input.next();
			System.out.println("You typed " + typedNumber);

			if (typedNumber.toUpperCase().equals("MAX")) {

				naturalNumber = MAX_NUMBER;
			} else {
				naturalNumber = Integer.parseInt(typedNumber);
			}

		}

		// allocate memory
		isNatural = new boolean[naturalNumber + 1];

		// mark all not prime numbers
		int i, j;

		for (i = 2; i <= naturalNumber; i++) {
			// System.out.println("checking " + i + "-----------");
			if (!isNatural[i]) {
				for (j = 2; (i * j) <= naturalNumber; j++) {
					isNatural[i * j] = true;
					// System.out.println("Setting " + (i*j) + " as natural");
				}
			}
		}

		// print prime numbers list
		System.out.println("Prime Numbers List");
		j = 0;
		for (i = 2; i <= naturalNumber; i++) {
			if (!isNatural[i]) {
				j++;
				System.out.printf("(%d);%d\n", j, i);
			}
		}
		System.out.println("\n---------------\nCount:" + j);
	}
}
