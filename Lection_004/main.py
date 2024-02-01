# def f(x):

#     return x * x

# a = f
# print(f(5))
# print(a(5))


# def calk1(a, b):
#     return a + b


# def calk2(a, b):
#     return a * b


# def math(op, x, y):
#     print(op(x, y))

# math(lambda a,b: a+b, 5, 45)

# data = [1, 2, 3, 5, 8, 15, 23, 38]
# res = []

# for i in data:
#     if i % 2 == 0:
#         res.append((i, i ** 2))
# print(res)


# def select(f, col):
#     return [f(x) for x in col]

    
# def where(f, col):
#     return [x for x in col if f(x)]
    
# data = [1, 2, 3, 5, 8, 15, 23, 38]
# res = map(int, data)
# print(res)
# res = filter(lambda x: x % 2 == 0, res)
# print(res)
# res = list(map(lambda x: (x, x ** 2), res))
# print(res)

# list_1 = [x for x in range(1, 20)] # Генератор списков
# print(list_1)

# list_1 = list(map(lambda x: x + 10, list_1))
# print(list_1)

# data = '65 2 756 153 68 0'
# print(data)

# data = list(map(int, data.split()))
# print(data)

# data = [15, 65, 7, 36, 165]
# res = list(filter(lambda x: x % 10 == 5, data))
# print(res)

# colors = ['red', 'green', 'blue']

# data = open('file.txt', 'a')
# data.writelines(colors)
# data.close()

# with open('file.txt', 'w') as data:
#     data.write('line 1\n')
#     data.write('line 2\n')
# print(56)

# path = 'file.txt'
# data = open('file.txt', 'r')

# for line in data:
#     print(line)
# data.close()