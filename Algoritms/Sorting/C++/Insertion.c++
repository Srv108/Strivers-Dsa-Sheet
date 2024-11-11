#include<iostream>
using namespace std;

void InsertionSort(int* arr,int n){
    for(int i=1;i<n;i++){
        int ele = arr[i];
        int j;
        for(j=i-1;j>=0;j--){
            if(arr[j] > ele) {
                arr[j+1] = arr[j];
            }else break;
        }
        arr[j+1] = ele;
    }
}

int main(){
    int arr[] = {3,5,8,6,4,4,4,4,0,-1,-8,-3,-2,4,4,4};

    int n = sizeof(arr)/sizeof(arr[0]);
    InsertionSort(arr,n);
    
    for (int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
}