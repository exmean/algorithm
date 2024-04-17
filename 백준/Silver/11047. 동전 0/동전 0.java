import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for ( int i = 0; i < N; i++ ) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        for ( int j = ( N - 1 ); 0 <= j; j-- ) {
            if ( K / arr[j] == 0 ) continue;

            result += K / arr[j];
            K %= arr[j];

            if ( K == 0 ) break;
        }

        System.out.println(result);
    }
}