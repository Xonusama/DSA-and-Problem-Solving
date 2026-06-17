// 1
// 01
// 101
// 0101
// 10101

//Time- O(n*2)
//Space-O(1)

import java.util.Scanner;

public class Pattern5 {

    static void printPattern(int n){
        for(int i = 1; i <= n; i++){

            // int num = (i % 2 == 0) ? 0 : 1;
            int num = i % 2;

            for(int j = 1; j <= i; j++){
                System.out.print(num);
                num = (num == 0) ? 1 : 0;
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
