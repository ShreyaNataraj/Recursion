public class PracticeRFibo {
  public static int fib(int n){
    if(n==0||n==1){
      return n;

    }
    int fnm1 = fib(n-1);
    int fnm2 = fib(n-2);
    int fib = fnm1+fnm2;
    return fib;
  }
  //Boolean issorted array
  public static boolean issorted(int arr[],int i){
    if(i==arr.length-1){
      return true;

    }
    if(arr[i]>arr[i+1]){
      return false;
    }
    return issorted(arr, i+1);
  }
  //first occurence
  public static int firstoccur(int arr[], int i, int n){
    if(i==arr.length){
      return -1;
    }
    //compare with self
    if(arr[i]==n){
      return i;

    }
    return firstoccur(arr,i+1,n);
  }
  // last occur
  public static int lastoccurence(int arr[], int i, int n){
    if(i==arr.length){
      return -1;
    }
    int isfound = lastoccurence(arr, i+1, n);
    if(isfound!=-1){
      return isfound;
    }
    if(arr[i] == n){
      return i;

    }
    return isfound;
  }
  // power calculation problem
  public static int pow (int x, int n){
    if(n==1){
      return x;
    }
    int xnm1 = pow(x, n-1);
    int xn =  x*xnm1;
    return xn;
  }
  
  
  public static void main(String[] args) {
    System.out.println(pow(2,5));
    
  }
}
