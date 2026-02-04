// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//           for(int j=i+1;j<n; j++){
//             if(nums[i]+nums[j]==target){
//               return new int[] { i, j };
//             }
//           }
//         }
        
//       return new int[] {};
//     }
// }
import java.util.Scanner;

class Solution {

    public void twosum(int[] arr, int target) {
       
        int n=arr.length;
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n; j++){
            if(arr[i]+arr[j]==target){
              System.out.print("["+ i +','+ j+']');
              return;
            }
          }
        }
        
       System.out.println("no such pairs");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
          arr[i] = input.nextInt();
        }
        
        int target = input.nextInt();

        Solution obj = new Solution();
        obj.twosum(arr, target);
        input.close();
    }
}

// import java.util.Scanner;

// class Solution {

//     // Method to find two sum
//     public void twoSum(int[] arr, int target) {

//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {

//                 if (arr[i] + arr[j] == target) {
//                     System.out.println("[" + i + ", " + j + "]");
//                     return;
//                 }
//             }
//         }

//         System.out.println("no such pairs");
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         int n = input.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = input.nextInt();
//         }

//         int target = input.nextInt();

//         // Create object of Solution
//         Solution obj = new Solution();
//         obj.twoSum(arr, target);

//         input.close();
//     }
// }    ***************************************************************
