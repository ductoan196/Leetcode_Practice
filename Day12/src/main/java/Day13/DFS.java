package Day13;

import java.util.*;

public class DFS {
    public static void main(String[] args) {
        int[][] graph = {
                //  0  1  2  3  4  5  6
                {0, 1, 0, 0, 0, 0, 0}, // 0
                {1, 0, 1, 1, 1, 0, 0}, // 1
                {0, 1, 0, 0, 0, 1, 0}, // 2
                {0, 1, 0, 0, 0, 1, 1}, // 3
                {0, 1, 0, 0, 0, 0, 1}, // 4
                {0, 0, 1, 1, 0, 0, 0}, // 5
                {0, 0, 0, 1, 1, 0, 0}  // 6
        };
        DFS_Stack(graph);
    }

    private static void DFS_Stack(int[][] graph){
        Stack<Integer> stack = new Stack<>();
        //add đỉnh đầu tiên
        stack.add(0);
        //đánh dấu 0 đã được duyệt
        Set<Integer> visited = new HashSet<>();
        visited.add(0);

        //duyệt stack đến khi stack rỗng
        while (!stack.empty()){
            //lấy ra đỉnh ở top
            int u = stack.pop();
            //process đỉnh u
            System.out.print(u+ "-");

            //add các đỉnh kề với u vào stack và visit
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] ==1 && !visited.contains(v)){
                    stack.push(v);
                    //đánh dâu v đã được thêm
                    visited.add(v);
                }
            }
        }
    }
    private static void DES_rec(int[][] graph, Set<Integer> visited, int u){
        //process
        System.out.println(u+ " ");
        for (int v = 0; v < graph.length; v++) {
            if (graph[u][v] ==1 && !visited.contains(v)){
                DES_rec(graph,visited,v);
            }
        }
    }
    private static void BFS(int[][]graph){
        Queue<Integer> queue = new LinkedList();
        //them dinh vao queue
        //đánh dấu đỉnh đã visit
        queue.add(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        while (!queue.isEmpty()){
            //lay dau queue
            int u = queue.poll();
            //process
            System.out.println(u+ " ");
        }
        for (int v = 0; v < graph.length; v++) {
            queue.add(v);

        }
    }
}
