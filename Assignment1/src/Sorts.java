import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Random;

public class Sorts {
    private static long avgCPUTime=0;

    public static void main (String[] args) {

        int[] test=new int[10];

        // Generate 10 random input
        Random rand = new Random();
        for(int i=0; i<10; i++)
            test[i]=i;

        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<10; j++)
                test[i]=i;
        }
        long avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        System.out.println("100");
        test=new int[100];
        // Generate 10 random input
        rand = new Random();
        for(int i=0; i<100; i++)
            test[i]=i;
        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<100; j++)
                test[i]=i;
        }
        avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        System.out.println("1000");
        test=new int[1000];
        // Generate 10 random input
        rand = new Random();
        for(int i=0; i<1000; i++)
            test[i]=i;
        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<1000; j++)
                test[i]=i;
        }
        avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        System.out.println("10000");
        test=new int[10000];
        // Generate 10 random input
        rand = new Random();
        for(int i=0; i<10000; i++)
            test[i]=i;
        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<10000; j++)
                test[i]=i;
        }
        avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        System.out.println("100000");
        test=new int[100000];
        // Generate 10 random input
        rand = new Random();
        for(int i=0; i<100000; i++)
            test[i]=i;
        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<100000; j++)
                test[i]=i;
        }
        avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        System.out.println("200000");
        test=new int[200000];
        // Generate 10 random input
        rand = new Random();
        for(int i=0; i<200000; i++)
            test[i]=i;
        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<200000; j++)
                test[i]=i;
        }
        avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        System.out.println("300000");
        test=new int[300000];
        // Generate 10 random input
        rand = new Random();
        for(int i=0; i<300000; i++)
            test[i]=i;
        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<300000; j++)
                test[i]=i;
        }
        avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        System.out.println("400000");
        test=new int[400000];
        // Generate 10 random input
        rand = new Random();
        for(int i=0; i<400000; i++)
            test[i]=i;
        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<400000; j++)
                test[i]=i;
        }
        avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        System.out.println("500000");
        test=new int[500000];
        // Generate 10 random input
        rand = new Random();
        for(int i=0; i<500000; i++)
            test[i]=i;
        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<500000; j++)
                test[i]=i;
        }
        avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        System.out.println("1000000");
        test=new int[1000000];
        // Generate 10 random input
        rand = new Random();
        for(int i=0; i<1000000; i++)
            test[i]=i;
        mergeSort_count=0;
        avgCPUTime=0;
        for (int i=0;i<4;i++) {
            insertionSort(test, test.length);
            for(int j=0; j<1000000; j++)
                test[i]=i;
        }
        avgElapsedCPUTime=avgCPUTime/4;
        System.out.println("avgCPU: "+avgElapsedCPUTime);
        System.out.println();

        //Merge Sort

        //Selection Sort
//        selectionSort(test,test.length);

        //Insertion Sort
//        insertionSort(test,test.length);

    }

    public static void printData(int[] data, String sortType){
        System.out.print(sortType+": ");
        for (int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }

    public static void selectionSort(int A[], int n) {
        int[] tempArray=A.clone();

        int min=0, minIndex=0;

        //of operations
        long count=0;

        ThreadMXBean tmb = ManagementFactory.getThreadMXBean();
        long startTime = System.nanoTime(); //get starting times
        long startCPUTime = tmb.getCurrentThreadCpuTime(); //also in nanoseconds

        for (int i=0;i<tempArray.length-1;i++){
            minIndex=i;
            min=tempArray[minIndex];
            for (int j=i+1;j<tempArray.length;j++){
                if (min>tempArray[j]){
                    minIndex=j;
                    min=tempArray[j];
                }

                //of operations
                count++;
            }
            if (minIndex!=i){
                int temp=tempArray[i];
                tempArray[i]=tempArray[minIndex];
                tempArray[minIndex]=temp;
            }
        }

        long endCPUTime = tmb.getCurrentThreadCpuTime(); //get ending times
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime; //calculate delta times
        long elapsedCPUTime = endCPUTime - startCPUTime;

        avgCPUTime=avgCPUTime+elapsedCPUTime;

        System.out.println("#: "+count);
        System.out.println("tElapsed: "+elapsedTime);
        System.out.println("tCPU: "+elapsedCPUTime);
    }

    public static void insertionSort (int A[], int n) {
        int[] tempArray=A.clone();
        int i=0,j=0;

        //of operations
        long count=0;

        ThreadMXBean tmb = ManagementFactory.getThreadMXBean();
        long startTime = System.nanoTime(); //get starting times
        long startCPUTime = tmb.getCurrentThreadCpuTime(); //also in nanoseconds

        for (i=1;i<n;i++){
            int temp=tempArray[i];
            for (j=i;j>0 && tempArray[j-1]>temp;j--) {
                tempArray[j] = tempArray[j - 1];

                //of operations
                count++;
            }
            tempArray[j]=temp;
        }

        long endCPUTime = tmb.getCurrentThreadCpuTime(); //get ending times
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime; //calculate delta times
        long elapsedCPUTime = endCPUTime - startCPUTime;

        avgCPUTime=avgCPUTime+elapsedCPUTime;

        System.out.println("#: "+count);
        System.out.println("tElapsed: "+elapsedTime);
        System.out.println("tCPU: "+elapsedCPUTime);
    }

    public static long mergeSort_count=0;

    public static void mergeSort (int A[], int n) {
        int[] tempArray=A.clone();

        ThreadMXBean tmb = ManagementFactory.getThreadMXBean();
        long startTime = System.nanoTime(); //get starting times
        long startCPUTime = tmb.getCurrentThreadCpuTime(); //also in nanoseconds

        myMergeSort(tempArray,0,n-1);

        long endCPUTime = tmb.getCurrentThreadCpuTime(); //get ending times
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime; //calculate delta times
        long elapsedCPUTime = endCPUTime - startCPUTime;

        avgCPUTime=avgCPUTime+elapsedCPUTime;

        System.out.println("#: "+mergeSort_count);
        System.out.println("tElapsed: "+elapsedTime);
        System.out.println("tCPU: "+elapsedCPUTime);
    }

    public static void myMergeSort(int data[], int left, int right){
        if (left<right){
            int half=(left+right)/2;
            myMergeSort(data,left,half);
            myMergeSort(data,half+1,right);
            merge(data,left,right);
            mergeSort_count++;
        }
    }

    public static void merge(int data[], int left, int right){
        int mid=(left+right)/2;
        int i=left;
        int j=mid+1;
        int count=0;
        int[] temp=new int[right-left+1];
        while(i<=mid && j<=right){
            if (data[i]<data[j])
                temp[count++]=data[i++];
            else
                temp[count++]=data[j++];
        }

        while (i<=mid){
            temp[count++]=data[i++];
        }

        while (j<=right){
            temp[count++]=data[j++];
        }

        count=0;
        while (left<=right){
            data[left++]=temp[count++];
        }
    }
}
