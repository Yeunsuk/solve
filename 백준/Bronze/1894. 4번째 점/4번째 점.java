import java.util.*; // 1894(기하학) 4번째 점
import java.io.*;

public class Main {
    static double Macro(String str) {
        return Double.parseDouble(str);
    }

    static class Point {
        double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean equal(Point a, Point b) {
        return a.x == b.x && a.y == b.y;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            Point p1 = new Point(Macro(st.nextToken()), Macro(st.nextToken()));
            Point p2 = new Point(Macro(st.nextToken()), Macro(st.nextToken()));
            Point p3 = new Point(Macro(st.nextToken()), Macro(st.nextToken()));
            Point p4 = new Point(Macro(st.nextToken()), Macro(st.nextToken()));

            if(equal(p2, p3)) {
                Point tmp = p1;
                p1 = p2;
                p2 = tmp;
            }else if(equal(p1, p4)) {
                Point tmp = p3;
                p3 = p4;
                p4 = tmp;
            }else if(equal(p2, p4)) {
                Point tmp1 = p1; Point tmp2 = p3;
                p1 = p2; p2 = tmp1;
                p3 = p4; p4 = tmp2;
            }

            double x = p1.x + (p2.x - p1.x) + (p4.x - p1.x);
            double y = p1.y + (p2.y - p1.y) + (p4.y - p1.y);
            sb.append(String.format("%.3f %.3f\n", x, y));
        }

        bw.write(sb.toString());
        bw.close();
    }
}