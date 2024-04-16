import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int m = 1000;
    static int[] arr = { 500, 100, 50, 10, 5, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = ( m - Integer.parseInt(br.readLine()) );

        int result = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            result += ( p / arr[i] );
            p %= arr[i];
        }

        System.out.println(result);
    }
}