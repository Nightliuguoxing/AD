#include "stdio.h"
#include "time.h"

int res[1000005], nums[1000005];

void merge(int L, int M, int H){
    int i = L, j = M + 1, k = L, n;
    for(n = L; n <= H; n++){
        res[n] = nums[n];
    }
    while(i <= M && j <= H){
        if(res[i] > res[j]){
            nums[k] = res[j];
            j++;
        }else{
            nums[k] = res[i];
            i++;
        }
        k++;
    }
    if(i <= M){
        for(n = i; n <= M; n++){
            nums[k++] = res[n]; 
        }
    }  
}

void mergeSort(int L, int H){
    if(L + 1 >= H){
        if(nums[L] > nums[H]){
            int t = nums[L];
            nums[L] = nums[H];
            nums[H] = t;
        }
    }else{
        int M = (L + H)  / 2;
        mergeSort(L, M);
        mergeSort(M + 1, H);
        merge(L, M, H);
    }
}

int main(void){
    int n;
    scanf("%d", &n);
    int i;
    for(i = 0; i < n; i++){
        scanf("%d", &nums[i]);
    }
    clock_t st = clock();
    mergeSort(0, n - 1);
    clock_t ft = clock();
    double dt = (ft - st) * 1.0 / CLOCKS_PER_SEC;
    for(i = 0; i < n; i++){
        printf("%4d ", nums[i]);
    }
    printf("\n duration: %f s\n", dt);

    return 0;
}