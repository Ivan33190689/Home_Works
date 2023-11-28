// Задача 1: Напишите программу, которая бесконечно 
// запрашивает целые числа с консоли. 
// Программа завершается при вводе символа ‘q’ 
// или при вводе числа, сумма цифр которого чётная.

// void OutputProgram()
// {
//     System.Console.Write("Введите 'q' или число для выхода: ");
//     string input = Console.ReadLine();

//     if (input == "q")
//     {
//         System.Console.WriteLine("[STOP]");
//         return;
//     }

//     int number;

//     if (int.TryParse(input, out number))
//     {
//         int sum = 0;
//         while (number > 0)
//         {
//             sum += number % 10;
//             number /= 10;
//         }

//         if (sum % 2 == 0)
//         {
//             System.Console.WriteLine("[STOP]");
//             return;
//         }
//         else
//         {
//             System.Console.WriteLine("Некорректный ввод. Введите целое число или 'q': ");
//         }
//     }
// }

// OutputProgram();


// Задача 2: Задайте массив заполненный случайными трёхзначными числами.
// Напишите программу, которая покажет количество чётных чисел в массиве.

int[] CreateArray()
{
    System.Console.WriteLine("Введите количество элементов массива: ");
    int size = int.Parse(Console.ReadLine()!);

    int[] array = new int[size];
    Random rand = new Random();

    for (int i = 0; i < size; i++)
        array[i] = rand.Next(100, 1000);

    return array;
}

void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
        System.Console.Write(array[i] + " ");
        System.Console.WriteLine();
}


int[] array = CreateArray();
PrintArray(array);

int DifferenceEvenNumbers(int[] array)
{
    int count = 0;

    for (int i = 0; i < array.Length; i++)

    if (array[i] % 2 == 0)
        count++;

    return count;
}

int count = DifferenceEvenNumbers(array);
System.Console.WriteLine($"Количество трёхзначных чётных чисел в массиве - {count}");