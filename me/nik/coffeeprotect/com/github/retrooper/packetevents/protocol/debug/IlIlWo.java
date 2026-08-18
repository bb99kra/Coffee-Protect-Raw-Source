/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.IlIlnF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIlWo {
    private final String IlIlr;
    private final String IlIlJ;
    private final int IlIlw;
    private final float IlIli;
    private final float IlIlD;
    private final String IlIlc;
    private final boolean IlIlq;
    private final int IlIlO;
    private final List<String> IlIlB;
    private final List<String> IlIlG;
    private final List<String> IlIlT;
    private final List<String> IlIll;
    private final Set<IlIlAn> IlIlo;
    private final Set<IlIlAn> IlIlt;
    private static final long a = IlIls.a(-7188995404470769055L, -6889618208757723628L, MethodHandles.lookup().lookupClass()).a(231404088302461L);
    private static transient /* synthetic */ String SmZrHVvGwm = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlWo(String string, String string2, int n, float f, float f2, String string3, boolean bl, int n2, List<String> list, List<String> list2, List<String> list3, List<String> list4, Set<IlIlAn> set, Set<IlIlAn> set2) {
        this.IlIlr = string;
        this.IlIlJ = string2;
        this.IlIlw = n;
        this.IlIli = f;
        this.IlIlD = f2;
        this.IlIlc = string3;
        this.IlIlq = bl;
        this.IlIlO = n2;
        this.IlIlB = list;
        this.IlIlG = list2;
        this.IlIlT = list3;
        this.IlIll = list4;
        this.IlIlo = set;
        this.IlIlt = set2;
    }

    public static IlIlWo IlIle(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x42C5D8A65D9EL;
        String string = packetWrapper.IlIli();
        String string2 = packetWrapper.IlIli();
        int n = packetWrapper.IlIlW();
        PacketWrapper[] packetWrapperArray = IlIlnF.IlIlb();
        float f = packetWrapper.IlIlX();
        float f2 = packetWrapper.IlIlX();
        String string3 = packetWrapper.IlIli();
        boolean bl = packetWrapper.IlIlK();
        int n2 = packetWrapper.IlIlW();
        List<String> list = packetWrapper.IlIll(PacketWrapper::IlIli);
        List<String> list2 = packetWrapper.IlIll(PacketWrapper::IlIli);
        List<String> list3 = packetWrapper.IlIll(PacketWrapper::IlIli);
        List<String> list4 = packetWrapper.IlIll(PacketWrapper::IlIli);
        Set<IlIlAn> set = packetWrapper.IlIlI(PacketWrapper::IlIlE);
        Set<IlIlAn> set2 = packetWrapper.IlIlI(PacketWrapper::IlIlE);
        IlIlWo ilIlWo = new IlIlWo(string, string2, n, f, f2, string3, bl, n2, list, list2, list3, list4, set, set2);
        if (packetWrapperArray == null) {
            PacketWrapper.IlIle(new int[4]);
        }
        return ilIlWo;
    }

    public static void IlIlK(PacketWrapper<?> packetWrapper, IlIlWo ilIlWo) {
        long l = a ^ 0x1BD5B67101E3L;
        packetWrapper.IlIlM(ilIlWo.IlIlr);
        packetWrapper.IlIlM(ilIlWo.IlIlJ);
        PacketWrapper[] packetWrapperArray = IlIlnF.IlIlb();
        packetWrapper.IlIla(ilIlWo.IlIlw);
        packetWrapper.IlIlR(ilIlWo.IlIli);
        packetWrapper.IlIlR(ilIlWo.IlIlD);
        packetWrapper.IlIlM(ilIlWo.IlIlc);
        packetWrapper.IlIla(ilIlWo.IlIlq);
        packetWrapper.IlIla(ilIlWo.IlIlO);
        packetWrapper.IlIlQ(ilIlWo.IlIlB, PacketWrapper::IlIlM);
        packetWrapper.IlIlQ(ilIlWo.IlIlG, PacketWrapper::IlIlM);
        packetWrapper.IlIlQ(ilIlWo.IlIlT, PacketWrapper::IlIlM);
        packetWrapper.IlIlQ(ilIlWo.IlIll, PacketWrapper::IlIlM);
        PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
        packetWrapper.IlIlZ(ilIlWo.IlIlo, PacketWrapper::IlIlh);
        packetWrapper.IlIlZ(ilIlWo.IlIlt, PacketWrapper::IlIlh);
        if (PacketWrapper.IlIlz() == null) {
            IlIlnF.IlIlF(new PacketWrapper[1]);
        }
    }

    public String IlIlC() {
        return this.IlIlr;
    }

    public String IlIlo() {
        return this.IlIlJ;
    }

    public int IlIlt() {
        return this.IlIlw;
    }

    public float IlIlu() {
        return this.IlIli;
    }

    public float IlIlg() {
        return this.IlIlD;
    }

    public String IlIlF() {
        return this.IlIlc;
    }

    public boolean IlIlU() {
        return this.IlIlq;
    }

    public int IlIlG() {
        return this.IlIlO;
    }

    public List<String> IlIlU() {
        return this.IlIlB;
    }

    public List<String> IlIlH() {
        return this.IlIlG;
    }

    public List<String> IlIlC() {
        return this.IlIlT;
    }

    public List<String> IlIln() {
        return this.IlIll;
    }

    public Set<IlIlAn> IlIlM() {
        return this.IlIlo;
    }

    public Set<IlIlAn> IlIlN() {
        return this.IlIlt;
    }
}

