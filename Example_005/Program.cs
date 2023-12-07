// Реализация матрицы.

int ReadInt(string text)
{
    Console.Write(text);

    return int.Parse(Console.ReadLine()!);
}

int[,] GenerationArray2d(int row, int col, int min, int max)
{
    int[,] array = new int[row, col];
    Random rand = new Random();

    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++)
            array[i, j] = rand.Next(min, max + 1);

    return array;
}

void PrintArray2d(int[,] arrayforprint)
{
    for (int i = 0; i < arrayforprint.GetLength(0); i++)
    {
        for (int j = 0; j < arrayforprint.GetLength(1); j++)
        {
            System.Console.Write(arrayforprint[i, j] + "\t");
        }
        System.Console.WriteLine();
    }
}


// Задача 1: Напишите программу, которая на вход принимает 
// позиции элемента в двумерном массиве, и возвращает значение этого 
// элемента, или же указание, что такого элемента нет.

// bool FindNumber(int[,] array2d, int number)
// {
//     for (int i = 0; i < array2d.GetLength(0); i++)
//     {
//         for (int j = 0; j < array2d.GetLength(1); j++)
//         {
//             if (number == array2d[i, j])
//             {
//                 return true;
//             }
//         }
//     }
//     return false;
// }

// int rows = ReadInt("Введите количество строк массива: ");
// int columns = ReadInt("Введите количество столбцов массива: ");

// int[,] array2d = GenerationArray2d(rows, columns, 0, 100);
// PrintArray2d(array2d);

// int number = ReadInt("Введите число: ");
// bool Existnumber = FindNumber(array2d, number);

// if (Existnumber)
// {
//     System.Console.WriteLine("Число существует! ");
// }
// else
// {
//     System.Console.WriteLine("Такого числа нет! ");
// }

// System.Console.WriteLine(Existnumber);


// Задача 2: Задайте двумерный массив.
// Напишите программу, которая поменяет местами первую и последнюю строку массива.

// void SwapRowsArray2d(int[,] array2d)
// {
//     int row = array2d.GetLength(0);
//     int col = array2d.GetLength(1);

//     if (row < 2) return;

//     for (int j = 0; j < col; j++)
//     {
//         int temp = array2d[0, j];
//         array2d[0, j] = array2d[row - 1, j];
//         array2d[row - 1, j] = temp;
//     }
// }

// int rows = ReadInt("Введите количество строк массива: ");
// int columns = ReadInt("Введите количество столбцов массива: ");

// int[,] array2d = GenerationArray2d(rows, columns, 0, 100);
// PrintArray2d(array2d);
// System.Console.WriteLine();

// SwapRowsArray2d(array2d);
// PrintArray2d(array2d);


// Задача 3: Задайте прямоугольный двумерный массив. 
// Напишите программу, которая будет находить строку с наименьшей суммой элементов.

int MinSumRow(int[,] matrix)
{
    int indexRow = 0;
    int minSumRow = int.MaxValue;
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        int rowSum = 0;
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            rowSum += matrix[i, j];
        }
        if (rowSum < minSumRow)
        {
            minSumRow = rowSum;
            indexRow = i;
        }
    }
    return indexRow;
}

int[] MinRowArray(int[,] matrix, int index)
{
    int[] rowArray = new int[matrix.GetLength(1)];

    for (int k = 0; k < matrix.GetLength(1); k++)
    {
        rowArray[k] = matrix[index, k];
    }
    return rowArray;
}

void PrintArray(int[] array)
{
    System.Console.WriteLine($"[{String.Join(" | ", array)}]");
}

int rows = ReadInt("Введите количество строк массива: ");
int columns = ReadInt("Введите количество столбцов массива: ");

int[,] array2d = GenerationArray2d(rows, columns, 0, 10);
PrintArray2d(array2d);
System.Console.WriteLine();

int minIndexRow = MinSumRow(array2d);
System.Console.WriteLine(minIndexRow);

int[] minRow = MinRowArray(array2d, minIndexRow);
PrintArray(minRow);


// Задача 4*(не обязательная): Задайте двумерный массив из целых чисел. 
// Напишите программу, которая удалит строку и столбец, на пересечении 
// которых расположен наименьший элемент массива. Под удалением понимается создание нового двумерного массива без строки и столбца

// int[] FindMinNumberIndexes(int[,] matrix)
// {
//     int[] minNumberPosition = new int[2];

//     for (int i = 0; i < matrix.GetLength(0); i++)
//     {
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
//             if (matrix[i, j] < matrix[minNumberPosition[0], minNumberPosition[1]])
//             {
//                 minNumberPosition[0] = i;
//                 minNumberPosition[1] = j;
//             }
//         }
//     }
//     return minNumberPosition;
// }

// int[,] DeleteRowAndColumns(int[,] oldmatrix, int[] indexes)
// {
//     int[,] newMatrix = new int[oldmatrix.GetLength(0) - 1, oldmatrix.GetLength(1) - 1];

//     for (int i = 0, x = 0; i < oldmatrix.GetLength(0); i++)
//     {
//         if (i == indexes[0]) continue;
//         for (int j = 0, y = 0; j < oldmatrix.GetLength(1); j++)
//         {
//             if (j == indexes[1]) continue;
//             newMatrix[x, y] = oldmatrix[i, j];
//             y++;
//         }
//         x++;
//     }
//     return newMatrix;
// }

// int rows = ReadInt("Введите количество строк массива: ");
// int columns = ReadInt("Введите количество столбцов массива: ");

// int[,] array2d = GenerationArray2d(rows, columns, 0, 10);
// PrintArray2d(array2d);
// System.Console.WriteLine();

// int[] minNumberPosition = FindMinNumberIndexes(array2d);
// System.Console.WriteLine(string.Join(" ", minNumberPosition));
// PrintArray2d(DeleteRowAndColumns(array2d, minNumberPosition));


