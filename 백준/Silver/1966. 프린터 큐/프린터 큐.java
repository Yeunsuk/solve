import java.util.*; //1966(큐) 프린터 큐
import java.io.*;

public class Main {
  static Queue<Integer> q = new LinkedList<>();
  static int wait, idex, cnt, i;
  static Integer[] arr;

  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    int test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    while(test-- > 0) {
      st = new StringTokenizer(br.readLine());
      wait = Integer.parseInt(st.nextToken());
      idex = Integer.parseInt(st.nextToken());
      
      arr = new Integer[wait];
      cnt = 0;
      
      st = new StringTokenizer(br.readLine());
      for(i = 0; i < wait; i++) { //문서 배열
        arr[i] = Integer.parseInt(st.nextToken());
      }
      
      int want = arr[idex];
      for(i = 0; i < wait; i++) { //문서큐
        if(i == idex) q.add(10);
        else if(arr[i] < want) q.add(0);
        else q.add(arr[i]);
      }
      
      Arrays.sort(arr, Collections.reverseOrder());
      for(i = 0; i < wait; i++) {
        if(arr[i] == want) { //원하는 우선도
          while(q.peek() != 10) {
            if(q.peek() == 0) {
              q.poll();  
            } else{
              q.poll();
              cnt++;
            }
          }
          cnt++;
          break;
        }
          
        else { //더 높은 우선도 출력
          while(q.peek() != arr[i]) {
            q.add(q.poll());
          }
          q.poll();
          cnt++;
        }
      }

      sb.append(cnt).append("\n");
      q.clear();
    }
    System.out.print(sb);
  } 
}