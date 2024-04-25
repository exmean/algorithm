import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    public static int n, m;
    public static boolean[][] visited = new boolean[50][50];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static boolean isRange(int y, int x) {
        return y < n && x < m;
    }

    public static void dfs(int y, int x) {
        if (isRange(y, x)) {
            visited[y][x] = true;

            int ny = y;
            int nx = x;

            if (graph.get(y).get(x) == 124) {
                ny = y+1;
            } else {
                nx = x+1;
            }

            if (isRange(ny, nx)) {
                boolean isSame = graph.get(y).get(x) == graph.get(ny).get(nx);
                if (isSame && !visited[ny][nx]) {
                    dfs(ny, nx);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            graph.add((ArrayList<Integer>) str.chars().boxed().collect(Collectors.toList()));
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j]) {
                    continue;
                }

                dfs(i, j);
                result++;
            }
        }

        System.out.println(result);
    }
}