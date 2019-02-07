package q1;

public class Main {

    public static void main(String[] args) {
        // Start of the single thread algorithm
        Algorithm algorithmSingleThread = new AlgorithmSingleThread();
        algorithmSingleThread.execute();
        System.out.println("Single Thread Algorithm");
        System.out.println("Average = " + algorithmSingleThread.getAverage());
        System.out.println("Execution Time = " + algorithmSingleThread.getExecutionTime());

        // Start of the parallel algorithm
        Algorithm algorithmParallel = new AlgorithmParallel();
        algorithmParallel.execute();
        System.out.println("\nParallel Algorithm");
        System.out.println("Average = " + algorithmParallel.getAverage());
        System.out.println("Execution Time = " + algorithmParallel.getExecutionTime());

        // Comparison of the two algorithms
        if(algorithmParallel.getExecutionTime() < algorithmSingleThread.getExecutionTime()) {
            System.out.println("\nParallel computation was faster than Single thread computation");
        } else {
            System.out.println("\nParallel computation was not faster than Single thread computation");
        }
    }
}
