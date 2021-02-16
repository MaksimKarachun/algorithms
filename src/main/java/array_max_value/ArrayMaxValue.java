package array_max_value;

public class ArrayMaxValue
{
    public static Integer getMaxValue(int[] values)
    {
        if(values != null && values.length > 0) {
            int maxValue = values[0];
            for (int value : values) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            return maxValue;
        }
        else return null;
    }
}