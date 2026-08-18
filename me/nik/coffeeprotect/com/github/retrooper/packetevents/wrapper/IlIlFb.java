/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public class IlIlFb
extends PacketWrapper<IlIlFb> {
    private ResourceLocation IlIl_;
    private int IlIlD;
    private static final long b = IlIls.a(-8487520423974804489L, -8762365465750566516L, MethodHandles.lookup().lookupClass()).a(141926739961465L);
    private static final String c;
    private static transient /* synthetic */ String cpTSdJpqvE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFb(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    @ApiStatus.Obsolete
    public IlIlFb(ItemType itemType, int n) {
        this(itemType.getName(), n);
    }

    public IlIlFb(ResourceLocation resourceLocation, int n) {
        super(IlIlAG.SET_COOLDOWN);
        this.IlIl_ = resourceLocation;
        this.IlIlD = n;
    }

    @Override
    public void IlIle() {
        block8: {
            IlIlFb ilIlFb;
            block6: {
                long l = b ^ 0x753FD151CC8L;
                PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                try {
                    block7: {
                        try {
                            try {
                                ilIlFb = this;
                                if (packetWrapperArray == null) break block6;
                                if (!ilIlFb.IlIlg.IlIlz(ServerVersion.V_1_21_2)) break block7;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw IlIlFb.a(illegalStateException);
                            }
                            this.IlIl_ = this.readIdentifier();
                            if (packetWrapperArray != null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw IlIlFb.a(illegalStateException);
                        }
                    }
                    ilIlFb = this;
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlFb.a(illegalStateException);
                }
            }
            ItemType itemType = ilIlFb.IlIlt(ItemTypes.getRegistry());
            this.IlIl_ = itemType.getName();
        }
        this.IlIlD = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        block8: {
            IlIlFb ilIlFb;
            block6: {
                long l = b ^ 0x1E2E80FC2260L;
                PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                try {
                    block7: {
                        try {
                            try {
                                ilIlFb = this;
                                if (packetWrapperArray == null) break block6;
                                if (!ilIlFb.IlIlg.IlIlz(ServerVersion.V_1_21_2)) break block7;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw IlIlFb.a(illegalStateException);
                            }
                            this.writeIdentifier(this.IlIl_);
                            if (packetWrapperArray != null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw IlIlFb.a(illegalStateException);
                        }
                    }
                    ilIlFb = this;
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlFb.a(illegalStateException);
                }
            }
            ilIlFb.IlIle(this.IlIlQ());
        }
        this.IlIlJ(this.IlIlD);
    }

    public void IlIlj(IlIlFb ilIlFb) {
        this.IlIl_ = ilIlFb.IlIl_;
        this.IlIlD = ilIlFb.IlIlD;
    }

    public ResourceLocation IlIlm() {
        return this.IlIl_;
    }

    public void IlIlU(ResourceLocation resourceLocation) {
        this.IlIl_ = resourceLocation;
    }

    @ApiStatus.Obsolete
    public ItemType IlIlQ() {
        ItemType itemType;
        block4: {
            ItemType itemType2;
            block5: {
                long l = b ^ 0x52DDFE7E6D54L;
                itemType2 = ItemTypes.getByName(this.IlIl_.toString());
                PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                try {
                    try {
                        itemType = itemType2;
                        if (packetWrapperArray == null) break block4;
                        if (itemType != null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw IlIlFb.a(illegalStateException);
                    }
                    throw new IllegalStateException(c + this.IlIl_);
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlFb.a(illegalStateException);
                }
            }
            itemType = itemType2;
        }
        return itemType;
    }

    @ApiStatus.Obsolete
    public void IlIly(ItemType itemType) {
        this.IlIl_ = itemType.getName();
    }

    public int IlIlx() {
        return this.IlIlD;
    }

    public void IlIlq(int n) {
        this.IlIlD = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x5144D3773056L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ceW\u001f\u008a\u00fb\u0010\u0094\u00d2\u00ad\u00a4\tM\u001d\u0017i6\u00b5a0`w\u0011\u008e\u00c1!\u00f8f:ezqm\u00ec\u001c\u00a0\u0088\u0086|\u00c6\u00ce\u00b0\u0087\u00ca\u00ea\u00bc9\u0091\u00de\u00e3\u008b\"\u00b0M\u00a7\u00e07".getBytes("ISO-8859-1"));
                c = IlIlFb.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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

