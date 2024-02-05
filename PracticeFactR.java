public class PracticeFactR {
  public static int factorial(int n){
    if(n==0){
      return 1;
    }
    int fn1 = factorial(n-1);
    int f = n * fn1;
    return f;
  }
  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
  
}
