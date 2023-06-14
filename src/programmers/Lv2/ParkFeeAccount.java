package programmers.Lv2;

import java.util.*;

public class ParkFeeAccount {
    public static void main(String[] args) {
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        int[] fees = new int[]{180, 5000, 10, 600};
        System.out.println(Arrays.toString(solution(fees, records)));

        records = new String[] {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
        fees = new int[]{120, 0, 60, 591};
        System.out.println(Arrays.toString(solution(fees, records)));
    }

    public static int[] solution(int[] fees, String[] records) {
        Map <String,List <Integer>> parking = new HashMap <>();
        Map <String,Integer> res = new HashMap <>();

        for (String record : records) {
            String[] parkingInfo = record.split(" ");

            String time = parkingInfo[0];
            String carNumber = parkingInfo[1];
            String state = parkingInfo[2];
            int pre = 0;

            if (!parking.containsKey(carNumber) && state.equals("IN")) {
                List <Integer> carInfo = new ArrayList <>();
                carInfo.add(getTime(time));
                parking.put(carNumber, carInfo);
            } else
                parking.get(carNumber).add(getTime(time));
        }

        for (String key : parking.keySet()) {
            if (parking.get(key).size() % 2 != 0) {
                parking.get(key).add(getTime("23:59"));
            }
        }

        for (String key : parking.keySet()) {
            int total = 0;
            for (int i = 0; i < parking.get(key).size() / 2; i++) {
                int end = parking.get(key).get(2 * i + 1);
                int start = parking.get(key).get(2 * i);
                total += end - start;
            }
            if (total >= fees[0]){
                res.put(key, fees[1] + ((int)Math.ceil((double)(total - fees[0])/fees[2])) * fees[3]);
                continue;
            }
            res.put(key, fees[1]);
        }

        return res.entrySet().stream().sorted(new Comparator <Map.Entry <String,Integer>>() {
            @Override
            public int compare(Map.Entry <String,Integer> o1, Map.Entry <String,Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        }).mapToInt(Map.Entry::getValue).toArray();
    }

    public static int getTime(String time) {
        String[] t = time.split(":");
        return Integer.valueOf(t[0]) * 60 + Integer.valueOf(t[1]);
    }
}