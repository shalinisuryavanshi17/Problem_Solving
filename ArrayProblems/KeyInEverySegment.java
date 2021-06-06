package ArrayProblems;

import java.util.*;

public class KeyInEverySegment {
    public static boolean findxinkindowSize(int N, int[] arr, int x, int k) {
        int i;
        boolean b = false;

        // Iterate from 0 to N - 1
        for (i = 0; i < N; i = i + k) {

            // Iterate from 0 to k - 1
            for (int j = 0; j < k; j++) {
                if (i + j < N && arr[i + j] == x)
                    break;

                if (j == k)
                    return false;
                if (i + j >= N)
                    return false;
            }
        }
        if (i >= N)
            return true;
        else
            return b;
    }

    // Driver Code
    public static void main(String args[]) {
        int arr[] = new int[] { 5, 8, 7, 12, 14, 3, 9 };
        int x = 8, k = 2;
        int n = arr.length;
        if (findxinkindowSize(n, arr, x, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}