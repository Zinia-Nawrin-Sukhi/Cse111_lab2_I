class A3{
  public static int temp = 4;
  public int sum;
  public int y;
  public A3(){
    y = temp - 2;
    sum = temp + 1;
    temp-=2;
  }
  public void methodA(int m, int n){
    int x = 0;
    y = y + m + (temp++);
    x = x + 1 +  n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
  }
}
class B3 extends A3 {
  public static int x;
  public int sum;
  public B3(){
    y = temp + 3 ;
    sum = 3 + temp + 2;
    temp-=2;
  }  
  public B3(B3 b){
    sum = b.sum;
    x = b.x;
    b.methodB(2,3);
  }
  public void methodB(int m, int n){    
    int  y = 0;
    y = y + this.y; 
    x = this.y + 2 + temp;
    methodA(x, y);
    sum = x + y + sum;
    System.out.println(x + " " + y+ " " + sum);
  }
}
