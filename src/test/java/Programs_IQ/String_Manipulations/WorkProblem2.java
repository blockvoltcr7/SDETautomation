package Programs_IQ.String_Manipulations;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WorkProblem2 {

    public static void main(String[] args) {
        String jsonString = "{\"010A00\":{"
                + "\"securities\":["
                + "{"
                + "\"symbol\":\"nvda\""
                + "},"
                + "{"
                + "\"symbol\":\"meta\""
                + "}"
                + "]"
                + "}"
                + "}";
        System.out.println("jsonString "+jsonString);

        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONObject innerObject = jsonObject.getJSONObject("010A00");
            JSONArray securitiesArray = innerObject.getJSONArray("securities");

            for (int i = 0; i < securitiesArray.length(); i++) {
                JSONObject security = securitiesArray.getJSONObject(i);
                String symbol = security.getString("symbol");

                if (symbol.equals("meta")) {
                    System.out.println("Found symbol: " + symbol);
                    break;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    }

