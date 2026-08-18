/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public class IlIlqI {
    public static final IlIlqI IlIlI;
    private final List<IlIlxI> IlIlm;
    private static int IlIlR;
    private static final long a;
    private static final long b;
    private static transient /* synthetic */ String azKAWaKvbq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlqI(List<IlIlxI> list) {
        this.IlIlm = list;
    }

    public void IlIlc(DataOutput dataOutput) throws IOException {
        long l = a ^ 0xE6F1BB92643L;
        Iterator<IlIlxI> iterator = this.IlIlm.iterator();
        int n = IlIlqI.IlIlY();
        while (iterator.hasNext()) {
            IlIlxI ilIlxI = iterator.next();
            UUID uUID = ilIlxI.IlIlk();
            byte[] byArray = ilIlxI.IlIlm();
            dataOutput.writeByte((int)b);
            dataOutput.writeLong(uUID.getMostSignificantBits());
            dataOutput.writeLong(uUID.getLeastSignificantBits());
            dataOutput.write(byArray);
            if (n != 0) continue;
        }
    }

    public List<IlIlxI> IlIlt() {
        return this.IlIlm;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a(6748635544533956957L, 6737095129603059940L, MethodHandles.lookup().lookupClass()).a(196613580681299L);
        long l = a ^ 0x67418E0AC726L;
        IlIlqI.IlIle(56);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -8482857669694338611L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                IlIlI = new IlIlqI(new ArrayList<IlIlxI>());
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static void IlIle(int n) {
        IlIlR = n;
    }

    public static int IlIlY() {
        return IlIlR;
    }

    public static int IlIlQ() {
        int n = IlIlqI.IlIlY();
        if (n == 0) {
            return 94;
        }
        return 0;
    }
}

