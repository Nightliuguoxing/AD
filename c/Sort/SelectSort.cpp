#include "stdio.h"

void swap(int a, int b){
    int temp;
    temp = a;
    a = b;
    b = temp;
}

void printSc(int nums[], int n){
    int i;
    for(i = 0; i < n; i++){
        printf("%d", nums[i]);
    }
}

void selectSort(int nums[], int n){
    int i, j;
    for(i = 0; i < n - 1; i++){
        int min = i;
        for(j = i + 1; j < n; j++){
            if(nums[j] < nums[min]){
                min = j;
            }
        }
        swap(nums[min], nums[i]);
    }
    printSc(nums, n);
}


int main(){
    int i, n;
    scanf("%d", &n);
    int nums[1000000];
    for(i = 0; i < n; i++){
        scanf("%d", &nums[i]);
    }
    for(i = 0; i < n; i++){
        printf("%d", &nums[i]);
    }
}
