/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlJs
extends PacketWrapper<IlIlJs> {
    private int IlIle;
    private boolean IlIlm;
    private byte[] IlIlx;
    private static String[] IlIlO;
    private static final long b;
    private static transient /* synthetic */ String udrerqhvWW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJs(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJs(ClientVersion clientVersion, int n, boolean bl, byte[] byArray) {
        super(IlIlqw.LOGIN_PLUGIN_RESPONSE.IlIlY(), clientVersion);
        this.IlIle = n;
        this.IlIlm = bl;
        this.IlIlx = byArray;
    }

    @Override
    public void IlIle() {
        block6: {
            block4: {
                IlIlJs ilIlJs;
                block5: {
                    long l = b ^ 0x7319CDBDBFAEL;
                    this.IlIle = this.IlIlf();
                    String[] stringArray = IlIlJs.IlIly();
                    this.IlIlm = this.IlIlK();
                    ilIlJs = this;
                    if (stringArray == null) break block4;
                    if (!ilIlJs.IlIlm) break block5;
                    this.IlIlx = this.IlIlW(ByteBufHelper.IlIlH(this.IlIlS));
                    if (stringArray != null) break block6;
                }
                ilIlJs = this;
            }
            ilIlJs.IlIlx = new byte[0];
        }
        if (PacketWrapper.IlIlz() == null) {
            IlIlJs.IlIlY(new String[5]);
        }
    }

    @Override
    public void IlIlJ() {
        block3: {
            IlIlJs ilIlJs;
            block2: {
                long l = b ^ 0x6A64B0548106L;
                String[] stringArray = IlIlJs.IlIly();
                this.IlIlJ(this.IlIle);
                String[] stringArray2 = stringArray;
                this.IlIla(this.IlIlm);
                ilIlJs = this;
                if (stringArray2 == null) break block2;
                if (!ilIlJs.IlIlm) break block3;
                ilIlJs = this;
            }
            ilIlJs.IlIle(this.IlIlx);
        }
    }

    public void IlIlH(IlIlJs ilIlJs) {
        this.IlIle = ilIlJs.IlIle;
        this.IlIlm = ilIlJs.IlIlm;
        this.IlIlx = ilIlJs.IlIlx;
    }

    public int IlIlJ() {
        return this.IlIle;
    }

    public void IlIlf(int n) {
        this.IlIle = n;
    }

    public boolean IlIlv() {
        return this.IlIlm;
    }

    public void IlIlL(boolean bl) {
        this.IlIlm = bl;
    }

    public byte[] IlIlZ() {
        return this.IlIlx;
    }

    public void IlIlm(byte[] byArray) {
        this.IlIlx = byArray;
    }

    public static void IlIlY(String[] stringArray) {
        IlIlO = stringArray;
    }

    public static String[] IlIly() {
        return IlIlO;
    }

    static {
        b = IlIls.a(443004440179376121L, -2044303354928965335L, MethodHandles.lookup().lookupClass()).a(192324800082473L);
        if (IlIlJs.IlIly() == null) {
            IlIlJs.IlIlY(new String[2]);
        }
    }
}

