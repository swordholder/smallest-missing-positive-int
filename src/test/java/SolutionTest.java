import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void findWithinNegative() {
        Solution solution = new Solution();

        int[] A = {-5, -50, -54, -90, -100};
        int res = solution.findSmallestMissingPositiveInt(A);

        Assertions.assertEquals(res, 1);
    }

    @Test
    public void findWithinPositive() {
        Solution solution = new Solution();

        int[] A = {1,5, 50, 54, 90, 100};
        int res = solution.findSmallestMissingPositiveInt(A);

        Assertions.assertEquals(res, 2);
    }

    @Test
    public void findWithinMixed() {
        Solution solution = new Solution();

        int[] A = {1,5, -50, -54, 90, 100};
        int res = solution.findSmallestMissingPositiveInt(A);

        Assertions.assertEquals(res, 2);
    }

    @Test
    public void findWithinZero() {
        Solution solution = new Solution();

        int[] A = {0};
        int res = solution.findSmallestMissingPositiveInt(A);

        Assertions.assertEquals(res, 1);
    }
}
