﻿// Задача 1: Напишите программу, которая принимает на вход 
// число и проверяет, кратно ли оно одновременно 7 и 23.

// void MultiNumber(int number)
// {
//     if (number % 7 == 0 && number % 23 == 0)
//     {
//         System.Console.WriteLine($"Чисдо {number} кратное 7 и 23");
//     }
//     else
//     {
//         System.Console.WriteLine($"Число {number} некратное 23 и 7");
//     }
// }

// System.Console.WriteLine("Введите число: ");
// int number = int.Parse(Console.ReadLine()!);

// MultiNumber(number);
// System.Console.WriteLine();


// Задача 2: Напишите программу, которая принимает на вход 
// координаты точки (X и Y), причём X ≠ 0 и Y ≠ 0 и выдаёт 
// номер координатной четверти плоскости, в которой 
// находится эта точка.

void FindQuarter(int x, int y)
{
    if (x > 0 && y > 0)
    {
        System.Console.WriteLine("Первая четверть");
    }
    else if (x < 0 && y > 0)
    {
        System.Console.WriteLine("Вторая четверть");
    }
    else if(x < 0 && y < 0)
    {
        System.Console.WriteLine("Третья четверть");
    }
    else if(x > 0 && y < 0)
    {
        System.Console.WriteLine("Четвёртая четверть");
    }
    else
    {
        System.Console.WriteLine("Такой четверти не существует");
    }
}

System.Console.WriteLine("Введите точку x: ");
int x = int.Parse(Console.ReadLine()!);
System.Console.WriteLine("Введите точку y: ");
int y = int.Parse(Console.ReadLine()!);

FindQuarter(x, y);
System.Console.WriteLine();