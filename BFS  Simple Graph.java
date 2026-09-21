import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[][] graph = {
                {1, 2},
                {0, 3, 4},
                {0},
                {1},
                {1}
        };

        boolean[] visited = new boolean[5];

        Queue<Integer> queue = new LinkedList<>();

        int start = 0;

        visited[start] = true;
        queue.add(start);

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {

            int node = queue.remove();

            System.out.print(node + " ");

            for (int neighbor : graph[node]) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}