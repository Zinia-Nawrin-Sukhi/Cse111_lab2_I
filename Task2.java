import java.util.Scanner;
public class Task2
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int []a= new int[9];
    
    for(int i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
       System.out.println("you have entered");
      for(int j=0;j<=i;j++)
      {
        if(j<i)
        {
          System.out.print(a[j]+",");
        }
        else{
          System.out.print(a[j]+" ");
        }
      }
    }
    }
}