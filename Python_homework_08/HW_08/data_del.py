import csv

def delite_row():
    var = int(input('\nИз какого фаила удалить строку? \n'
                    'Ваш выбор: '))
    while var < 1 or var > 2:
        var = int(input('Ошибка! Ваш выбор: '))
    if var == 1:
        with open('data_first_variant.csv', 'r', newline='', encoding='utf-8') as file:
            reader = csv.reader(file)
            data = [row for row in reader]
            
            del data[3]
            
        with open('data_first_variant.csv', 'w', newline='', encoding='utf-8') as file:
            writer = csv.writer(file)
            writer.writerows(data)
    elif var == 2:
        with open('data_second_variant.csv', 'r', newline='', encoding='utf-8') as file:
            reader = csv.reader(file)
            data = [row for row in reader]
            
            del data[2]
            
        with open('data_second_variant.csv', 'w', newline='', encoding='utf-8') as file:
            writer = csv.writer(file)
            writer.writerows(data)    
