package unitTest.core;

import core.Puzzle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PuzzleTest {

    private void validatePuzzlePart(int[][] part, int size) {
        assertEquals(size, part.length);
        for (int[] itemList: part){
            assertEquals(size, itemList.length);
        }
    }

    private void validatePuzzlePart2(int[][][] part, int size) {
        assertEquals(size, part.length);
        for (int[][] itemList: part){
            assertEquals(size, itemList.length);
        }
    }

    private void validatePuzzleParts(Puzzle p, int size) {
        validatePuzzlePart(p.getRows(), size);
        validatePuzzlePart(p.getColumns(), size);
        validatePuzzlePart2(p.getSections(), (int) Math.sqrt(size));
    }

    @Test
    void canCreatePuzzle() throws Exception {
        int four = 4;
        Puzzle p = new Puzzle(four);

        validatePuzzleParts(p, four);
    }

    @Test
    void canCreatePuzzle1() {
        int five = 5;

        assertThrows(Exception.class, () -> {
            new Puzzle(five);
        });
    }
}