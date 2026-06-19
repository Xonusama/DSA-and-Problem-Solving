// *        * 
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

// Time - O(n^2)

import java.util.Scanner;

public class Pattern10 {

    // helper method
    static void printRow(int stars, int spaces){
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

    //main method
    static void printPattern(int n){
        //first half
        for(int i = 1; i <= n; i++){
            printRow(i, 2*(n-i));
        }

        //second half
        for(int i = 1; i < n; i++){
            printRow(n - i, i * 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        printPattern(n);

        sc.close();
    }
}
