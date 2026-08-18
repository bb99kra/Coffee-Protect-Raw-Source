/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlC3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlrO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlqF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.IlIlAR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.IlIlqc;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.IlIljv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.IlIlWE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlCp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlZH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIld8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlnn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class IlIlC8<T> {
    private final IlIlqF IlIlI;
    private final IlIlrO IlIlS;
    private final IlIlnn IlIlA;
    private final IlIlCp IlIlG;
    private static final Logger IlIlo;
    private static boolean IlIlC;
    private static final long a;

    public IlIlC8() {
        long l = a ^ 0x26C0D7FF421BL;
        this.IlIlI = new IlIlqF();
        boolean bl = IlIlC8.IlIlT();
        this.IlIlS = new IlIlrO();
        this.IlIlA = new IlIlnn();
        this.IlIlG = new IlIlCp();
        if (bl) {
            PacketWrapper.IlIle(new int[4]);
        }
    }

    public IlIlqF IlIlg() {
        return this.IlIlI;
    }

    public IlIlrO IlIlV() {
        return this.IlIlS;
    }

    public IlIlnn IlIlf() {
        return this.IlIlA;
    }

    public IlIld8 IlIlM() {
        return IlIlZH.IlIl_;
    }

    public Logger IlIly() {
        return IlIlo;
    }

    public IlIlCp IlIlm() {
        return this.IlIlG;
    }

    public abstract void IlIlA();

    public abstract boolean IlIlL();

    public abstract void IlIlR();

    public abstract boolean IlIlf();

    public abstract void IlIlh();

    public abstract boolean IlIls();

    public abstract T IlIlj();

    public abstract IlIljv IlIlq();

    public abstract IlIlAR IlIlM();

    public abstract IlIlqc IlIlq();

    public abstract IlIlWE IlIli();

    public abstract IlIlC3 IlIlh();

    static {
        a = IlIls.a(-8106922675801316264L, 8017710358934157780L, MethodHandles.lookup().lookupClass()).a(77873440358449L);
        IlIlo = Logger.getLogger(IlIlC8.class.getName());
        IlIlC8.IlIlk(true);
    }

    public static void IlIlk(boolean bl) {
        IlIlC = bl;
    }

    public static boolean IlIlO() {
        return IlIlC;
    }

    public static boolean IlIlT() {
        boolean bl = IlIlC8.IlIlO();
        return !bl;
    }
}

