/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.IlIlqc;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

public abstract class IlIly3
implements IlIlqc {
    private static String[] IlIlw;
    private static final long a;

    @Override
    public abstract int IlIlm(@NotNull Object var1);

    @Override
    public abstract Object IlIlF(@NotNull Object var1);

    @Override
    @NotNull
    public ClientVersion IlIlY(@NotNull Object object) {
        return this.IlIlV(object).IlIlh();
    }

    @Override
    public IlIlG2 IlIlV(@NotNull Object object) {
        long l = a ^ 0x3158FC2BEBD1L;
        Object object2 = this.IlIlF(object);
        String[] stringArray = IlIly3.IlIlD();
        IlIlG2 ilIlG2 = IlIlr7.IlIlb().IlIlM().IlIlg(object2);
        if (stringArray != null) {
            PacketWrapper.IlIle(new int[2]);
        }
        return ilIlG2;
    }

    public static void IlIlZ(String[] stringArray) {
        IlIlw = stringArray;
    }

    public static String[] IlIlD() {
        return IlIlw;
    }

    static {
        a = IlIls.a(959514199781171128L, -4194615835615661995L, MethodHandles.lookup().lookupClass()).a(43890032338394L);
        if (IlIly3.IlIlD() != null) {
            IlIly3.IlIlZ(new String[3]);
        }
    }
}

