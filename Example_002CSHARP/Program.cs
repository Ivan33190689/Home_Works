// int MaxNumber(int arg1, int arg2, int arg3)
// {
//     int result = arg1;
//     if (arg2 > result) result = arg2;
//     if (arg3 > result) result = arg3;
//     return result;
// }

// int a1 = 4;
// int b1 = 5;
// int c1 = 16;
// int a2 = 1;
// int b2 = 9;
// int c2 = 52;
// int a3 = 63;
// int b3 = 26;
// int c3 = 61;

// int max1 = MaxNumber(a1, b1, c1);
// int max2 = MaxNumber(a2, b2, c2);
// int max3 = MaxNumber(a3, b3, c3);
// int max = MaxNumber(max1, max2, max3);

// System.Console.WriteLine(max);

// int[] array = {35, 28, 71, 28, 48, 72, 85, 58, 47};

// int max = MaxNumber(MaxNumber(array[0], array[1], array[2]), MaxNumber(array[3], array[4], array[5]), MaxNumber(array[6], array[7], array[8]));

// System.Console.WriteLine(max);


int[] array = {54, 17, 25, 74, 4, 15, 3, 75};

int n = array.Length;
int find = 15;
int index = 0;

while (index < n)
{
    if (array[index] == find)
    {
        System.Console.WriteLine(index);
        break; 
    }
    index++;
}