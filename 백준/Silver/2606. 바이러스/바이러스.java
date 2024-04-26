import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static int result = 0;
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void dfs(int x) {
        visited[x] = true;

        for (int i = 1; i < graph.size(); i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                int y = graph.get(i).get(j);

                if (!visited[y]) {
                    if (j == 0 && x != y && !visited[graph.get(i).get(++j)]) {
                        break;
                    }

                    dfs(y);
                    result += 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c1 = Integer.parseInt(br.readLine()) + 1;
        int c2 = Integer.parseInt(br.readLine()) + 1;
        visited = new boolean[c1];

        for (int i = 0; i < c2; i++) {
            graph.add(i, new ArrayList<>());

            if (i == 0) {
                continue;
            }

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                graph.get(i).add(Integer.parseInt(st.nextToken()));
            }
        }

        dfs(1);
        System.out.println(result);
    }
}