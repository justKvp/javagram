package io.iqark.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.iqark.basepojo.constanthero.HeroData;

public class JacksonUtil {

    public static HeroData getHeroDataFromString(String source) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(source, HeroData.class);
    }
}
