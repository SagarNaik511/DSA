// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
      
//       int n = input.nextInt();
//         int[] prices = new int[n];

//         for (int i = 0; i < n; i++) {
//             prices[i] = input.nextInt();
//         }
        
      
     
//      Solution obj = new Solution();
//      obj.profit(prices);
//     input.close();
//   }
// }
//   class Solution{
//     public void profit(int[] prices){
//      int n = prices.length;
//      int minprice=prices[0];
//      int maxprofit = 0;
     
//      for(int i=1;i<n;i++){
//        if(minprice>prices[i]){
//          minprice = prices[i];
//        }else if(prices[i]-minprice > maxprofit){
//          maxprofit = prices[i]-minprice;
//        }
       
//      }
     
     
//     System.out.print("total profit:"+maxprofit); 
//   }
// }

class Solution {
    public int stockBuySell(int[] arr, int n) {
     int minprice=arr[0];
     int maxprofit = 0;
     
     for(int i=1;i<n;i++){
       if(minprice>arr[i]){
         minprice = arr[i];
       }else if(arr[i]-minprice > maxprofit){
         maxprofit = arr[i]-minprice;
       }
       
     } 
     return maxprofit; 
    }   
}