package core;

/**
 * Sections logic:
 * x / sqrt(size)
 * y / sqrt(size)g
 *
 * 00 10 20
 * 01 11 21
 * 02 12 22
 *
 * 00 10
 * 01 11
 */

public class Puzzle {
    private int[][] rows;
    private int[][] columns;
    private int[][][] sections;

    public Puzzle(int size) throws Exception {
        if (size != 4 && size != 9) {
            throw new Exception("bad input");
        }

        this.rows = new int[size][size];
        this.columns = new int[size][size];
        this.sections = new int[(int) Math.sqrt(size)][(int) Math.sqrt(size)][size];
    }

    public void insertNumber(int number, int x, int y) {
        rows[y][x] = number;
        columns[x][y] = number;
    }

    public int[][] getRows() {
        return rows;
    }

    public int[][] getColumns() {
        return columns;
    }

    public int[][][] getSections() {
        return sections;
    }
}
