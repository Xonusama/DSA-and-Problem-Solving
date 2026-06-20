// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444

//Time - O(n^2)


import java.util.Scanner;

public class Pattern12 {
    static void printPattern(int n){
        int size = n * 2 - 1;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                int min = Math.min(
                    Math.min(i, j),
                    Math.min(size - i - 1, size - j - 1)
                );
                System.out.print(n - min + " ");
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
