package day57;

public class EarliestFinishTimeForLandAndWaterRides_3633 {
    static void main() {
        int[] landStart={2,8};
        int[] landDur={4,1};
        int[] waterStart={6};
        int[] waterDur={3};
        System.out.println(earliestFinishTime(landStart,landDur,waterStart,waterDur));
    }
    public static int earliestFinishTime(int[] landStartTime,int[] landDuration,int[] waterStartTime,int[] waterDuration){
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
                int finishLand = landStartTime[i] + landDuration[i];
                int finishLW = Math.max(finishLand, waterStartTime[j]) + waterDuration[j];
                int finishWater = waterStartTime[j] + waterDuration[j];
                int finishWL = Math.max(finishWater, landStartTime[i]) + landDuration[i];
                ans = Math.min(ans, Math.min(finishLW, finishWL));
            }
        }
        return ans;
    }
}
