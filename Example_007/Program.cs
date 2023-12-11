int ReadInt(string text)
{
    System.Console.Write(text);

    return int.Parse(Console.ReadLine()!);
}


// Задача 1: Задайте значения M и N. Напишите программу, которая выведет все натуральные числа в промежутке от M до N. 
// Использовать рекурсию, не использовать циклы.

// int PrintNumbers(int M, int N)
// {
//     if (M > N) return M;

//     System.Console.Write(M + " ");

//     return PrintNumbers(M + 1, N);
// }

// int M = ReadInt("Ввелите первое число: ");
// int N = ReadInt("Введите второе число: ");
// PrintNumbers(M, N);


// Задача 2: Напишите программу вычисления функции 
// Аккермана с помощью рекурсии. 
// Даны два неотрицательных числа m и n.
// m = 2, n = 3 -> A(m,n) = 9
// m = 3, n = 2 -> A(m,n) = 29


// int FuncAckerman(int m, int n)
// {
//     if (m == 0) return n + 1;
//     else if (m > 0 && n == 0) return FuncAckerman(m - 1, 1);
//     else return FuncAckerman(m - 1, FuncAckerman(m, n - 1));
// }

// int m = ReadInt("Введите число m: ");
// int n = ReadInt("Введите число n: ");
// System.Console.WriteLine(FuncAckerman(m, n));


// Задача 3: Задайте произвольный массив. 
// Выведете его элементы, начиная с конца. 
// Использовать рекурсию, не использовать циклы.

int[] GenerateArray(int size, int min, int max)
{
    int[] array = new int[size];
    Random rand = new Random();

    for (int i = 0; i < size; i++)

        array[i] = rand.Next(min, max);

    return array;
}

void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
        System.Console.Write(array[i] + " ");
    System.Console.WriteLine();
}

void ReverseArray(int[] array, int index)
{
    if (index < 0) return;

    System.Console.Write(array[index] + " ");
    ReverseArray(array, index - 1);
}

void Main(string[] args)
{
    int size = ReadInt("Введите размер массива: ");
    int[] array = GenerateArray(size, 0, 100);
    System.Console.WriteLine("Исходный массив");
    PrintArray(array);

    System.Console.WriteLine("Перевёрнутый массив");
    ReverseArray(array, array.Length - 1);
    System.Console.WriteLine();
}

Main(args);