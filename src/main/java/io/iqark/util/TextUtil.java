package io.iqark.util;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class TextUtil {
    public static JSONObject getJsonFromInputStream(InputStream is) throws IOException {
        return new JSONObject(IOUtils.toString(is, StandardCharsets.UTF_8));
    }

    public static String getStringFromInputStream(InputStream is) throws IOException {
        return IOUtils.toString(is, StandardCharsets.UTF_8);
    }
}
