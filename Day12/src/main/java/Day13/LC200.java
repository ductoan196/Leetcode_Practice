package Day13;

import java.util.LinkedList;
import java.util.Queue;

public class LC200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1' && !visited[i][j]){
                    //duyet
                    //DFS|| BFS
                    DFS(grid,visited,i,j);
                    count++;
                }
            }
        }
        return count;

    }
    private boolean isNotValid(char[][] grid, boolean[][] visited, int x, int y){
        return true;
    }
    private void BFS(char[][] grid, boolean[][]visited, int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] =true;
        int[][] dirrection = {
                {0,1},  //x= x+0, y = y+1
                {0,-1}, //x = x+0, y = y-1
                {1,0}, // x = x+1, y = y+0
                {-1,0} // x = x-1 , y = y+0
        };


        while (!queue.isEmpty()){
            int[]point = queue.poll();
            int currX = point[0];
            int currY = point[1];

            //
            for (int i = 0; i < dirrection.length; i++) {
                int newX = dirrection[i][0] + currX;
                int newY = dirrection[i][1] + currY;
                if (isNotValid(grid, visited, newX, newY)){
                    continue;
                }
                queue.add(new int[]{newX, newY});
                visited[newX][newY] =true;
            }


        }
    }
    private void DFS(char[][] grid, boolean[][]visited, int x, int y){
        if (x<0 || x>=grid.length || y<0 || y>=grid[0].length ||visited[x][y]|| grid[x][y] =='0'){
            return;
        }
        //process
        visited[x][y] = true;
        //laan luot xet 4 dinh co lien ket voi dinh hien tai dua tren toa do x va y
        DFS(grid,visited, x-1,y);
        DFS(grid,visited, x+1,y);
        DFS(grid,visited, x,y+1);
        DFS(grid,visited, x,y-1);

    }
}
