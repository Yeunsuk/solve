import java.util.*; //1302(자료구조) 베스트셀러
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Integer> map = new HashMap<>();
    int num = Integer.parseInt(br.readLine());
    int cnt = 0;
    
    while(num-- > 0) {
      String nm = br.readLine();
      map.put(nm, map.getOrDefault(nm, 0) + 1);
      cnt = Math.max(cnt, map.get(nm));
    }
    
    List<String> li = new ArrayList<>();
    for(Map.Entry<String, Integer> entry : map.entrySet()) if(entry.getValue() == cnt) li.add(entry.getKey());
    
    Collections.sort(li);
    System.out.print(li.get(0));
  }
}