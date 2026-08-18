/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlQo {
    private ResourceLocation IlIlH;
    private List<Integer> IlIlY;
    private static transient /* synthetic */ String QNgGPbCyYQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlQo(String string, List<Integer> list) {
        this(new ResourceLocation(string), list);
    }

    public IlIlQo(ResourceLocation resourceLocation, List<Integer> list) {
        this.IlIlH = resourceLocation;
        this.IlIlY = list;
    }

    public static IlIlQo IlIlW(PacketWrapper<?> packetWrapper) {
        ResourceLocation resourceLocation = packetWrapper.readIdentifier();
        List<Integer> list = packetWrapper.IlIll(PacketWrapper::IlIlf);
        return new IlIlQo(resourceLocation, list);
    }

    public static void IlIll(PacketWrapper<?> packetWrapper, IlIlQo ilIlQo) {
        packetWrapper.writeIdentifier(ilIlQo.IlIlH);
        packetWrapper.IlIlQ(ilIlQo.IlIlY, PacketWrapper::IlIlJ);
    }

    public String IlIlC() {
        return this.IlIlH.toString();
    }

    public void IlIlO(String string) {
        this.IlIlH = new ResourceLocation(string);
    }

    public ResourceLocation IlIlb() {
        return this.IlIlH;
    }

    public void IlIld(ResourceLocation resourceLocation) {
        this.IlIlH = resourceLocation;
    }

    public List<Integer> IlIlX() {
        return this.IlIlY;
    }

    public void IlIlI(List<Integer> list) {
        this.IlIlY = list;
    }
}

