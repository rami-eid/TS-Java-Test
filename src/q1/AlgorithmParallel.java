package q1;

import java.util.List;

/**
 * Class allowing the user to calculate the average of a list of integers in parallel
 */
class AlgorithmParallel extends Algorithm {

    public AlgorithmParallel() {
        generateList();
    }

    /**
     * Calculate the average as in the parent class, but uses parallelStream
     */
    @Override
    void calculateAverage() {
        List<Integer> array = getArray();

        // If array is empty, then average is null
        if(array.isEmpty()) {
            setAverage(0);
            return;
        }

        // If array contains only one integer, than average is equal to this integer
        if(array.size() == 1) {
            setAverage(array.get(0));
            return;
        }

        setAverage(array.parallelStream().mapToDouble(x->x).average().orElse(0));
    }
}
