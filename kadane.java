// import java.util.*;
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         int n = input.nextInt();
        
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = input.nextInt();
//         }
        
//         Solution obj = new Solution();
//         int maxsum = obj.kadane(arr);
//         System.out.print("Max continuous sum:"+maxsum);
//         input.close();
//     }
// }
// class Solution {
//     public int sumof(int[] arr) {
//     int n = arr.length;
//     int sum =0;
//     for(int i=0;i<n;i++){
//       sum = sum + arr[i];
//     }
//     return sum;
//   }
  
//   public int kadane(int[] arr){
//     int n = arr.length;
//     int her = sumof(arr);
//     int sum2 =0;
//     for(int i=0;i<n;i++){
//       sum2+=arr[i];
//       if(sum2 > her){
//         her = sum2;
//       }
//     }
//     return her;
//   }
// }

class Solution {
    public int maxSubArray(int[] nums) {  
        int currentSum = 0;
        int maxSum = nums[0];   

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;   
            }
        }
        return maxSum;
    }
}

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         int n = input.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = input.nextInt();
//         }

//         Solution obj = new Solution();
//         int maxsum = obj.kadane(arr);

//         System.out.print("Max continuous sum: " + maxsum);
//         input.close();
//     }
// }
// class Solution {

//     // helper method (still useful)
//     public int sumof(int[] arr) {
//         int sum = 0;
//         for (int x : arr) {
//             sum += x;
//         }
//         return sum;
//     }

//     // PROPER Kadane
//     public int kadane(int[] arr) {

//         int currentSum = 0;
//         int maxSum = arr[0];   // IMPORTANT FIX

//         for (int i = 0; i < arr.length; i++) {

//             currentSum += arr[i];

//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }

//             if (currentSum < 0) {
//                 currentSum = 0;   // KEY KADANE STEP
//             }
//         }
//         return maxSum;
//     }
// }


