// import java.util.*;
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
      
//         int n = input.nextInt();
//         int target = input.nextInt();
        
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = input.nextInt();
//         }
    
//       Solution obj = new Solution();
//       int ans = obj.binaryS(arr,target);
//       System.out.print("element found in "+ ans);
//     input.close();
//   }
// }
//   class Solution{
//     public int binaryS(int[] arr, int target){
//       int n = arr.length; 
//       for(int i=0;i<n;i++){
//         if(target < arr[i] || target == arr[i]){
//           return i;
//         }
//       }
//       return -1;
//   }
// }

class Solution {
    public int searchInsert(int[] nums, int target) {
     
      for(int i=0;i< nums.length;i++){
        if(target < nums[i] || target == nums[i]){
          return i;
        }
      }
      return -1;
    }
}
