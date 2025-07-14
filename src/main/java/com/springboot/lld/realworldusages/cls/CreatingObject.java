package com.springboot.lld.realworldusages.cls;

import java.lang.reflect.InvocationTargetException;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class CreatingObject {

    /**
     * Create object using reflection.
     *
     * @param cls fully qualified name of class includes the package name as String
     * @return object
     * @throws NoSuchMethodException if a method that does not exist at runtime.
     * @throws IllegalAccessException if a currently executing method does not have access to
     *     the definition of the specified class, field, method or constructor
     * @throws InvocationTargetException InvocationTargetException is a checked exception
     *     that wraps an exception thrown by an invoked method or constructor.
     * @throws InstantiationException when an method tries to create an instance of a class
     *     using the newInstance method in class Class.
     * @throws ClassNotFoundException when an application tries to load in a class
     *     through its string name.
     */

    public static Object createObject(String cls)
            throws IllegalAccessException,
            InvocationTargetException,
            InstantiationException,
            ClassNotFoundException,
            NoSuchMethodException {

        var objectClass = Class.forName(cls);
        var objectConstructor = objectClass.getConstructor();
        return objectConstructor.newInstance();
    }

    /**
     * Tests for {@link CreatingObject#createObject(String)}.
     */
//    @Test
//    void testCreateObject()
//            throws InvocationTargetException,
//            NoSuchMethodException,
//            InstantiationException,
//            IllegalAccessException,
//            ClassNotFoundException {
//        assertEquals(String.class, CreatingObject.createObject("java.lang.String").getClass());
//        assertNotEquals(Integer.class,
//                CreatingObject.createObject("java.lang.String").getClass());
//    }
}
