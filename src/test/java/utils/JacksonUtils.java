package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import objects.BillingDeatils;

import java.io.IOException;
import java.io.InputStream;

public class JacksonUtils {
    public static BillingDeatils deserializeJson(InputStream is, BillingDeatils billingDeatils) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(is, billingDeatils.getClass());

    }
}
