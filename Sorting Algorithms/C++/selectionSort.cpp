#include <iostream>
using namespace std;

int findMinIndex(int arr[], int lastIndex)
{
    // Assuming the 0th index to be min
    int min = 0;
    for (int i = 0; i <= lastIndex; i++)
    {
        if (arr[i] < arr[min])
        {
            min = i;
        }
    }
    return min;
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Outer loop for selecting the current last index
    for (int i = 0; i < size - 1; i++)
    {
        int lastIndex = size - 1 - i;

        // Function to find index with minimum index
        int findMinIndex(int arr[], int lastIndex);
        int minIndex = findMinIndex(arr, lastIndex);
        if (arr[lastIndex] != arr[minIndex])
        {
            int swap = arr[lastIndex];
            arr[lastIndex] = arr[minIndex];
            arr[minIndex] = swap;
        }
    }

    cout << "Array after sorting : ";
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}
