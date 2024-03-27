
package com.study.api.proxy;

import java.util.function.Function;
@SuppressWarnings("null")
public class TypeProxy {
    public static Function<?,String> string = String::valueOf;
    public static Function<String,Integer> integer = Integer::parseInt;
    public static Function<String,Double> doubleof = Double::parseDouble;
    public static Function<String,Float> floatof = Float::parseFloat;
    public static Function<String,Long> longof = Long::parseLong;

}