# Функция суммы числа

# def sum_numbers(n):
#     sum = 0

#     for i in range(1, n + 1):
#         sum += i
#     print(sum)

# n = int(input('Введите число: '))
# sum_numbers(n)

# def sum_numbers(n, y='Hello'):  # y присвоено значение по умолчанию
#     print(y)
#     sum1 = 0

#     for i in range(1, n + 1):
#         sum1 += i
#     return sum1

# n = int(input('Введите число: '))
# print(sum_numbers(n))

# Функция вывода бесконечной строки

# def sum_str(*args):
#     res = ''

#     for i in args:
#         res += i
#     return res

# print(sum_str('s', 't', 'r', 'i', 'n', 'g'))

# from modul1 import max1
# print(max1(10, 9))

# from modul1 import *  # Вывод всех функций
# print(max1(10, 9))

# import modul1 as m1 # Переименование фаила на время работы
# print(m1.max1(10, 9))
 
# def fib(n):
#     if n in [1, 2]:
#         return 1
#     return fib(n - 2) + fib(n - 1)

# list_1 = []

# for i in range(1, 10):
#     list_1.append(fib(i))
# print(list_1)

# Сортировка слияниями

# def quick_sort(array):
#     if len(array) <= 1:
#         return array
#     else:
#         pivot = array[0]
#     less = [i for i in array[1:] if i <= pivot]
#     great = [i for i in array[1:] if i > pivot]
#     return quick_sort(less) + [pivot] + quick_sort(great)
    
# print(quick_sort([12, 14, 6, 7, 8, 54, 58, 1, 3, 57, 3]))

# Сортировка слияниями

def merge_sort(nums):
    if len(nums) > 1:
        mid = len(nums) // 2
        left = nums[:mid]
        right = nums[mid:]
        merge_sort(left)
        merge_sort(right)
        i = j = k = 0
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                nums[k] = left[i]
                i += 1
            else:
                nums[k] = right[j]
                j += 1
            k += 1

        while i < len(left):
            nums[k] = left[i]
            i += 1
            k += 1
            
        while j < len(right):
            nums[k] = right[j]
            j += 1
            k += 1


list_1 = [1, 2, 5, 7, 3, 16, 9, 5, 8]
merge_sort(list_1)
print(list_1)
