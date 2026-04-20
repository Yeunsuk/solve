import java.util.*; //4378(구현) 트ㅏㅊ;
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String arr1 = "`1234567890-=", arr2 = "QWERTYUIOP[]\\", str = "";
    String arr3 = "ASDFGHJKL;'", arr4 = "ZXCVBNM,./";
    String[] arr = {arr1, arr2, arr3, arr4};

    while((str = br.readLine()) != null) {
      for(int i = 0; i < str.length(); i++) {
        char t = str.charAt(i);
        
        if(t == ' ') bw.write(" ");
        else {
          for(int j = 0; j < 4; j++) {
            if(arr[j].contains(t + "")) {
              bw.write(arr[j].charAt(arr[j].indexOf(t) - 1));
              break;
            }
          }
        }
      }
      
      bw.write("\n");
    }

    bw.close();
  }
}