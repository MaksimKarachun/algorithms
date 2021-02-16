import binary_search.BinarySearch;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTest extends TestCase {

    ArrayList<String> list;
    BinarySearch binarySearch;

    @Override
    protected void setUp() throws Exception {
        list = new ArrayList<String>(Arrays.asList("anton", "boris", "fedor", "gerasim", "will"));
        binarySearch = new BinarySearch(list);
        super.setUp();
    }

    public void testBinarySearch(){
        int actual = binarySearch.search("fedor");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
