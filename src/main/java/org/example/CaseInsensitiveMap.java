package org.example;

import java.util.HashMap;
import java.util.Map;

public class CaseInsensitiveMap <K,V> extends HashMap<K,V> {
  private Map<String, K> lowerCaseKeyMap = new HashMap<>();

  @Override
  public V put(K key, V value){
    if(key instanceof String){
      lowerCaseKeyMap.put(((String)key).toLowerCase(), key);
    }
    return super.put(key, value);
  }

  public boolean containsIgnoreCaseKey(Object key){
    if(key instanceof String){
      String lowerCaseKey = ((String)key).toLowerCase();
      return lowerCaseKeyMap.containsKey(lowerCaseKey);
    }
    return false;
  }
}
