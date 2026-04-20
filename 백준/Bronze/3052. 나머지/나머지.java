import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<Integer> hash = new HashSet<>();

    for(int i = 0; i < 10; i++) {
      hash.add(Integer.parseInt(br.readLine()) % 42);
    }
    
    br.close();
    System.out.print(hash.size());
  }
}