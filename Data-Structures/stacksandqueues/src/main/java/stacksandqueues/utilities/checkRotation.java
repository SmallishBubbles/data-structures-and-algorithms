package stacksandqueues.utilities;

import java.util.Queue;

public class checkRotation {
    public static boolean checkRotation(Queue q1, Queue q2) {
        if ( q1.size() != q2.size() ){
            return false;
        }
        int remainingTries = q1.size();
        int numMatches = 0;
        while ( remainingTries >= 0 ) {
            if ( numMatches == q1.size() ) {
                return true;
            } else if ( q1.peek().equals(q2.peek()) ) {
                q1.add(q1.remove());
                q2.add(q2.remove());
                numMatches ++;
            } else {
                q1.add(q1.remove());
                numMatches = 0;
                remainingTries--;
            }
        }
        return false;
    }
}
