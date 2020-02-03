import java.util.List;

class Questions {

    //Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
    //Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    //Given nums = [0,0,1,1,1,2,2,3,3,4],
    //Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively
    //It doesn't matter what values are set beyond the returned length.
    public int removeDuplicates(int[] nums) {
        return 0;
    }

    //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.

    //Given nums = [2, 7, 11, 15], target = 9,
    //Because nums[0] + nums[1] = 2 + 7 = 9,
    //return [0, 1].
    public int[] twoSum(int[] nums, int target) {
        return new int[] {0};
    }


    //You are given coins of different denominations and a total amount of money amount.
    // Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

    //Input: coins = [1, 2, 5], amount = 11
    //Output: 3
    //Explanation: 11 = 5 + 5 + 1

    //Input: coins = [2], amount = 3
    //Output: -1
    public int coinChange(int[] coins, int amount) {
        return 0;
    }

    //Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

    //Input:
    //[
    // [ 1, 2, 3 ],
    // [ 4, 5, 6 ],
    // [ 7, 8, 9 ]
    //]
    //Output: [1,2,3,6,9,8,7,4,5]
    public List<Integer> spiralOrder(int[][] matrix) {
        return null;
    }

    //Given a 2D array with values such as ‘S’, ‘D’, ‘1’ and ‘0’.
    //- S is the Source
    //- D is the Destination
    //- 1 marks the valid path
    //- 0 marks the obstacle
    //Find the shortest distance from S to D avoiding all the obstacles.

    //Input
    //{
    //	{'S', '0', '1', '1'},
    //	{'1', '1', '0', '1'},
    //	{'0', '1', '1', '1'},
    //	{'1', '0', 'D', '1'}
    //};
    public int shortestDistance(char[][] matrix) {
        return 0;
    }
}