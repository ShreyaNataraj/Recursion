public class Rincreasing {
  public static void Incre(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    Incre(n-1);
    System.out.println(n);

  }
  public static void main(String[] args) {
    int n =5;
    Incre(n);
    
  }
  
}
