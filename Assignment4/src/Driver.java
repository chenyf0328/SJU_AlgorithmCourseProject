import java.util.Random;

public class Driver {
    public static void findMeanAndMaximum(int[] comparisons, int[] swaps){
        QuickSort qs=new QuickSort(comparisons);
        int sumComp=calSum(comparisons);

        System.out.println("Mean of comparisons is: " + sumComp/comparisons.length);
        System.out.println("Maximum of comparisons is: " + qs.getData()[9]);
        System.out.println();

        qs=new QuickSort(swaps);
        int sumSwaps=calSum(swaps);
        System.out.println("Mean of swaps is: " + sumSwaps/swaps.length);
        System.out.println("Maximum of swaps is: " + qs.getData()[9]);
    }

    public static int calSum(int[] data){
        int sum=0;
        for (int i=0;i<data.length;i++){
            sum=sum+data[i];
        }
        return sum;
    }

    public static void main (String[] args) {

        // store the result of 10 comparisons and swaps
        int[] cntComparisons=new int[10];
        int[] cntSwaps=new int[10];

        // Version 1 (16 numbers)
//        int[] dataV116=new int[]{5,2,10,28,87,45,90,23,4,12,22,45,23,19,43,44};
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 (16 numbers):");
//        new MinimumMaximum(dataV116);
//        System.out.println("----------------------------------------------------");

//        //Version 1 (50 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV150 = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV150[i] = rand.nextInt(100);
//
//            MinimumMaximum minMax = new MinimumMaximum(dataV150);
//            cntComparisons[num]=minMax.getMyMap().get("comparisons");
//            cntSwaps[num]=minMax.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 1 (100 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV1100 = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV1100[i] = rand.nextInt(1000);
//
//            MinimumMaximum minMax = new MinimumMaximum(dataV1100);
//            cntComparisons[num]=minMax.getMyMap().get("comparisons");
//            cntSwaps[num]=minMax.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 1 (200 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV1200 = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV1200[i] = rand.nextInt(1000);
//
//            MinimumMaximum minMax = new MinimumMaximum(dataV1200);
//            cntComparisons[num]=minMax.getMyMap().get("comparisons");
//            cntSwaps[num]=minMax.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 1 (400 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV1400 = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV1400[i] = rand.nextInt(1000);
//
//            MinimumMaximum minMax = new MinimumMaximum(dataV1400);
//            cntComparisons[num]=minMax.getMyMap().get("comparisons");
//            cntSwaps[num]=minMax.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 1 almost sorted (50 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV150AS = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV150AS[i] = i;
//
//            for (int j=0;j<50/50;j++){
//                int randI=rand.nextInt(50);
//                int randJ=rand.nextInt(50);
//                int temp=dataV150AS[randI];
//                dataV150AS[randI]=dataV150AS[randJ];
//                dataV150AS[randJ]=temp;
//            }
//
//            MinimumMaximum minMax = new MinimumMaximum(dataV150AS);
//            cntComparisons[num]=minMax.getMyMap().get("comparisons");
//            cntSwaps[num]=minMax.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 almost sorted (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 1 almost sorted (100 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV1100AS = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV1100AS[i] = i;
//
//            for (int j=0;j<100/50;j++){
//                int randI=rand.nextInt(100);
//                int randJ=rand.nextInt(100);
//                int temp=dataV1100AS[randI];
//                dataV1100AS[randI]=dataV1100AS[randJ];
//                dataV1100AS[randJ]=temp;
//            }
//
//            MinimumMaximum minMax = new MinimumMaximum(dataV1100AS);
//            cntComparisons[num]=minMax.getMyMap().get("comparisons");
//            cntSwaps[num]=minMax.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 almost sorted (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 1 almost sorted (200 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV1200AS = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV1200AS[i] = i;
//
//            for (int j=0;j<200/50;j++){
//                int randI=rand.nextInt(200);
//                int randJ=rand.nextInt(200);
//                int temp=dataV1200AS[randI];
//                dataV1200AS[randI]=dataV1200AS[randJ];
//                dataV1200AS[randJ]=temp;
//            }
//
//            MinimumMaximum minMax = new MinimumMaximum(dataV1200AS);
//            cntComparisons[num]=minMax.getMyMap().get("comparisons");
//            cntSwaps[num]=minMax.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 almost sorted (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 1 almost sorted (400 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV1400AS = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV1400AS[i] = i;
//
//            for (int j=0;j<400/50;j++){
//                int randI=rand.nextInt(400);
//                int randJ=rand.nextInt(400);
//                int temp=dataV1400AS[randI];
//                dataV1400AS[randI]=dataV1400AS[randJ];
//                dataV1400AS[randJ]=temp;
//            }
//
//            MinimumMaximum minMax = new MinimumMaximum(dataV1400AS);
//            cntComparisons[num]=minMax.getMyMap().get("comparisons");
//            cntSwaps[num]=minMax.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 almost sorted (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        // Version 2 (16 numbers)
//        int[] dataV216=new int[]{5,2,10,28,87,45,90,23,4,12,22,45,23,19,43,44};
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (16 numbers):");
//        new SelectionProblem(dataV216, 16);
//        System.out.println("----------------------------------------------------");

        // Version 2
//      // Version 2 (50 numbers)
//        int spec = 1;
//        for (int num=0;num<10;num++) {
//            int[] dataV250 = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV250[i] = rand.nextInt(100);
//
//            SelectionProblem select = new SelectionProblem(dataV250,spec);
//            cntComparisons[num]=select.getMyMap().get("comparisons");
//            cntSwaps[num]=select.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        // Version 2 (100 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV2100 = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV2100[i] = rand.nextInt(1000);
//
//            SelectionProblem select = new SelectionProblem(dataV2100,spec);
//            cntComparisons[num]=select.getMyMap().get("comparisons");
//            cntSwaps[num]=select.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (200 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV2200 = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV2200[i] = rand.nextInt(1000);
//
//            SelectionProblem select = new SelectionProblem(dataV2200,spec);
//            cntComparisons[num]=select.getMyMap().get("comparisons");
//            cntSwaps[num]=select.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (400 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV2400 = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV2400[i] = rand.nextInt(1000);
//
//            SelectionProblem select = new SelectionProblem(dataV2400,spec);
//            cntComparisons[num]=select.getMyMap().get("comparisons");
//            cntSwaps[num]=select.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 almost sorted (50 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV250AS = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV250AS[i] = i;
//
//            for (int j=0;j<50/50;j++){
//                int randI=rand.nextInt(50);
//                int randJ=rand.nextInt(50);
//                int temp=dataV250AS[randI];
//                dataV250AS[randI]=dataV250AS[randJ];
//                dataV250AS[randJ]=temp;
//            }
//
//            SelectionProblem select = new SelectionProblem(dataV250AS,spec);
//            cntComparisons[num]=select.getMyMap().get("comparisons");
//            cntSwaps[num]=select.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 almost sorted (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 almost sorted (100 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV2100AS = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV2100AS[i] = i;
//
//            for (int j=0;j<100/50;j++){
//                int randI=rand.nextInt(100);
//                int randJ=rand.nextInt(100);
//                int temp=dataV2100AS[randI];
//                dataV2100AS[randI]=dataV2100AS[randJ];
//                dataV2100AS[randJ]=temp;
//            }
//
//            SelectionProblem select = new SelectionProblem(dataV2100AS,spec);
//            cntComparisons[num]=select.getMyMap().get("comparisons");
//            cntSwaps[num]=select.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 almost sorted (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 almost sorted (200 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV2200AS = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV2200AS[i] = i;
//
//            for (int j=0;j<200/50;j++){
//                int randI=rand.nextInt(200);
//                int randJ=rand.nextInt(200);
//                int temp=dataV2200AS[randI];
//                dataV2200AS[randI]=dataV2200AS[randJ];
//                dataV2200AS[randJ]=temp;
//            }
//
//            SelectionProblem select = new SelectionProblem(dataV2200AS,spec);
//            cntComparisons[num]=select.getMyMap().get("comparisons");
//            cntSwaps[num]=select.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 almost sorted (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 almost sorted (400 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV2400AS = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV2400AS[i] = i;
//
//            for (int j=0;j<400/50;j++){
//                int randI=rand.nextInt(400);
//                int randJ=rand.nextInt(400);
//                int temp=dataV2400AS[randI];
//                dataV2400AS[randI]=dataV2400AS[randJ];
//                dataV2400AS[randJ]=temp;
//            }
//
//            SelectionProblem select = new SelectionProblem(dataV2400AS,spec);
//            cntComparisons[num]=select.getMyMap().get("comparisons");
//            cntSwaps[num]=select.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 almost sorted (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        // Version 3
//        // Version 3 (16 numbers)
//        int[] dataV316=new int[]{5,2,10,28,87,45,90,23,4,12,22,45,23,19,43,44};
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (16 numbers):");
//        new MedianOfMedians(dataV316, 16);
//        System.out.println("----------------------------------------------------");

//        //Version 3 (50 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV350 = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV350[i] = rand.nextInt(100);
//
//            MedianOfMedians medianMedian = new MedianOfMedians(dataV350, spec);
//            cntComparisons[num]=medianMedian.getMyMap().get("comparisons");
//            cntSwaps[num]=medianMedian.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 (100 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV3100 = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV3100[i] = rand.nextInt(1000);
//
//            MedianOfMedians medianMedian = new MedianOfMedians(dataV3100, spec);
//            cntComparisons[num]=medianMedian.getMyMap().get("comparisons");
//            cntSwaps[num]=medianMedian.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 (200 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV3200 = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV3200[i] = rand.nextInt(1000);
//
//            MedianOfMedians medianMedian = new MedianOfMedians(dataV3200, spec);
//            cntComparisons[num]=medianMedian.getMyMap().get("comparisons");
//            cntSwaps[num]=medianMedian.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 (400 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV3400 = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV3400[i] = rand.nextInt(1000);
//
//            MedianOfMedians medianMedian = new MedianOfMedians(dataV3400, spec);
//            cntComparisons[num]=medianMedian.getMyMap().get("comparisons");
//            cntSwaps[num]=medianMedian.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 almost sorted (50 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV350AS = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV350AS[i] = i;
//
//            for (int j=0;j<50/50;j++){
//                int randI=rand.nextInt(50);
//                int randJ=rand.nextInt(50);
//                int temp=dataV350AS[randI];
//                dataV350AS[randI]=dataV350AS[randJ];
//                dataV350AS[randJ]=temp;
//            }
//
//            MedianOfMedians medianMedian = new MedianOfMedians(dataV350AS, spec);
//            cntComparisons[num]=medianMedian.getMyMap().get("comparisons");
//            cntSwaps[num]=medianMedian.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 almost sorted (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 almost sorted (100 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV3100AS = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV3100AS[i] = i;
//
//            for (int j=0;j<100/50;j++){
//                int randI=rand.nextInt(100);
//                int randJ=rand.nextInt(100);
//                int temp=dataV3100AS[randI];
//                dataV3100AS[randI]=dataV3100AS[randJ];
//                dataV3100AS[randJ]=temp;
//            }
//
//            MedianOfMedians medianMedian = new MedianOfMedians(dataV3100AS, spec);
//            cntComparisons[num]=medianMedian.getMyMap().get("comparisons");
//            cntSwaps[num]=medianMedian.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 almost sorted (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 almost sorted (200 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV3200AS = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV3200AS[i] = i;
//
//            for (int j=0;j<200/50;j++){
//                int randI=rand.nextInt(200);
//                int randJ=rand.nextInt(200);
//                int temp=dataV3200AS[randI];
//                dataV3200AS[randI]=dataV3200AS[randJ];
//                dataV3200AS[randJ]=temp;
//            }
//
//            MedianOfMedians medianMedian = new MedianOfMedians(dataV3200AS, spec);
//            cntComparisons[num]=medianMedian.getMyMap().get("comparisons");
//            cntSwaps[num]=medianMedian.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 almost sorted (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 almost sorted (400 numbers)
//        int spec = 25;
//        for (int num=0;num<10;num++) {
//            int[] dataV3400AS = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV3400AS[i] = i;
//
//            for (int j=0;j<400/50;j++){
//                int randI=rand.nextInt(400);
//                int randJ=rand.nextInt(400);
//                int temp=dataV3400AS[randI];
//                dataV3400AS[randI]=dataV3400AS[randJ];
//                dataV3400AS[randJ]=temp;
//            }
//
//            MedianOfMedians medianMedian = new MedianOfMedians(dataV3400AS, spec);
//            cntComparisons[num]=medianMedian.getMyMap().get("comparisons");
//            cntSwaps[num]=medianMedian.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 almost sorted (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

    }
}
