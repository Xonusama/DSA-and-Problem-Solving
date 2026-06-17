// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

// Time - O(n^2)


import java.util.Scanner;

public class Pattern6 {

    static void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            int spaces = 2 * (n - i);
            for(int k = 1; k <= spaces; k++){
                System.out.print(" ");
            }

            for(int l = i; l >= 1; l--){
                System.out.print(l);
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
