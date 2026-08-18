/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIloQ;

public class IlIlOa {
    private UUID IlIlc;
    private String IlIls;
    private List<IlIloQ> IlIlL;
    private static transient /* synthetic */ String tEOUjwOxXM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlOa(UUID uUID, String string) {
        this.IlIlc = uUID;
        this.IlIls = string;
        this.IlIlL = new ArrayList<IlIloQ>();
    }

    public IlIlOa(UUID uUID, String string, List<IlIloQ> list) {
        this.IlIlc = uUID;
        this.IlIls = string;
        this.IlIlL = list;
    }

    public UUID IlIlM() {
        return this.IlIlc;
    }

    public void IlIlK(UUID uUID) {
        this.IlIlc = uUID;
    }

    public String IlIlE() {
        return this.IlIls;
    }

    public void IlIlN(String string) {
        this.IlIls = string;
    }

    public List<IlIloQ> IlIlf() {
        return this.IlIlL;
    }

    public void IlIl_(List<IlIloQ> list) {
        this.IlIlL = list;
    }
}

