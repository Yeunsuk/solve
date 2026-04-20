import java.util.*; //2751(정렬) 수 정렬하기 2 
import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    StringBuilder sb = new StringBuilder();
    
    int num = Integer.parseInt(br.readLine());
    List<Integer> li = new ArrayList<>();
    
    for(int i = 0; i < num; i++) {
      li.add(Integer.parseInt(br.readLine()));
    }
    
    Collections.sort(li);
    br.close();
    
    for(int i = 0; i < num; i++) {
      sb.append(li.get(i) + "\n");
    }
    
    System.out.print(sb);
  } 
}