class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n; j++){
            if(nums[i]+nums[j]==target){
              return new int[] { i, j };
            }
          }
        }
        
      return new int[] {};
    }
}
// import java.util.Scanner;

// class Solution {

//     public void twosum(int[] arr, int target) {
       
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//           for(int j=i+1;j<n; j++){
//             if(arr[i]+arr[j]==target){
//               System.out.print("["+ i +','+ j+']');
//               return;
//             }
//           }
//         }
        
//        System.out.println("no such pairs");
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
        
//         int[] arr = new int[n];
        
//         for(int i=0;i<n;i++){
//           arr[i] = input.nextInt();
//         }
        
//         int target = input.nextInt();

//         Solution obj = new Solution();
//         obj.twosum(arr, target);
//     }
// }
