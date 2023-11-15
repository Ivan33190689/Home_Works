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

int a = 1;
int b = 2;
int c = 6;
int d = 8;
int e = 4;

int max = a;

if (b > max) max = b;
if (c > max) max = c;
if (d > max) max = d;
if (e > max) max = e;

Console.WriteLine($"max = {max}");