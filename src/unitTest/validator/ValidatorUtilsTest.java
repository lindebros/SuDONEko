package unitTest.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import validator.ValidatorUtils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ValidatorUtilsTest {

    @DisplayName("ValidateGrid can return true for simple grid")
    @Test
    void validateGrid1() {
        int[][] someGrid = {{1}};
        assertTrue(ValidatorUtils.validateGrid(someGrid));
    }

    @DisplayName("ValidateGRid should be able to return false if duplicate on line")
    @Test
    void validateGrid2() {
        int[][] someInvalidGrid = {{1, 1}};
        boolean result = ValidatorUtils.validateGrid(someInvalidGrid);
        assertFalse(result);
    }

    @DisplayName("ValidateGrid should be able to return false for duplicate on second line")
    @Test
    void validateGrid3() {
        int[][] someInvalidGrid = {{2,3},{1, 1}};
        boolean result = ValidatorUtils.validateGrid(someInvalidGrid);
        assertFalse(result);
    }

    @DisplayName("ValidateLine should return true for good lines")
    @Test
    void validateLine1() {
        int[] someLine = {1,2};
        boolean result = ValidatorUtils.validateGridLine(someLine);
        assertTrue(result);
    }

    @DisplayName("ValidateLine should return false for bad lines")
    @Test
    void validateLine2() {
        int[] someLine = {1,1};
        boolean result = ValidatorUtils.validateGridLine(someLine);
        assertFalse(result);
    }
}