// Задача 1: Задайте одномерный массив из 10 целых чисел 
// от 1 до 100. Найдите количество элементов массива, 
// значения которых лежат в отрезке [20,90].


// int[] NewArray()
// {
//     int[] newArray = new int[10];

//     Random rand = new Random();
//     for (int i = 0; i < 10; i++)
//         newArray[i] = rand.Next(1, 101);
//     return newArray;
// }

// void PrintArray(int[] newArray)
// {
//     for (int i = 0; i < newArray.Length; i++)
//         System.Console.Write(newArray[i] + " ");
//     System.Console.WriteLine();
// }

// int[] array = NewArray();
// PrintArray(array);

// int QuantityNumbers(int[] array)
// {
//     int begin = 20;
//     int end = 90;
//     int quantity = 0;
//     for (int i = 0; i < array.Length; i++)

//         if (array[i] >= begin && array[i] <= end)
//             quantity++;

//     return quantity;
// }

// int quantity = QuantityNumbers(array);
// System.Console.WriteLine($"Количество чиcел в отрезке [20, 90] = {quantity}");


// Задача 2: Задайте массив на 10 целых чисел. 
// Напишите программу, которая определяет количество 
// чётных чисел в массиве.

// int[] NewArray()
// {
//     int[] newArray = new int[10];
//     Random rand = new Random();

//     for (int i = 0; i < 10; i++)
//         newArray[i] = rand.Next(1, 101);

//     return newArray;
// }

// void PrintArray(int[] newArray)
// {
//     for (int i = 0; i < newArray.Length; i++)
//         System.Console.Write(newArray[i] + " ");
//     System.Console.WriteLine();
// }

// int[] array = NewArray();
// PrintArray(array);

// int EvenNumbers(int[] array)
// {
//     int count = 0;
//     for (int i = 0; i < array.Length; i++)

//     if (array[i] % 2 == 0)
//         count++;

//     return count;
// }

// int evenNumbers = EvenNumbers(array);
// System.Console.WriteLine($"Количество чётных чисел = {evenNumbers}");


// Задача 3: Задайте массив из вещественных чисел 
// с ненулевой дробной частью. Найдите разницу между 
// максимальным и минимальным элементов массива.


double[] CreateArray(int size)
{
    double[] newArray = new double[size];
    Random rand = new Random();

    for (int i = 0; i < size; i++)

        newArray[i] = Math.Round(rand.Next(1, 10) + rand.NextDouble(), 2);

return newArray;
}

void PrintArray(double[] newArray)
{
    for (int i = 0; i < newArray.Length; i++)

    System.Console.Write(newArray[i] + " ");
    System.Console.WriteLine();
}

System.Console.WriteLine("Введите количество элементов массива: ");
int size = Convert.ToInt32(Console.ReadLine());

double[] newArray = CreateArray(size);
PrintArray(newArray);

void DifferenceMinMax(double[] newArray)
{
    double min = newArray[0];
    double max = newArray[0];
    double difference = 0;
    int i = 1;

    while (i < newArray.Length)
    {
        if (min > newArray[i])
            min = newArray[i];
        if (max < newArray[i])
            max = newArray[i];
        i++;
    }
    difference = max - min;
    System.Console.Write($"Разница между максимальным и минимальным элементов массива: {difference:F2}");

}

DifferenceMinMax(newArray);
