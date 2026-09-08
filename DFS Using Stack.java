import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[][] graph = {
                {1, 2},
                {3, 4},
                {5},
                {},
                {},
                {}
        };

        boolean[] visited = new boolean[6];

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        System.out.println("DFS Traversal:");

        while (!stack.isEmpty()) {

            int current = stack.pop();

            if (!visited[current]) {

                visited[current] = true;

                System.out.print(current + " ");

                for (int neighbor : graph[current]) {

                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}