from Logger import input_data, print_data
from exit import exit_program
from data_target import copy_data
from data_del import delite_row

def interface():
    print('Добрый день! Это бот-помощник. \n'
          'Что вы хотите сделать? \n'
          '0 - Выйти \n'
          '1 - Записать данные \n'
          '2 - Вывести данные \n'
          '3 - Копировать данные'
          '4 - Удалить строку данных')
command = int(input('Ваш выбор: '))
while command < 0 or command > 4:
    command = int(input('Ошибка! Ваш выбор: '))
    
if command == 0:
    exit_program()
elif command == 1:
    input_data()
elif command == 2:
    print_data()
elif command == 3:
    copy_data()
if command == 4:
    delite_row()

interface()

