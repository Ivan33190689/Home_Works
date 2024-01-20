# Коллекции данных

# Списки

# list_1 = []
# list_1 = list()
# print(list_1)  # Вывод пустого списка
# list_1 = [1, 2, 3, 8]
# print(list_1)  # Вывод данных в скобочках
# print(*list_1) # Вывод данных через пробел

# for i in list_1:
#     print(i)
# print(len(list_1))  # Длина списка
# print(list_1[0])  # Обращение к элементу
# print(list_1[-1]) # Вывод последнего элемента
# list_1 = [1, 5]
# list_1.append(8) # Прибавление элемента к списку
# print(list_1)

# list_1 = []
# for i in range(5):
#     list_1.append(i)
#     print(list_1)

# Методы
# list_1 = [1, 2, 6, -5, 25, 0]
# print(list_1.pop())  # Удаляет последний элемент в списке и выводит его
# print(list_1.pop(0))  # Удаление первого элемента и вывод его на экран
# print(list_1.insert(3, 11))
# print(list_1)  # Добавление элемента на опр. позицию

# Срезы
# print(list_1[0])  # Вывод первого элемента
# print(list_1[-3])  # Вывод третьего элемента с конца
# print(list_1[:]) # Вывод всего списка
# print(list_1[:2])  # Вывод первых двух элементов
# print(list_1[len(list_1) - 2:])  # Вывод последних двух элементов
# print(list_1[2:4])  # Вывод двух элементов, начиная со второго
# print(list_1[::2])  # Вывод каждого второго элемента

# Кортеж
# t = ()
# print(type(t))

# t = (1, 3, 5, 6, 6, 38, 9, -5,)
# print(type(t))

# v = [1, 6, 4, 7, -5, 28, 17]
# print(v)
# print(type(v))
# v = tuple(v)
# print(v)
# print(type(v))

# a, b, c, d, e, f, g = v
# print(a, b, c, d, e, f, g) # Распаковка кортежа

t = (1, 2, 3, 4, 5,)

# for i in t:
#     print(i)

# for i in range(len(t)):
#     print(t[i])

# Словари

# d = {}
# d = dict() # Создание пустого словаря

# d['q'] = 'qwerty'
# print(d)

# d['w'] = 'werty'
# print(d['q'])
# del d['w'] # Удаление ключа

# dictionary = {}
# dictionary = {'left': 'на лево', 'right': 'на право', 'up': 'вверх', 'down': 'вниз'}
# print(dictionary)

# for item in dictionary:
#     print(item) # Вывод ключей словаря

# Множества

# colors = {'red', 'green', 'blue'}
# print(colors)

# colors.add('grey') # Добавление элементов
# print(colors)

# colors.remove('red') # Удаление элемента
# print(colors)

# colors.discard('red') # Проверяет элемент и удаляет его, если он есть во множествах
# print(colors)

# colors.clear() # Удаление множества
# print(colors)

a = {1, 2, 3, 5, 7}
# b = {2, 5, 16, 7}
c = a.copy()  # Скопировали данные a
# u = a.union(b)  # объединили данные a, b
# i = a.intersection(b)  # Вывод (повторяющихся) пересекаемых элементов
# df = a.difference(b)  # Вывод (неповторяющихся) уникальных элументов.
# b = frozenset(a)  # Замораживание переменной a

