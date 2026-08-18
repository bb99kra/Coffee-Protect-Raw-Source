/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body.IlIlLv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body.IlIlTp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body.IlIloj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body.IlIlqE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class IlIlAy
implements IlIlqE {
    private final IlIlTp IlIlg;
    private static transient /* synthetic */ String uAVothOdUh = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlAy(IlIlTp ilIlTp) {
        this.IlIlg = ilIlTp;
    }

    public static IlIlAy IlIli(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) {
        return new IlIlAy(IlIlTp.IlIla(nBTCompound, packetWrapper));
    }

    public static void IlIlA(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, IlIlAy ilIlAy) {
        IlIlTp.IlIlF(nBTCompound, packetWrapper, ilIlAy.IlIlg);
    }

    @Override
    public IlIloj<?> IlIly() {
        return IlIlLv.IlIlR;
    }

    public IlIlTp IlIlh() {
        return this.IlIlg;
    }
}

