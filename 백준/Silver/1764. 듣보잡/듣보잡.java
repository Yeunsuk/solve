import java.util.*; //1764(자료구조) 듣보잡
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Integer> map = new HashMap<>();
    List<String> li = new ArrayList<>();

    StringTokenizer st = new StringTokenizer(br.readLine());
    int ear = Integer.parseInt(st.nextToken());
    int see = Integer.parseInt(st.nextToken());
    
    for(int i = 0; i < ear; i++) map.put(br.readLine(), 1);
    for(int i = 0; i < see; i++) {
      String na = br.readLine();
      map.put(na, map.getOrDefault(na, 0) +  1);
      if(map.get(na) == 2) li.add(na);
    }
    
    br.close();
    Collections.sort(li);
    bw.write(li.size() + "\n");
    for(String s : li) bw.write(s + "\n");
    bw.close();
  }
}