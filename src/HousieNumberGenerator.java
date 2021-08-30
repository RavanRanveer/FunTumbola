public class HousieNumberGenerator implements RandomNumberGenerator{

    private int[] visitedArray;
    int count;

    int[] getVisitedArray(int min, int max){
        if(visitedArray == null){
            visitedArray = new int[max-min+1];
        }
        return visitedArray;
    }

    @Override
    public int generateRandomNumber(int min, int max) {
        visitedArray = getVisitedArray(min, max);
        int i;
        while(count<=(max-min+1)) {
            i = (int) (Math.random() * (max-min+1)+min);
            if (visitedArray[i - min] == 1) {
                continue;
            } else {
                visitedArray[i - min] = 1;
                count++;
                return i;
            }
        }
        return -1;
    }
}
