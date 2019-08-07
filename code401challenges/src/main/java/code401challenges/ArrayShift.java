package code401challenges;

public class ArrayShift {
    public static int[] arrayShift(int[] arrToBeShifted, int intToBeAdded){
        int length = arrToBeShifted.length;
        int[] finalArr = new int[length + 1];
        // need to divide with decimal places for this to calc properly
        // https://stackoverflow.com/questions/4540684/java-round-up-any-number
        int middle = (int)Math.ceil(length / 2.0);
        for ( int i = 0; i < finalArr.length; i++){
            if ( i < middle ){
                finalArr[i] = arrToBeShifted[i];
            } else if ( i == middle ){
                finalArr[i] = intToBeAdded;
            } else {
                finalArr[i] = arrToBeShifted[i-1];
            }
        }
        return finalArr;
    }
}
