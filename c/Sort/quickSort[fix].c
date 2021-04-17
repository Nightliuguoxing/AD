#include "stdio.h"
#include "time.h"

int n, nums[1000005];

int keySort(int nums[], int L, int H){
    int key, count = 1, temp;
    int M = L + (H - L) / 2;
    if (nums[L] > nums[H]){
        temp = nums[L];
        nums[L] = nums[H];
        nums[H] = temp;
    }
    if (nums[M] > nums[H]){
        temp = nums[H];
        nums[H] = nums[M];
        nums[M] = temp;
    }
    if (nums[L] < nums[M]){
        temp = nums[L];
        nums[L] = nums[M];
        nums[M] = temp;
    }
    nums[0] = nums[L];
    key = nums[L];
    while (L < H){
        while (L < H && nums[H] >= key)
            --H;
        nums[L] = nums[H];
        while (L < H && nums[L] <= key)
            ++L;
        nums[H] = nums[L];
        count++;
    }
    nums[L] = nums[0];
    return L;
}

void Sort(int nums[], int L, int H){
    int k;
    if (L < H){
        k = keySort(nums, L, H);
        Sort(nums, L, k - 1);
        Sort(nums, k + 1, H);
    }
}

int main(void){
    int i;
    scanf("%d", &n);
    for (i = 1; i <= n; i++){
        scanf("%d", &nums[i]);
    }
    clock_t st = clock();
    Sort(nums, 1, n);
    clock_t ft = clock();
    double dt = (ft - st) * 1.0 / CLOCKS_PER_SEC;
    printf("\n duration: %f s\n", dt);
    return 0;
}