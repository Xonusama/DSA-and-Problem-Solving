//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;

public class Pattern3 {

    static void PrintPattern(int n){
        int upper = (n+1)/2;
        int lower = n/2;

        //first half
        for(int i = 0; i < upper; i++){
            for(int j = upper-i-1; j>=0; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2+1; k++){
                System.out.print("*");
            }
            for(int l = upper-i-1; l>=0; l--){
                System.out.print(" ");
            }
            System.out.println();
        }

        //second half
        for(int i = 0; i < lower; i++){
            if(n%2 == 0) System.out.print(" ");
            else System.out.print("  ");
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < lower*2 - (i*2+1); k++){
                System.out.print("*");
            }
            for(int l = 0; l < i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        PrintPattern(n);

        sc.close();
    }

}
