import java.util.*; //13411(기하학) 하늘에서 정의가 빗발친다!
import java.io.*;

public class Main {
    static class Entry {
        int index;
        double distance;

        Entry(int index, double distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public String toString() {
            return String.valueOf(index + 1);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Entry> list = new ArrayList<>();
        
        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            double len = Math.sqrt(x * x + y * y) / v;
            list.add(new Entry(i, len));
        }

        list.sort(Comparator.comparingDouble(e -> e.distance));
        for(int i = 0; i < num; i++) sb.append(list.get(i)).append("\n");
        bw.write(sb.toString());
        bw.close();
    }
}