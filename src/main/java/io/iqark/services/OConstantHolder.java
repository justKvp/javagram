package io.iqark.services;

import io.iqark.util.JsonUtil;
import jakarta.enterprise.context.ApplicationScoped;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

@ApplicationScoped
public class OConstantHolder {
    public JSONObject heroes;

    public OConstantHolder() throws IOException {
        this.heroes = getJsonName("build/heroes.json");
    }

    protected JSONObject getJsonName(String name) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(name);
        return JsonUtil.fromInputStream(is);
    }
}
