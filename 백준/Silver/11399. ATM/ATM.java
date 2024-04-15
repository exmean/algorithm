import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] P = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for ( int i = 0; i < N; i++ ) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);
        for ( int i = 0; i < P.length; i++ ) {
            if ( i == 0 ) continue;
            P[i] = (P[i-1] + P[i]);
        }

        System.out.println(Arrays.stream(P).sum());
    }
}