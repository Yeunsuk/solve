import java.util.*; //14405(문자열) 피카츄 
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] list = {"pi", "ka", "chu"};
    String str = br.readLine();

    for(int i = 0; i < 3; i++) str = str.replaceAll(list[i], " ");
    str = str.replace(" ", "");
    
    if(str.length() == 0) bw.write("YES");
    else bw.write("NO");
    bw.close();
  }
}