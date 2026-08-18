/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlnX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlqI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlvB;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.Parsers$Parser;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIlxt {
    private static final VersionedRegistry<Parsers$Parser> IlIlK;
    public static final Parsers$Parser IlIlp;
    public static final Parsers$Parser IlIlQ;
    public static final Parsers$Parser IlIlN;
    public static final Parsers$Parser IlIlV;
    public static final Parsers$Parser IlIlh;
    public static final Parsers$Parser IlIlG;
    public static final Parsers$Parser IlIlq;
    public static final Parsers$Parser IlIlW;
    public static final Parsers$Parser IlIlE;
    public static final Parsers$Parser IlIlx;
    public static final Parsers$Parser IlIlA;
    public static final Parsers$Parser IlIlS;
    public static final Parsers$Parser IlIllG;
    public static final Parsers$Parser IlIllW;
    public static final Parsers$Parser IlIlO;
    public static final Parsers$Parser IlIlc;
    public static final Parsers$Parser IlIlI;
    public static final Parsers$Parser IlIlD;
    public static final Parsers$Parser IlIllQ;
    public static final Parsers$Parser IlIlL;
    public static final Parsers$Parser IlIlt;
    @ApiStatus.Obsolete
    public static final Parsers$Parser IlIlZ;
    public static final Parsers$Parser IlIlv;
    public static final Parsers$Parser IlIlJ;
    public static final Parsers$Parser IlIlr;
    public static final Parsers$Parser IlIlY;
    public static final Parsers$Parser IlIlP;
    public static final Parsers$Parser IlIly;
    public static final Parsers$Parser IlIlF;
    public static final Parsers$Parser IlIlll;
    public static final Parsers$Parser IlIli;
    public static final Parsers$Parser IlIllg;
    public static final Parsers$Parser IlIll;
    public static final Parsers$Parser IlIlX;
    public static final Parsers$Parser IlIlB;
    public static final Parsers$Parser IlIlf;
    public static final Parsers$Parser IlIls;
    public static final Parsers$Parser IlIllu;
    public static final Parsers$Parser IlIl_;
    public static final Parsers$Parser IlIlg;
    public static final Parsers$Parser IlIlz;
    public static final Parsers$Parser IlIlln;
    public static final Parsers$Parser IlIle;
    public static final Parsers$Parser IlIlR;
    public static final Parsers$Parser IlIlU;
    public static final Parsers$Parser IlIlo;
    public static final Parsers$Parser IlIllA;
    public static final Parsers$Parser IlIlw;
    public static final Parsers$Parser IlIlu;
    public static final Parsers$Parser IlIlb;
    public static final Parsers$Parser IlIlT;
    public static final Parsers$Parser IlIla;
    public static final Parsers$Parser IlIlm;
    public static final Parsers$Parser IlIln;
    public static final Parsers$Parser IlIlC;
    public static final Parsers$Parser IlIlj;
    public static final Parsers$Parser IlIlH;
    public static final Parsers$Parser IlIlk;
    public static final Parsers$Parser IlIlM;
    public static final Parsers$Parser IlIld;
    public static final Parsers$Parser IlIll0;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static transient /* synthetic */ String ZKigxDivhl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlxt() {
    }

    @ApiStatus.Internal
    public static Parsers$Parser IlIlW(String string) {
        return IlIlxt.IlIlJ(string, null, null);
    }

    @ApiStatus.Internal
    public static Parsers$Parser IlIlJ(String string, @Nullable IlIlnX ilIlnX, @Nullable IlIlvB ilIlvB) {
        return IlIlK.define(string, typesBuilderData -> new Parsers$Parser((TypesBuilderData)typesBuilderData, ilIlnX, ilIlvB));
    }

    public static Parsers$Parser IlIlZ(String string) {
        return IlIlK.getByName(string);
    }

    public static Parsers$Parser IlIlo(ClientVersion clientVersion, int n) {
        return IlIlK.getById(clientVersion, n);
    }

    public static List<Parsers$Parser> IlIlN() {
        return new ArrayList<Parsers$Parser>(IlIlK.getEntries());
    }

    public static VersionedRegistry<Parsers$Parser> IlIlE() {
        return IlIlK;
    }

    private static /* synthetic */ void lambda$static$26(PacketWrapper packetWrapper, List list) {
        packetWrapper.writeIdentifier((ResourceLocation)list.get(0));
    }

    private static /* synthetic */ List lambda$static$25(PacketWrapper packetWrapper) {
        return Collections.singletonList(packetWrapper.readIdentifier());
    }

    private static /* synthetic */ void lambda$static$24(PacketWrapper packetWrapper, List list) {
        packetWrapper.writeIdentifier((ResourceLocation)list.get(0));
    }

    private static /* synthetic */ List lambda$static$23(PacketWrapper packetWrapper) {
        return Collections.singletonList(packetWrapper.readIdentifier());
    }

    private static /* synthetic */ void lambda$static$22(PacketWrapper packetWrapper, List list) {
        packetWrapper.writeIdentifier((ResourceLocation)list.get(0));
    }

    private static /* synthetic */ List lambda$static$21(PacketWrapper packetWrapper) {
        return Collections.singletonList(packetWrapper.readIdentifier());
    }

    private static /* synthetic */ void lambda$static$20(PacketWrapper packetWrapper, List list) {
        packetWrapper.writeIdentifier((ResourceLocation)list.get(0));
    }

    private static /* synthetic */ List lambda$static$19(PacketWrapper packetWrapper) {
        return Collections.singletonList(packetWrapper.readIdentifier());
    }

    private static /* synthetic */ void lambda$static$18(PacketWrapper packetWrapper, List list) {
        packetWrapper.writeIdentifier((ResourceLocation)list.get(0));
    }

    private static /* synthetic */ List lambda$static$17(PacketWrapper packetWrapper) {
        return Collections.singletonList(packetWrapper.readIdentifier());
    }

    private static /* synthetic */ void lambda$static$16(PacketWrapper packetWrapper, List list) {
        block3: {
            PacketWrapper packetWrapper2;
            block2: {
                long l = a ^ 0x37424507A4D2L;
                int n = IlIlqI.IlIlQ();
                packetWrapper2 = packetWrapper;
                if (n != 0) break block2;
                if (!packetWrapper2.IlIlw().IlIlz(ServerVersion.V_1_19_4)) break block3;
                packetWrapper2 = packetWrapper;
            }
            packetWrapper2.IlIla((Integer)list.get(0));
        }
    }

    private static /* synthetic */ List lambda$static$15(PacketWrapper packetWrapper) {
        long l = a ^ 0x40EA0390AA12L;
        int n = IlIlqI.IlIlQ();
        int n2 = packetWrapper.IlIlw().IlIlz(ServerVersion.V_1_19_4);
        if (n == 0) {
            n2 = n2 != 0 ? packetWrapper.IlIlW() : 0;
        }
        return Collections.singletonList(n2);
    }

    private static /* synthetic */ void lambda$static$14(PacketWrapper packetWrapper, List list) {
        packetWrapper.IlIlu(((Byte)list.get(0)).intValue());
    }

    private static /* synthetic */ List lambda$static$13(PacketWrapper packetWrapper) {
        return Collections.singletonList(packetWrapper.IlIlE());
    }

    private static /* synthetic */ void lambda$static$12(PacketWrapper packetWrapper, List list) {
        packetWrapper.IlIlu(((Byte)list.get(0)).intValue());
    }

    private static /* synthetic */ List lambda$static$11(PacketWrapper packetWrapper) {
        return Collections.singletonList(packetWrapper.IlIlE());
    }

    private static /* synthetic */ void lambda$static$10(PacketWrapper packetWrapper, List list) {
        packetWrapper.IlIlJ((Integer)list.get(0));
    }

    private static /* synthetic */ List lambda$static$9(PacketWrapper packetWrapper) {
        return Collections.singletonList(packetWrapper.IlIlf());
    }

    private static /* synthetic */ void lambda$static$8(PacketWrapper packetWrapper, List list) {
        long l = a ^ 0x3C7D2B8AF38FL;
        byte by = (Byte)list.get(0);
        int n = IlIlqI.IlIlQ();
        packetWrapper.IlIlu(by);
        int n2 = n;
        int n3 = by & 1;
        if (n2 == 0) {
            if (n3 != 0) {
                packetWrapper.IlIlP((Long)list.get(1));
            }
            n3 = by & 2;
        }
        if (n3 != 0) {
            packetWrapper.IlIlP((Long)list.get(2));
        }
    }

    private static /* synthetic */ List lambda$static$7(PacketWrapper packetWrapper) {
        long l = a ^ 0x1409B7E3AF66L;
        byte by = packetWrapper.IlIlE();
        long l2 = (by & 1) != 0 ? packetWrapper.IlIli() : (long)IlIlxt.b("h", (int)25143, (long)(0x5C0FD8318BC2A118L ^ l));
        long l3 = (by & 2) != 0 ? packetWrapper.IlIli() : (long)IlIlxt.b("h", (int)26601, (long)(0x2BDB12261DE524C7L ^ l));
        return Arrays.asList(by, l2, l3);
    }

    private static /* synthetic */ void lambda$static$6(PacketWrapper packetWrapper, List list) {
        long l = a ^ 0x48D94D78F0E4L;
        int n = IlIlqI.IlIlY();
        byte by = (Byte)list.get(0);
        packetWrapper.IlIlu(by);
        int n2 = n;
        int n3 = by & 1;
        if (n2 != 0) {
            if (n3 != 0) {
                packetWrapper.IlIla((Integer)list.get(1));
            }
            n3 = by & 2;
        }
        if (n3 != 0) {
            packetWrapper.IlIla((Integer)list.get(2));
        }
    }

    private static /* synthetic */ List lambda$static$5(PacketWrapper packetWrapper) {
        long l = a ^ 0x28C4E7E1738EL;
        byte by = packetWrapper.IlIlE();
        int n = IlIlqI.IlIlY();
        Object object = by & 1;
        if (n != 0) {
            object = object != 0 ? packetWrapper.IlIlW() : (Object)IlIlxt.a("y", (int)24023, (long)(0x684CD6D613548CA0L ^ l));
        }
        int n2 = object;
        Object object2 = by & 2;
        if (n != 0) {
            object2 = object2 != 0 ? packetWrapper.IlIlW() : (Object)IlIlxt.a("y", (int)22031, (long)(0x7516C90DCEF28779L ^ l));
        }
        int n3 = object2;
        return Arrays.asList(by, n2, n3);
    }

    private static /* synthetic */ void lambda$static$4(PacketWrapper packetWrapper, List list) {
        long l = a ^ 0x17E983417CDL;
        byte by = (Byte)list.get(0);
        int n = IlIlqI.IlIlY();
        packetWrapper.IlIlu(by);
        int n2 = by & 1;
        if (n != 0) {
            if (n2 != 0) {
                packetWrapper.IlIlY((Double)list.get(1));
            }
            n2 = by & 2;
        }
        if (n2 != 0) {
            packetWrapper.IlIlY((Double)list.get(2));
        }
    }

    private static /* synthetic */ List lambda$static$3(PacketWrapper packetWrapper) {
        long l = a ^ 0x76166DB6AD47L;
        byte by = packetWrapper.IlIlE();
        double d = (by & 1) != 0 ? packetWrapper.IlIlb() : -1.7976931348623157E308;
        double d2 = (by & 2) != 0 ? packetWrapper.IlIlb() : Double.MAX_VALUE;
        return Arrays.asList(by, d, d2);
    }

    private static /* synthetic */ void lambda$static$2(PacketWrapper packetWrapper, List list) {
        long l = a ^ 0x34FA615BB0A3L;
        int n = IlIlqI.IlIlY();
        byte by = (Byte)list.get(0);
        packetWrapper.IlIlu(by);
        int n2 = n;
        int n3 = by & 1;
        if (n2 != 0) {
            if (n3 != 0) {
                packetWrapper.IlIlR(((Float)list.get(1)).floatValue());
            }
            n3 = by & 2;
        }
        if (n3 != 0) {
            packetWrapper.IlIlR(((Float)list.get(2)).floatValue());
        }
    }

    private static /* synthetic */ List lambda$static$1(PacketWrapper packetWrapper) {
        long l = a ^ 0x299D224A3D5FL;
        byte by = packetWrapper.IlIlE();
        float f = (by & 1) != 0 ? packetWrapper.IlIlX() : -3.4028235E38f;
        float f2 = (by & 2) != 0 ? packetWrapper.IlIlX() : Float.MAX_VALUE;
        return Arrays.asList(by, Float.valueOf(f), Float.valueOf(f2));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                IlIlxt.a = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(-4999457145079539976L, -6520683717145676828L, MethodHandles.lookup().lookupClass()).a(59942669213034L);
                                var31 = IlIlxt.a ^ 101201018214062L;
                                var23_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var31 >>> 56);
                                for (var24_2 = 1; var24_2 < 8; ++var24_2) {
                                    v2 = v2;
                                    v2[var24_2] = (byte)(var31 << var24_2 * 8 >>> 56);
                                }
                                var23_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var22_3 = new String[62];
                                var28_4 = 0;
                                var27_5 = "s\u0012\u00bf=\u00af\u0087\u0017\u00cf\u0010\u00e8\u001bjR\u00a6=l\u0093p\u0082\u00d6a:\u00a5$)\u0018c\u0005\u00d6\f\u00d4\u009d\u0003\u000e}V\u00d9\u00bc1\u00b0\u001c\u001c\u00a9\u00f8\u008c\u0005f\n\u00d3\u0005\b\u000e\u00b0\u00de\u00e0\u009a\u0010\u0015g\u0010G\n\u00baR\u00a2)`\u0016r3\u009dM=\u0001!\t\b\u001c\u001b5\u00f7\u008cM\u0081\u00c5\u0018h\u00d5~\u00f4i,+\u00f9&-\u0082\u00998I\u0006\u00c0\u00cf&a\u00ebp\u00fe2O\b\f\u00e08\u001a\u0087\u00d7eN\by0>\u00a7(\u00e8\u007f\u000e\u0010\u0015\u0097d*2\u0098\u00a2\u00c5\u00ca\\\u0099\u00c7J\u00f4\u00ecW\u0010Fwu\u00a1D2t7\u0084l\u00b2\u0014\u00802L\u00c9\u0010e\u0082n\u0016\u0083W\"s\u00ab\u00acG\u000e\u00e7\u0005\u00c6\u00f3\u0010\u00f12A\u00fc@\u0010p\u00a3\u00c6\u008c\u00ee\u00a4L\u00b6n:\u00106\u00d5\f\u00d8(\u00b6A\u00b3\u0002\u00e8\u00e6\u00d0\u0096\u00a5\u008e\u00a8\bI\u00c5\u00ad\u00a6\u00d2\u00dc\u00c6\u00f7\b\u00f7 C#C \u00c9\u00f6\u0010\u00e8\u001bjR\u00a6=l\u0093sE\u00d4\u009e\u0086&\u00a5U\u0018\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8r\u00bcs\u00cf\u001d\u00c7\u00af\u00806\u007f\u00ba\u00c4\u00c0!\u009b\u000b\u0010^_\u00fa\u00bb\u00b4\u00a8\u0098\u001a\u001cJ>\u000e\u00fd\u00dc\u00c1-\b|\u00b8\u0098L\u0097\u0090\u00bbs\u0010\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8S[\u00b3\u009e\u0019\u00d8\u00b5\t\u0018\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8\u0099\u0002\u00dd\u00bf9\u0000\u00d5k-\u0089\u0002\u00ec\u00f9\u0089\u0018\u008a\u0010\u00b0Omu\u00f9\u00c1\u00d3\u007fM\u00cb\u00d5Y\u00c2C\u009b\u00b3\u0018h\u00d5~\u00f4i,+\u00f9ql\u00fec)E\u00d5\u00c8\u008c\u00f2\u0014\u00e0\u00ef\u00e4Ml\u0010\u00afY\u0097<\u0082\u00ed\u0097\u00c5q\u00ab\u000f`*\u00ac\u00cf\u00ae\u0010MJ\u0000\u00fa\u009dlc\u00cd\u00d4}\u00b6`\u000b\u0099s/\u0010\u00cc\u00e0g|,S<\u0094!\u0095\u00dd\u00c6l\u0092.Z\u0010\u0002&\b\u0090\u008c\u00cc0Q}\u00c4\u0001rR\u007f\u00ef5\u0010\u00cb l\u00f6U~9T\u0019o}\u0082\u00fdO\u008b\u00b6\u0010,\u0091\u009d\u00a4\u00b4,\u00d0\u0086D\u0015'\u00d97\u009dE\u00f5\u0010\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8~\u00bdX\u0005\u00e1y\u00ed\\\u0010\u00e5\u00f0\u008b\u00b1a\u00b3\u00c2\u0087A\u00d3\u009c\u001dLo\u00b2m\u0010\u000e\u00f1\u00d2d\u00af\u00c4\u00d9\u0095$\u00b9\u00fd\u001f\u00e71\u00fdA\u0010h\u00d5~\u00f4i,+\u00f9\u00cc#\u00e3\u00de\u00f8|\u00f7e\u0010\fA.\u0092>\u00e7\u00a7\u00eer!\u00e39VE\u00da\u00ee\u0010w\u001e\u001c\u008ab\u0017\u00a5\u00b5\u00b1\u0093\u00da\u00a4J\u00ad<-\u0010}p\u00bfj\u00e6eo\u00aaVZ\u0001&\u00af\u0014\u00831\u0010\u008a,d\u0002\u00c7\u00b1\u00ec\u001f\u00d02\u0016\u007fV\u0085\u00c3\u00bb\u0018\u00cc\u00e0g|,S<\u0094\u00d0\u007f\u00a9(\u00fa\u00bf\u00a9\u00a2l\u00b7\u0081\u00d1\u009b\u00bbl\u0007\u0010\u0095\u00d8\u0095C\u0091\u00b3\u008e\u00bc\u00f1<\u009f\u001d\u009d\u00fe\u00cd\u00d3\b?\u00f1\u00cd\u00fbO\u0097\u0002i\u0010 E\u00e4\u009e7\u008d\u0087\u00d4\u00bb\u00fe\u0012W\u00ef-\u00e0*\b%\u00a0\u009a~#\u000fI\u0099\u0018\u0011y\u00a6\u00dbM.\u0007\u00fe\u00f5\u00aa\u00ec8\u00a1\u00803>\u00b9\u0098\u00bbb\u00fa\u00b7y&\bM-\u0097\u000b\u00d9\u00a8\u00fe\u00df\u0010\u009e\u0007\u00b4\u00b0\u000b\u00e7**c\u00e7I\u00cb`z\u00ea=\u0010\u001d5\u00de\u00ee\f\u007f\u00cc\u009c\u00ec\u0085\u001dv\u00ff\u00d1\u009c0\u0018\u0019zc\u00a4\u000f\u0011\u0094VrF\u0087\u00c8A\u00fc\u00a2\u00be\u00a6\u00dar\u001a7J/[\u0010\u0013\u00af\u00ea\u00e9\u0097\u0099\u00bae\u00f4\u0088\u00e3|\u00c0\u009aD\u00a8\b\u001b\u00b1\u00f7\u00b23\u00c2r\u00df\b\u00e5FX\u0004\u00a65\u0018\u00bc\u0010\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8\u0089\u00e9\fy\u00d6\u009f\u00e7Q\u0018\fA.\u0092>\u00e7\u00a7\u00ee\u00e6\u0097\u00d0\u00c2:*\u0089\u00a4s\u00a8fmFG\u0013'\u0010\u00c17?I\u0095\u0098o\u00bdS\u00fc\u0085\u00ae\u0005\u0000\u00c4\u00d0\b\u001c+\u008b\u00e7\u00e7\u00ceis\u0018\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8\u001f\u00a0\u00d2z\u00f0q2d\u00c5\u0097D\u00c9\u00f7Ly\u00df\u0018h\u00d5~\u00f4i,+\u00f9i9u3\u00d3u\u00f7\b\u00b2\u00b7{\u0092\u0080W\u00f4Z\u0010h\u00d5~\u00f4i,+\u00f9\u00e0\u0016=\u008d\u00b2\u00bdd1\u0010\u00afD\u00de\u00b4h\u00af\u0013\ry\u0006\u00a3\u0094\u00ac\u009d\u00af.\u0010ar\u001f\u00a1v{w\u00ec\u0019Y\u001a\u00e8l+\u00cd1";
                                var29_6 = "s\u0012\u00bf=\u00af\u0087\u0017\u00cf\u0010\u00e8\u001bjR\u00a6=l\u0093p\u0082\u00d6a:\u00a5$)\u0018c\u0005\u00d6\f\u00d4\u009d\u0003\u000e}V\u00d9\u00bc1\u00b0\u001c\u001c\u00a9\u00f8\u008c\u0005f\n\u00d3\u0005\b\u000e\u00b0\u00de\u00e0\u009a\u0010\u0015g\u0010G\n\u00baR\u00a2)`\u0016r3\u009dM=\u0001!\t\b\u001c\u001b5\u00f7\u008cM\u0081\u00c5\u0018h\u00d5~\u00f4i,+\u00f9&-\u0082\u00998I\u0006\u00c0\u00cf&a\u00ebp\u00fe2O\b\f\u00e08\u001a\u0087\u00d7eN\by0>\u00a7(\u00e8\u007f\u000e\u0010\u0015\u0097d*2\u0098\u00a2\u00c5\u00ca\\\u0099\u00c7J\u00f4\u00ecW\u0010Fwu\u00a1D2t7\u0084l\u00b2\u0014\u00802L\u00c9\u0010e\u0082n\u0016\u0083W\"s\u00ab\u00acG\u000e\u00e7\u0005\u00c6\u00f3\u0010\u00f12A\u00fc@\u0010p\u00a3\u00c6\u008c\u00ee\u00a4L\u00b6n:\u00106\u00d5\f\u00d8(\u00b6A\u00b3\u0002\u00e8\u00e6\u00d0\u0096\u00a5\u008e\u00a8\bI\u00c5\u00ad\u00a6\u00d2\u00dc\u00c6\u00f7\b\u00f7 C#C \u00c9\u00f6\u0010\u00e8\u001bjR\u00a6=l\u0093sE\u00d4\u009e\u0086&\u00a5U\u0018\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8r\u00bcs\u00cf\u001d\u00c7\u00af\u00806\u007f\u00ba\u00c4\u00c0!\u009b\u000b\u0010^_\u00fa\u00bb\u00b4\u00a8\u0098\u001a\u001cJ>\u000e\u00fd\u00dc\u00c1-\b|\u00b8\u0098L\u0097\u0090\u00bbs\u0010\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8S[\u00b3\u009e\u0019\u00d8\u00b5\t\u0018\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8\u0099\u0002\u00dd\u00bf9\u0000\u00d5k-\u0089\u0002\u00ec\u00f9\u0089\u0018\u008a\u0010\u00b0Omu\u00f9\u00c1\u00d3\u007fM\u00cb\u00d5Y\u00c2C\u009b\u00b3\u0018h\u00d5~\u00f4i,+\u00f9ql\u00fec)E\u00d5\u00c8\u008c\u00f2\u0014\u00e0\u00ef\u00e4Ml\u0010\u00afY\u0097<\u0082\u00ed\u0097\u00c5q\u00ab\u000f`*\u00ac\u00cf\u00ae\u0010MJ\u0000\u00fa\u009dlc\u00cd\u00d4}\u00b6`\u000b\u0099s/\u0010\u00cc\u00e0g|,S<\u0094!\u0095\u00dd\u00c6l\u0092.Z\u0010\u0002&\b\u0090\u008c\u00cc0Q}\u00c4\u0001rR\u007f\u00ef5\u0010\u00cb l\u00f6U~9T\u0019o}\u0082\u00fdO\u008b\u00b6\u0010,\u0091\u009d\u00a4\u00b4,\u00d0\u0086D\u0015'\u00d97\u009dE\u00f5\u0010\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8~\u00bdX\u0005\u00e1y\u00ed\\\u0010\u00e5\u00f0\u008b\u00b1a\u00b3\u00c2\u0087A\u00d3\u009c\u001dLo\u00b2m\u0010\u000e\u00f1\u00d2d\u00af\u00c4\u00d9\u0095$\u00b9\u00fd\u001f\u00e71\u00fdA\u0010h\u00d5~\u00f4i,+\u00f9\u00cc#\u00e3\u00de\u00f8|\u00f7e\u0010\fA.\u0092>\u00e7\u00a7\u00eer!\u00e39VE\u00da\u00ee\u0010w\u001e\u001c\u008ab\u0017\u00a5\u00b5\u00b1\u0093\u00da\u00a4J\u00ad<-\u0010}p\u00bfj\u00e6eo\u00aaVZ\u0001&\u00af\u0014\u00831\u0010\u008a,d\u0002\u00c7\u00b1\u00ec\u001f\u00d02\u0016\u007fV\u0085\u00c3\u00bb\u0018\u00cc\u00e0g|,S<\u0094\u00d0\u007f\u00a9(\u00fa\u00bf\u00a9\u00a2l\u00b7\u0081\u00d1\u009b\u00bbl\u0007\u0010\u0095\u00d8\u0095C\u0091\u00b3\u008e\u00bc\u00f1<\u009f\u001d\u009d\u00fe\u00cd\u00d3\b?\u00f1\u00cd\u00fbO\u0097\u0002i\u0010 E\u00e4\u009e7\u008d\u0087\u00d4\u00bb\u00fe\u0012W\u00ef-\u00e0*\b%\u00a0\u009a~#\u000fI\u0099\u0018\u0011y\u00a6\u00dbM.\u0007\u00fe\u00f5\u00aa\u00ec8\u00a1\u00803>\u00b9\u0098\u00bbb\u00fa\u00b7y&\bM-\u0097\u000b\u00d9\u00a8\u00fe\u00df\u0010\u009e\u0007\u00b4\u00b0\u000b\u00e7**c\u00e7I\u00cb`z\u00ea=\u0010\u001d5\u00de\u00ee\f\u007f\u00cc\u009c\u00ec\u0085\u001dv\u00ff\u00d1\u009c0\u0018\u0019zc\u00a4\u000f\u0011\u0094VrF\u0087\u00c8A\u00fc\u00a2\u00be\u00a6\u00dar\u001a7J/[\u0010\u0013\u00af\u00ea\u00e9\u0097\u0099\u00bae\u00f4\u0088\u00e3|\u00c0\u009aD\u00a8\b\u001b\u00b1\u00f7\u00b23\u00c2r\u00df\b\u00e5FX\u0004\u00a65\u0018\u00bc\u0010\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8\u0089\u00e9\fy\u00d6\u009f\u00e7Q\u0018\fA.\u0092>\u00e7\u00a7\u00ee\u00e6\u0097\u00d0\u00c2:*\u0089\u00a4s\u00a8fmFG\u0013'\u0010\u00c17?I\u0095\u0098o\u00bdS\u00fc\u0085\u00ae\u0005\u0000\u00c4\u00d0\b\u001c+\u008b\u00e7\u00e7\u00ceis\u0018\u00f6\u008d)w\u00ad\u00ea\u00af\u00b8\u001f\u00a0\u00d2z\u00f0q2d\u00c5\u0097D\u00c9\u00f7Ly\u00df\u0018h\u00d5~\u00f4i,+\u00f9i9u3\u00d3u\u00f7\b\u00b2\u00b7{\u0092\u0080W\u00f4Z\u0010h\u00d5~\u00f4i,+\u00f9\u00e0\u0016=\u008d\u00b2\u00bdd1\u0010\u00afD\u00de\u00b4h\u00af\u0013\ry\u0006\u00a3\u0094\u00ac\u009d\u00af.\u0010ar\u001f\u00a1v{w\u00ec\u0019Y\u001a\u00e8l+\u00cd1".length();
                                var26_7 = 8;
                                var25_8 = -1;
lbl19:
                                // 2 sources

                                while (true) {
                                    v3 = ++var25_8;
                                    v4 = var27_5.substring(v3, v3 + var26_7);
                                    v5 = -1;
                                    break block16;
                                    break;
                                }
lbl24:
                                // 1 sources

                                while (true) {
                                    var22_3[var28_4++] = IlIlxt.a(var30_9).intern();
                                    if ((var25_8 += var26_7) < var29_6) {
                                        var26_7 = var27_5.charAt(var25_8);
                                        ** continue;
                                    }
                                    var27_5 = "h\u00d5~\u00f4i,+\u00f9l'\u0084G[lh\u00f1\u0010\u00d41\u0099\u001d\u0000y\u00eb\u00ec\r5\u0015\u00cf\u00bf\u00f7x\u00d7";
                                    var29_6 = "h\u00d5~\u00f4i,+\u00f9l'\u0084G[lh\u00f1\u0010\u00d41\u0099\u001d\u0000y\u00eb\u00ec\r5\u0015\u00cf\u00bf\u00f7x\u00d7".length();
                                    var26_7 = 16;
                                    var25_8 = -1;
lbl33:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var25_8;
                                        v4 = var27_5.substring(v6, v6 + var26_7);
                                        v5 = 0;
                                        break block16;
                                        break;
                                    }
                                    break;
                                }
