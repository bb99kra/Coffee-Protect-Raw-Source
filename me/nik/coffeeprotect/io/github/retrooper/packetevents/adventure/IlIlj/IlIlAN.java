/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlj;

import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlj.IlIlA9;

class IlIlAN
extends IlIlA9<Double> {
    private static transient /* synthetic */ String TZUVZaxkdR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlAN(Class clazz) {
        super(clazz);
    }

    public Double IlIlp(String string) throws IllegalArgumentException {
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw IlIlAN.IlIlk(string, Double.class, numberFormatException.getMessage());
        }
    }
}

