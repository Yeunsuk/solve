import java.util.*; //10101(기하학) 삼각형 외우기
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();


    int angle1 = Integer.parseInt(br.readLine());
    int angle2 = Integer.parseInt(br.readLine());
    int angle3 = Integer.parseInt(br.readLine());
    br.close();

    if(angle1 + angle2 + angle3 == 180) {
      if(angle1 == angle2 && angle3 == 60) sb.append("Equilateral");
      else if(angle1 == angle2 || angle2 == angle3 || angle3 == angle1) System.out.print("Isosceles");
      else System.out.print("Scalene");
    }else System.out.print("Error");
    
    System.out.print(sb);
  }
}