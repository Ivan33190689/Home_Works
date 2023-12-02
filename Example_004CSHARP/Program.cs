// Двумерный массив – массив, элементами которого являются одномерные
// массивы одинакового размера.

// Другие названия двумерного массива:
// • таблица
// • матрица
// • массив массивов

//  имя массива.GetLength(0) - возврашает строку;
// имя массива.GetLength(1) - возвращает столбеч;

//  int[.] matrix = new int[5, 8];
// 1 - строки, 2 - столбицы;

// string[,] table = new string[2, 5];
// table[1, 2] = "слово";

// for (int rows = 0; rows < 2; rows++)
// {
//     for (int columns = 0; columns < 5; columns++)
//     {
//         System.Console.WriteLine($"{table[rows, columns]}--");
//     }
// }


// int[,] matrix = new int[3, 4];

// for (int i = 0; i < 3; i++)
// {
//     for (int j = 0; j < 4; j++)
//     {
//         System.Console.Write($"{matrix[i, j]} ");
//     }
//     System.Console.WriteLine();
// }

// void PrintArray(int[,] matr)
// {
//     for (int i = 0; i < matr.GetLength(0); i++)
//     {
//         for (int j = 0; j < matr.GetLength(1); j++)
//         {
//             System.Console.Write($"{matr[i, j]} ");
//         }
//         System.Console.WriteLine();
//     }
// }
// int[,] matrix = new int[3, 4];
// PrintArray(matrix);

// void FillArray(int[,] matr)
// {
//     Random rand = new Random();

//     for (int i = 0; i < matr.GetLength(0); i++)
//         for (int j = 0; j < matr.GetLength(1); j++)
//             matr[i, j] = rand.Next(1, 10);
// }

// void PrintArray(int[,] matr)
// {
//     for (int i = 0; i < matr.GetLength(0); i++)
//     {
//         for (int j = 0; j < matr.GetLength(1); j++)
//         {
//             System.Console.Write($"{matr[i, j]} ");
//        }
//         System.Console.WriteLine();
// }
// }

// int[,] matrix = new int[3, 4];
// FillArray(matrix);
// PrintArray(matrix);

// Метод вычисления факториала.

// int Factorial(int n)
// {
//     if (n == 1 || n == 0) return 1;
//     else return n * Factorial(n - 1);
// }
// for (int i = 1; i < 40; i++)
// {
//     Console.WriteLine($"({i}) ! = {Factorial(i)}");

// }

// Метод вычисления фибоначчи.

double Fibonacci(int n)
{
    if (n == 1 || n == 2) return 1;
    else return Fibonacci(n - 1) + Fibonacci(n - 2);
}

for (int i = 1; i <= 50; i++)
{
    Console.WriteLine($"f({i}) = {Fibonacci(i)}");
}

