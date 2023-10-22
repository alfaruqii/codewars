def count_sheep(n):
    sheep = ""
    for i in range(1,n+1):
        sheep = sheep + f"{i} sheep..."
    return sheep

result = count_sheep(3)
print(result)
