package com.springboot.lld.realworldusages.cls;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class GetAllFieldNames {

    /**
     * Print all declared field names of the class or the interface the class extends.
     *
     * @param clazz Tested class
     * @return list of names of all fields
     */

    public static List<String> getAllFieldNames(final Class<?> clazz) {
        var fields = new ArrayList<String>();
        var currentClazz = clazz;
        while (currentClazz != null) {
            fields.addAll(
                    Arrays.stream(currentClazz.getDeclaredFields())
                            .filter(field -> !field.isSynthetic())
                            .map(Field::getName)
                            .toList());
            currentClazz = currentClazz.getSuperclass();
        }
        return fields;
    }


    /**
     *  Tests for {@link GetAllFieldNames#getAllFieldNames(Class)}.
     */
//    @Test
//    void testGetAllFieldNames() {
//        class SuperClass {
//            public int superFieldOne;
//            private int superFieldTwo;
//        }
//
//        class TestClass extends SuperClass {
//            public int fieldOne;
//            private int fieldTwo;
//        }
//
//        var list = GetAllFieldNames.getAllFieldNames(TestClass.class);
//        assertEquals(4, list.size());
//        assertTrue(list.contains("fieldOne"));
//        assertTrue(list.contains("fieldTwo"));
//        assertTrue(list.contains("superFieldOne"));
//        assertTrue(list.contains("superFieldTwo"));
//    }
}
