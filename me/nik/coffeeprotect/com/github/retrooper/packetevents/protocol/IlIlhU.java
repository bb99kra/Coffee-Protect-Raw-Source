/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlLN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlh0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlhC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlhZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIln0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlrg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlrk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlxk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public final class IlIlhU {
    private static volatile boolean IlIlk;
    private static final Object IlIlu;
    private static final IlIlxk IlIlo;
    private static final IlIlxk IlIlB;
    private static final IlIlxk IlIlU;
    private static final IlIlxk IlIlW;
    private static PacketWrapper[] IlIlC;
    private static final long a;
    private static transient /* synthetic */ String koRSHyIBsq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlhU() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ApiStatus.Internal
    public static void IlIlV() {
        long l = a ^ 0x5AA2E9924C74L;
        PacketWrapper[] packetWrapperArray = IlIlhU.IlIlX();
        if (IlIlk) {
            return;
        }
        Object object = IlIlu;
        synchronized (object) {
            boolean bl = IlIlk;
            if (packetWrapperArray == null) {
                if (bl) {
                    return;
                }
                IlIlnN.IlIlk();
                IlIlAG.IlIlp();
                IlIlqy.IlIl_();
                IlIlWz.IlIlq();
                bl = true;
            }
            IlIlk = bl;
        }
    }

    @ApiStatus.Internal
    public static boolean IlIlk() {
        return IlIlk;
    }

    public static IlIloL IlIl_(IlIlhC ilIlhC, IlIlrk ilIlrk, ClientVersion clientVersion, int n) {
        long l = a ^ 0x136F29EBAA50L;
        switch (ilIlrk) {
            case HANDSHAKING: {
                if (ilIlhC == IlIlhC.CLIENT) {
                    return IlIlhZ.IlIlE(n);
                }
                return IlIlh0.IlIlC(n);
            }
            case STATUS: {
                if (ilIlhC == IlIlhC.CLIENT) {
                    return IlIlLN.IlIle(n);
                }
                return IlIlrg.IlIlT(n);
            }
            case LOGIN: {
                if (ilIlhC == IlIlhC.CLIENT) {
                    return IlIlqw.IlIlL(n);
                }
                return IlIln0.IlIlI(n);
            }
            case PLAY: {
                if (ilIlhC == IlIlhC.CLIENT) {
                    return IlIlnN.IlIl_(clientVersion, n);
                }
                return IlIlAG.IlIlI(clientVersion, n);
            }
            case CONFIGURATION: {
                if (ilIlhC == IlIlhC.CLIENT) {
                    return IlIlqy.IlIll(clientVersion, n);
                }
                return IlIlWz.IlIle(clientVersion, n);
            }
        }
        return null;
    }

    static /* synthetic */ IlIlxk IlIlA() {
        return IlIlW;
    }

    static /* synthetic */ IlIlxk IlIlN() {
        return IlIlU;
    }

    static /* synthetic */ IlIlxk IlIlh() {
        return IlIlB;
    }

    static /* synthetic */ IlIlxk IlIlO() {
        return IlIlo;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                IlIlhU.a = IlIls.a(2949564670279226956L, -2619348451418308943L, MethodHandles.lookup().lookupClass()).a(248231781638407L);
                var11 = IlIlhU.a ^ 132783920685139L;
                if (IlIlhU.IlIlX() != null) {
                    IlIlhU.IlIlv(new PacketWrapper[4]);
                }
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[42];
                var4_4 = 0;
                var5_5 = "\u00a9\u00aem\u009c\u00ed?\u00d4\u009a\u008a=C\u009d\u00ceTPk\u00f4X\u000bZ\u0005\t\u00eb\u00de\u00192\u009b\u00a1\u00be\u00ac/\u0019.f\u00c5\u00b1m`\u00dd\u00cfF\u00c5$\u00e4\u00b30\\\u00be\u00d5\u001e\u0099>Im\u0012Q\u00a1\u009c\u00bb\u0085t\u00a6_\u00d7\u00d4\u00ae\u00a6V\u0086|\u00031\u00ab\u00cf<\u00d0\u00e1\u0007\u0012\u00efJ\u00cb;\u001c\u0011\u0010\u00f4\u001a6-M\u00a9\u0093\u00acS\u00f4\u00fc\u008c\u00facq\u00b8[\u0082\u00fac\u00e7\u0017.\u00b5\u00c3\u00db\u0000\"\u0095\u0098\u001f&\u00d7\u0003\u00f4\u0098\u00d232Jg\u0010\u00fdP\u00fc\u00deD9i~\b\u00c4\u008a\u001a\u0090\u00b7\u00caS\u00f6Q\u00df\u0006\u000bO\u0093Re9\u0014N\u00f1A\f\"e\u00f0`w\u00dcQf\u00abb&\u00b4\u001b\u001c\u00c3\u007f\u008c\u00beR\u00b7fM\u000e\u000bo\u00d1\u0097\u0080MCu\u000b\u009d\u0005 W\u00e4\u0018\u007f>i\u00a5\u00de\u0012\u00d9\u00ef\u001d3\u0086\u00a0\u0091W\u000f.\u00e1Ciu\u00f7\u00cf\u0013\u0001\u001d\"qt\u009b\u00a6\u0018\u00df\u0011\u00d7_\u00c2\u0096|f|\u00f2\u009e\u0093Ak)tt\u00a8\u00fd\u0000uF\u0012\n\u00ff1I\u0012`vwK\u0011m\u00a6\u00d0\u0011:\u00b1\u0084S\u00e7:\u001bw'cL\u00b0x\u00a8U\u008e\u00d4\u009f\u00eb\u00a7\u0017P\u00f5\u00cc\u00d9\u00df\u0097\u001d\u0001g\u001c\u00eb!\u00ae@\u00188R\u0093\u00aa1c\u00b3\u0089\u008e5'\u00a3\u00b8\u00bb\u00ca\u00cd`z|";
                var6_6 = "\u00a9\u00aem\u009c\u00ed?\u00d4\u009a\u008a=C\u009d\u00ceTPk\u00f4X\u000bZ\u0005\t\u00eb\u00de\u00192\u009b\u00a1\u00be\u00ac/\u0019.f\u00c5\u00b1m`\u00dd\u00cfF\u00c5$\u00e4\u00b30\\\u00be\u00d5\u001e\u0099>Im\u0012Q\u00a1\u009c\u00bb\u0085t\u00a6_\u00d7\u00d4\u00ae\u00a6V\u0086|\u00031\u00ab\u00cf<\u00d0\u00e1\u0007\u0012\u00efJ\u00cb;\u001c\u0011\u0010\u00f4\u001a6-M\u00a9\u0093\u00acS\u00f4\u00fc\u008c\u00facq\u00b8[\u0082\u00fac\u00e7\u0017.\u00b5\u00c3\u00db\u0000\"\u0095\u0098\u001f&\u00d7\u0003\u00f4\u0098\u00d232Jg\u0010\u00fdP\u00fc\u00deD9i~\b\u00c4\u008a\u001a\u0090\u00b7\u00caS\u00f6Q\u00df\u0006\u000bO\u0093Re9\u0014N\u00f1A\f\"e\u00f0`w\u00dcQf\u00abb&\u00b4\u001b\u001c\u00c3\u007f\u008c\u00beR\u00b7fM\u000e\u000bo\u00d1\u0097\u0080MCu\u000b\u009d\u0005 W\u00e4\u0018\u007f>i\u00a5\u00de\u0012\u00d9\u00ef\u001d3\u0086\u00a0\u0091W\u000f.\u00e1Ciu\u00f7\u00cf\u0013\u0001\u001d\"qt\u009b\u00a6\u0018\u00df\u0011\u00d7_\u00c2\u0096|f|\u00f2\u009e\u0093Ak)tt\u00a8\u00fd\u0000uF\u0012\n\u00ff1I\u0012`vwK\u0011m\u00a6\u00d0\u0011:\u00b1\u0084S\u00e7:\u001bw'cL\u00b0x\u00a8U\u008e\u00d4\u009f\u00eb\u00a7\u0017P\u00f5\u00cc\u00d9\u00df\u0097\u001d\u0001g\u001c\u00eb!\u00ae@\u00188R\u0093\u00aa1c\u00b3\u0089\u008e5'\u00a3\u00b8\u00bb\u00ca\u00cd`z|".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block9;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "gm\naO\u00a8\u00f8\u0080\u00c0\u0090\u00a5 =\u00e7\u0003\u00e4";
                    var6_6 = "gm\naO\u00a8\u00f8\u0080\u00c0\u0090\u00a5 =\u00e7\u0003\u00e4".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block9;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block10;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        IlIlhU.IlIlk = false;
        IlIlhU.IlIlu = new Object();
        v8 = new ClientVersion[(int)var0_3[33]];
        v8[0] = ClientVersion.V_1_7_2;
        v8[1] = ClientVersion.V_1_8;
        v8[2] = ClientVersion.V_1_9;
        v8[3] = ClientVersion.V_1_10;
        v8[4] = ClientVersion.V_1_12;
        v8[5] = ClientVersion.V_1_12_1;
        v8[(int)var0_3[6]] = ClientVersion.V_1_13;
        v8[(int)var0_3[8]] = ClientVersion.V_1_14;
        v8[(int)var0_3[30]] = ClientVersion.V_1_14_4;
        v8[(int)var0_3[24]] = ClientVersion.V_1_15;
        v8[(int)var0_3[18]] = ClientVersion.V_1_15_2;
        v8[(int)var0_3[13]] = ClientVersion.V_1_16;
        v8[(int)var0_3[16]] = ClientVersion.V_1_16_2;
        v8[(int)var0_3[0]] = ClientVersion.V_1_17;
        v8[(int)var0_3[28]] = ClientVersion.V_1_18;
        v8[(int)var0_3[22]] = ClientVersion.V_1_19;
        v8[(int)var0_3[21]] = ClientVersion.V_1_19_1;
        v8[(int)var0_3[19]] = ClientVersion.V_1_19_3;
        v8[(int)var0_3[40]] = ClientVersion.V_1_19_4;
        v8[(int)var0_3[41]] = ClientVersion.V_1_20_2;
        v8[(int)var0_3[2]] = ClientVersion.V_1_20_3;
        v8[(int)var0_3[39]] = ClientVersion.V_1_20_5;
        v8[(int)var0_3[26]] = ClientVersion.V_1_21;
        v8[(int)var0_3[9]] = ClientVersion.V_1_21_2;
        v8[(int)var0_3[12]] = ClientVersion.V_1_21_5;
        v8[(int)var0_3[31]] = ClientVersion.V_1_21_6;
        v8[(int)var0_3[10]] = ClientVersion.V_1_21_9;
        v8[(int)var0_3[35]] = ClientVersion.V_26_1;
        IlIlhU.IlIlo = new IlIlxk(v8);
        v9 = new ClientVersion[(int)var0_3[25]];
        v9[0] = ClientVersion.V_1_7_2;
        v9[1] = ClientVersion.V_1_8;
        v9[2] = ClientVersion.V_1_9;
        v9[3] = ClientVersion.V_1_12;
        v9[4] = ClientVersion.V_1_12_1;
        v9[5] = ClientVersion.V_1_13;
        v9[(int)var0_3[14]] = ClientVersion.V_1_14;
        v9[(int)var0_3[17]] = ClientVersion.V_1_15_2;
        v9[(int)var0_3[5]] = ClientVersion.V_1_16;
        v9[(int)var0_3[34]] = ClientVersion.V_1_16_2;
        v9[(int)var0_3[38]] = ClientVersion.V_1_17;
        v9[(int)var0_3[11]] = ClientVersion.V_1_19;
        v9[(int)var0_3[20]] = ClientVersion.V_1_19_1;
        v9[(int)var0_3[4]] = ClientVersion.V_1_19_3;
        v9[(int)var0_3[3]] = ClientVersion.V_1_19_4;
        v9[(int)var0_3[27]] = ClientVersion.V_1_20_2;
        v9[(int)var0_3[37]] = ClientVersion.V_1_20_3;
        v9[(int)var0_3[29]] = ClientVersion.V_1_20_5;
        v9[(int)var0_3[36]] = ClientVersion.V_1_21_2;
        v9[(int)var0_3[1]] = ClientVersion.V_1_21_4;
        v9[(int)var0_3[15]] = ClientVersion.V_1_21_5;
        v9[(int)var0_3[32]] = ClientVersion.V_1_21_6;
        v9[(int)var0_3[7]] = ClientVersion.V_1_21_9;
        v9[(int)var0_3[23]] = ClientVersion.V_26_1;
        IlIlhU.IlIlB = new IlIlxk(v9);
        v10 = new ClientVersion[(int)var0_3[14]];
        v10[0] = ClientVersion.V_1_20_2;
        v10[1] = ClientVersion.V_1_20_3;
        v10[2] = ClientVersion.V_1_20_5;
        v10[3] = ClientVersion.V_1_21;
        v10[4] = ClientVersion.V_1_21_6;
        v10[5] = ClientVersion.V_1_21_9;
        IlIlhU.IlIlU = new IlIlxk(v10);
        IlIlhU.IlIlW = new IlIlxk(new ClientVersion[]{ClientVersion.V_1_20_2, ClientVersion.V_1_20_5, ClientVersion.V_1_21_6, ClientVersion.V_1_21_9});
    }

    public static void IlIlv(PacketWrapper[] packetWrapperArray) {
        IlIlC = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlX() {
        return IlIlC;
    }
}

