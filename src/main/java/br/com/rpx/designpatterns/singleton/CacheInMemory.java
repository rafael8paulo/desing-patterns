package br.com.rpx.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class CacheInMemory {

    private static CacheInMemory instance;
    private static Map<String, Object> cache;

    private CacheInMemory() {
        cache = new HashMap<>();
    }

    public static synchronized CacheInMemory getInstance() {
        if (instance == null) {
            instance = new CacheInMemory();
        }
        return instance;
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public Object get(String key) {
        return cache.get(key);
    }
}
