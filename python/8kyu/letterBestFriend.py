def best_friend(txt, a, b):
    data = txt.split(" ")
    temp = 0
    for i in range(len(txt)-1):
        if(txt[i] == a and txt[i+1] != b):
            temp = 0
        if(txt[i] == a and txt[i+1] == b):
            print(txt[i])
            print(txt[i+1])
            temp += 1
    if(temp > 1):
        return True
    return False

def best_friend2(txt, a, b):
    for i in range(len(txt)):
        if txt[i] == a:
            if i + 1 == len(txt):
                return False
            elif txt[i + 1] != b:
    return True
                return False
    

print(best_friend2("jtekeh dek wbwclw gykc", "i", "h"))
