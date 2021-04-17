#include "stdio.h"
#include "time.h"

int n, nums[100005];

void sort(int nums[], int L, int R){
    int i = L, j = R;
    nums[0] = nums[L];
    while (i < j){
        while (i < j && nums[0] < nums[j])
        j--;
        if(i < j){
            nums[i] = nums[j];
            i++;
        }
        while (i < j && nums[i] <= nums[0])
            i++;
        if(i < j){
            nums[j] = nums[i];
            j--;
        }
        
    }
    nums[i] = nums[0];

    if(L < i)
        sort(nums, L, j - 1);
    if(i < R)
        sort(nums, j + 1, R);

}

int main(void){
    scanf("%d", &n);
    int i;
    for(i = 0; i < n; i++){
        scanf("%d", &nums[i]);
    }
	clock_t st = clock();
    sort(nums, 1, n);
	clock_t ft = clock();
	double dt = (ft - st) * 1.0 / CLOCKS_PER_SEC;
	printf("\n");
	printf("duration: %f s\n", dt);
    return 0;
}