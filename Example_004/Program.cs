// Задача 1: Напишите программу, которая бесконечно 
// запрашивает целые числа с консоли. 
// Программа завершается при вводе символа ‘q’ 
// или при вводе числа, сумма цифр которого чётная.

void OutputProgram()
{
    System.Console.Write("Введите 'q' или число для выхода: ");
    string input = Console.ReadLine();

    if (input == "q")
    {
        System.Console.WriteLine("[STOP]");
        return;
    }

    int number;
    
    if (int.TryParse(input, out number))
    {
        int sum = 0;
        
        while (number > 0)
        {
            sum += number % 10;
            number /= 10;
        }

        if (sum % 2 == 0)
        {
            System.Console.WriteLine("[STOP]");
            return;
        }
        else
        {
            System.Console.WriteLine("Некорректный ввод. Введите целое число или 'q': ");
        }
    }
}

OutputProgram();