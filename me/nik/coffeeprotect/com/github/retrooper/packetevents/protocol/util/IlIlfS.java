/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.util.function.Function;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlOU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlXv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class IlIlfS
implements IlIlOU<Z> {
    final Function IlIlQ;
    final Function IlIlC;
    final IlIlOU IlIlg;
    private static transient /* synthetic */ String RpPzUkFszO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    IlIlfS(IlIlOU ilIlOU, Function function, Function function2) {
        this.IlIlg = ilIlOU;
        this.IlIlQ = function;
        this.IlIlC = function2;
    }

    @Override
    public Z IlIlj(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws IlIlXv {
        return this.IlIlQ.apply(this.IlIlg.IlIlj(nBTCompound, packetWrapper));
    }

    @Override
    public void IlIlr(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, Z z) throws IlIlXv {
        this.IlIlg.IlIlr(nBTCompound, packetWrapper, this.IlIlC.apply(z));
    }
}

