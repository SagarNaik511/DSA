// How do you count 1s?
// Example (6 columns):
// 0 0 1 1 1 1
// First 1 is at index 2
// Number of 1s = 6 - 2 = 4 using binary search

// import java.util.*;
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
      
//         int n = input.nextInt();
//         int m = input.nextInt();
        
//         int[][] arr = new int[n][m];
//         for (int i = 0; i < n; i++) {
//           for (int j = 0; j < n; j++){
//             arr[i][j] = input.nextInt();
//         }
//         }
    
//       Solution obj = new Solution();
//       int ans = obj.rowWithMax1s(arr,n,m);
//       System.out.print("max number of ones found in: "+ ans);
//       input.close();
//   }
// }
// class Solution {

//     // Binary search to find first 1 in a row
//     private int firstOne(int[] row, int m) {
//         int low = 0, high = m - 1;
//         int ans = m;   // default if no 1 is found

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (row[mid] == 1) {
//                 ans = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }

//     // Main method to find row with maximum 1s
//     public int rowWithMax1s(int[][] mat, int n, int m) {

//         int maxOnes = 0;
//         int rowIndex = -1;

//         for (int i = 0; i < n; i++) {

//             int firstIndex = firstOne(mat[i], m);
//             int onesCount = m - firstIndex;

//             if (onesCount > maxOnes) {
//                 maxOnes = onesCount;
//                 rowIndex = i;
//             }
//         }

//         return rowIndex;
//     }
// }

class Solution {
    public int rowWithMax1s(int[][] mat) {
       int n = mat.length;
       int m = mat[0].length;
       int maxOnes = 0;
        int rowIndex = -1;

        for (int i = 0; i < n; i++) {

            int firstIndex = firstOne(mat[i], m);
            int onesCount = m - firstIndex;

            if (onesCount > maxOnes) {
                maxOnes = onesCount;
                rowIndex = i;
            }
        }

        return rowIndex;
    }

    private int firstOne(int[] row, int m) {
        int low = 0, high = m - 1;
        int ans = m;   // cause if no 1 found then we can do m - firstIndex = m - m = 0

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == 1) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

}