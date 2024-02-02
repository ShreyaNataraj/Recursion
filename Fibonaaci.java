public class Fibonaaci {
  public static int fibo(int n){
    //Base condtion
    if(n==0 ||n==1){
      return n;
    }
    int fnm1 = fibo(n-1);
    int fnm2 = fibo(n-2);
    int fo= fnm1+fnm2;
    return fo;
  }
  public static void main(String args[]){
    int n = 5;
    System.out.println(fibo(n));
  }
  
}
