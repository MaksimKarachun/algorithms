package rabin_karp;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class RabinKarpExtended
{
    private String text;
    private TreeMap<Integer, Integer> number2position = new TreeMap<Integer, Integer>();

    public RabinKarpExtended(String text)
    {
        this.text = text;
        try {
            createIndex();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Integer> search(String query)
    {
        ArrayList<Integer> indices = null;
        if (number2position != null) {
            indices = new ArrayList<Integer>();
            //TODO: implement search alogorithm
            char[] queryArray = query.toCharArray();
            int queryLength = query.length();
            StringBuilder str = new StringBuilder();
            for (char c : queryArray) {
                str.append((int) c);
            }
            int queryInt = Integer.parseInt(str.toString());
            StringBuilder currentString;
            for (int i = 0; i <= number2position.size() - queryLength; i++) {
                currentString = new StringBuilder();
                for (int k = 0; k < queryLength; k++) {
                    currentString.append(number2position.get(i + k));
                }
                if (Integer.parseInt(currentString.toString()) == queryInt)
                    indices.add(i);
            }
        }
        return indices;
    }

    private void createIndex() throws Exception{
        //TODO: implement text indexing
        int differentChar = 0;
        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length; i++){
            int charNum = textArray[i];
            if (!number2position.containsValue(charNum)){
                differentChar++;
            }
            if (differentChar > 9){
                number2position = null;
                throw new Exception("количество букв алфавита больше 9");
            }
            number2position.put(i, charNum);
        }
    }
}