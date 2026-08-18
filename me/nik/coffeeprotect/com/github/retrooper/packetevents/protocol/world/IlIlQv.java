/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

public abstract class IlIlQv {
    private static int IlIlm;

    public abstract long[] IlIl_();

    public abstract int IlIlU();

    abstract int IlIlr();

    public abstract int IlIlo(int var1);

    public abstract void IlIlr(int var1, int var2);

    public static void IlIlE(int n) {
        IlIlm = n;
    }

    public static int IlIlx() {
        return IlIlm;
    }

    public static int IlIlV() {
        int n = IlIlQv.IlIlx();
        if (n == 0) {
            return 69;
        }
        return 0;
    }

    static {
        if (IlIlQv.IlIlV() == 0) {
            IlIlQv.IlIlE(57);
        }
    }
}

