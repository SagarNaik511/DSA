// Linear Search

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
    
//      Solution obj = new Solution();
//       int ans = obj.binaryS(arr,target);
//       System.out.print("element found in "+ ans);
//     input.close();
//   }
// }
//   class Solution{
//     public int binaryS(int[] arr, int target){
//      int n = arr.length; 
//      for(int i=0;i<n;i++){
//        if(target==arr[i]){
//          return i;
//        }
//      }
//      return -1;
//   }
// }


// Binary Search

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
    
//      Solution obj = new Solution();
//       int ans = obj.binaryS(arr,target);
//       System.out.print("element found in the index:"+ ans);
//     input.close();
//   }
// }
//   class Solution{
//     public int binaryS(int[] arr, int target){
//      int n = arr.length; 
//      int start = 0;
//      int end = n-1;
//     while(start<=end){
//       int mid = start + (end - start)/2;
    
//        if(target<arr[mid]){
//          end=mid -1;
//        }else if(target>arr[mid]){
//          start = mid + 1;
//        }else{
//          return mid;
//        }
//     }
//      return -1;
// }
// }

// while loop is used when we don't know the number of iterations in advance, whereas for loop is used when we know the number of iterations beforehand.

class Solution {
    public int search(int[] nums, int target) { 
     int start = 0;
     int end = nums.length - 1;
    while(start<=end){
      int mid = start + (end - start)/2;
    
       if(target<nums[mid]){
         end=mid -1;
       }else if(target>nums[mid]){
         start = mid + 1;
       }else{
         return mid;
       }
    }
     return -1;
    }
}