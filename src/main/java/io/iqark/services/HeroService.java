package io.iqark.services;

import io.iqark.basepojo.constanthero.HeroData;
import io.iqark.util.JacksonUtil;
import io.iqark.util.TextUtil;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Startup
@ApplicationScoped
public class HeroService {
    private final Map<Integer, HeroData> heroMap = new HashMap<>();

    public HeroService() throws IOException {
        loadHeroesData();
    }

    protected String getStringJsonName(String name) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(name);
        return TextUtil.getStringFromInputStream(is);
    }

    public HeroData getHero(String name) {
        String search = name.toLowerCase();
        for (Map.Entry<Integer, HeroData> entry : heroMap.entrySet()) {
            if (entry.getValue().getName().contains(search) || entry.getValue().getLocName().toLowerCase().contains(search)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public HeroData getHeroById(Integer id) {
        return heroMap.get(id);
    }

    protected void loadHeroesData() throws IOException {
        JSONObject heroes = new JSONObject(getStringJsonName("build/heroes.json"));
        for (String key : heroes.keySet()) {
            HeroData hd = JacksonUtil.getHeroDataFromString(heroes.get(key).toString());
            this.heroMap.put(Integer.parseInt(key), hd);
        }
    }
}
