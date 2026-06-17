// *
// **
// ***
// ****
// *****
// *****
// ****
// ***
// **
// *


import java.util.Scanner;

public class Pattern4 {

    static void printPattern(int n){
        int upper = (n+1)/2;
        int lower = n/2;

        //first half
        for(int i = 1; i <= upper; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second half
        for(int i = lower; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
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