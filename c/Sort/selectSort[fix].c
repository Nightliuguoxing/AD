#include "stdio.h"
#include "time.h"

void Sort(int nums[], int n){
    int L = 0;
    int R = n - 1;
    while (L < R){
        int max = L; 
        int min = L; 
        int j = 0;
        for (j = L + 1; j <= R; j++){
            if (nums[j] < nums[min]){
                min = j;
            }
            if (nums[j] > nums[max]){
                max = j;
            }
        }
        if (min != L){
            int tmp = nums[L];
            nums[L] = nums[min];
            nums[min] = tmp;
        }
        if (max == L){
            max = min;
        }
        if (max != R){
            int tmp = nums[R];
            nums[R] = nums[max];
            nums[max] = tmp;
        }
        L++;
        R--;
    }
}

int main(void){
    int n, nums[1000005];
    scanf("%d", &n);
    int i;
    for(i = 0; i < n; i++){
        scanf("%d", &nums[i]);
    }
    clock_t st = clock();
    sort(nums, n);
    clock_t ft = clock();
    double dt = (ft - st) * 1.0 / CLOCKS_PER_SEC;
    printf("\n duration: %f s\n", dt);
    return 0;
}