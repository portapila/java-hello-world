import java.util.Scanner;

/*
 * incluir classes para:
 * - debug
  */

public class PrimeNumbers extends Object {
    public static void main (String[] args){
        boolean isNatural[];
        int naturalNumber = -1;
        Scanner input = new Scanner(System.in);

        // get a number from user

        while (naturalNumber < 1 || naturalNumber > 1000)
        {
            System.out.print("Type a Natural Number up to 1000: ");
            String typedNumber = input.next();
            System.out.println("You typed " + typedNumber);
            naturalNumber = Integer.parseInt(typedNumber);
    
        }

        // allocate memory
        isNatural = new boolean[naturalNumber + 1];

        // mark all not prime numbers
        int i, j;

        for (i = 2; i <= naturalNumber; i++)
        {
            //System.out.println("checking " + i + "-----------");
            if (!isNatural[i])
            {
                for (j = 2; (i*j) <= naturalNumber; j++)
                {
                    isNatural[i*j] = true;
                    //System.out.println("Setting " + (i*j) + " as natural");
                }
            }
        }

        // print prime numbers list
        System.out.println("Prime Numbers List");
        for (i=2; i <= naturalNumber; i++)
        {
            if (!isNatural[i])
            {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n---------------");
    }    
}
