import java.util.*; //1158(자료구조) 요세푸스 문제
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] Input = new int[2];
    StringTokenizer st;

    st = new StringTokenizer(br.readLine()," ");
    Input[0] = Integer.parseInt(st.nextToken());
    Input[1] = Integer.parseInt(st.nextToken());
    ArrayList<Integer> list = new ArrayList<Integer>(Input[0]);
    int count = Input[1];
    sb.append("<");
    int size = 0;
    
    for(int i = 1; i <= Input[0]; i++) {
      list.add(i);
    }
    
    
    for(int i = 0; i < Input[0]; i++) {
      sb.append(list.get(count - 1));
      if(i != Input[0] - 1) sb.append(", ");
      list.remove(count - 1);
      count += Input[1] - 1;
      
      size = Integer.valueOf(list.size());
      while(count > size) {
        count -= size;
        if(size == 0) break;
      }
    }
    sb.append(">");
    System.out.print(sb);
  }
} 