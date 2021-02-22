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
        int actual1 = binarySearch.search("fedor"); //expected 2
        int actual2 = binarySearch.search("");      //expected -1
        int actual3 = binarySearch.search("zzz");   //expected -1
        int actual = actual1 + actual2 + actual3;
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
