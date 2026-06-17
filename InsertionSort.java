public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]) min = j;
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,56,34,5,1,34,99,67,34,34,45,2,3,1,98,38,83,19};
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
