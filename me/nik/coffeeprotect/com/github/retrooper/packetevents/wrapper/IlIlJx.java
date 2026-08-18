/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlG4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlh8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlJx
extends PacketWrapper<IlIlJx> {
    private byte[] IlIll;
    private byte[] IlIlQ;
    private IlIlh8 IlIlp;
    private static final long b = IlIls.a(1987908468542125981L, -9178003901634628676L, MethodHandles.lookup().lookupClass()).a(181474389581655L);
    private static final String c;
    private static transient /* synthetic */ String HEGestXjRK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJx(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJx(ClientVersion clientVersion, byte[] byArray, byte[] byArray2) {
        super(IlIlqw.ENCRYPTION_RESPONSE.IlIlY(), clientVersion);
        this.IlIll = byArray;
        this.IlIlQ = byArray2;
    }

    public IlIlJx(ClientVersion clientVersion, IlIlh8 ilIlh8) {
        super(IlIlqw.ENCRYPTION_RESPONSE.IlIlY(), clientVersion);
        this.IlIlp = ilIlh8;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlJx ilIlJx;
                block3: {
                    long l = b ^ 0x7E624AED10CL;
                    this.IlIll = this.IlIlN(ByteBufHelper.IlIlH(this.IlIlS));
                    String[] stringArray = IlIlJs.IlIly();
                    ilIlJx = this;
                    if (stringArray == null) break block2;
                    if (!ilIlJx.IlIlg.IlIlz(ServerVersion.V_1_19)) break block3;
                    ilIlJx = this;
                    if (stringArray == null) break block2;
                    if (!ilIlJx.IlIlg.IlIlS(ServerVersion.V_1_19_2)) break block3;
                    ilIlJx = this;
                    if (stringArray == null) break block2;
                    if (ilIlJx.IlIlK()) break block3;
                    this.IlIlp = this.IlIlx();
                    if (stringArray != null) break block4;
                    PacketWrapper.IlIle(new int[1]);
                }
                ilIlJx = this;
            }
            ilIlJx.IlIlQ = this.IlIll();
        }
    }

    @Override
    public void IlIlJ() {
        block6: {
            IlIlJx ilIlJx;
            block2: {
                block3: {
                    IlIlJx ilIlJx2;
                    String[] stringArray;
                    block4: {
                        block5: {
                            long l = b ^ 0x1E9B5947EFA4L;
                            String[] stringArray2 = IlIlJs.IlIly();
                            this.IlIlU(this.IlIll);
                            stringArray = stringArray2;
                            ilIlJx = this;
                            if (stringArray == null) break block2;
                            if (!ilIlJx.IlIlg.IlIlz(ServerVersion.V_1_19)) break block3;
                            ilIlJx = this;
                            if (stringArray == null) break block2;
                            if (!ilIlJx.IlIlg.IlIlS(ServerVersion.V_1_19_2)) break block3;
                            this.IlIla(this.IlIlp == null);
                            ilIlJx2 = this;
                            if (stringArray == null) break block4;
                            if (ilIlJx2.IlIlp == null) break block5;
                            this.IlIll(this.IlIlp);
                            if (stringArray != null) break block6;
                        }
                        ilIlJx2 = this;
                    }
                    ilIlJx2.IlIlU(this.IlIlQ);
                    if (stringArray != null) break block6;
                }
                ilIlJx = this;
            }
            ilIlJx.IlIlU(this.IlIlQ);
        }
    }

    public void IlIla(IlIlJx ilIlJx) {
        this.IlIll = ilIlJx.IlIll;
        this.IlIlQ = ilIlJx.IlIlQ;
        this.IlIlp = ilIlJx.IlIlp;
    }

    public byte[] IlIle() {
        return this.IlIll;
    }

    public void IlIlz(byte[] byArray) {
        this.IlIll = byArray;
    }

    public SecretKey IlIlO(PrivateKey privateKey) {
        long l = b ^ 0x4D5DB1154C0CL;
        byte[] byArray = this.IlIle();
        byte[] byArray2 = IlIlG4.IlIlG(privateKey.getAlgorithm(), privateKey, byArray);
        if (byArray2 != null) {
            return new SecretKeySpec(byArray2, c);
        }
        return null;
    }

    public void IlIlh(SecretKey secretKey, PublicKey publicKey) {
        this.IlIll = IlIlG4.IlIlB(publicKey.getAlgorithm(), publicKey, secretKey.getEncoded());
    }

    public Optional<byte[]> IlIlf() {
        return Optional.ofNullable(this.IlIlQ);
    }

    public void IlIlh(byte[] byArray) {
        this.IlIlQ = byArray;
    }

    public Optional<IlIlh8> IlIlz() {
        return Optional.ofNullable(this.IlIlp);
    }

    public void IlIlx(@Nullable IlIlh8 ilIlh8) {
        this.IlIlp = ilIlh8;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0xD3DF3596EB8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("[\u00f95\u0010N\u0089\u00acF".getBytes("ISO-8859-1"));
                c = IlIlJx.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}

