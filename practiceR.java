public class practiceR {
  public static void printincreasing(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    printincreasing(n-1);
    System.out.println(n);
  }
  public static void main(String[] args) {
    printincreasing(5);
  }
}
