public class Rlastoccurence {
  public static int lastoccurence(int arr[], int key, int i){
    if(i==arr.length){
      return -1;

    }
    //comparing or looking forward
    int isfound = lastoccurence(arr,key,i+1);
    if(isfound!=-1){
      return isfound;
    }
    //comparing with self
    if(arr[i] ==key){
      return i;
    }
    return isfound;

  }
  public static void main(String[] args) {
    int arr[] ={1,2,3,4,5,6,5};
    int key = 5;
    System.out.println(lastoccurence(arr,key,0));
    
  }
}
