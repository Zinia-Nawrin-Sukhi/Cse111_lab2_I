import java.util.Scanner;
public class Task5
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
  
      System.out.println("please enter voltage");
 double E=sc.nextDouble();
  System.out.println("please enter resistance ");
  double R=sc.nextDouble();
    System.out.println("please enter inductance");
  double L=sc.nextDouble();
    System.out.println("please enter capacitance ");
  double C=sc.nextDouble();
    System.out.println("please enter frequency");
  double F=sc.nextDouble();
   double I=E/Math.sqrt(R*R+((2*3.1416*F*L)-(1/(2*3.1416*F*C)*(2*3.1416*F*L)-(1/(2*3.1416*F*C)))));
    System.out.println(I) ;                     
  }
}
