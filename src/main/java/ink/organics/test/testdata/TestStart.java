package ink.organics.test.testdata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ink.organics.test.testdata.java.StaticFieldPOJO;

public class TestStart {

    private static final ObjectMapper objectMapper = new ObjectMapper();


    public static void main(String[] args) throws JsonProcessingException {
        StaticFieldPOJO staticFieldPOJO = new StaticFieldPOJO();

        String json = objectMapper.writeValueAsString(staticFieldPOJO);
        System.out.println(json);
    }
}
