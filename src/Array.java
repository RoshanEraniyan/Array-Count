import java.util.*;
class Solution {
    public int calculateCount(int size,int array[])
    {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++)
        {
            if(max<=array[i])
            {
                max=array[i];
            }
        }
        for(int i=0;i<size;i++)
        {
            if(array[i]==max)
            {
                count++;
            }
        }
        return size-count;
    }
}
class Array{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++)
        {
            array[i]= scanner.nextInt();
        }
        Solution solution=new Solution();
        System.out.print(solution.calculateCount(n,array));
    }
}

