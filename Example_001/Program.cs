// Большее из двух чисел.

void CompareNumbers(int firstNumber, int secondNumber)
   {
        if (firstNumber == secondNumber)
        {
            Console.WriteLine($"Введенные числа равны `{firstNumber}`");
        }
        if (firstNumber > secondNumber)
        {
            Console.WriteLine($"Первое число `{firstNumber}` больше чем второе число `{secondNumber}`");
        }
        if (firstNumber < secondNumber)
        {
            Console.WriteLine($"Первое число `{firstNumber}` меньше чем второе число `{secondNumber}`");
        }
    }

Console.WriteLine("Введите первое число: ");
int firstNumber = int.Parse(Console.ReadLine()!);
Console.WriteLine("Введите второе число: ");
int secondNumber = int.Parse(Console.ReadLine()!);

CompareNumbers(firstNumber, secondNumber);
Console.WriteLine();