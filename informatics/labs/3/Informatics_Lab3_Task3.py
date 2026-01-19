#Author = Maria Shelestyuk
#Group = P3117
#Date = 29.10.25
import re
patterns = [r"\S{5,}",
           r"\d",
            r"[A-ZА-Я]",
            r"\W+(^\s)",
            r"(january|february|march|april|may|june|july|august|september|october|november|december)"]
def test(f):
    result = []
    for pattern in patterns:
        otvet = re.findall(pattern, f)
        result.append(otvet)
    if len(result[-1]) == 0:
        result.pop()
        otvet2 = re.findall(patterns[-1], f, re.IGNORECASE)
        result.append(otvet2)
    sum_ch25 = sum(int(x) for x in result[1])
    if sum_ch25 == 25:
        result.append([sum_ch25])
    else:
        result.append([])
    if len(result[0]) == 0:
        print("Длина пароля меньше 5")
    if len(result[1]) == 0:
        print("Пароль должен содержать цифры")
    if len(result[2]) == 0:
        print("Пароль должен содержать заглавные буквы")
    if len(result[3]) == 0:
        print("Пароль должен содержать специальные символы")
    if len(result[4]) == 0:
        print("Пароль должен содержать названия месяцев")
    if len(result[5]) == 0:
        print("Сумма чисел в пароле должна быть равна 25")
    print(result)
test("c5a5j*March*bhejF87J")
test("876_ 09")
test("Aa1!Bb2@Cc3#")
test("МойПароль123!")
test("12345678")
