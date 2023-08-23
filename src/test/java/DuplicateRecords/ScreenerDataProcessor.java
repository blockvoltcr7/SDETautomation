package DuplicateRecords;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScreenerDataProcessor {

    public static void main(String[] args) {
        List<ScreenerData> screenerDataList = new ArrayList<>();
        // Add the sample data representing the table
        screenerDataList.add(new ScreenerData(42344, "FF", "FA", 2));
        screenerDataList.add(new ScreenerData(42344, "FF", "FN", 2));
        screenerDataList.add(new ScreenerData(42355, "AA", "FA", 2));
        screenerDataList.add(new ScreenerData(42355, "AA", "FN", 2));
        screenerDataList.add(new ScreenerData(42366, "FF", "FA", 2));
        screenerDataList.add(new ScreenerData(42366, "Null", "FN", 2));
        screenerDataList.add(new ScreenerData(42377, "AA", "FA", 2));
        screenerDataList.add(new ScreenerData(42377, "FF", "FN", 2));

        Map<Integer, String> duplicateScreenerIds = new HashMap<>();
        for (ScreenerData data : screenerDataList) {
            int screenerId = data.getScreenerId();
            String code = data.getCode();
            if (duplicateScreenerIds.containsKey(screenerId)) {
                String existingCode = duplicateScreenerIds.get(screenerId);
                if (!existingCode.equals(code)) {
                    System.out.println("Duplicate records with different codes found for Screener ID: " + screenerId);
                }
            } else {
                duplicateScreenerIds.put(screenerId, code);
            }
        }
    }

    static class ScreenerData {
        private int screenerId;
        private String code;
        private String scopeCd;
        private int count;

        public ScreenerData(int screenerId, String code, String scopeCd, int count) {
            this.screenerId = screenerId;
            this.code = code;
            this.scopeCd = scopeCd;
            this.count = count;
        }

        public int getScreenerId() {
            return screenerId;
        }

        public String getCode() {
            return code;
        }

        public String getScopeCd() {
            return scopeCd;
        }

        public int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return "ScreenerData{" +
                    "screenerId=" + screenerId +
                    ", code='" + code + '\'' +
                    ", scopeCd='" + scopeCd + '\'' +
                    ", count=" + count +
                    '}';
        }
    }
}
