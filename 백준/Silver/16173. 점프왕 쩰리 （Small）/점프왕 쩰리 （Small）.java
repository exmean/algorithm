import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int n;
    public static int[][] graph;
    public static boolean[][] visited;
    public static final String SUCCESS = "HaruHaru";
    public static final String FAIL = "Hing";


    public static String dfs(int y, int x) {
        visited[y][x] = true;
        int val = graph[y][x];

        if (val == -1) {
            return SUCCESS;
        }

        int ny = y + val;
        int nx = x + val;

        if (nx < n && !visited[y][nx] && !dfs(y, nx).equals(FAIL)) {
            return SUCCESS;
        }

        if (ny < n && !visited[ny][x] && !dfs(ny, x).equals(FAIL)) {
            return SUCCESS;
        }

        return FAIL;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(dfs(0, 0));
    }
}