class Solution {
    
    public boolean inrange(int[][] grid, int i, int j){
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length;
    }
    
    public int dfs(int[][] grid, int[][] directions, int i, int j){
        Stack<int[]> stack = new Stack<int[]>();
        stack.push(new int[] {i, j});
        int size = 1;
        while(stack.size() != 0){
            int[] current = stack.pop();
            i = current[0];
            j = current[1];
            for(int[] direction : directions){
                int newi = i + direction[0], newj = j + direction[1];
                if(inrange(grid, newi, newj) && grid[newi][newj] == 1){
                    grid[newi][newj] = 2;
                    stack.push(new int[] {newi, newj});
                    size++;
                }
            }
        }
        return size;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int max_size = 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 2;
                    int size = dfs(grid, directions, i, j);
                    if(size > max_size){
                        max_size = size;
                    }
                }
            }
        }
        return max_size;
    }
}
