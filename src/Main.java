import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ExecutionException, InterruptedException {
        String[] fileNames = Ex2_1.createTextFiles(100, 4, 10);

        // Measure the execution time of the getNumOfLines() method
        long startTime = System.currentTimeMillis();
       int numOfLines = Ex2_1.getNumOfLines(fileNames);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time for getNumOfLines(): " + elapsedTime + " milliseconds");

        // Measure the execution time of the getNumOfLinesThreads() method
        startTime = System.currentTimeMillis();
        int numOfLinesThreads = Ex2_1.getNumOfLinesThreads(fileNames);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time for getNumOfLinesThreads(): " + elapsedTime + " milliseconds");

        // Measure the execution time of the getNumOfLinesThreadPool() method
        startTime = System.currentTimeMillis();
        int numOfLinesThreadPool = Ex2_1.getNumOfLinesThreadPool(fileNames);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time for getNumOfLinesThreadPool(): " + elapsedTime + " milliseconds");

    }
}