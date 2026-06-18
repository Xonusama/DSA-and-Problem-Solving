// A
// AB
// ABC
// ABCD
// ABCDE

// Time - O(n^2)

import java.util.Scanner;

public class Pattern7 {

    static void printPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                char ch = (char)('A'+j);
                System.out.print((char)ch);
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