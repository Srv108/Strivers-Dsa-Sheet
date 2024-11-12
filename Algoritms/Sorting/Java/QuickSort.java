import java.util.*;
public class QuickSort {

    public static int partition(int[] arr, int start, int end) {
        int pivot_ele = arr[end];  
        int i = start - 1; 

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot_ele) {
                i++; 

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1; 
    }

    public static void quickSortHelper(int[] arr, int start, int end) {
        if (start < end) {

            int pivotIndex = partition(arr, start, end);
            quickSortHelper(arr, start, pivotIndex - 1); 
            quickSortHelper(arr, pivotIndex + 1, end);   
        }
    }

    public static void quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2,3,3,3,3,-1,0,-4,3}; 
        int n = arr.length;
        quickSort(arr);  

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
