public class DuplicateString {
  public static void removeDuplicate(int idx, String str, StringBuilder newstr, boolean map[]){
    if(idx == str.length()){
      System.out.println(newstr);
      return;
    }
    //Logic
    char currchar = Character.toLowerCase(str.charAt(idx));
    if(map[currchar - 'a'] == true){
      removeDuplicate(idx + 1, str, newstr, map);
    }
    else {
      map[currchar - 'a'] = true;
      removeDuplicate(idx + 1, str, newstr.append(currchar), map);
    }
  }

  public static void main(String[] args) {
    String str = "SShreyaa";
    removeDuplicate(0, str, new StringBuilder(), new boolean[26]);
  }
}
