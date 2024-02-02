public class TillingProblem {
  public static int TillingProblem(int n){
    if(n==0||n==1){
      return 1;
    }
    //vertical case
    int fnm1 = TillingProblem(n-1);
    //Horizontal case
    int fnm2 = TillingProblem(n-2);
    // Total ways
    int totalways  = fnm1+fnm2;
    return totalways;
  }
 
  
  public static void main(String args[]){
    System.out.println(TillingProblem(2));

  }
}
