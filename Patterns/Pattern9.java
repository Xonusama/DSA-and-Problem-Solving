// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

import java.util.Scanner;

public class Pattern9 {

    static void printPattern(int n){   //Brute force method
    //first half
    for(int i = 1; i <= n; i++){
        for(int j = n; j >= i; j--){
            System.out.print("*");
        }

        for(int k = 1; k <= (i*2)-2; k++){
            System.out.print(" ");
        }

        for(int l = n; l >= i; l--){
            System.out.print("*");
        }
        System.out.println();
    }

    //second half
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }

        for(int k = 1; k <= (n*2) - (i*2); k++){
            System.out.print(" ");
        }

        for(int l = 1; l <= i; l++){
            System.out.print("*");
        }
        System.out.println();
    }
}

static void printRow(int stars, int spaces){  //helper method
    for(int i = 0; i < stars; i++){
        System.out.print("*");
    }

    for(int j = 0; j < spaces; j++){
        System.out.print(" ");
    }

    for(int k = 0; k < stars; k++){
        System.out.print("*");
    }
    System.out.println();
}

static void printPatternHelperMethod(int n){  //using helper method to print pattern
    for(int i = 1; i <= n; i++){
        printRow(n - i + 1, 2 * i - 2);
    }

    for(int i = 1; i <= n; i++){
        printRow(i, (n - i)*2);
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        // printPattern(n);

        printPatternHelperMethod(n);

        sc.close();
    }
}
