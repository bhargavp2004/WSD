import java.util.ArrayList;

public class Median implements IMedian{

    public double findMedian(ArrayList<Integer> values)
    {
        if(values.size() % 2 == 0)
        {
            int mid1 = values.get((values.size() / 2));
            int mid2 = values.get((values.size() / 2 - 1));

            return (double)((mid1 + mid2) / 2);
        }
        else
        {
            return values.get((values.size() / 2));
        }
    }
}
