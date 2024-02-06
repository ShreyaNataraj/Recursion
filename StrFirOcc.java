public class StrFirOcc {
  public static int firstoccur(String str, char elem, int i){
    if(i==str.length()){
      return -1;
    }
    if(str.charAt(i)==elem){
      return i;
    }
    return firstoccur(str,elem,i+1);
  }
  public static int lastoccur(String str,char elem , int i){
    if(i==str.length()){
      return -1;
    }
    //lookong forward 
    int isfound =lastoccur(str,elem, i+1);
    if (isfound!=-1){
      return isfound;
    }
    if(str.charAt(i)==elem){
      return i;
    }
    return isfound;
  }
 

  public static void main(String[] args) {
    String str = "abaaacdaefaah";
    char elem = 'a';
    System.out.print(lastoccur(str,elem,0));
    
  }
}
