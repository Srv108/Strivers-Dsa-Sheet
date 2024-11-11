#include<iostream>
using namespace std;

int minElement(int* arr, int index,int n){
    int min_element = index;
    for(int i=index;i<n;i++){
        if(arr[i] <= arr[min_element]) min_element = i;
    }
    return min_element;
}

void selectionSort(int* arr,int n){
    for(int i=0;i<n;i++){
        int index = minElement(arr,i,n);
        if(index != i){
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}

int main(){
    int arr[] = {9,7,6,5,3,3,3,3,2,1,-10,-1,-4};

    int n = sizeof(arr)/sizeof(arr[0]);
    selectionSort(arr,n);

    for (int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
}