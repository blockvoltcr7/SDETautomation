package Programs_IQ.String_Manipulations;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WorkProblem1 {

    public static void main(String[] args) {
        String jsonString = "{\n" +
                "  \"010A00\": {\n" +
                "    \"securities\": [\n" +
                "      {\n" +
                "        \"symbol\": \"meta\",\n" +
                "        \"cusip\": \"5363452\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"symbol\": \"meta\",\n" +
                "        \"cusip\": \"56235435\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";

        // Parse the JSON string
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray securitiesArray = jsonObject.getJSONObject("010A00").getJSONArray("securities");

        // Extract cusip values and output in the desired format
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < securitiesArray.length(); i++) {
            JSONObject securityObject = securitiesArray.getJSONObject(i);
            String cusipValue = securityObject.getString("cusip");
            output.append("'").append(cusipValue).append("',");
        }

        // Remove the trailing comma
        if (output.length() > 0) {
            output.deleteCharAt(output.length() - 1);
        }

        System.out.println(output.toString());
    }
}
