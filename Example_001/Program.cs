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

int FindMax(int a, int b, int c)
{
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    return max;
}

Console.WriteLine("Введите первое число: ");
int a = int.Parse(Console.ReadLine()!);
Console.WriteLine("Введите второе число: ");
int b = int.Parse(Console.ReadLine()!);
Console.WriteLine("Введите третье число: ");
int c = int.Parse(Console.ReadLine()!);

int result = FindMax(a, b, c);
Console.WriteLine($"Максимальное из трёх чисел = [ {result} ]");


