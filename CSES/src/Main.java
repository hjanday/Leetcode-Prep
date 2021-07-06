import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
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

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args){
        /*
        You are given a DNA sequence: a string consisting of characters
         A, C, G, and T. Your task is to find the longest repetition in the sequence.
        This is a maximum-length substring containing only one type
        of character.
         */
        FastReader f = new FastReader();
        String n = f.nextLine();
        Character val = Character.MIN_VALUE;
        int local_max = 0;
        int global_max = 0;

        for(int i = 0; i<n.length();i++) {
            char curr = n.charAt(i);
            if (curr == val)  {
                val = curr;
                local_max++;
                global_max = Math.max(local_max, global_max);
            }
            else{
                val = curr;
                local_max = 1;
            }
        }


        System.out.println(global_max);

    }
}
