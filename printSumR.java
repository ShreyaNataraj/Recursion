public class printSumR {
  public static int printsum(int n){
    if(n==1||n==0){
      return n;
    }
    int sm1 = printsum(n-1);
    int sn = n + sm1;
    return sn;
  }
  public static void main(String[] args) {
    System.out.println(printsum(5));
    
  }
  
}
