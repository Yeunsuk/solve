import java.util.*; //29713(문자열) 브실이의 띠부띠부씰 컬렉션
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Character, Integer> map = new HashMap<>();
    int num = Integer.parseInt(br.readLine());
    String std = "BRONZESILVER";
    String str = br.readLine();
    
    for(int i = 0; i < num; i++) {
      char tmp = str.charAt(i);
      
      if(std.indexOf(tmp) != -1) {
        map.put(tmp, map.getOrDefault(tmp, 0) + 1);
      }
    }
    
    if(map.containsKey('E')) map.put('E', map.get('E') / 2);
    else map.put('E', 0);
    
    if(map.containsKey('R')) map.put('R', map.get('R') / 2);
    else map.put('R', 0);
    
    bw.write(String.valueOf(Collections.min(map.values())));
    bw.close();
  }
}