package q1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmSingleThreadTest {

    @Test
    void calculateAverage() {
        AlgorithmSingleThread algorithm = new AlgorithmSingleThread();
        algorithm.setArray(new ArrayList<>());
        algorithm.calculateAverage();
        assertEquals(0, algorithm.getAverage(), "The algorithm should return an of 0 if the array is empty.");

        algorithm.setArray(Arrays.asList(100,100,100,100));
        algorithm.calculateAverage();
        assertEquals(100, algorithm.getAverage(), "The algorithm should return a good average when there are multiple integers in the array.");

        algorithm.setArray(Arrays.asList(20));
        algorithm.calculateAverage();
        assertEquals(20, algorithm.getAverage(), "The algorithm should return a good average when there is one integer in the array.");
    }

    @Test
    void generateList() {
        AlgorithmSingleThread algorithm = new AlgorithmSingleThread();
        assertEquals(1000000, algorithm.getArray().size(), "The algorithm should create a list of 1M integers.");
    }

    @Test
    void execute() {
        AlgorithmSingleThread algorithm = new AlgorithmSingleThread();
        algorithm.execute();
        assertNotEquals(0, algorithm.getExecutionTime(), "Computation time should not be 0.");
    }
}