package sorting;

public class SelectionSort {

    public static int[] sort(int [] arr){
        for(int i=0;i< arr.length;i++){
            int num = arr[i];
            int min_index = i;
            /* Loop through slice array next index i+1 */
            for(int j=i+1; j< arr.length;j++ ){
                if(num > arr[j]){
                    min_index=j;
                    num=arr[j];
                }
            }
            /*
             Swapping min value with current elemt
             */
            int tmp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = tmp;
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
        int[] sort = sort(arr);
        System.out.println("output");
        print(sort);
    }
}
