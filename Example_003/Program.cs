﻿// Задача 1: Задайте одномерный массив из 10 целых чисел 
// от 1 до 100. Найдите количество элементов массива, 
// значения которых лежат в отрезке [20,90].

using System.ComponentModel;

int[] NewArray()
{
    int[] newArray = new int[10];

    Random rand = new Random();
    for (int i = 0; i < 10; i++)
        newArray[i] = rand.Next(1, 101);
    return newArray;
}

void PrintArray(int[] newArray)
{
    for (int i = 0; i < newArray.Length; i++)
        System.Console.Write(newArray[i] + " ");
    System.Console.WriteLine();
}

int[] array = NewArray();
PrintArray(array);

int QuantityNumbers(int[] array)
{
    int begin = 20;
    int end = 90;
    int quantity = 0;
    for (int i = 0; i < array.Length; i++)
    
        if (array[i] >= begin && array[i] <= end)
            quantity++;
    
    return quantity;
}

int quantity = QuantityNumbers(array);
System.Console.WriteLine($"Количество чиcел в отрезке [20, 90] = {quantity}");


