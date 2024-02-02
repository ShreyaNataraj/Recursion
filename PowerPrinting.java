public class PowerPrinting {
  public static int printpower(int x, int n){
    if(n==1){
      return 1;
    }

  return x * (int)Math.pow(x,n-1);
  }
  public static void main(String[] args) {
    int x = 2, n=4;
    System.out.println(printpower(x,n));
    
  }
}
