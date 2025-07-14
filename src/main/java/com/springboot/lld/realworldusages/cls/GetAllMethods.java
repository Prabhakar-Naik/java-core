package com.springboot.lld.realworldusages.cls;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class GetAllMethods {

    /**
     * Print all declared methods of the class.
     *
     * @param cls Tested class
     * @return list of methods name
     */
    public static List<String> getAllMethods(final Class<?> cls) {
        return Arrays.stream(cls.getDeclaredFields())
                .map(Field::getName)
                .toList();
    }

    /**
     * Tests for {@link GetAllMethods#getAllMethods(Class)}.
     */
//    @Test
//    void testGetAllMethods() {
//        var list = GetAllMethods.getAllMethods(GetAllMethods.class);
//        assertTrue(list.contains("getAllMethods"));
//    }
}
