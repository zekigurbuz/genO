import java.util.*;
import java.io.*;

public class FastIO {
    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;
    public FastIO() {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
    }
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    int nextInt() {
        return Integer.parseInt(next());
    }
    long nextLong() {
        return Long.parseLong(next());
    }
    double nextDouble() {
        return Double.parseDouble(next());
    }
    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
    void print(Object o) {
        out.print(o);
    }
    void println(Object o) {
        out.println(o);
    }
    void printf(String s, Object... o) {
        out.printf(s, o);
    }
}