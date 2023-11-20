int MaxNumber(int arg1, int arg2, int arg3)
{
    int result = arg1;
    if (arg2 > result) result = arg2;
    if (arg3 > result) result = arg3;
    return result;
}

int a1 = 4;
int b1 = 5;
int c1 = 16;
int a2 = 1;
int b2 = 9;
int c2 = 52;
int a3 = 63;
int b3 = 26;
int c3 = 61;

int max1 = MaxNumber(a1, b1, c1);
int max2 = MaxNumber(a2, b2, c2);
int max3 = MaxNumber(a3, b3, c3);
int max = MaxNumber(max1, max2, max3);
System.Console.WriteLine(max);