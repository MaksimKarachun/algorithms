import binary_search.BinarySearch;
import bubble_sort.BubbleSort;
import com.sun.tools.javac.util.StringUtils;
import junit.framework.TestCase;
import rabin_karp.RabinKarpExtended;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RabinKarpExtendedTest extends TestCase {

    String text;
    RabinKarpExtended rabinKarpExtended;

    @Override
    protected void setUp() throws Exception {
        text = "aereracsererasdasssa";
        super.setUp();
    }

    public void testBubbleSort(){
        rabinKarpExtended = new RabinKarpExtended(text);
        String query = "er";
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3, 8, 10));
        List<Integer> actual = rabinKarpExtended.search(query);
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
