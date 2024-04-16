import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = n % 5;

        if ( n == 4 || n == 7 ) {
            System.out.println(-1);
        } else if ( x == 0 ) {
            System.out.println( n / 5 );
        } else if ( ( x % 2 ) == 0 ) {
            System.out.println( ( n / 5 ) + 2 );
        } else {
            System.out.println( ( n / 5 ) + 1 );
        }
    }
}