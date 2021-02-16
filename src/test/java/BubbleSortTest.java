import binary_search.BinarySearch;
import bubble_sort.BubbleSort;
import junit.framework.TestCase;


public class BubbleSortTest extends TestCase {

    int[] mass;
    BinarySearch binarySearch;

    @Override
    protected void setUp() throws Exception {
        mass = new int[]{10, 8, 7, 5, 4, 1};
        super.setUp();
    }

    public void testBubbleSort(){
        BubbleSort.sort(mass);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : mass) {
            stringBuilder.append(i);
        }
        String actual = stringBuilder.toString();
        String expected = "1457810";
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
