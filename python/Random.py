import random

n = int(input())
print(n)
LR = min(10000, n)
for _ in range(n):
    print(random.randint(-LR, LR), end=" ")