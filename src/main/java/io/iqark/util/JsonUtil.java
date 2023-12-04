package io.iqark.util;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class JsonUtil {
    public static JSONObject fromInputStream(InputStream is) throws IOException {
        return new JSONObject(IOUtils.toString(is, StandardCharsets.UTF_8));
    }
}
