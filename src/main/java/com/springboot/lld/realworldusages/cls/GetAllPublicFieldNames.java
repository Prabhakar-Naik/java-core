package com.springboot.lld.realworldusages.cls;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class GetAllPublicFieldNames {

    /**
     * Print all declared public field names of the class or the interface the class extends.
     *
     * @param clazz Tested class
     * @return list of name of public fields
     */

    public static List<String> getAllPublicFieldNames(final Class<?> clazz) {
        return Arrays.stream(clazz.getFields())
                .map(Field::getName)
                .toList();
    }

    /**
     * Tests for {@link GetAllPublicFieldNames#getAllPublicFieldNames(Class)}.
     */
//    @Test
//    void testGetAllPublicFieldNames() {
//        class TestClass {
//            public int fieldOne;
//            public int fieldTwo;
//        }
//
//        var list = GetAllPublicFieldNames.getAllPublicFieldNames(TestClass.class);
//        assertEquals(2, list.size());
//        assertTrue(list.contains("fieldOne"));
//        assertTrue(list.contains("fieldTwo"));
//    }
}
