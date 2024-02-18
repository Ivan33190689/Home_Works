def copy_data():
    var = int(input('\nВ каком формате копировать данные? \n'
                    'Ваш выбор: '))
    while var < 1 or var > 2:
        var = int(input('Ошибка! Ваш выбор: '))
    if var == 1:
        with open('data_second_variant.csv', 'r', encoding='utf-8') as file:
            data = file.read()
        with open('data_first_variant.csv', 'w', encoding='utf-8') as file:
            file.write(data)
    elif var == 2:
        with open('data_first_variant.csv', 'r', encoding='utf-8') as file:
            data = file.read()
        with open('data_second_variant.csv', 'w', encoding='utf-8') as file:
            file.write(data)
