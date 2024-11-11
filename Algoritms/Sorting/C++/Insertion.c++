#include<iostream>
using namespace std;

void InsertionSort(int* arr,int n){
    for(int i=0;i<n;i++){
        
    }
}

int main(){
    int arr[] = {1,2,5,3,8,6,4,0};

    int n = sizeof(arr)/sizeof(arr[0]);
    InsertionSort(arr,n);
    
    for (int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
}