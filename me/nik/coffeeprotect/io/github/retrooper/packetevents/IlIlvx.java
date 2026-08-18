/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.IlIlAR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.IlIlZg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlrG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public abstract class IlIlvx
implements IlIlAR {
    private static PacketWrapper[] IlIlx;
    private static final long b;

    @Override
    public abstract IlIlrG IlIlT();

    @Override
    public void IlIlE(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x42A8CA8EE42CL;
                PacketWrapper[] packetWrapperArray = IlIlvx.IlIl_();
                bl = IlIlZg.IlIlN(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                IlIlZg.IlIlH(object, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void IlIlC(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x5ACA29078F75L;
                PacketWrapper[] packetWrapperArray = IlIlvx.IlIl_();
                bl = IlIlZg.IlIlN(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                IlIlZg.IlIlr(object, IlIlr7.IlIlh, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void IlIlM(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x6D5BE6D4FE23L;
                PacketWrapper[] packetWrapperArray = IlIlvx.IlIl_();
                bl = IlIlZg.IlIlN(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                IlIlZg.IlIlb(object, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void IlIlD(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x41E12F5745B3L;
                PacketWrapper[] packetWrapperArray = IlIlvx.IlIl_();
                bl = IlIlZg.IlIlN(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                IlIlZg.IlIli(object, IlIlr7.IlIlh, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void IlIlf(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x714FDE6B8F76L;
                PacketWrapper[] packetWrapperArray = IlIlvx.IlIl_();
                bl = IlIlZg.IlIlN(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                IlIlZg.IlIlS(object, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void IlIlV(Object object, Object object2) {
        block4: {
            boolean bl;
            block5: {
                long l = b ^ 0x1C8E6A403134L;
                PacketWrapper[] packetWrapperArray = IlIlvx.IlIl_();
                bl = IlIlZg.IlIlN(object);
                if (packetWrapperArray == null) break block4;
                if (!bl) break block5;
                IlIlZg.IlIll(object, IlIlr7.IlIlh, object2);
                if (packetWrapperArray != null) break block4;
            }
            bl = ((ByteBuf)object2).release();
        }
        if (PacketWrapper.IlIlz() == null) {
            IlIlvx.IlIli(new PacketWrapper[1]);
        }
    }

    @Override
    public ClientVersion IlIlo(Object object) {
        ClientVersion clientVersion;
        long l = b ^ 0x246896C1D6CAL;
        IlIlG2 ilIlG2 = this.IlIlg(object);
        PacketWrapper[] packetWrapperArray = IlIlvx.IlIl_();
        ClientVersion clientVersion2 = clientVersion = ilIlG2.IlIlh();
        if (packetWrapperArray != null) {
            if (clientVersion2 == null) {
                clientVersion = ClientVersion.IlIlw(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlN());
            }
            clientVersion2 = clientVersion;
        }
        if (packetWrapperArray == null) {
            PacketWrapper.IlIle(new int[4]);
        }
        return clientVersion2;
    }

    public static void IlIli(PacketWrapper[] packetWrapperArray) {
        IlIlx = packetWrapperArray;
    }

    public static PacketWrapper[] IlIl_() {
        return IlIlx;
    }

    static {
        b = IlIls.a(3519959932563815245L, -3977095029101564052L, MethodHandles.lookup().lookupClass()).a(194706504837223L);
        if (IlIlvx.IlIl_() == null) {
            IlIlvx.IlIli(new PacketWrapper[4]);
        }
    }
}

