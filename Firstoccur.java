public class Firstoccur {
  public static int Firstoccurence(int arr[], int i, int key){
    if(i == arr.length){
      return -1;
    }
    //Comparing with self
    if(arr[i] == key){
      return i;

    }
    return Firstoccurence(arr,i+1,key);
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,3,3};
    int key = 3;
    System.out.println(Firstoccurence(arr,0,key));
    
  }
}
