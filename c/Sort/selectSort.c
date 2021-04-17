#include "stdio.h"
#include "time.h"
void sort (int nums[], int n){
    if(nums == NULL || n <= 0){
        return ;
    }
    int i, j, t;
	clock_t st = clock();
    for(i = 0; i < n; i++){
        int min = nums[i];
        for(j = i; j < n; j++){
            if(min > nums[j]){
                t = nums[j];
                nums[j] = min;
                min = t;
            }
        }
        nums[i] = min;
    }
	clock_t ft = clock();
	double dt = (ft - st) * 1.0 / CLOCKS_PER_SEC;
	
    for(i = 0; i < n ; i++){
        printf("%4d ", nums[i]);
    }
	printf("\n duration: %f s\n", dt);
}

int main(void) {
    int n, nums[1000005];
    scanf("%d", &n);
    int i;
    for(i = 0; i < n; i++){
        scanf("%d", &nums[i]);
    }
	sort(nums, n);
    return 0;
}