package com.rined.psr.portal.utils;

import java.util.Collection;

public final class Utils {

    public static <T,V> boolean isSameSize(Collection<T> first, Collection<V> second){
        return first.size() == second.size();
    }

}
