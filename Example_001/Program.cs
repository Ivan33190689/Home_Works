// Большее из двух чисел.

// void CompareNumbers(int firstNumber, int secondNumber)
//    {
//         if (firstNumber == secondNumber)
//         {
//             Console.WriteLine($"Введенные числа равны `{firstNumber}`");
//         }
//         if (firstNumber > secondNumber)
//         {
//             Console.WriteLine($"Первое число `{firstNumber}` больше чем второе число `{secondNumber}`");
//         }
//         if (firstNumber < secondNumber)
//         {
//             Console.WriteLine($"Первое число `{firstNumber}` меньше чем второе число `{secondNumber}`");
//         }
//     }

// Console.WriteLine("Введите первое число: ");
// int firstNumber = int.Parse(Console.ReadLine()!);
// Console.WriteLine("Введите второе число: ");
// int secondNumber = int.Parse(Console.ReadLine()!);

// CompareNumbers(firstNumber, secondNumber);
// Console.WriteLine();


// Нахождение максимального из трёх.

// int FindMax(int a, int b, int c)
// {
//     int max = a;
//     if (b > max) max = b;
//     if (c > max) max = c;
//     return max;
// }

// Console.WriteLine("Введите первое число: ");
// int a = int.Parse(Console.ReadLine()!);
// Console.WriteLine("Введите второе число: ");
// int b = int.Parse(Console.ReadLine()!);
// Console.WriteLine("Введите третье число: ");
// int c = int.Parse(Console.ReadLine()!);

// int result = FindMax(a, b, c);
// Console.WriteLine($"Максимальное из трёх чисел = [ {result} ]");


// Нахождение чётного числа.


// bool FindEvenNumber(int number)
// {
//     if (number % 2 == 0)
//     {
//         Console.WriteLine($"Чётное число [{number}]");
//         return true;
//     }
//     else
//     {
//         Console.WriteLine($"Нечётное число [{number}]");
//         return false;
//     }
// }


// Console.WriteLine("Введите число: ");
// int number = int.Parse(Console.ReadLine()!);

// Console.WriteLine(FindEvenNumber(number));


// void CheckIfEven(int number)
//     {
//         if ((number % 2) == 0)
//         {
//             Console.WriteLine($"Число `{number}` чётное");
//         }
//         else
//         {
//             Console.WriteLine($"Число `{number}` нечётное");
//         }
//     }

// Console.WriteLine("Введите чисдо: ");
// int number = int.Parse(Console.ReadLine()!);
// CheckIfEven(number);
// Console.WriteLine();


// Вывести чётные числа


void PrintEvenNumbers(int number)
{
    for (int i = 2; i <= number; i+=2)
    Console.Write(i + " ");
}

Console.WriteLine("Введите чисдо: ");
int number = int.Parse(Console.ReadLine()!);
PrintEvenNumbers(number);
Console.WriteLine();