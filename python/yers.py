
for i in range(1800, 2021):
    if i % 4 == 0 and not i % 100 == 0 or i % 400 == 0:
        print(i)