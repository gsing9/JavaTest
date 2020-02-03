import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionsTest {
    Questions questions = new Questions();

    @Test
    public void removeDuplicatesTest() {
        int[] example1 = new int[] {1,1,2};
        int output1 = questions.removeDuplicates(example1);
        assertEquals(2, output1);

        int[] example2 = new int[] {0,0,1,1,1,2,2,3,3,4};
        int output2 = questions.removeDuplicates(example2);
        assertEquals(5, output2);
    }

    @Test
    public void twoSumTest() {
        int[] example1 = new int[] {2, 7, 11, 15};
        int[] actualOutput1 = questions.twoSum(example1, 9);
        int[] expectedOutput1 = new int[] {0, 1};
        assertArrayEquals(expectedOutput1, actualOutput1);

        int[] example2 = new int[] {2, 7, 11, 15};
        int[] actualOutput2 = questions.twoSum(example2, 18);
        int[] expectedOutput2 = new int[] {1, 2};
        assertArrayEquals(expectedOutput2, actualOutput2);
    }

    @Test
    public void coinChangeTest() {
        int[] example1 = new int[] {1, 2, 5};
        int output1 = questions.coinChange(example1, 11);
        assertEquals(3, output1);

        int[] example2 = new int[] {2};
        int output2 = questions.coinChange(example2, 3);
        assertEquals(-1, output2);
    }

    @Test
    public void spiralOrderTest() {
        int[][] example1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        List<Integer> actual1 = questions.spiralOrder(example1);
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1,2,3,6,9,8,7,4,5));
        assertEquals(expected1, actual1);

        int[][] example2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12}
        };
        List<Integer> actual2 = questions.spiralOrder(example2);
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7));
        assertEquals(expected2, actual2);
    }

    @Test
    public void shortestDistanceTest() {
        char[][] example1 = {
            {'S', '0', '1', '1'},
            {'1', '1', '0', '1'},
            {'0', '1', '1', '1'},
            {'1', '0', 'D', '1'}
        };
        int output1 = questions.shortestDistance(example1);
        assertEquals(5, output1);

        char[][] example2 = {
            {'S', '0', '1', '1'},
            {'1', '1', '0', '1'},
            {'0', '1', '1', '1'},
            {'1', '0', '0', 'D'}
        };
        int output2 = questions.shortestDistance(example2);
        assertEquals(6, output2);
    }

}