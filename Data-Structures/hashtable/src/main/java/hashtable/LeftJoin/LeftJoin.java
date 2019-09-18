package hashtable.LeftJoin;

import hashtable.HashTable;
import hashtable.Node;

public class LeftJoin {
    public static String[][] leftJoin(HashTable<String, String> table1, HashTable<String, String> table2) {
        String[][] join = new String[table1.itteratable().size()][3];

        int i = 0;

        for ( Node<String, String> node : table1.itteratable() ) {
            join[i][0] = node.getKey();
            join[i][1] = node.getValue();
            if ( table2.contains(node.getKey()) ) {
                join[i][2] = table2.get(node.getKey());
            } else {
                join[i][2] = null;
            }

            i++;
        }

        return join;
    }
}
