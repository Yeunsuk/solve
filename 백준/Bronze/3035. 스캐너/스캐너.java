import java.io.*; //3035 스캐너
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    StringBuilder sb = new StringBuilder();
    List<String> list = new ArrayList<>();
    int[] arr = new int[str.length];

    for(int i=0; i<arr.length; i++) arr[i] = Integer.parseInt(str[i]);

    while(true) {
      String tmp = br.readLine();
      if(tmp == null || tmp.isEmpty()) break;
      list.add(tmp);
    }
    
    int x = arr[1]*arr[3] / list.get(0).length();
    int y = arr[0]*arr[2] / list.size();

    for(int i=0; i<list.size(); i++) {
      String tmp = "";
      for(int j=0; j<list.get(0).length(); j++) {
        for(int k=0; k<x; k++) tmp += list.get(i).charAt(j);
      }
      
      for(int j = 0; j < y; j++) {
        sb.append(tmp);
        if(j!=y || j!=0) sb.append("\n");
      }
    }
    
    System.out.print(sb);
  }
}