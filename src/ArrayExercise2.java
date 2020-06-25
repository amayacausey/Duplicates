import java.util.Arrays;
import java.util.Scanner;
public class ArrayExercise2 {
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
        int[] arr = new int [10];
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number. Number 0"+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i=0; i<n; i++)
        {
        System.out.print(arr[i]+" ");
        }

        }
        static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty
        // or contains a single element
        if (n==0 || n==1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];


        temp[j++] = arr[n-1];

        // Modify original array
        for (int i=0; i<j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }
}


