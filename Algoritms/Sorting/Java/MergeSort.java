import java.util.*;
public class MergeSort {
    
public static int[] mergeSortedArray(int[] arr1,int[] arr2){
    int m = arr1.length;
    int n = arr2.length;
    int i = 0, j = 0, k = 0;
    int[] answer = new int[m+n];
    while(i < m && j < n){
        if(arr1[i] <= arr2[j]){
            answer[k] = arr1[i];
            i++;
            k++;
        }else{
            answer[k] = arr2[j];
            k++;
            j++;
        }
    }

    while(i < m){
        answer[k] = arr1[i];
        i++;k++;
    }

    while(j < n){
        answer[k] = arr2[j];
        j++;k++;
    }

    return answer;
}

public static int[] mergeSortHelper(int[] arr,int start,int end ){
    if(start == end){
        int[] ans = new int[1];
        ans[0] = arr[start];
        return ans;
    }
    int mid = (start + end) / 2;
    int[] left = mergeSortHelper(arr,start,mid);
    int[] right = mergeSortHelper(arr,mid+1,end);

    int[] result = mergeSortedArray(left,right);

    return result;
}

public static int[] mergeSort(int[] arr){
    int[] answer = mergeSortHelper(arr,0,arr.length-1);
    return answer;
}

    public static void main(String[] args){
        int arr[] = {8,7,6,5,4,3,2,0,-1,-5,-8,1};

        int n = arr.length;
        int[] result = mergeSort(arr);

        for (int i=0;i<n;i++){
            System.out.println(result[i]);
        }
    }
}