lbl38:
                                // 1 sources

                                while (true) {
                                    var22_3[var28_4++] = IlIlxt.a(var30_9).intern();
                                    if ((var25_8 += var26_7) < var29_6) {
                                        var26_7 = var27_5.charAt(var25_8);
                                        ** continue;
                                    }
                                    break block17;
                                    break;
                                }
                            }
                            var30_9 = var23_1.doFinal(v4.getBytes("ISO-8859-1"));
                            switch (v5) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl50:
                                // 1 sources

                                ** continue;
                            }
                        }
                        IlIlxt.d = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var31 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var31 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[2];
                        var14_13 = 0;
                        var15_14 = "\u000bx\u000b\u001cAu\u00c31\u00df\u0098\u00e8\u00b6\u00aa\u00e6\u00b6\u00e8";
                        var16_15 = "\u000bx\u000b\u001cAu\u00c31\u00df\u0098\u00e8\u00b6\u00aa\u00e6\u00b6\u00e8".length();
                        var13_16 = 0;
                        while (true) {
                            break block18;
                            break;
                        }
lbl70:
                        // 1 sources

                        while (true) {
                            var17_12[v10] = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                            if (var13_16 < var16_15) ** continue;
                            break block19;
                            break;
                        }
                    }
                    var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                    v10 = var14_13++;
                    var19_18 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    ** while (true)
                }
                IlIlxt.b = var17_12;
                IlIlxt.c = new Integer[2];
                IlIlxt.g = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v11 = SecretKeyFactory.getInstance("DES");
                v12 = new byte[8];
                v13 = v12;
                v12[0] = (byte)(var31 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v13 = v13;
                    v13[var1_21] = (byte)(var31 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v11.generateSecret(new DESKeySpec(v13)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "\u000b\u0095\u001e\u0017\u00b2\u0001\u0092\u00d7\u00cc\u0091@\u0081K<%)";
                var5_25 = "\u000b\u0095\u001e\u0017\u00b2\u0001\u0092\u00d7\u00cc\u0091@\u0081K<%)".length();
                var2_26 = 0;
                while (true) {
                    break block20;
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    var6_22[v14] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block21;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v14 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        IlIlxt.e = var6_22;
        IlIlxt.f = new Long[2];
        IlIlxt.IlIlK = new VersionedRegistry<T>(var22_3[43]);
        IlIlxt.IlIlp = IlIlxt.IlIlJ(var22_3[20], null, null);
        IlIlxt.IlIlQ = IlIlxt.IlIlJ(var22_3[30], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$1(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$2(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlN = IlIlxt.IlIlJ(var22_3[21], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$3(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$4(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlV = IlIlxt.IlIlJ(var22_3[17], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$5(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$6(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlh = IlIlxt.IlIlJ(var22_3[51], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$7(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$8(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlG = IlIlxt.IlIlJ(var22_3[55], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$9(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$10(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlq = IlIlxt.IlIlJ(var22_3[40], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$11(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$12(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlW = IlIlxt.IlIlJ(var22_3[4], null, null);
        IlIlxt.IlIlE = IlIlxt.IlIlJ(var22_3[45], null, null);
        IlIlxt.IlIlx = IlIlxt.IlIlJ(var22_3[46], null, null);
        IlIlxt.IlIlA = IlIlxt.IlIlJ(var22_3[42], null, null);
        IlIlxt.IlIlS = IlIlxt.IlIlJ(var22_3[15], null, null);
        IlIlxt.IlIllG = IlIlxt.IlIlJ(var22_3[35], null, null);
        IlIlxt.IlIllW = IlIlxt.IlIlJ(var22_3[11], null, null);
        IlIlxt.IlIlO = IlIlxt.IlIlJ(var22_3[36], null, null);
        IlIlxt.IlIlc = IlIlxt.IlIlJ(var22_3[13], null, null);
        IlIlxt.IlIlI = IlIlxt.IlIlJ(var22_3[0], null, null);
        IlIlxt.IlIlD = IlIlxt.IlIlJ(var22_3[22], null, null);
        IlIlxt.IlIllQ = IlIlxt.IlIlJ(var22_3[49], null, null);
        IlIlxt.IlIlL = IlIlxt.IlIlJ(var22_3[8], null, null);
        IlIlxt.IlIlt = IlIlxt.IlIlJ(var22_3[2], null, null);
        IlIlxt.IlIlZ = IlIlxt.IlIlJ(var22_3[14], null, null);
        IlIlxt.IlIlv = IlIlxt.IlIlJ(var22_3[3], null, null);
        IlIlxt.IlIlJ = IlIlxt.IlIlJ(var22_3[18], null, null);
        IlIlxt.IlIlr = IlIlxt.IlIlJ(var22_3[34], null, null);
        IlIlxt.IlIlY = IlIlxt.IlIlJ(var22_3[52], null, null);
        IlIlxt.IlIlP = IlIlxt.IlIlJ(var22_3[31], null, null);
        IlIlxt.IlIly = IlIlxt.IlIlJ(var22_3[37], null, null);
        IlIlxt.IlIlF = IlIlxt.IlIlJ(var22_3[5], null, null);
        IlIlxt.IlIlll = IlIlxt.IlIlJ(var22_3[59], null, null);
        IlIlxt.IlIli = IlIlxt.IlIlJ(var22_3[9], null, null);
        IlIlxt.IlIllg = IlIlxt.IlIlJ(var22_3[48], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$13(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$14(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIll = IlIlxt.IlIlJ(var22_3[54], null, null);
        IlIlxt.IlIlX = IlIlxt.IlIlJ(var22_3[44], null, null);
        IlIlxt.IlIlB = IlIlxt.IlIlJ(var22_3[16], null, null);
        IlIlxt.IlIlf = IlIlxt.IlIlJ(var22_3[1], null, null);
        IlIlxt.IlIls = IlIlxt.IlIlJ(var22_3[23], null, null);
        IlIlxt.IlIllu = IlIlxt.IlIlJ(var22_3[41], null, null);
        IlIlxt.IlIl_ = IlIlxt.IlIlJ(var22_3[25], null, null);
        IlIlxt.IlIlg = IlIlxt.IlIlJ(var22_3[12], null, null);
        IlIlxt.IlIlz = IlIlxt.IlIlJ(var22_3[29], null, null);
        IlIlxt.IlIlln = IlIlxt.IlIlJ(var22_3[61], null, null);
        IlIlxt.IlIle = IlIlxt.IlIlJ(var22_3[47], null, null);
        IlIlxt.IlIlR = IlIlxt.IlIlJ(var22_3[28], null, null);
        IlIlxt.IlIlU = IlIlxt.IlIlJ(var22_3[27], null, null);
        IlIlxt.IlIlo = IlIlxt.IlIlJ(var22_3[32], null, null);
        IlIlxt.IlIllA = IlIlxt.IlIlJ(var22_3[50], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$15(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$16(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlw = IlIlxt.IlIlJ(var22_3[33], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$17(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$18(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlu = IlIlxt.IlIlJ(var22_3[56], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$19(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$20(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlb = IlIlxt.IlIlJ(var22_3[57], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$21(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$22(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIlT = IlIlxt.IlIlJ(var22_3[60], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$23(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$24(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIla = IlIlxt.IlIlJ(var22_3[26], null, null);
        IlIlxt.IlIlm = IlIlxt.IlIlJ(var22_3[38], null, null);
        IlIlxt.IlIln = IlIlxt.IlIlJ(var22_3[53], null, null);
        IlIlxt.IlIlC = IlIlxt.IlIlJ(var22_3[10], null, null);
        IlIlxt.IlIlj = IlIlxt.IlIlJ(var22_3[39], null, null);
        IlIlxt.IlIlH = IlIlxt.IlIlJ(var22_3[58], null, null);
        IlIlxt.IlIlk = IlIlxt.IlIlJ(var22_3[19], null, null);
        IlIlxt.IlIlM = IlIlxt.IlIlJ(var22_3[6], (IlIlnX)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$25(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlvB)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$26(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlxt.IlIld = IlIlxt.IlIlJ(var22_3[24], null, null);
        IlIlxt.IlIll0 = IlIlxt.IlIlJ(var22_3[7], null, null);
        IlIlxt.IlIlK.unloadMappings();
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5CC5;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/IlIlxt", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlxt.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlxt.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/IlIlxt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1275;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/IlIlxt", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            IlIlxt.f[n2] = l4;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = IlIlxt.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/IlIlxt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlxt.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(IlIlxt.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

