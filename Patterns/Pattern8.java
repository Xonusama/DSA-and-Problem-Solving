//    A
//   ABA
//  ABCBA
// ABCDCBA

//Time - O(n^2)

import java.util.Scanner;

public class Pattern8 {

    static void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            int ascii = -1;
            for(int k = 1; k <= i*2 - 1; k++){
                if(k <= i){
                    ascii++;
                    System.out.print((char)('A'+ascii));
                }
                else{
                    ascii--;
                    System.out.print((char)('A'+ascii));
                }
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
