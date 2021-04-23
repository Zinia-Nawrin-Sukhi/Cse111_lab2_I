import java.util.Scanner;
public class T1
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int a[]=new int[x];
     for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
     for(int i=0;i<a.length;i++)
     {
       for(int j=1;j<=a[i];j++)
       { 
         if(j<a[i])
         {
         System.out.print(j+",");
       }
         else{
         System.out.print(j+".");
       }
       }
      System.out.println(" ");
     }
  }
}