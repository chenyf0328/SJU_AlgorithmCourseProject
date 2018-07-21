import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Random;

public class Driver {
    public static void main (String[] args) {

//        // Question 2
//        // Question 2: n = 10
//        int[] data = new int[10];
//        Random rand = new Random();
//        for (int i=0;i<10;i++)
//            data[i]=rand.nextInt(100);
//
//        System.out.println("before using CountingSort:");
//        for (int iter: data)
//            System.out.print(iter+" ");
//        System.out.println();
//
//        CountingSort cs = new CountingSort(data);
//
//        System.out.println("After using CountingSort:");
//        for (int iter: data)
//            System.out.print(iter+" ");
//        System.out.println();

//        // Question 2: n = 50
//        int[] data = new int[50];
//        Random rand = new Random();
//        for (int i=0;i<50;i++)
//            data[i]=rand.nextInt(1000);
//
//        System.out.println("before using CountingSort:");
//        for (int iter: data)
//            System.out.print(iter+" ");
//        System.out.println();
//
//        CountingSort cs = new CountingSort(data);
//
//        System.out.println("After using CountingSort:");
//        for (int iter: data)
//            System.out.print(iter+" ");
//        System.out.println();

//        // Question 2: n = 100
        int[] data = new int[100];
        Random rand = new Random();
        for (int i=0;i<100;i++)
            data[i]=rand.nextInt(1000);

        System.out.println("before using CountingSort:");
        for (int iter: data)
            System.out.print(iter+" ");
        System.out.println();

        CountingSort cs = new CountingSort(data);

        System.out.println("After using CountingSort:");
        for (int iter: data)
            System.out.print(iter+" ");
        System.out.println();

//        // Question 3
//        // Question 3: n = 10
//        double[] data = new double[10];
//        Random rand = new Random();
//        for (int i=0;i<10;i++)
//            data[i]=rand.nextDouble();
//
//        System.out.println("before using CountingSort:");
//        for (double iter: data)
//            System.out.printf("%.3f ", iter);
//        System.out.println();
//
//        BucketSort cs = new BucketSort(data);
//
//        System.out.println("After using CountingSort:");
//        for (double iter: data)
//            System.out.printf("%.3f ", iter);
//        System.out.println();

//        // Question 3: n = 50
//        double[] data = new double[50];
//        Random rand = new Random();
//        for (int i=0;i<50;i++)
//            data[i]=rand.nextDouble();
//
//        System.out.println("before using CountingSort:");
//        for (double iter: data)
//            System.out.printf("%.3f ", iter);
//        System.out.println();
//
//        BucketSort cs = new BucketSort(data);
//
//        System.out.println("After using CountingSort:");
//        for (double iter: data)
//            System.out.printf("%.3f ", iter);
//        System.out.println();

        // Question 3: n = 100
//        double[] data = new double[100];
//        Random rand = new Random();
//        for (int i=0;i<100;i++)
//            data[i]=rand.nextDouble();
//
//        System.out.println("before using CountingSort:");
//        for (double iter: data)
//            System.out.printf("%.3f ", iter);
//        System.out.println();
//
//        BucketSort cs = new BucketSort(data);
//
//        System.out.println("After using CountingSort:");
//        for (double iter: data)
//            System.out.printf("%.3f ", iter);
//        System.out.println();
    }
}
