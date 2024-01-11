# Пример вывода данных в консоль.


# print(5)

# print(5, 8, 6)


# Пример вывода типа данных.

# n = 5
# print(type(n))


# Строки

# str = 'abcd'
# str1 = "qwerty"
# print(str, str1)

# n = 'fd\'df'
# print(n)

# n = 'fd"qwerty"df'
# print(n)

# Интерполяция строк

# a = 5
# b = 5.38
# c = 'fddf'
# print(f"{a} - {b} - {c}")


# Ввод данных и нахождение суммы.

# print('Введите первое число: ')

# a = int(input())
# b = int(input('Введите второе число: '))

# print(f"{a} + {b} = {a + b}")

# Округление чисел

# a = 5.586363
# b = 6.724846

# print(round(a * b, 3))

# Прибавление к переменной

# iter = 2

# iter += 3  # iter = iter + 3 и т.д

# Логические операции

# a = 1 > 4
# print(a)

# a = 1 < 4 and 5 > 2
# print(a)


# Условия if, else

# username = input('Введите имя: ')

# if username == 'Маша':
    
#     print('Ура, это же Маша!')

# elif username == 'Марина':

#     print('Я ждала Вас, Марина')

# elif username == 'Ильнар':

#     print('Ильнар - топ)')

# else:

#     print(f"Привет, {username}!")

# Цикл while

# n = 423
# sum = 0

# while n > 0:

#     x = n % 10
    
#     sum += x
    
#     n //= 10
    
# print(sum)

# Логическое действие while, else

# i = 0

# while i < 5:
    
#     if i == 3:
#         break
        
#     i = i + 1
# else:
#     print('Пожалуй')
#     print('хватит )')
# print(i)


# С методом flag. Нахождение минимального делителя числа.

# n = int(input('Введите число: '))
# flag = True
# i = 2

# while flag:
    
#     if n % i == 0:
#         flag = False
#         print(i)

#     elif i > n // 2:
#         print(n)
#         flag = False
#     i += 1


# Цикл for

# for i in 1, -2, 3, 14:
#     print(i)

# Вывод for при помощи метода range

# r = range(100, 0, -20)

# for i in r:
#     print(i)

# Вывод строк при помощи цикла for

# a = 'qwerty'

# for i in a:
#     print(i)

# Вложенный цикл for для строк

# line = ""

# for i in range(5):
#     line = ""
#     for j in range(5):
#         line += "*"
#     print(line)

text = 'Съешь ещё этих французских булок'

# print(len(text)) # длина строки
# print('ещё' in text) # проверка текста в строке
# print(text.lower())  # Перевод текста в нижний регистр.
# print(text.upper()) # Поднятие текста в верхний регистр
# print(text.replace('ещё', 'ещё немного')) # Поменять значения и слова
# print(text[len(text) - 1])  # Вывод последней буквы текста.
# print(text[-1])  # Упрощённый вариант
# print(text[:])  # Вывод всего текста
# print(text[:2])  # Вывод первых двух букв.
# print(text[len(text) - 2:])  # Вывод двух последних букв
# print(text[20:])  # С 20-го символа и до конца
# print(text[2:9])  # Вывод символов со 2 по 9.
# print(text[6:-18])  # В обратном направлении
# print(text[0:len(text):6])
# print(text[::6]) # Одинаковый вывод
text = text[2:9] + text[-5] + text[:2]
print(text)