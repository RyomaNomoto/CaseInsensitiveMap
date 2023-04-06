package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaseInsensitiveMapTest {
  @Test
  public void testContainsIgnoreCaseKey() {
    CaseInsensitiveMap<String, Integer> map = new CaseInsensitiveMap<>();
    map.put("Key1", 1);

    assertTrue(map.containsIgnoreCaseKey("Key1"));
    assertTrue(map.containsIgnoreCaseKey("key1"));
    assertFalse(map.containsIgnoreCaseKey("Key2"));
  }
}
