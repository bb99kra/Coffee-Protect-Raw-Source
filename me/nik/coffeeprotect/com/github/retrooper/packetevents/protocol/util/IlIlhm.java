/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlXv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodecs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class IlIlhm
implements NbtCodec<List<T>> {
    final NbtCodec IlIln;
    private static final long a = IlIls.a(-598540141868900757L, 7016368061973634565L, MethodHandles.lookup().lookupClass()).a(112730861804421L);
    private static transient /* synthetic */ String SKzpOWsIyX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlhm(NbtCodec nbtCodec) {
        this.IlIln = nbtCodec;
    }

    public List<T> IlIlk(NBT nBT, PacketWrapper<?> packetWrapper) throws IlIlXv {
        long l = a ^ 0x1EE42FBCF40L;
        boolean bl = IlIlXv.IlIlH();
        try {
            ArrayList arrayList;
            block8: {
                List list = (List)NbtCodecs.IlIlh.IlIlA(nBT, packetWrapper);
                ArrayList arrayList2 = new ArrayList(list.size());
                for (NBT nBT2 : list) {
                    try {
                        arrayList = arrayList2;
                        if (!bl) {
                            arrayList.add(this.IlIln.IlIlA(nBT2, packetWrapper));
                            if (!bl) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (IlIlXv ilIlXv) {
                        throw IlIlhm.a(ilIlXv);
                    }
                }
                arrayList = arrayList2;
            }
            return arrayList;
        }
        catch (IlIlXv ilIlXv) {
            try {
                Object t = this.IlIln.IlIlA(nBT, packetWrapper);
                return Collections.singletonList(t);
            }
            catch (IlIlXv ilIlXv2) {
                ilIlXv.addSuppressed(ilIlXv2);
                throw ilIlXv;
            }
        }
    }

    public NBT IlIls(PacketWrapper<?> packetWrapper, List<T> list) {
        long l = a ^ 0x459F1F63EC9BL;
        ArrayList<NBT> arrayList = new ArrayList<NBT>(list.size());
        boolean bl = IlIlXv.IlIlH();
        for (Object t : list) {
            arrayList.add(this.IlIln.IlIl_(packetWrapper, t));
            if (!bl) continue;
        }
        return NbtCodecs.IlIlh.IlIl_(packetWrapper, arrayList);
    }

    private static IlIlXv a(IlIlXv ilIlXv) {
        return ilIlXv;
    }
}

