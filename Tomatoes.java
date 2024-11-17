
/*
 * Anna Del Negro
 * Dr. Steinberg
 * COP3503 Spring 2024
 * Programming Assignment 3
 */

public class Tomatoes {
    public int minTomatoMoves(int array[]) {

        int len = array.length;
        int arraySum = 0; /* final sum of array variable */

        /* calculating total sum of array values */
        for (int i = 0; i < len; i++)
            arraySum += array[i];

        /*
         * if array sum is not divisible by len then no possible solution since cannot
         * be evenly distributed
         */
        if (arraySum % len != 0)
            return 0;

        int capValueIndex = arraySum / len; /* cap val per index (cannot be more than this otherwise not even) */

        int minMoves = 0; /* final returned min moves */

        /*
         * discrepancies
         * index: difference of what value we have in the current index and whats
         * supposed to be per index (locally)
         * global: sum of all the index discrepancies
         */
        int globalDiscrepancy = 0;
        int indexDiscrepancy = 0;

        /* calculating discrepancies and min amount of moves */
        for (int i = 0; i < len; i++) {
            indexDiscrepancy = array[i] - capValueIndex;
            globalDiscrepancy += indexDiscrepancy;
            minMoves = Math.max(minMoves, Math.max(Math.abs(indexDiscrepancy), Math.abs(globalDiscrepancy)));
        }

        return minMoves;
    }

}
