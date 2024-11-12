#include<iostream>
using namespace std;

int* mergeSortedArray(int* arr1,int* arr2,int m,int n){
    int i = 0, j = 0, k = 0;
    int* answer = new int[m+n];
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

int* mergeSortHelper(int* arr,int start,int end ){
    if(start == end){
        int* ans = new int[1];
        ans[0] = arr[start];
        return ans;
    }
    int mid = (start + end) / 2;
    int* left = mergeSortHelper(arr,start,mid);
    int* right = mergeSortHelper(arr,mid+1,end);

    int* result = mergeSortedArray(left,right,(mid-start+1),(end-mid));

    

    delete[] left;
    delete[] right;

    return result;
}

void MergeSort(int* arr,int n){
    int* sortedArray = mergeSortHelper(arr,0,n-1);

    for (int i = 0; i < n; i++) {
        arr[i] = sortedArray[i];
    }
    delete[] sortedArray;
}

int main(){
    int arr[] = {1,2,3,4,5,6,7};

    int n = sizeof(arr)/sizeof(arr[0]);
    MergeSort(arr,n);

    for (int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
}