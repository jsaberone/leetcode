Given a 2D grid, each cell is either a wall ‘W’, an enemy ‘E’ or empty ‘0’ (the number zero), return the maximum enemies you can kill using one bomb. The bomb kills all the enemies in the same row and column from the planted point until it hits the wall since the wall is too strong to be destroyed. Note: You can only put the bomb at an empty cell.

(给定2D网格，每个单元格可以是墙“W”，敌人“E”或空“0”（数字0），使用一个炸弹返回可以杀死的最大敌人。 炸弹从种植点杀死同一行和列中的所有敌人，直到它撞到墙壁，因为墙壁太强而不能被摧毁。 注意：您只能将炸弹放在空单元格中。)        

Example:
```
Input: [["0","E","0","0"],["E","0","W","E"],["0","E","0","0"]]
Output: 3
Explanation: For the given grid,

0 E 0 0
E 0 W E
0 E 0 0
```

Placing a bomb at (1,1) kills 3 enemies.