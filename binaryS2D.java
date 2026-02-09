// import java.util.*;
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
      
//         int n = input.nextInt();
//         int m = input.nextInt();
        
//         int target = input.nextInt();
        
//         int[][] arr = new int[n][m];
//         for (int i = 0; i < n; i++) {
//           for (int j = 0; j < n; j++){
//             arr[i][j] = input.nextInt();
//         }
//         }
    
//       Solution obj = new Solution();
//       int ans = obj.binarySearch(arr,target);
//       System.out.print("element fount in: "+ ans);
//       input.close();
//   }
// }
// class Solution {
//     public int binarySearch(int[][] mat, int target) {
//         int n = mat.length;
//         int m = mat[0].length;
        
//         int low = 0;
//         int high = n*m - 1;

//         while (low <= high) {
//           int mid = low + (high - low)/2;
//           int row = mid/m;
//           int col = mid%m;
          
//           if(mat[row][col] > target){
//             high = mid - 1;
//           }else if(mat[row][col] < target){
//             low = mid + 1;
//           }else{
//             return mid;
//           }
//         }  
//         return -1;
//     }
// }

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        
        int low = 0;
        int high = n*m - 1;

        while (low <= high) {
          int mid = low + (high - low)/2;
          int row = mid/m;
          int col = mid%m;
          
          if(mat[row][col] > target){
            high = mid - 1;
          }else if(mat[row][col] < target){
            low = mid + 1;
          }else{
            return true;
          }
        }  
        return false;
    }
}
