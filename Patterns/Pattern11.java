// *****
// *   *
// *   *
// *   *
// *****


// Time - O(n^2)


import java.util.Scanner;

public class Pattern11 {

    static void printPattern(int n){
    for(int i = 1; i <= n; i++){
        if(i == 1 || i == n){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        else{
            System.out.print("*");
            for(int j = 1; j <= n - 2; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
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
