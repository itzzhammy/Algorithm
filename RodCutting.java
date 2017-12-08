
package algorithms;

public class RodCutting {
     public int cutRod(int price[], int n)
    {
        if (n <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;
        // Recursively cut the rod in different pieces and
        // compare different configurations
        for (int i = 0; i<n; i++)
        {  max_val = Math.max(max_val, price[i] + cutRod(price, n-i-1));
       
        }
        System.out.println("Maximum revenue is "+max_val+" on length "+ n);
        return max_val;
    }
     public void main(){
        RodCutting obj =new RodCutting();
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20 , 24 , 30};
        int size = arr.length;
        System.out.println(".........Maximum revenue is....... "+ obj.cutRod(arr, size));
     }
}
        
       
 

