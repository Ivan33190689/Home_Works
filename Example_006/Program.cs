// Задача 1: Создание строки из двумерного массива символов.

// char[,] charArray = new char[,] { { 'a', 'b' }, { 'c', 'd' } };
// string result = "";

// for (int i = 0; i < charArray.GetLength(0); i++)
// {
//     for (int j = 0; j < charArray.GetLength(1); j++)
//     {
//         result += charArray[i, j];
//     }
// }

// System.Console.WriteLine(result);


// Задача 2: Замена заглавных букв на строчные в строке.

// string str = "HeLLo WorlD!";
// string result = str.ToLower();
// Console.WriteLine(result);


// Задача 3: Проверка строки на палиндром.

bool IsPalindrome(string word)
{
    int length = word.Length;

    for (int i = 0; i < length / 2; i++)
    {
        if (word[i] != word[length - 1 - i])
        {
            return false;
        }
    }
    return true;
}

System.Console.WriteLine("Введите слово: ");
string words = Console.ReadLine()!;
string str = words.ToLower();
bool word = IsPalindrome(str);
System.Console.WriteLine(word);
