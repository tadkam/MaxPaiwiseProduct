/**
 * Created by Admin on 2018-02-24.
 */
import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        int n = numbers.length;
        long max1 = 0;
        long max2 = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if ( numbers[i] > max1) {
                max1 = numbers[i];
                index = i;
            }
        }
        numbers[index] = -1000000;

        for (int i = 0; i < n; i++) {
            if ( numbers[i] > max2) {
                max2 = numbers[i];
            }
        }
        return  max1 * max2;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i <n; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }


    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
             } return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
