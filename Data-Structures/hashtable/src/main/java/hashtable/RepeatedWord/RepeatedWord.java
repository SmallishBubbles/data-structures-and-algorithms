package hashtable.RepeatedWord;

import hashtable.HashTable;

public class RepeatedWord {

    public static String findFirstRepeatedWord(String longString) {
        HashTable<String, Integer> hashTable = new HashTable(100);

        String[] splitString = normalizeAndSplitString(longString);

        for ( int i = 0; i < splitString.length; i++ ) {
            if ( hashTable.contains(splitString[i]) ) {
                return splitString[i];
            } else {
                hashTable.add(splitString[i], 1);
            }
        }

        return "There were no duplicates";
    }

    private static String[] normalizeAndSplitString(String stringToSplit) {
        // https://stackoverflow.com/questions/18830813/how-can-i-remove-punctuation-from-input-text-in-java
        return stringToSplit.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }

}
