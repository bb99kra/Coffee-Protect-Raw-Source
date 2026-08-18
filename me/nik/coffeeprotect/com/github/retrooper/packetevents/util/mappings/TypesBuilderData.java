/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlfR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIljV;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class TypesBuilderData {
    protected final ResourceLocation IlIlF;
    protected final int[] IlIlr;
    protected final IlIljV IlIle;
    protected final IlIlfR IlIl_;
    private static String IlIlN;
    private static transient /* synthetic */ String COuciwdpRU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Deprecated
    public TypesBuilderData(ResourceLocation resourceLocation, int[] nArray) {
        this(resourceLocation, nArray, new IlIljV("", true), IlIlfR.IlIlk);
    }

    @ApiStatus.Internal
    public TypesBuilderData(ResourceLocation resourceLocation, int[] nArray, IlIljV ilIljV, IlIlfR ilIlfR) {
        this.IlIlF = resourceLocation;
        this.IlIlr = nArray;
        this.IlIle = ilIljV;
        this.IlIl_ = ilIlfR;
    }

    public int getId(ClientVersion clientVersion) {
        return this.IlIlr[this.IlIle.IlIl_(clientVersion)];
    }

    public ResourceLocation IlIl_() {
        return this.IlIlF;
    }

    @Deprecated
    public int[] IlIly() {
        return this.IlIlr;
    }

    public IlIlfR IlIla() {
        return this.IlIl_;
    }

    public static void IlIlL(String string) {
        IlIlN = string;
    }

    public static String IlIlK() {
        return IlIlN;
    }

    static {
        if (TypesBuilderData.IlIlK() == null) {
            TypesBuilderData.IlIlL("y4Lbcb");
        }
    }
}

