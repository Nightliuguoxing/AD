#include "stdio.h"

void SmallHeapAdjust(int nums[], int i, int n){
    int root, child;
    root = nums[i];
    for(child = 2 * i; child <= n; child = child * 2){
        if(child < n && nums[child] < nums[child + 1]) child++;
        if(root > nums[child]) break;
        nums[i] = nums[child];
        i = child;
    }
    nums[i] = root;
}

void BigHeapAdjust(int nums[], int i, int n){
    int root, child;
    root = nums[i];
    for(child = 2 * i; child <= n; child = child * 2){
        if(child < n && nums[child] > nums[child + 1]) child++;
        if(root < nums[child]) break;
        nums[i] = nums[child];
        i = child;
    }
    nums[i] = root;
}

void HeapSort(int nums[], int n){
    int t, i;

    for(i = n / 2; i > 0; i--) {
        BigHeapAdjust(nums, i, n);
    }

    for (i = n; i > 0; i--) {
        t = nums[1];
        nums[1] = nums[i];
        nums[i] = t;
        BigHeapAdjust(nums, 1, i-1);
    } 

    for(i = 1; i <= n; i++){
        printf("%d ", nums[i]);
    }
}

int main() {
    int n, i, num, index;
    scanf("%d", &n);
    int nums[n];
    for (i = 1; i <= n; i++){
        scanf("%d", &nums[i]);
    }
    HeapSort(nums, n);
    scanf("%d", &index);
    nums[n + 1] = index;
    printf("\n");
    HeapSort(nums, n + 1);
    return  0;
}