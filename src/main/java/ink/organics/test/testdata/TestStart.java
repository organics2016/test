package ink.organics.test.testdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import ink.organics.test.testdata.java.RecordTestPOJO;

public class TestStart {

    private static final ObjectMapper objectMapper = new ObjectMapper();


    public static void main(String[] args) {
        RecordTestPOJO re = new RecordTestPOJO(1,2);

        System.out.println(re);
    }
}
