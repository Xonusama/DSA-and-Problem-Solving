// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;

public class Pattern2 {

    static void PrintPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for(int k = n*2-(i*2+1); k > 0; k--){
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

        System.out.print("Enter Nubmer of Lines: ");
        int n = sc.nextInt();

        PrintPattern(n);

        sc.close();
    }
}
