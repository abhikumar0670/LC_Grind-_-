import java.util.*;
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        for (int col = 0; col < n; col++) {
            sortDiagonal(grid, 0, col, n);
        }
        for (int row = 1; row < n; row++) {
            sortDiagonal(grid, row, 0, n);
        }

        return grid;
    }

    private void sortDiagonal(int[][] grid, int row, int col, int n) {
        List<Integer> diagonal = new ArrayList<>();
        int r = row, c = col;

        while (r < n && c < n) {
            diagonal.add(grid[r][c]);
            r++;
            c++;
        }
        if (row >= col) {
            diagonal.sort(Collections.reverseOrder());
        } else {
            Collections.sort(diagonal);
        }
        r = row;
        c = col;
        int idx = 0;
        while (r < n && c < n) {
            grid[r][c] = diagonal.get(idx++);
            r++;
            c++;
        }
    }
}

