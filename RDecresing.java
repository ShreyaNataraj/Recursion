public class RDecresing{
  public static void Decre(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.print(n + " ");
    Decre(n-1);

  }
  public static void main(String[] args) {
    int n = 5;
    Decre(n);
  }
}