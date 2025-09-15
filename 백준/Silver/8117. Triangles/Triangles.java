import java.util.*; // 8117(기하학) Triangles
import java.io.*;

public class Main {  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> list = new ArrayList<>();
    
    while(true) {
      int num = Integer.parseInt(br.readLine());
      if(num == 0) break;
      list.add(num);
    }
    
    Collections.sort(list);
    for(int i = 0; i < list.size() - 2; i++) {
      if(list.get(i) + list.get(i + 1) > list.get(i + 2)) {
        bw.write(list.get(i) + " " + list.get(i + 1) + " " + list.get(i + 2));
        bw.close();
        return;
      }
    }
    
    bw.write("NIE");
    bw.close();
  }
}