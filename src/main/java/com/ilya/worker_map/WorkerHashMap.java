package com.ilya.worker_map;

import com.sun.jdi.Value;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Node;

import java.security.Key;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class WorkerHashMap implements Map {
    private int size;

    @Override
    public int size() {
        return size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
      return false;
    }

    @Override
    public boolean containsValue(Object value) {

        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Nullable
    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(@NotNull Map m) {

    }

    @Override
    public void clear() {

    }

    @NotNull
    @Override
    public Set keySet() {
        return null;
    }

    @NotNull
    @Override
    public Collection values() {
        return null;
    }

    @NotNull
    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
