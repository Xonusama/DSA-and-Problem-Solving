//     *
//    ***
//   *****
//  *******
// *********


import java.util.Scanner;

public class Pattern1 {
    
    static void PrintPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n-i; j >= 0; j--){
                System.out.print(" ");
            }

            for(int k = i*2 - 1; k > 0; k--){
                System.out.print("*");
            }
            
            for(int l = n-i; l >= 0; l--){
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
