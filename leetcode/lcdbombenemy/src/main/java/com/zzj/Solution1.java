package com.zzj;

/**
 * @author zhouzijia
 * @date 2018-8-23 10:22
 */
public class Solution1 {

    private char[][] localGrid;

    public int maxKilledEnemies(char[][] grid){
        if(grid == null || grid.length == 0){
            return  0;
        }
        int max = 0;
        localGrid = grid;
        for(int i = 0 ; i < localGrid.length; i++){
            for(int j =0; j < localGrid[0].length; j++){
                if(localGrid[i][j] == '0'){
                    max = Math.max(max, count(i,j));
                }
            }
        }
        return max;
    }

    private int up(int row, int col){
        int count = 0;
        for(int i = row - 1; i >= 0; i--){
            switch (localGrid[i][col]){
                case 'W':
                    return count;
                case 'E':
                    count++;
                    break;
                default:
            }
        }
        return count;
    }

    private int down(int row, int col){
        int count = 0 ;
        for(int i = row +1 ; i < localGrid.length; i++){
            switch(localGrid[i][col]){
                case 'W':
                    return count;
                case 'E':
                    count++;
                    break;
                default:
            }
        }
        return count;
    }

    private int left(int row, int col){
        int count = 0;
        for(int i = col -1; i >=0 ; i--){
            switch(localGrid[row][i]){
                case 'W':
                    return count;
                case 'E':
                    count++;
                    break;
                default:
            }
        }
        return count;
    }

    private int right(int row, int col){
        int count = 0;
        for(int i = col+1; i < localGrid[0].length; i++){
            switch(localGrid[row][i]){
                case 'W':
                    return count;
                case 'E':
                    count++;
                    break;
                default:
            }
        }
        return count;
    }

    private int count(int row, int col){
        return up(row, col) + down(row, col) + left(row, col) + right(row, col);
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        char[][] arr = {{'0','E','0','0'},{'E','0','W','E'},{'0','E','0','0'}};
        System.out.println( solution1.maxKilledEnemies(arr));
        }
}
