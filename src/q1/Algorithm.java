package q1;

import java.util.*;


/**
 * Abstract class allowing the user to calculate the average of a list of integers
 */
public abstract class Algorithm {
    private final int ARRAY_SIZE = 1000000;
    private final int INTEGERS_BOUND = 100;

    private double average;
    public double getAverage() { return average; }
    public void setAverage(double average) { this.average = average; }

    private long executionTime;
    public long getExecutionTime() { return executionTime; }
    public void setExecutionTime(long executionTime) { this.executionTime = executionTime; }

    private List<Integer> array;
    public List<Integer> getArray() { return array; }
    public void setArray(List<Integer> array) { this.array = array; }

    void calculateAverage() {
        // If array is empty, than average is null
        if(array.isEmpty()) {
            average = 0;
            return;
        }

        // If array has only one integer, than average is equal to this integer
        if(array.size() == 1) {
            average = array.get(0);
            return;
        }

        average = array.stream().mapToDouble(x -> x).average().orElse(0);
    }

    /**
     * Generate an array of ARRAY_SIZE integers between 0 and INTEGERS_BOUND
     */
    void generateList() {
        array = new ArrayList<>();
        Random random = new Random();

        while(array.size() < ARRAY_SIZE) {
            array.add(random.nextInt(INTEGERS_BOUND));
        }
    }

    /**
     * Launch the calculation and set a timer of the execution.
     */
    void execute() {
        long startTimer = System.nanoTime();
        calculateAverage();
        long endTimer = System.nanoTime();
        executionTime = endTimer - startTimer;
    }
}
