package unitTest.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import validator.ValidatorUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;


class ValidatorUtilsTest {

    @DisplayName("ValidateGrid can return true for simple grid")
    @Test
    void validateGrid1() {
        int[][] someGrid = {{1}};
        assertTrue(ValidatorUtils.validateGrid(someGrid));
    }

    
}