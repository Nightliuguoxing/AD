#include "stdio.h"
#include <time.h>

void sort(int nums[], int n){
    int i, j, cur;
	clock_t st = clock();
    for(i = 1; i < n; i++){
        cur = nums[i];
        for(j = i - 1; j >= 0 && nums[j] > cur; j--){
            nums[j + 1] = nums[j];
        }
        nums[j + 1] = cur;
    }
	clock_t ft = clock();
	double dt = (ft - st) * 1.0 / CLOCKS_PER_SEC;
    for(i = 0; i < n; i++){
        printf("%4d ", nums[i]);
    }
	printf("\n duration: %f s\n", dt);
}

int main(void){
    int n, nums[1000005];
    scanf("%d", &n);
    int i;
    for(i = 0; i < n; i++){
        scanf("%d", &nums[i]);
    }
    sort(nums, n);
    return 0;
}