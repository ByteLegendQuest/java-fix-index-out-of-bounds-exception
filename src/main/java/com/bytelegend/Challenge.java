package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(firstOrNull(new Object[0]));
        System.out.println(firstOrNull(new Object[] {1}));
        System.out.println(firstOrNull(new Object[] {"a", "b", "c"}));
        System.out.println(lastOrNull(new Object[0]));
        System.out.println(lastOrNull(new Object[] {1}));
        System.out.println(lastOrNull(new Object[] {"a", "b", "c"}));
    }

    public static Object firstOrNull(Object[] array) {
        return array.length > 0 ? array[0] : null;
    }

    public static Object lastOrNull(Object[] array) {
        return array.length > 0 ? array[array.length-1] : null;
    }
}
