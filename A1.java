
class A1{
  public int temp = 4;
  public int sum = 1;
  public int y = 2;
  public A1(){
    y = temp - 2;
    sum = temp + 3;
    temp-=2;
  }
  public void methodA(int m, int n){
    int x = 0;
    y = y + m + (temp++);
    x = x + 2 +  n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
  }
}

class B1 extends A1 {
  public int x = 1;
  public int sum = 2;
  public B1(){
    y = temp + 3 ;
    sum = 3 + temp + 2;
    temp-=1;
  }  
  public B1(B1 b){
    sum = b.sum;
    x = b.x;
  }
  public void methodB(int m, int n){    
    int  y =0;
    y = y + this.y; 
    x = this.y + 2 + temp;
    methodA(x, y);
    sum = x + y + super.sum;
    System.out.println(x + " " + y+ " " + sum);
  }
}
