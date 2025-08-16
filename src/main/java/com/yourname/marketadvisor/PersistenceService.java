package com.yourname.marketadvisor;

import java.util.*;

class PersistenceService
{
    static class HL { int ath = Integer.MIN_VALUE; int atl = Integer.MAX_VALUE; }
    private final Map<Integer, HL> store = new HashMap<>();

    Map<Integer, HL> load() { return store; }
    void save(Map<Integer, HL> s) { /* stub */ }
}
