package sorting;

public class InsertionSort {

    public static int[] insertion_sort(int[] arr){

        for(int i =1; i< arr.length-1;i++){
            int data = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > data){
                int tmp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = tmp;
                j = j - 1;
            }
        }
        return arr;
    }

    public static void print(int [] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = new int[] {6,5,3,7,9,8,4};
        System.out.println("input");
        print(arr);
        int[] sort = insertion_sort(arr);
        System.out.println("output");
        print(sort);
    }
}
