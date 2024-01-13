# Найдите сумму цифр трехзначного числа n.
# Результат сохраните в перменную res.

# Пример:

# n = 123 -> res = 6 (1 + 2 + 3)
# n = 100 -> res = 1 (1 + 0 + 0)

n = int(input('Введите трёхзначное число: '))
res = 0

if n > 99 and n < 1000:

    while n > 0:
        x = n % 10
        res += x
        n //= 10
print(f"Сумма цифр = {res}")

# Петя, Катя и Сережа делают из бумаги журавликов. Вместе они сделали n журавликов.
# Сколько журавликов сделал каждый ребенок, если известно, что Петя и Сережа сделали 
# одинаковое количество журавликов, а Катя сделала в два раза больше журавликов, чем Петя и 
# Сережа вместе?
# Выведите через пробел количество журавликов, сделанных Петей, Катей и Сережей.

# Пример:

# n = 6 -> 1 4 1  
# n = 24 -> 4 16 4    
# n = 60 -> 10 40 10 

# n = int(input('Введите количество журавликов: '))

# petya = n // 6
# sereja = petya
# katya = n - (petya + sereja)

# print(f"{petya} {katya} {sereja}")

# Вам требуется написать программу, которая проверяет счастливость билета с номером n 
# и выводит на экран yes или no.

# Пример:

# n = 385916 -> yes
# n = 123456 -> no

# n = input('Введите номер билета: ')

# sum_firstNum = int(n[0]) + int(n[1]) + int(n[2])
# sum_secondNum = int(n[3]) + int(n[4]) + int(n[5])

# if sum_firstNum == sum_secondNum:
#     print('Счастливый билет')
# else:
#     print('Обычный билет')

# Определите, можно ли от шоколадки размером a × b долек отломить c долек,
# если разрешается сделать один разлом по прямой между дольками 
# (то есть разломить шоколадку на два прямоугольника).

# Выведите yes или no соответственно.

# Пример:

# a, b, c = 3, 2, 4 -> yes
# a, b, c = 3, 2, 1 -> no

# a = int(input('Введите размер шоколадки a: '))
# b = int(input('Введите размер шоколадки b: '))
# c = int(input('Введите размер шоколадки c: '))

# if c < a * b and (c % a == 0 or c % b == 0):
#     print('Можно')
# else:
#     print('Нельзя')
