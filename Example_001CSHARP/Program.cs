// Console.WriteLine("Введите ваше имя");
// string username = Console.ReadLine();
// Console.Write("Привет, ");
// Console.Write(username);

// int numberA = 3;
// int numberB = 5;
// int result = numberA + numberB;
// Console.WriteLe(result);

// double numberA = 12;
// double numberB = 5;
// Console.WriteLine(numberA / numberB);

// int numberA = new Random().Next(1, 10);
// int numberB = new Random().Next(1, 10);
// int result = numberA + numberB;
// Console.WriteLine($"{numberA} + {numberB} = {result}");

// Console.WriteLine("Введите имя пользователя: ");
// string username = Console.ReadLine();

// if (username == "Вера")
// {
//     Console.WriteLine("Ура, это же ВЕРА!");
// }
// else
// {
//     Console.WriteLine($"Привет, {username}");
// }

// int a = 1;
// int b = 2;
// int c = 6;
// int d = 8;
// int e = 4;

// int max = a;

// if (b > max) max = b;
// if (c > max) max = c;
// if (d > max) max = d;
// if (e > max) max = e;

// Console.WriteLine($"max = {max}");

Console.Clear();
// Console.SetCursorPosition(10, 4);
// Console.WriteLine("+");

int xa = 40;
int ya = 1;
int xb = 1;
int yb = 30;
int xc = 80;
int yc = 30;

Console.SetCursorPosition(xa, ya);
Console.WriteLine("+");

Console.SetCursorPosition(xb, yb);
Console.WriteLine("+");

Console.SetCursorPosition(xc, yc);
Console.WriteLine("+");

int x = xa;
int y = xb;

int count = 0;

while (count < 10000)
{
    int what = new Random().Next(0, 3);
    if (what == 0)
    {
        x = (x + xa) / 2;
        y = (y + ya) / 2;
    }

    if (what == 1)
    {
        x = (x + xb) / 2;
        y = (y + yb) / 2;
    }

    if (what == 2)
    {
        x = (x + xc) / 2;
        y = (y + yc) / 2;
    }

    Console.SetCursorPosition(x, y);
    Console.WriteLine("+");
    count++;
}