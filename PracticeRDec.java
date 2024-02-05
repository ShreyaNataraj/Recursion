public class PracticeRDec {
  public static void printdecreasing(int n){
    if(n==1){
      System.out.println(1);
      return;
    }
    System.out.print(n + "");
    printdecreasing(n-1);

  }
  public static void main(String[] args) {
    printdecreasing(5);
    
  }
}
