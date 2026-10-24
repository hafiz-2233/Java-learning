import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[]args){
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for (int i=0;i<6;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(5);

        boolean[]visited=new boolean[6];
        Queue<Integer>queue=new LinkedList<>();
        visited[0]=true;
        queue.add(0);
        System.out.println("BFS Traversal");
        while (!queue.isEmpty()){
            int current= queue.remove();
            System.out.println(current+" ");
            for (int neighbor : graph.get(current)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}