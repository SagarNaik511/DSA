class Solution {
    public int secondLargestElement(int[] nums) {
    int largest, secondlargest;
        if(nums[0]>nums[1]){
          largest=nums[0];
          secondlargest=nums[1];
        }else{
          largest=nums[1];
          secondlargest=nums[0];
        }
        
        for(int i=2;i<nums.length;i++){
          if(nums[i]>largest){
            secondlargest=largest;
            largest=nums[i];
          }
          else if(nums[i]>secondlargest && nums[i] != largest){
               secondlargest=nums[i];
          }
        }
        return secondlargest;
    }   
}

// class Solution {
//     public int secondLargestElement(int[] nums) {

//         // Edge case: fewer than 2 elements
//         if (nums == null || nums.length < 2) {
//             return -1;
//         }

//         int largest = nums[0];
//         int secondLargest = -1;

//         // First pass: find the largest
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] > largest) {
//                 largest = nums[i];
//             }
//         }

//         // Second pass: find the largest element < largest
//         boolean found = false;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] < largest) {
//                 if (!found || nums[i] > secondLargest) {
//                     secondLargest = nums[i];
//                     found = true;
//                 }
//             }
//         }

//         return found ? secondLargest : -1;
//     }
// }
