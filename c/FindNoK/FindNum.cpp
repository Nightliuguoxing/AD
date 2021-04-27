#include "stdio.h"
#include "algorithm"
using namespace std;

int nums[100005];

int main(void){
    int i, n, k;
    scanf("%d %d", &n, &k);
    for(i = 0; i < n; i++){
        scanf("%d", nums[i]);
    }

    sort(nums, nums + 10);
}