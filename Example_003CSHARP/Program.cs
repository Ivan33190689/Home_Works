// Вид 1.
// void Method1()
// {
//     Console.WriteLine("Текст ... ");
// }
//     Method1();


// Вид 2.
// void Method2(string msg)
// {
//     Console.WriteLine(msg);
// // }
// Method2(msg: "Текст сообщения");

// Вид 2.1.
// void Method2_1(string msg, int count)
// {
//     int i = 0;
//     while(i < count)
//     {
//         Console.WriteLine(msg);
//         i++;
//     }
// }
// Method2_1(msg: "Текст сообщения", count: 4);


// Вид 3.
// int Method3()
// {
//     return DateTime.Now.Year;
// }
// int year = Method3();
// Console.WriteLine(year);


// Вид 4.
// string Method4(int count, string text)
// {
//     int i = 0;
//     string result = String.Empty;

//     while(i < count)
//     {
//         result = result + text;
//         i++;
//     }
//     return result;
// }
// string res = Method4(5, " Smile, ");
// Console.WriteLine(res);


// Вид 4.1.

// string Method4(int count, string text)
// {
//     string result = String.Empty;

//     for(int i = 0; i < count; i++)
//     {
//         result = result + text;
//     }
//     return result;
// }
// string res = Method4(5, " Smile, ");
// Console.WriteLine(res);


// Таблица умножения.

// for(int i = 2; i<= 10; i++)
// {
//     for(int n = 2; n <= 10; n++)
//     {
//         Console.WriteLine($"{i} * {n} = {i * n}");
//     }
//     Console.WriteLine();
// }


// Упорядочить массив от минимального значения до максимального.

// int[] CreateRandomArray(int size, int minValue, int maxValue)
// {
//     int[] array = new int[size];

//     for(int i = 0; i < size; i++)
//     array[i] = new Random().Next(minValue, maxValue + 1);

//     return array;
// }

// void ShowArray(int[] array)
// {
//     for(int i = 0; i < array.Length; i++)
//     Console.Write(array[i] + " ");
//     {
//     Console.WriteLine();
//     }
// }

// void SelectPosition(int[] array)
// {

//     for(int i = 0; i < array.Length; i++)
//     {
//         int min = i;

//         for(int j = i + 1; j < array.Length; j++)
//         {
//             if(array[j] < array[min]) min = j;
//         }
//         int temp = array[i];
//         array[i] = array[min];
//         array[min] = temp;
//     }
// }

// Console.WriteLine("Input a size for array: ");
// int size = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine("Input a min possible: ");
// int min = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine("Input a max possible: ");
// int max = Convert.ToInt32(Console.ReadLine());

// int[] newarray = CreateRandomArray(size, min, max);
// ShowArray(newarray);

// SelectPosition(newarray);
// ShowArray(newarray);


// Наоборот. От наибольшего к наименьшему.

int[] CreateRandomArray(int size, int minValue, int maxValue)
{
    int[] array = new int[size];

    for(int i = 0; i < size; i++)
    array[i] = new Random().Next(minValue, maxValue + 1);

    return array;
}

void ShowArray(int[] array)
{
    for(int i = 0; i < array.Length; i++)
    Console.Write(array[i] + " ");
    {
    Console.WriteLine();
    }
}

void SelectPosition(int[] array)
{

    for(int i = 0; i < array.Length; i++)
    {
        int max = i;

        for(int j = i + 1; j < array.Length; j++)
        {
            if(array[j] > array[max]) max = j;
        }
        int temp = array[i];
        array[i] = array[max];
        array[max] = temp;
    }
}

Console.WriteLine("Input a size for array: ");
int size = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Input a min possible: ");
int min = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Input a max possible: ");
int max = Convert.ToInt32(Console.ReadLine());

int[] newarray = CreateRandomArray(size, min, max);
ShowArray(newarray);

SelectPosition(newarray);
ShowArray(newarray);