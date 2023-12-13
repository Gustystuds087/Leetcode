class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        for(int i = 0 ; i< mat.length; i++){
            int index = checkRow(mat, i);
            if(index >=0 && checkCol(mat, i, index))
                ans++;
        }
        return ans;
    }
    
    private int checkRow(int[][]mat, int i){
        int index = -1;
        for(int j = 0 ; j<mat[0].length ; j++){
            if(mat[i][j] ==1)
                if(index>=0)
                    return -1;
            else
                index = j;
        }
        return index;
    }
    
    private boolean checkCol(int[][]mat , int i, int index){
        for(int j = 0 ; j < mat.length; j++){
            if(mat[j][index] == 1 && j!=i){
                return false;
            }
        }
                    return true;
    }
}
