/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlj;

import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlj.IlIlA9;

class IlIlAU
extends IlIlA9<Integer> {
    private static transient /* synthetic */ String PATzUzSwEW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlAU(Class clazz) {
        super(clazz);
    }

    public Integer IlIlC(String string) throws IllegalArgumentException {
        try {
            return Integer.decode(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw IlIlAU.IlIlk(string, Integer.class, numberFormatException.getMessage());
        }
    }
}

