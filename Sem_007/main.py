# У вас есть код, который вы не можете менять (так часто бывает, когда код в глубине
# программы используется множество раз и вы не хотите ничего сломать):
# transformation = <???>
# values = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29] # или любой другой список
# transormed_values = list(map(transformation, values))
# Единственный способ вашего взаимодействия с этим кодом - посредством задания
# функции transformation.
# Однако вы поняли, что для вашей текущей задачи вам не нужно никак преобразовывать
# список значений, а нужно получить его как есть.
# Напишите такое лямбда-выражение transformation, чтобы transformed_values получился
# копией values.

transformation = lambda x: x
values = [1, 23, 42, 'asdfg']
transformed_values = list(map(transformation, values))
# if values == transformed_values:
#     print('ok')
# else:
#     print('fail')
    



# transformed_values = map(transformation, values) # итератор.
# list1 = list(map(int, input('Введите список: ').split())) # Список чисел
# print(list1)



# Напишите функцию same_by(characteristic, objects), которая
# проверяет, все ли объекты имеют одинаковое значение
# некоторой характеристики, и возвращают True, если это так.
# Если значение характеристики для разных объектов
# отличается - то False. Для пустого набора объектов, функция
# должна возвращать True. Аргумент characteristic - это
# функция, которая принимает объект и вычисляет его
# характеристику.
# Ввод: Вывод:
# values = [0, 2, 10, 6] same
# if same_by(lambda x: x % 2, values):
# print(‘same’)
# else:
# print(‘different’)


# from math import pi

# def find_farthest_orbit(list_of_orbits):
#     print(list_of_orbits)
#     list_orb = [el for el in list_of_orbits if el[0] != el[1]] # убрать круговые орбиты 
#     print(list_orb)
#     list_s = [el[0] * el[1] * pi for el in list_orb] # найти площадь по формуле
#     print(list_s)
#     print(max(list_s)) # нахождение максимальной площади
#     index_max = list_s.index(max(list_s)) # для наибольшей площади находим индексы
#     print(index_max)
#     return list_of_orbits[index_max]


# orbits = [(1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)]
# print(*find_farthest_orbit(orbits))



# Напишите функцию same_by(characteristic, objects), которая
# проверяет, все ли объекты имеют одинаковое значение
# некоторой характеристики, и возвращают True, если это так.
# Если значение характеристики для разных объектов
# отличается - то False. Для пустого набора объектов, функция
# должна возвращать True. Аргумент characteristic - это
# функция, которая принимает объект и вычисляет его
# характеристику.
# Ввод: Вывод:


# def same_by(characteristic, objects):
#     return len(list(filter(characteristic, objects))) == 0

# values = [0, 2, 10, 6]
# if same_by(lambda x: x % 2, values):
#     print('True')
# else:
#     print('False')

values = [0, 2, 17, 6]
print(list(filter(lambda x: x % 2, values)))