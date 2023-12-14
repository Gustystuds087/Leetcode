class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] oneRowCount = new int[grid.length];
        int[] oneColCount = new int[grid[0].length];
        int[] zeroRowCount = new int[grid.length];
        int[] zeroColCount = new int[grid[0].length];
        
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    oneRowCount[i]++;
                    oneColCount[j]++;
                }
            }
        }
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                int oneRow = oneRowCount[i];
                int oneCol = oneColCount[j];
                int zeroCol = grid[0].length - oneColCount[j];
                int zeroRow = grid.length - oneRowCount[i];
                
                grid[i][j] = oneRow + oneCol - (zeroRow + zeroCol);
            }
        }
        return grid;
    }
}