a = input()
array = [int(i) for i in a]
s1 = array[0] ^ array[2] ^ array[4] ^ array[6]
s2 = array[1] ^ array[2] ^ array[5] ^ array[6]
s3 = array[3] ^ array[4] ^ array[5] ^ array[6]
s = int(f'{s1}{s2}{s3}', 2)
if s != 0:
    print(f"Ошибка в {s} бите")
    if array[s-1] == 0:
        array[s-1] = 1
    else:
        array[s-1] = 0
print(f'{array[2]}{array[4]}{array[5]}{array[6]}')


