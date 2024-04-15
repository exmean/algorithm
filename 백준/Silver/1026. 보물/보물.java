import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        Integer[] b = new Integer[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for ( int i = 0; i < n; i++ ) {
            a[i] = Integer.parseInt(st1.nextToken());
            b[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());

        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            sum += a[i] * b[i];
        }

        System.out.println(sum);
    }
}