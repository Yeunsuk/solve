import java.util.*; //2108(수학) 통계학
import java.io.*;

public class Main {
  static List<Integer> li;
  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];
    double sum = 0; int cnt = 0;
    boolean check = false;
    int max = -1; 

    for(int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      sum += arr[i];
    }

    br.close();
    Arrays.sort(arr);
    System.out.println(Math.round(sum / num)); //산술평균
    System.out.println(arr[(num - 1) / 2]); //중앙값

    int fqy = arr[0];
    for(int i = 0; i < num - 1; i++) { //최빈값
      if(arr[i] == arr[i + 1]) cnt++;
      else cnt = 0;

      if(max < cnt) {
        check = true;
        fqy = arr[i];
        max = cnt;
      }else if(max == cnt && check == true) {
        check = false;
        fqy = arr[i];
      }
    }

    System.out.println(fqy);
    System.out.print(arr[num - 1] - arr[0]); //범위
  }
}