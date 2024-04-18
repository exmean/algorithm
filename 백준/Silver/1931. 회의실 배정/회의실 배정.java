import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][2];

        for ( int i = 0; i < N; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(
            arr,
            Comparator.comparingInt( a -> ((int []) a)[1] )
                .thenComparingInt( a -> (((int []) a)[0]) )
        );

        int end = arr[0][1];
        int result = 1;
        for ( int i = 1; i < N; i++ ) {
            int[] next = arr[i];
            if ( end <= next[0] ) {
                end = next[1];
                result++;
            }
        }

        System.out.println(result);
    }
}