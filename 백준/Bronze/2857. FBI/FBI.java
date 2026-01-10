import java.io.*; //2857(구현) FBI

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < 5; i++) {
      String str = br.readLine();
      if(str.contains("FBI")) sb.append(i+1).append(" ");
    }

    if(sb.toString().isEmpty()) sb.append("HE GOT AWAY!");
    System.out.print(sb);
  }
}