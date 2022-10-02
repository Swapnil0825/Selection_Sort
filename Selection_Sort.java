import java.util.Scanner;

public class Selection_Sort 
{
    public static void main(String[] args) 
    {
        int n,i,j,min,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        n=sc.nextInt();

        int[] a=new int[50];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
            if(a[j] < a[min])
            {
                min=j;
            } 
            } 
         
            if(min != i)
            {
                temp=a[min];
                a[min]=a[i];
                a[i]=temp;

            } 
        }  
        

        System.out.println("Sorted array is");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
    }

    
}
