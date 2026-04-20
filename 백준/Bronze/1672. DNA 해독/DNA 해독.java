import java.util.*; //1672(문자열) DNA 해독
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int num = Macro(br.readLine());
    String str = br.readLine();
    map.put('A', 1);
    map.put('G', 2);
    map.put('C', 3);
    map.put('T', 4);

    char[] arr = str.toCharArray();
    for(int i = 1; i < num; i++) {
      int tmp = map.get(arr[num - i]) * map.get(arr[num - i - 1]);

      if(tmp == 1 || tmp == 3 || tmp == 8) arr[num - i - 1] = 'A';
      else if(tmp == 4 || tmp == 12) arr[num - i - 1] = 'G';
      else if(tmp == 2 || tmp == 9) arr[num - i - 1] = 'C';
      else arr[num - i - 1] = 'T';
    }
        
    bw.write(String.valueOf(arr[0]));
    bw.close();
  }
}