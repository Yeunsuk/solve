import java.util.*; //10773(구현) 제로
import java.io.*;

public class Main {
  static List<Integer> li;
  static int n;

  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    int num = Integer.parseInt(br.readLine());
    li = new ArrayList<>();
    

    for(int i = 0; i < num; i++) {
      n = Integer.parseInt(br.readLine());
      
      if(n == 0) {
        li.remove(li.size() - 1);
      } else li.add(n);
    }

    n = 0;
    for(int i = 0; i < li.size(); i++) n += li.get(i);
    System.out.print(n);
  } 
}