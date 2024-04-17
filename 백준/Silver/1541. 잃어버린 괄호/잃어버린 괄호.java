import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        br.close();

        int value = 0;
        if ( st.countTokens() == 1 ) {
            value = Arrays.stream(st.nextToken().split("\\+"))
                .mapToInt(Integer::parseInt)
                .sum();

        } else {
            int[] arr = new int[st.countTokens()];
            for ( int i = 0; i < arr.length; i++ ) {
                String current = st.nextToken();
                if ( !current.contains("+") ) {
                    arr[i] = Integer.parseInt(current);
                    continue;
                }

                arr[i] = Arrays.stream(current.split("\\+"))
                    .mapToInt(Integer::parseInt)
                    .sum();
            }

            value = Arrays.stream(arr)
                .reduce((a, b) -> a - b)
                .getAsInt();
        }

        System.out.println(value);
    }
}