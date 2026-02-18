import java.io.*; //10798 세로읽기

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String[] arr = new String[5];
    int max = 0;

    for(int i=0; i<5; i++) {
      arr[i] = br.readLine();
      max = Math.max(max, arr[i].length());
    }

    for(int i=0; i<max; i++)
      for(int j=0; j<5; j++)
        if(i<arr[j].length())
          sb.append(arr[j].charAt(i));
    
    System.out.println(sb);
  }
}