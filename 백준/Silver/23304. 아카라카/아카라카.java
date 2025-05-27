import java.util.*; //23304(문자) 아카라카
import java.io.*;

public class Main {
    public static boolean Macro(String str) {
        if(str.length() == 1) return true;

        StringBuilder lt = new StringBuilder(), rt = new StringBuilder();
        int len = str.length() / 2;

        for(int i = 0; i < len; i++) lt.append(str.charAt(i));
        
        int tmp = (str.length() % 2 == 1) ? len + 1 : len;
        for(int i = 0; i < len; i++) rt.append(str.charAt(i + tmp));

        String rstr = rt.toString(), lstr = lt.toString();
        if(!lstr.equals(rstr)) return false;
        return Macro(lstr) && Macro(rstr);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write(Macro(br.readLine()) ? "AKARAKA" : "IPSELENTI");
        bw.close();
    }
}