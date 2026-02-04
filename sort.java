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
//         obj.isSorted(arr);
//         input.close();
//     }
// }
// class Solution {
//     public void isSorted(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 System.out.print("array is not sorted");
//                 return;
//             }
//         }
//         System.out.print("array is sorted");
//     }
// }


// ArrayList cannot be accessed with []. use int() <- parentheses 
//In Java, ArrayList elements are accessed using .get(index) 
//nums.get(i)
//nums.get(i + 1)

import java.util.ArrayList;

class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        
        for(int i=0;i<nums.size() - 1 ;i++){
            if(nums.get(i)>nums.get(i+1)){
            
                return false;
            }
        }
        return true;
    }
}