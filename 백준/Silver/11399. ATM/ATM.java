import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] P = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        if (N == 1) {
            System.out.println(P[0]);
        } else {
            int time = 0;
            int[] sort = Arrays.stream(P)
                .sorted()
                .toArray();

            for ( int i = 0; i < sort.length; i++ ) {
                time = ( time + sort[i] );
                P[i] = time;
            }

            System.out.println(Arrays.stream(P).sum());
        }
    }
}