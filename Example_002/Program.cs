// Задача 1: Напишите программу, которая принимает на вход 
// число и проверяет, кратно ли оно одновременно 7 и 23.

void MultiNumber(int number)
{
    if (number % 7 == 0 && number % 23 == 0)
    {
        System.Console.WriteLine($"Чисдо {number} кратное 7 и 23");
    }
    else
    {
        System.Console.WriteLine($"Число {number} некратное 23 и 7");
    }
}

System.Console.WriteLine("Введите число: ");
int number = int.Parse(Console.ReadLine()!);

MultiNumber(number);
System.Console.WriteLine();