import java.util.*; //2606(그래프) 바이러스
import java.io.*;

public class Main {
  public static int[] DFS(int[][] arr, int[] result, int n) { //DFS
    for(int i = 0; i < arr[n].length; i++) {
      if(arr[n][i] != 0) { //노드라인에 값이 있고
        if(result[i] == 0) { //방문하지 않았다면
          result[i] = arr[n][i]; //값추가
          DFS(arr, result, i); //다시 DFS
        } 
      } 
    }
    return result;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int node = Integer.parseInt(br.readLine()); //노드의 갯수
    int line = Integer.parseInt(br.readLine()); //가짓수

    int[][] arr = new int[line][2]; //노드의 갯수만큼 배열 생성
    for(int i = 0; i < line; i++) { //노드 루트
      st = new StringTokenizer(br.readLine()," ");
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    br.close();

    int[][] nodeline = new int[node][];
    for(int i = 0; i < node; i++) { //노드별 연결노드
      int[] tmp = new int[node];
      for(int j = 0; j < line; j++) { //해당노드와 연결선
        if(arr[j][0] == i + 1) { //해당노드와 연결 노드가 존재시
          tmp[arr[j][1] - 1] = arr[j][1]; //값 추가
        } else if(arr[j][1] == i + 1) {
          tmp[arr[j][0] - 1] = arr[j][0];
        }
      }
      nodeline[i] = tmp;
    }
    
    int[] result = new int[node];
    result[0] = 1;
    result = DFS(nodeline, result, 0);

    int cnt = -1;
    for(int i = 0; i < result.length; i++) {
      if(result[i] != 0) cnt++;
    }
    
    System.out.print(cnt);
  }
} 