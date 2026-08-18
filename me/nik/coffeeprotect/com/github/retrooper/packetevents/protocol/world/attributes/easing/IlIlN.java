/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlAl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.StaticEasingType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlhB;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIlN {
    private static final VersionedRegistry<IlIlAl> IlIlR;
    public static final IlIlAl IlIlq;
    public static final IlIlAl IlIlw;
    public static final IlIlAl IlIl_;
    public static final IlIlAl IlIlD;
    public static final IlIlAl IlIlK;
    public static final IlIlAl IlIlZ;
    public static final IlIlAl IlIlA;
    public static final IlIlAl IlIlI;
    public static final IlIlAl IlIlU;
    public static final IlIlAl IlIlf;
    public static final IlIlAl IlIlN;
    public static final IlIlAl IlIly;
    public static final IlIlAl IlIlb;
    public static final IlIlAl IlIla;
    public static final IlIlAl IlIlC;
    public static final IlIlAl IlIlr;
    public static final IlIlAl IlIlB;
    public static final IlIlAl IlIlY;
    public static final IlIlAl IlIlo;
    public static final IlIlAl IlIlu;
    public static final IlIlAl IlIlc;
    public static final IlIlAl IlIlW;
    public static final IlIlAl IlIlS;
    public static final IlIlAl IlIlM;
    public static final IlIlAl IlIlP;
    public static final IlIlAl IlIlt;
    public static final IlIlAl IlIlT;
    public static final IlIlAl IlIlk;
    public static final IlIlAl IlIld;
    public static final IlIlAl IlIlV;
    public static final IlIlAl IlIlQ;
    public static final IlIlAl IlIlE;
    private static transient /* synthetic */ String NGOvQKupPI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlN() {
    }

    @ApiStatus.Internal
    public static IlIlAl IlIlW(String string, IlIlhB ilIlhB) {
        return IlIlR.define(string, typesBuilderData -> new StaticEasingType((TypesBuilderData)typesBuilderData, ilIlhB));
    }

    public static VersionedRegistry<IlIlAl> IlIlj() {
        return IlIlR;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = IlIls.a(-2380229530161787523L, -7793185023871328816L, MethodHandles.lookup().lookupClass()).a(214614303979500L) ^ 112034002848861L;
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
                var0_3 = new String[33];
                var6_4 = 0;
                var5_5 = "\r\u0081du\u0094\u00eb#o\u00ec\u00fb\u00e1\u00d6\u00ba<.\u00c3\u0010R\u0096y\u00e9)\u00d4?z\u0080j);p_\u00eb\u00b6\u0010\u0094\"\t\u00c7\u00cb\u00ab}O\u009c\u009c\u00ee\u00cbJ}\u00ad\u00c7\u0010\u0099\u009a'\u00d0\u00e5(\u000e7Dz\u00e2\u000e\u0084\u00ddw\u00a4\b\u00daE\u0083\u00a6\u00f0/\u00c8\u0007\u0010[<J\u009d\u00fc\u001dzkB\u00f7\u001b\n\u00f1s\u00a5|\u0010\u00a0\u00e8\u008e^\u009f\u00de\u00c9\u00e8\u00b0W`e\u00c3\u00fd\u00f4~\u0010\u001e\u00e8\u008dU\u00a1\u00ba\u001e\u0014g\u00dd\u00bfK\u00d2\u0095\u00bd\u0010\u00103\u00d5h\u0017\u0004\u00ab:\u0002\u001c\u00de\u00b4\u00e72\u00a9Z7\u0010{n\u0016\u00b7U!P\u00b4\u00bd\u0001\u0000\u0016k^\u0094\u0015\u0010\u00be\u00e5)\u00ad\u00062vF\u00f97{\u0004V\u0087l\u00be\b\u009c\u00efV\u00b4b?\u001eF\b\u00a1\u00f4\u0087\u00d2\u00ff\u0097\u00e7\u00d2\u0010!\u0011z`\u0091\u00bb\u0092\u00c0\u00c43,'\u0097\u008c\u00ec\u0087\b\u00b1\u0096\u0082\u009f\u00af\u009c\u00b7\u00bc\u0010[<J\u009d\u00fc\u001dzk\u00a4\t$l\u00cb\u00acw\u0095\u0010oh\u00fe\u00bflB.\u00e5\u009e\u00b0lB\u00b1\u00b3o\u00b1\b\u00f0)GfaJ0\u0010\u0010@\u009a4V\u0094\u00b5\u0099\u0004\u00e64d\u009f\u00af-\u0087\u0011\u0010[<J\u009d\u00fc\u001dzk\u00ba\u00f4\u000e\u008b\u00e2\u00f2<}\u0010I\u009eD\u008d\u00e5\u00d7.\u00b8++|\u00ca\u009d\u0019\u00b5N\u0010\u00d6\u00ab '\u00f5=\u00cdhk\u00bej'\u00d5\u00e1\u001fz\u0010,@x'O\u00c5.;\u00a4\u00d0p\u00f8\u00e7\u00b1\u00c2E\u0010pb<m=\u009a\u00ed(\u0001i\u0000\u00e0\u001e\u00b2A\u00f1\u00103\u00d5h\u0017\u0004\u00ab:\u0002\u007fB@G:\u008ck/\u0010@\u009a4V\u0094\u00b5\u0099\u0004\u00a6\u0097\u0096\u00a5WT\u00e3\u0094\b?\u00d6\u0006\r \u00d1\u001ar\u0010\u008aW\t\u0091\u0001\u00b4\u00f7\u0094\u00d7\u00c9\u001c\u0095\u0086\u0085\u00c19\u0010Y\u00aa\u009b#\u00fc\\\u00f4\u00c9\u009e\u00b0Z\u0099O\u00e9F\u00b5\u0010\u00bbU\u00fc\u0015a\u00c7\u001fub\u00b7D\u00f5\u00c4\u0006\u0013\u001a\u0010Ia\u00a4\u001fr\u0017gR\u00fc\u0080A\u0013\u009fa\u00d7\u00f3";
                var7_6 = "\r\u0081du\u0094\u00eb#o\u00ec\u00fb\u00e1\u00d6\u00ba<.\u00c3\u0010R\u0096y\u00e9)\u00d4?z\u0080j);p_\u00eb\u00b6\u0010\u0094\"\t\u00c7\u00cb\u00ab}O\u009c\u009c\u00ee\u00cbJ}\u00ad\u00c7\u0010\u0099\u009a'\u00d0\u00e5(\u000e7Dz\u00e2\u000e\u0084\u00ddw\u00a4\b\u00daE\u0083\u00a6\u00f0/\u00c8\u0007\u0010[<J\u009d\u00fc\u001dzkB\u00f7\u001b\n\u00f1s\u00a5|\u0010\u00a0\u00e8\u008e^\u009f\u00de\u00c9\u00e8\u00b0W`e\u00c3\u00fd\u00f4~\u0010\u001e\u00e8\u008dU\u00a1\u00ba\u001e\u0014g\u00dd\u00bfK\u00d2\u0095\u00bd\u0010\u00103\u00d5h\u0017\u0004\u00ab:\u0002\u001c\u00de\u00b4\u00e72\u00a9Z7\u0010{n\u0016\u00b7U!P\u00b4\u00bd\u0001\u0000\u0016k^\u0094\u0015\u0010\u00be\u00e5)\u00ad\u00062vF\u00f97{\u0004V\u0087l\u00be\b\u009c\u00efV\u00b4b?\u001eF\b\u00a1\u00f4\u0087\u00d2\u00ff\u0097\u00e7\u00d2\u0010!\u0011z`\u0091\u00bb\u0092\u00c0\u00c43,'\u0097\u008c\u00ec\u0087\b\u00b1\u0096\u0082\u009f\u00af\u009c\u00b7\u00bc\u0010[<J\u009d\u00fc\u001dzk\u00a4\t$l\u00cb\u00acw\u0095\u0010oh\u00fe\u00bflB.\u00e5\u009e\u00b0lB\u00b1\u00b3o\u00b1\b\u00f0)GfaJ0\u0010\u0010@\u009a4V\u0094\u00b5\u0099\u0004\u00e64d\u009f\u00af-\u0087\u0011\u0010[<J\u009d\u00fc\u001dzk\u00ba\u00f4\u000e\u008b\u00e2\u00f2<}\u0010I\u009eD\u008d\u00e5\u00d7.\u00b8++|\u00ca\u009d\u0019\u00b5N\u0010\u00d6\u00ab '\u00f5=\u00cdhk\u00bej'\u00d5\u00e1\u001fz\u0010,@x'O\u00c5.;\u00a4\u00d0p\u00f8\u00e7\u00b1\u00c2E\u0010pb<m=\u009a\u00ed(\u0001i\u0000\u00e0\u001e\u00b2A\u00f1\u00103\u00d5h\u0017\u0004\u00ab:\u0002\u007fB@G:\u008ck/\u0010@\u009a4V\u0094\u00b5\u0099\u0004\u00a6\u0097\u0096\u00a5WT\u00e3\u0094\b?\u00d6\u0006\r \u00d1\u001ar\u0010\u008aW\t\u0091\u0001\u00b4\u00f7\u0094\u00d7\u00c9\u001c\u0095\u0086\u0085\u00c19\u0010Y\u00aa\u009b#\u00fc\\\u00f4\u00c9\u009e\u00b0Z\u0099O\u00e9F\u00b5\u0010\u00bbU\u00fc\u0015a\u00c7\u001fub\u00b7D\u00f5\u00c4\u0006\u0013\u001a\u0010Ia\u00a4\u001fr\u0017gR\u00fc\u0080A\u0013\u009fa\u00d7\u00f3".length();
                var4_7 = 16;
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
                    var0_3[var6_4++] = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "pb<m=\u009a\u00ed(\u00e4-+\u0010\u00ad5\u00b7q\u0010\u00ac\u001c'\u00f3@\u00edB\u00ee\u0080mYhIFx\u00b8";
                    var7_6 = "pb<m=\u009a\u00ed(\u00e4-+\u0010\u00ad5\u00b7q\u0010\u00ac\u001c'\u00f3@\u00edB\u00ee\u0080mYhIFx\u00b8".length();
                    var4_7 = 16;
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
                    var0_3[var6_4++] = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.a(var8_9).intern();
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
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlR = new VersionedRegistry<T>(var0_3[2]);
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlq = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[21], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlj(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlw = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[17], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIl_(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIl_ = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[12], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlw(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlD = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[1], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlU(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlK = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[4], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlf(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlZ = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[10], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlt(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlA = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[22], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlg(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlI = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[14], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlS(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlU = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[26], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIll(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlf = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[30], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlb(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlN = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[27], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlJ(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIly = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[11], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlE(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlb = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[23], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlP(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIla = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[31], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIls(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlC = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[8], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlH(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlr = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[24], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlh(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlB = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[18], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlB(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlY = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[25], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIla(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlo = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[5], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlk(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlu = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[19], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlu(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlc = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[15], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlQ(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[9], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlI(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlS = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[0], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlX(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlM = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[16], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlK(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlP = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[28], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlT(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlt = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[32], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlY(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlT = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[29], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlx(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlk = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[13], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlM(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIld = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[3], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlo(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlV = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[6], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlz(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlQ = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[7], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIlc(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlE = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlW(var0_3[20], (IlIlhB)LambdaMetafactory.metafactory(null, null, null, (F)F, IlIli(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.IlIlN.IlIlR.unloadMappings();
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

