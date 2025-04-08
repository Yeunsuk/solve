import java.util.*; //21205(수학) Vaccine Efficacy
import java.io.*;

public class Main {
  public static String Cal(int infect_vc, int cnt_vc, int infect_n, int cnt_n) {
    double rate_vc = (double) infect_vc / cnt_vc * 100;
    double rate_n = (double) infect_n / cnt_n * 100;

    if(rate_vc >= rate_n) return "Not Effective";
    else return String.format("%.6f", ((rate_n - rate_vc) / rate_n) * 100);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num = Integer.parseInt(br.readLine());
    
    int cnt_vca = 0, cnt_vcb = 0, cnt_vcc = 0;
    int infect_vca = 0, infect_vcb = 0, infect_vcc = 0;
      
    int cnt_na = 0, cnt_nb = 0, cnt_nc = 0;
    int infect_na = 0, infect_nb = 0, infect_nc = 0;
    
    for(int i = 0; i < num; i++) {
        String str = br.readLine();

        boolean std = str.charAt(0) == 'Y';
        boolean infecta = str.charAt(1) == 'Y';
        boolean infectb = str.charAt(2) == 'Y';
        boolean infectc = str.charAt(3) == 'Y';

        if(std) {
            if(infecta) infect_vca++;
            if(infectb) infect_vcb++;
            if(infectc) infect_vcc++;
            cnt_vca++;
            cnt_vcb++;
            cnt_vcc++;
        }else {
            if(infecta) infect_na++;
            if(infectb) infect_nb++;
            if(infectc) infect_nc++;
            cnt_na++;
            cnt_nb++;
            cnt_nc++;
        }
    }
    
    sb.append(Cal(infect_vca, cnt_vca, infect_na, cnt_na)).append('\n');
    sb.append(Cal(infect_vcb, cnt_vcb, infect_nb, cnt_nb)).append('\n');
    sb.append(Cal(infect_vcc, cnt_vcc, infect_nc, cnt_nc)).append('\n');
    bw.write(sb.toString());
    bw.close();
  }
}