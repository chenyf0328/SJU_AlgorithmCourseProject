import java.util.Arrays;

public class CountingSort {

    private int[] data = null;

    public CountingSort(int[] data){
        this.data=data;

        countingSort();
    }

    private void countingSort(){
        if (data == null || data.length == 0)
            return;

        int max = max(data);

        int[] count = new int[max+1];               // to store the sorted data
        Arrays.fill(count, 0);                  // initial array

        // calculate the number of each element
        for (int i=0;i<data.length;i++)
            count[data[i]]=count[data[i]]+1;

        int dataIndex=0;
        for (int i=0;i<=max;i++)
            for (int j=0;j<count[i];j++)
                data[dataIndex++]=i;

    }

    public int max(int[] data) {
        int max = Integer.MIN_VALUE;
        for (int tmp : data)
            if (tmp > max)
                max = tmp;

        return max;
    }
}
