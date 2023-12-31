// Задача: Написать программу, которая из имеющегося массива строк 
// формирует новый массив из строк, длина которых меньше, либо равна 3 символам. 
// Первоначальный массив можно ввести с клавиатуры, либо задать на старте выполнения алгоритма. При решении не рекомендуется пользоваться коллекциями, лучше обойтись исключительно массивами.

// Примеры:
// [“Hello”, “2”, “world”, “:-)”] → [“2”, “:-)”]
// [“1234”, “1567”, “-2”, “computer science”] → [“-2”]
// [“Russia”, “Denmark”, “Kazan”] → []


System.Console.Write("Введите количество строк: ");
int size = int.Parse(Console.ReadLine()!);

string[] myArray = new string[size];

System.Console.WriteLine("Введите строки: ");
for (int i = 0; i < size; i++)
{
    System.Console.Write($"Строка {i + 1}: ");
    myArray[i] = Console.ReadLine();
}

System.Console.WriteLine($"\nВы ввели строки");
for (int i = 0; i < size; i++)
{
    System.Console.WriteLine($"Строка {i + 1}: {myArray[i]} ");
}

string[] newArray = myArray.Where(str => str.Length <= 3).ToArray();

System.Console.Write($"\nНужные строки по условию задачи");
foreach (string letters in newArray)
{
    System.Console.Write($"\n{letters}");
}