import java.util.HashMap;

public class MinimumMaximum {

    private int[] data = null;
    private int min=0, max=0;
    private int cntComparisons=0, cntSwaps=0;
    private HashMap<String,Integer> myMap= new HashMap<>();

    public MinimumMaximum(int[] data){
        this.data=data;
        minimum();
        maximum();

        myMap.put("comparisons",cntComparisons);
        myMap.put("swaps",cntSwaps);
    }

    public HashMap<String, Integer> getMyMap(){
        return myMap;
    }

    public void minimum(){
        min=data[0];
        for (int i=1;i<data.length;i++){
            cntComparisons++;
            if (min>data[i]) {
                cntSwaps++;
                min = data[i];
            }
        }
//        System.out.println("Minimum is: " + getMin());
    }

    public int getMin(){
        return min;
    }

    public void maximum(){
        max=data[0];
        for (int i=1;i<data.length;i++){
            cntComparisons++;
            if (max<data[i]) {
                cntSwaps++;
                max = data[i];
            }
        }
//        System.out.println("Maximum is: " + getMax());
    }

    public int getMax(){
        return max;
    }
}
