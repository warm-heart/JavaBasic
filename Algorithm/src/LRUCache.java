import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wangqianlong
 * @create 2020-04-11 0:22
 */

public class LRUCache<K, V> {

    private final int MAX_CACHE_SIZE;
    private final float DEFAULT_LOAD_FACTORY = 0.75f;
    LinkedHashMap<K, V> cacheMap;

    public LRUCache(int MAX_CACHE_SIZE) {
        this.MAX_CACHE_SIZE = MAX_CACHE_SIZE;
        int capacity = (int) (Math.ceil(MAX_CACHE_SIZE / DEFAULT_LOAD_FACTORY) + 1);
        cacheMap = new LinkedHashMap<K, V>(capacity, DEFAULT_LOAD_FACTORY, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > MAX_CACHE_SIZE;
            }
        };
    }

    public synchronized void put(K key, V value) {
        cacheMap.put(key, value);
    }

    public synchronized V get(K key) {
        return cacheMap.get(key);
    }

    public synchronized V remove(K key) {
        return cacheMap.remove(key);
    }

    public synchronized Set<Map.Entry<K, V>> getAll(K key, V value) {
        return cacheMap.entrySet();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry entry : cacheMap.entrySet()) {
            builder.append(String.format("%s: %s ", entry.getKey(), entry.getValue()));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LRUCache<String, String> cache = new LRUCache<>(3);
        cache.put("one", "one");
        cache.put("two", "two");
        cache.put("three", "three");
        System.out.println(cache);
        cache.put("four", "four");
        System.out.println(cache);
        cache.put("five", "five");

        System.out.println(cache);

        String s = cache.get("three");
        System.out.println("使用：" + s);

        cache.put("six","six");
        System.out.println(cache);


    }
}
