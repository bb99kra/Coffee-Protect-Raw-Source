/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlit;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlhZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlrk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlnd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJB
extends PacketWrapper<IlIlJB> {
    private int IlIlF;
    private ClientVersion IlIlJ;
    private String IlIlt;
    private int IlIlB;
    private IlIlnd IlIlI;
    private static PacketWrapper[] IlIls;
    private static final long b;
    private static final String c;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map l;
    private static transient /* synthetic */ String qLvGBsTlPB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJB(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    @Deprecated
    public IlIlJB(int n, String string, int n2, IlIlrk ilIlrk) {
        this(n, string, n2, IlIlnd.LOGIN);
        this.IlIlJ(ilIlrk);
    }

    public IlIlJB(int n, String string, int n2, IlIlnd ilIlnd) {
        super(IlIlhZ.HANDSHAKE);
        this.IlIlF = n;
        this.IlIlJ = ClientVersion.IlIlw(n);
        this.IlIlt = string;
        this.IlIlB = n2;
        this.IlIlI = ilIlnd;
    }

    @Override
    public void IlIle() {
        long l = b ^ 0x5B691F63A9EFL;
        PacketWrapper[] packetWrapperArray = IlIlJB.IlIlG();
        try {
            this.IlIlF = this.IlIlf();
            this.IlIlJ = ClientVersion.IlIlw(this.IlIlF);
            this.IlIlt = this.IlIlp((int)IlIlJB.b("s", (int)20593, (long)(0x235BBDFE80DDD97L ^ l)));
            this.IlIlB = this.IlIlL();
            int n = this.IlIlf();
            this.IlIlI = IlIlnd.IlIlT(n);
        }
        catch (Exception exception) {
            throw new IlIlit();
        }
        try {
            if (packetWrapperArray != null) {
                PacketWrapper.IlIle(new int[1]);
            }
        }
        catch (Exception exception) {
            throw IlIlJB.a(exception);
        }
    }

    @Override
    public void IlIlJ() {
        long l = b ^ 0x4214628A9747L;
        this.IlIlJ(this.IlIlF);
        this.IlIlm(this.IlIlt, (int)IlIlJB.b("s", (int)9082, (long)(0x71F22EC3CB769035L ^ l)));
        this.IlIlG(this.IlIlB);
        this.IlIlJ(this.IlIlI.IlIlT());
    }

    public void IlIlw(IlIlJB ilIlJB) {
        long l = b ^ 0x6CD527D85F43L;
        this.IlIlF = ilIlJB.IlIlF;
        this.IlIlJ = ilIlJB.IlIlJ;
        this.IlIlt = ilIlJB.IlIlt;
        this.IlIlB = ilIlJB.IlIlB;
        PacketWrapper[] packetWrapperArray = IlIlJB.IlIlG();
        try {
            this.IlIlI = ilIlJB.IlIlI;
            if (PacketWrapper.IlIlz() == null) {
                IlIlJB.IlIlM(new PacketWrapper[5]);
            }
        }
        catch (IlIlit ilIlit) {
            throw IlIlJB.a(ilIlit);
        }
    }

    public int IlIlE() {
        return this.IlIlF;
    }

    public void IlIlA(int n) {
        this.IlIlF = n;
        this.IlIlJ = ClientVersion.IlIlw(n);
    }

    @Override
    public ClientVersion IlIlB() {
        return this.IlIlJ;
    }

    @Override
    public void IlIlm(ClientVersion clientVersion) {
        this.IlIlJ = clientVersion;
        this.IlIlF = clientVersion.IlIlE();
    }

    public String IlIlL() {
        return this.IlIlt;
    }

    public void IlIlx(String string) {
        this.IlIlt = string;
    }

    public int IlIlS() {
        return this.IlIlB;
    }

    public void IlIlY(int n) {
        this.IlIlB = n;
    }

    public IlIlrk IlIlZ() {
        return this.IlIlI.IlIle();
    }

    /*
     * Exception decompiling
     */
    @Deprecated
    public void IlIlJ(IlIlrk var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public IlIlnd IlIlm() {
        return this.IlIlI;
    }

    public void IlIlM(IlIlnd ilIlnd) {
        this.IlIlI = ilIlnd;
    }

    public static void IlIlM(PacketWrapper[] packetWrapperArray) {
        IlIls = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlG() {
        return IlIls;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(-4571636572326091363L, 7323288003146912613L, MethodHandles.lookup().lookupClass()).a(77039227728430L);
        long l = b ^ 0x2CC959EE91C5L;
        IlIlJB.IlIlM(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("\u00b9XD\u0017\u00d6\u00c7\u0019Gw\u00cf\u0098Q$\u0012#\u00ec\u0084\u00d2lB,\u00e7\u00d9K\u00b3q\u00b9\u00151\u00be\u008a\u00eb".getBytes("ISO-8859-1"));
        c = IlIlJB.b(byArray3).intern();
        IlIlJB.l = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00d1m\u00d1+\u0018\u00ad\u00e6\\\u008ey,\u00f282\u000b\u00f4";
        int n2 = "\u00d1m\u00d1+\u0018\u00ad\u00e6\\\u008ey,\u00f282\u000b\u00f4".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        g = lArray;
        h = new Integer[2];
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x96;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])IlIlJB.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    IlIlJB.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlJB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlJB.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlJB.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlJB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlJB.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

