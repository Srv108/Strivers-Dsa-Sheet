#include<iostream>
using namespace std;


void BubbleSort(int* arr,int n){
    for(int i=0;i<n-1;i++){
        bool flag = false;
        for(int j=0;j<n-i-1;j++){
            if(arr[j] >= arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                flag = true;
            }
        }
        if(flag == false) break;
    }
}

int main(){
    int arr[] = {2,4,7,6,9,5,9,7,2};

    int n = sizeof(arr)/sizeof(arr[0]);
    BubbleSort(arr,n);

    for (int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
}