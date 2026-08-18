/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlOI;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlZb;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlis;

public class IlIliw
extends IlIlis {
    private final Callable<Map<String, int[]>> IlIlU;
    private static final long a = IlIls.a(2161330130299528854L, -8628110990753286432L, MethodHandles.lookup().lookupClass()).a(109671068974058L);
    private static final String f;
    private static transient /* synthetic */ String IUtRGNYdzb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIliw(String string, Callable<Map<String, int[]>> callable) {
        super(string);
        this.IlIlU = callable;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected IlIlOI IlIlS() throws Exception {
        int n;
        IlIlZb ilIlZb;
        block18: {
            void var6_6;
            boolean bl;
            int n2;
            Map<String, int[]> map;
            block16: {
                block17: {
                    Map<String, int[]> map2;
                    block15: {
                        long l = a ^ 0x48AAA1C29AF7L;
                        ilIlZb = new IlIlZb();
                        map = this.IlIlU.call();
                        n2 = IlIlis.IlIlq();
                        try {
                            map2 = map;
                            if (n2 == 0) break block15;
                            if (map2 == null) return null;
                        }
                        catch (Exception exception) {
                            throw IlIliw.a(exception);
                        }
                        map2 = map;
                    }
                    try {
                        try {
                            bl = map2.isEmpty();
                            if (n2 == 0) break block16;
                            if (!bl) break block17;
                            return null;
                        }
                        catch (Exception exception) {
                            throw IlIliw.a(exception);
                        }
                    }
                    catch (Exception exception) {
                        throw IlIliw.a(exception);
                    }
                }
                bl = true;
            }
            boolean bl2 = bl;
            for (Map.Entry<String, int[]> entry : map.entrySet()) {
                boolean bl3;
                block19: {
                    block20: {
                        try {
                            try {
                                try {
                                    n = entry.getValue().length;
                                    if (n2 == 0) break block18;
                                    if (n2 == 0) break block19;
                                }
                                catch (Exception exception) {
                                    throw IlIliw.a(exception);
                                }
                                if (n != 0) break block20;
                            }
                            catch (Exception exception) {
                                throw IlIliw.a(exception);
                            }
                            if (n2 != 0) continue;
                        }
                        catch (Exception exception) {
                            throw IlIliw.a(exception);
                        }
                    }
                    bl3 = false;
                }
                var6_6 = bl3;
                ilIlZb.IlIlJ(entry.getKey(), entry.getValue());
                if (n2 != 0) continue;
            }
            n = var6_6;
        }
        try {
            if (n == false) return new IlIlZb().IlIlS(f, ilIlZb.IlIld()).IlIld();
            return null;
        }
        catch (Exception exception) {
            throw IlIliw.a(exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x41D2EEF372B6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d4\u008a\u00bc\u0081!\u00a5\u00cdM".getBytes("ISO-8859-1"));
                f = IlIliw.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
}

