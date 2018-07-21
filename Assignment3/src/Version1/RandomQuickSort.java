package Version1;

import java.util.HashMap;
import java.util.Random;

public class RandomQuickSort {
    private int[] data = null;
    private int cntComparisons=0;
    private int cntSwaps=0;
    private HashMap<String,Integer> myMap= new HashMap<>();

    public RandomQuickSort(int[] data){
        this.data=data;
        randomQuickSort(data,0,data.length-1);

        myMap.put("comparisons",cntComparisons);
        myMap.put("swaps",cntSwaps);
    }

    public int[] getData(){
        return data;
    }

    public HashMap<String, Integer> getMyMap(){
        return myMap;
    }

    public void randomQuickSort(int[] data, int p, int r){
        if (p < r) {
            int q = randomizedPartition(this.data, p, r);

//            showStage();

            randomQuickSort(data, p, q - 1);
            randomQuickSort(data, q + 1, r);
        }
    }

    public int partition(int[] data, int p, int r){
        int x = data[r];
        int i=p-1;
        for (int j=p;j<r;j++){
            cntComparisons++;
            if (data[j]<=x){
                i++;

                // swap data[i] and data[j]
                int temp=data[i];
                data[i]=data[j];
                data[j]=temp;

                cntSwaps++;
            }
        }

        // swap data[i+1] and data[r]
        int temp=data[i+1];
        data[i+1]=data[r];
        data[r]=temp;

        cntSwaps++;

        return i+1;
    }

    public int randomizedPartition(int[] data, int p, int r){
        int i = (int) ((Math.random()*(r-p+1))+p);
        int temp=data[i];
        data[i]=data[r];
        data[r]=temp;
        return partition(this.data, p, r);
    }

    public void showStage(){
        for (int i=0;i<this.data.length;i++)
            System.out.print(data[i]+" ");

        System.out.println();
    }
}
