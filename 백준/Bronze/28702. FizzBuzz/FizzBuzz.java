import java.util.*; //28702(수학) FizzBuzz
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    for(int i = 0; i < 3; i++) {
      String tmp = br.readLine();
      
      try {
        int num = Integer.parseInt(tmp) + (3 - i);
        if(num % 15 == 0) bw.write("FizzBuzz");
        else if(num % 3 == 0) bw.write("Fizz");
        else if(num % 5 == 0) bw.write("Buzz");
        else bw.write(String.valueOf(num));
        bw.close();
        return;
      }catch(NumberFormatException e) {}
    }
  }
}