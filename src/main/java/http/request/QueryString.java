package http.request;

import java.util.HashMap;

public class QueryString {

    private static final String PARAMETER_DELIMITER = "&";
    private static final String VALUE_DELIMITER = "=";
    private static final int KEY_INDEX = 0;
    private static final int VALUE_INDEX = 1;

    private HashMap<String, String> param = new HashMap<>();

    public QueryString(String value) {
        String[] values = value.split(PARAMETER_DELIMITER);
        for (String s : values) {
            String[] query = s.split(VALUE_DELIMITER);
            addParameter(query);
        }
    }

    private void addParameter(String[] query) {
        if(query.length > 1) {
            param.put(query[KEY_INDEX], query[VALUE_INDEX]);
        }
    }

    public String getParameter(String key) {
        return param.get(key);
    }
}
