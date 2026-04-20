import java.util.*; //10867(정렬) 중복 빼고 정렬하기
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    HashSet<Integer> h = new HashSet<>();
    ArrayList<Integer> arr;
    StringTokenizer st;
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) h.add(Integer.parseInt(st.nextToken()));
    arr = new ArrayList<>(h);
    Collections.sort(arr);

    for(int tmp : arr) bw.write(tmp + " ");
    bw.close();
  }
}