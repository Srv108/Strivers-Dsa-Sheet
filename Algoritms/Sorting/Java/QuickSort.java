import java.util.*;
public class QuickSort {
        
    public static void partition(int[] arr,int pivot_ele){
        int n = arr.length;
        int i = 0,j = 0;
        while(j < n){
            if(arr[j] < pivot_ele){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                i++;
            }
            j++;
        }
        
    }

    public static void quickSortHelper(int[] arr,int start,int end ){
        if(start > end){
            return;
        }
        int mid = (start + end) / 2;
        partition(arr,arr[mid]);
        quickSortHelper(arr,start,mid-1); // left array
        quickSortHelper(arr,mid+1,end); // right array
    }

    public static void quickSort(int[] arr){
        quickSortHelper(arr,0,arr.length-1);
        
    }

    public static void main(String[] args){
        int arr[] = {4,3,2,5,8,7,6,0,10,7};

        int n = arr.length;
        quickSort(arr);

        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
