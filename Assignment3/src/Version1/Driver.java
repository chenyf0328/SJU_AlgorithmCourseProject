package Version1;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

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

//        // Version 1 (16 numbers)
//        int[] dataV116=new int[]{5,2,10,28,87,45,90,23,4,12,22,45,23,19,43,44};
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 (16 numbers):");
//        new QuickSort(dataV116);
//        System.out.println("----------------------------------------------------");

//        //Version 1 (50 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV150 = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV150[i] = rand.nextInt(100);
//
//            QuickSort qs = new QuickSort(dataV150);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
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
//            QuickSort qs = new QuickSort(dataV1100);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
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
//            QuickSort qs = new QuickSort(dataV1200);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
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
//            QuickSort qs = new QuickSort(dataV1400);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
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
//            QuickSort qs = new QuickSort(dataV150AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
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
//            QuickSort qs = new QuickSort(dataV1100AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
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
//            QuickSort qs = new QuickSort(dataV1200AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
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
//            QuickSort qs = new QuickSort(dataV1400AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 1 almost sorted (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        // Version 2
//        // Version 2 (a) (50 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV250 = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV250[i] = rand.nextInt(100);
//
//            SmallQuickSort qs = new SmallQuickSort(dataV250);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (a) (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        // Version 2 (a) (100 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2100 = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV2100[i] = rand.nextInt(1000);
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2100);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (a) (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (a) (200 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2200 = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV2200[i] = rand.nextInt(1000);
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2200);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (a) (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (a) (400 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2400 = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV2400[i] = rand.nextInt(1000);
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2400);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (a) (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (a) almost sorted (50 numbers)
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
//            SmallQuickSort qs = new SmallQuickSort(dataV250AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (a) almost sorted (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (a) almost sorted (100 numbers)
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
//            SmallQuickSort qs = new SmallQuickSort(dataV2100AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (a) almost sorted (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (a) almost sorted (200 numbers)
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
//            SmallQuickSort qs = new SmallQuickSort(dataV2200AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (a) almost sorted (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (a) almost sorted (400 numbers)
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
//            SmallQuickSort qs = new SmallQuickSort(dataV2400AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (a) almost sorted (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        // Version 2 (b) (50 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2b50 = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV2b50[i] = rand.nextInt(100);
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2b50);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (b) (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        // Version 2 (b) (100 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2b100 = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV2b100[i] = rand.nextInt(1000);
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2b100);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (b) (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (b) (200 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2b200 = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV2b200[i] = rand.nextInt(1000);
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2b200);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (b) (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (b) (400 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2b400 = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV2b400[i] = rand.nextInt(1000);
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2b400);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (b) (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (b) almost sorted (50 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2b50AS = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV2b50AS[i] = i;
//
//            for (int j=0;j<50/50;j++){
//                int randI=rand.nextInt(50);
//                int randJ=rand.nextInt(50);
//                int temp=dataV2b50AS[randI];
//                dataV2b50AS[randI]=dataV2b50AS[randJ];
//                dataV2b50AS[randJ]=temp;
//            }
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2b50AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (b) almost sorted (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (b) almost sorted (100 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2b100AS = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV2b100AS[i] = i;
//
//            for (int j=0;j<100/50;j++){
//                int randI=rand.nextInt(100);
//                int randJ=rand.nextInt(100);
//                int temp=dataV2b100AS[randI];
//                dataV2b100AS[randI]=dataV2b100AS[randJ];
//                dataV2b100AS[randJ]=temp;
//            }
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2b100AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (b) almost sorted (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (b) almost sorted (200 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2b200AS = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV2b200AS[i] = i;
//
//            for (int j=0;j<200/50;j++){
//                int randI=rand.nextInt(200);
//                int randJ=rand.nextInt(200);
//                int temp=dataV2b200AS[randI];
//                dataV2b200AS[randI]=dataV2b200AS[randJ];
//                dataV2b200AS[randJ]=temp;
//            }
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2b200AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (b) almost sorted (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 2 (b) almost sorted (400 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV2b400AS = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV2b400AS[i] = i;
//
//            for (int j=0;j<400/50;j++){
//                int randI=rand.nextInt(400);
//                int randJ=rand.nextInt(400);
//                int temp=dataV2b400AS[randI];
//                dataV2b400AS[randI]=dataV2b400AS[randJ];
//                dataV2b400AS[randJ]=temp;
//            }
//
//            SmallQuickSort qs = new SmallQuickSort(dataV2b400AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 2 (b) almost sorted (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        // Version 3 (16 numbers)
//        int[] dataV316=new int[]{5,2,10,28,87,45,90,23,4,12,22,45,23,19,43,44};
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (16 numbers):");
//        new RandomQuickSort(dataV316);
//        System.out.println("----------------------------------------------------");

//        //Version 3 (50 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV350 = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV350[i] = rand.nextInt(100);
//
//            RandomQuickSort qs = new RandomQuickSort(dataV350);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 (100 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV3100 = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV3100[i] = rand.nextInt(1000);
//
//            RandomQuickSort qs = new RandomQuickSort(dataV3100);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 (200 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV3200 = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV3200[i] = rand.nextInt(1000);
//
//            RandomQuickSort qs = new RandomQuickSort(dataV3200);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 (400 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV3400 = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV3400[i] = rand.nextInt(1000);
//
//            RandomQuickSort qs = new RandomQuickSort(dataV3400);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 almost sorted (50 numbers)
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
//            RandomQuickSort qs = new RandomQuickSort(dataV350AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 almost sorted (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 almost sorted (100 numbers)
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
//            RandomQuickSort qs = new RandomQuickSort(dataV3100AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 almost sorted (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 almost sorted (200 numbers)
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
//            RandomQuickSort qs = new RandomQuickSort(dataV3200AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 almost sorted (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 3 almost sorted (400 numbers)
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
//            RandomQuickSort qs = new RandomQuickSort(dataV3400AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 3 almost sorted (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

        // Version 4 (16 numbers)
//        int[] dataV416=new int[]{5,2,10,28,87,45,90,23,4,12,22,45,23,19,43,44};
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 4 (16 numbers):");
//        new MedianOf3QuickSort(dataV416);
//        System.out.println("----------------------------------------------------");

//        //Version 4 (50 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV450 = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV450[i] = rand.nextInt(100);
//
//            MedianOf3QuickSort qs = new MedianOf3QuickSort(dataV450);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 4 (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 4 (100 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV4100 = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV4100[i] = rand.nextInt(1000);
//
//            MedianOf3QuickSort qs = new MedianOf3QuickSort(dataV4100);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 4 (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 4 (200 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV4200 = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV4200[i] = rand.nextInt(1000);
//
//            MedianOf3QuickSort qs = new MedianOf3QuickSort(dataV4200);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 4 (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 4 (400 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV4400 = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV4400[i] = rand.nextInt(1000);
//
//            MedianOf3QuickSort qs = new MedianOf3QuickSort(dataV4400);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 4 (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 4 almost sorted (50 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV450AS = new int[50];
//            Random rand = new Random();
//            for (int i = 0; i < 50; i++)
//                dataV450AS[i] = i;
//
//            for (int j=0;j<50/50;j++){
//                int randI=rand.nextInt(50);
//                int randJ=rand.nextInt(50);
//                int temp=dataV450AS[randI];
//                dataV450AS[randI]=dataV450AS[randJ];
//                dataV450AS[randJ]=temp;
//            }
//
//            MedianOf3QuickSort qs = new MedianOf3QuickSort(dataV450AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 4 almost sorted (50 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 4 almost sorted (100 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV4100AS = new int[100];
//            Random rand = new Random();
//            for (int i = 0; i < 100; i++)
//                dataV4100AS[i] = i;
//
//            for (int j=0;j<100/50;j++){
//                int randI=rand.nextInt(100);
//                int randJ=rand.nextInt(100);
//                int temp=dataV4100AS[randI];
//                dataV4100AS[randI]=dataV4100AS[randJ];
//                dataV4100AS[randJ]=temp;
//            }
//
//            MedianOf3QuickSort qs = new MedianOf3QuickSort(dataV4100AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 4 almost sorted (100 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 4 almost sorted (200 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV4200AS = new int[200];
//            Random rand = new Random();
//            for (int i = 0; i < 200; i++)
//                dataV4200AS[i] = i;
//
//            for (int j=0;j<200/50;j++){
//                int randI=rand.nextInt(200);
//                int randJ=rand.nextInt(200);
//                int temp=dataV4200AS[randI];
//                dataV4200AS[randI]=dataV4200AS[randJ];
//                dataV4200AS[randJ]=temp;
//            }
//
//            MedianOf3QuickSort qs = new MedianOf3QuickSort(dataV4200AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 4 almost sorted (200 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");

//        //Version 4 almost sorted (400 numbers)
//        for (int num=0;num<10;num++) {
//            int[] dataV4400AS = new int[400];
//            Random rand = new Random();
//            for (int i = 0; i < 400; i++)
//                dataV4400AS[i] = i;
//
//            for (int j=0;j<400/50;j++){
//                int randI=rand.nextInt(400);
//                int randJ=rand.nextInt(400);
//                int temp=dataV4400AS[randI];
//                dataV4400AS[randI]=dataV4400AS[randJ];
//                dataV4400AS[randJ]=temp;
//            }
//
//            MedianOf3QuickSort qs = new MedianOf3QuickSort(dataV4400AS);
//            cntComparisons[num]=qs.getMyMap().get("comparisons");
//            cntSwaps[num]=qs.getMyMap().get("swaps");
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Version 4 almost sorted (400 numbers):");
//        findMeanAndMaximum(cntComparisons,cntSwaps);
//        System.out.println("----------------------------------------------------");
    }
}
