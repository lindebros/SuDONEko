package validator;

import java.util.HashSet;
import java.util.Set;

public class ValidatorUtils {

    public static boolean validateGrid(int[][] grid) {
        for (int[] line : grid) {
            if (!validateGridLine(line)) return  false;
        }
        return true;
    }

    public static boolean validateGridLine(int[] line) {
        Set<Integer> dump = new HashSet<>();
        for (int n : line) {
            if (dump.contains(n)) return false;
            dump.add(n);
        }
        return true;
    }

}
