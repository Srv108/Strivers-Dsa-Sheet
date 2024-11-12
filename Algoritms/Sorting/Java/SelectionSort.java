import java.util.*;
public class SelectionSort {

    public static int minElement(int[] arr,int k){
        int index = k;
        for(int i=k;i<arr.length;i++){
            if(arr[i] < arr[index]) index = i;
        }
        return index;
    }

    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int index = minElement(arr, i);
            if(index != i){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int arr[] = {9,8,7,6,5,5,5,5,5,4,3,2,1};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
