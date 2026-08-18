/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.IlIlAi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.IlIlL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.IlIlOy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.IlIlhq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.IlIlxp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.StaticAttributeDisplayType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlOw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlQ9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIlfB {
    private static final VersionedRegistry<IlIlL<?>> IlIlf;
    public static final IlIlL<IlIlOy> IlIla;
    public static final IlIlL<IlIlhq> IlIlI;
    public static final IlIlL<IlIlxp> IlIlu;
    private static transient /* synthetic */ String eaObkpUijE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlfB() {
    }

    @ApiStatus.Internal
    public static <T extends IlIlAi> IlIlL<T> IlIlf(String string, IlIlQ9<T> ilIlQ9, IlIlOw<T> ilIlOw) {
        return IlIlf.define(string, typesBuilderData -> new StaticAttributeDisplayType((TypesBuilderData)typesBuilderData, ilIlQ9, ilIlOw));
    }

    public static VersionedRegistry<IlIlL<?>> IlIlb() {
        return IlIlf;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = IlIls.a(1568250189601471893L, -6363294962630345119L, MethodHandles.lookup().lookupClass()).a(171315315263843L) ^ 61358076908619L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "T\u00d5\u008f\u00bb\u00c8q\u0081&\u0010B\u00f1\u009d\n\u00e1~D;\u00ed,\u00ab\u008e\u000e\u00aa\u00bf\u008b";
                var7_6 = "T\u00d5\u008f\u00bb\u00c8q\u0081&\u0010B\u00f1\u009d\n\u00e1~D;\u00ed,\u00ab\u008e\u000e\u00aa\u00bf\u008b".length();
                var4_7 = 8;
                var3_8 = -1;
lbl18:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = IlIlfB.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00d4c\u00dd\u008a\u00917\u00bb\u0010\u00c9\u0086\u00aa\u0085x\u00c0U\u00b8G\u008b\fo\u009dN\u00c1m\b&\u000b\u00bb\u00a1\u001d\\\u0004\u0097";
                    var7_6 = "\u00d4c\u00dd\u008a\u00917\u00bb\u0010\u00c9\u0086\u00aa\u0085x\u00c0U\u00b8G\u008b\fo\u009dN\u00c1m\b&\u000b\u00bb\u00a1\u001d\\\u0004\u0097".length();
                    var4_7 = 24;
                    var3_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = IlIlfB.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl49:
                // 1 sources

                ** continue;
            }
        }
        IlIlfB.IlIlf = new VersionedRegistry<T>(var0_3[2]);
        IlIlfB.IlIla = IlIlfB.IlIlf(var0_3[3], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlz(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/IlIlOy;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlp(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.IlIlOy ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/IlIlOy;)V)());
        IlIlfB.IlIlI = IlIlfB.IlIlf(var0_3[0], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlF(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/IlIlhq;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlU(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.IlIlhq ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/IlIlhq;)V)());
        IlIlfB.IlIlu = IlIlfB.IlIlf(var0_3[1], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlN(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/IlIlxp;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlH(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.IlIlxp ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/IlIlxp;)V)());
        IlIlfB.IlIlf.unloadMappings();
    }

    private static String a(byte[] byArray) {
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

