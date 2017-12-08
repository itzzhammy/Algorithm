package algorithms;
import java.util.Scanner;
public class Algorithms {

   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        Scanner sc1 =new Scanner(System.in);
//        Scanner sc2 =new Scanner(System.in);
//        Scanner sc3 =new Scanner(System.in);
        for(int i=0;i<10;i++)
        {   System.out.println("Press 'y' to continue:\nPress 'n' to exit:");
            char c=sc.next().charAt(0);
            if(c=='y')
            {           
        
        System.out.println("1.Sortings\n2.Dynamic Programming\n3.Graphs\n");
        System.out.println("Enter Choice");
        int num=sc.nextInt();
       switch(num){
           case 1:
           {
                System.out.println("1.Radix Sort\n2.Count Sort3.Merge Sort\n4.Heap Sort\n5.Insertion Sort\n6.Quick Sort\n");
                System.out.println("Enter Choice");
                int num1=sc.nextInt();
                switch(num1){
                    case 1:
                    {
                       RadixSort rs=new RadixSort();
                       rs.main();
                       break; 
                    }
                    case 2:
                    {
                       CountSort cs=new CountSort();
                       cs.main();
                       break;  
                    }
                    case 3:
                    {
                        MergeSort ms=new MergeSort();
                        ms.main();
                        break; 
                    }
                    case 4:
                    {
                        HeapSort hs=new HeapSort();
                        hs.main();
                        break;
                    }
                    case 5:
                    {
                        InsertionSort is=new InsertionSort();
                        is.main();
                        break;
                    }
                    case 6:
                    {
                        QuickSort qs=new QuickSort();
                        qs.main();
                        break;
                    }
                    default:
                    {
                        System.out.println("Incorrect Entry\n");
                        break;
                    }
                    }
                
           break;
 
           }
           case 2:
            {
                System.out.println("1.Rod Cutting\n2.Knapsack\n3.Matrix Chain Multiplication\n");
                System.out.println("Enter Choice");
                int num2=sc.nextInt();
                switch(num2){
                    case 1:
                    {
                            RodCutting rod=new RodCutting();     
                            rod.main();
                            break;
                    }
                    case 2:
                    {
                            Knapsack ks=new Knapsack();
                            ks.main();
                            break;
                    }
                    case 3:
                    {
                            MatrixChainMultiplication mcm=new MatrixChainMultiplication();
                            mcm.main();
                            break;
                    }
                }
             break;   
            }
           case 3:
            {
                System.out.println("1.BFS\n2.DFS\n");
               System.out.println("Enter Choice");
                int num3=sc.nextInt();
                switch(num3){
                    case 1:
                    {
                    BFS b=new BFS();
                    b.main();
                    break;
                    }
                    case 2:
                    {
                    DFS d=new DFS();
                    d.main();
                    break;
                    }
                    
                }
              break; 
            }
       }

 }
        
        else
        break;
 } 
 }   
}
