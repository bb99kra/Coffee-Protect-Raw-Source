/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.IlIlGM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.IlIlym;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlAt
implements IlIlGM {
    private IlIlCg IlIlp;
    @Nullable
    private IlIlCg IlIlK;
    private IlIlCg IlIlA;
    private int IlIlV;
    private int IlIlj;
    private int IlIlo;
    private int IlIld;
    private float IlIlL;
    private int IlIlE;
    private static int IlIlc;
    private static final long a;
    private static transient /* synthetic */ String VnnZRObgZj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlAt(IlIlym ilIlym, @Nullable IlIlym ilIlym2, IlIlCg ilIlCg, int n, int n2, int n3, int n4, float f, int n5) {
        long l = a ^ 0x13940EB75B12L;
        this(ilIlym.IlIlr(), ilIlym2 == null ? null : ilIlym2.IlIlr(), ilIlCg, n, n2, n3, n4, f, n5);
    }

    private IlIlAt(IlIlCg ilIlCg, @Nullable IlIlCg ilIlCg2, IlIlCg ilIlCg3, int n, int n2, int n3, int n4, float f, int n5) {
        this.IlIlp = ilIlCg;
        this.IlIlK = ilIlCg2;
        this.IlIlA = ilIlCg3;
        this.IlIlV = n;
        this.IlIlj = n2;
        this.IlIlo = n3;
        this.IlIlL = f;
        this.IlIlE = n5;
        this.IlIld = n4;
    }

    public static IlIlAt IlIlY(IlIlCg ilIlCg, @Nullable IlIlCg ilIlCg2, IlIlCg ilIlCg3, int n, int n2, int n3, int n4, float f, int n5) {
        return new IlIlAt(ilIlCg, ilIlCg2, ilIlCg3, n, n2, n3, n4, f, n5);
    }

    public static IlIlAt IlIlU(IlIlCg ilIlCg, IlIlCg ilIlCg2, int n, int n2, int n3, int n4, float f, int n5) {
        return new IlIlAt(ilIlCg, null, ilIlCg2, n, n2, n3, n4, f, n5);
    }

    public static IlIlAt IlIlZ(IlIlCg ilIlCg, IlIlCg ilIlCg2, int n, int n2, int n3, float f, int n4) {
        return new IlIlAt(ilIlCg, null, ilIlCg2, n, n2, n3, 0, f, n4);
    }

    public static IlIlAt IlIlH(IlIlym ilIlym, @Nullable IlIlym ilIlym2, IlIlCg ilIlCg, int n, int n2, int n3, int n4, float f, int n5) {
        return new IlIlAt(ilIlym, ilIlym2, ilIlCg, n, n2, n3, n4, f, n5);
    }

    public static IlIlAt IlIlf(IlIlym ilIlym, IlIlCg ilIlCg, int n, int n2, int n3, int n4, float f, int n5) {
        return new IlIlAt(ilIlym, null, ilIlCg, n, n2, n3, n4, f, n5);
    }

    public static IlIlAt IlIly(IlIlym ilIlym, IlIlCg ilIlCg, int n, int n2, int n3, float f, int n4) {
        return new IlIlAt(ilIlym, null, ilIlCg, n, n2, n3, 0, f, n4);
    }

    public IlIlym IlIld() {
        return IlIlym.IlIl_(this.IlIlp);
    }

    public void IlIlP(IlIlym ilIlym) {
        this.IlIlp = ilIlym.IlIlr();
    }

    @ApiStatus.Obsolete
    public IlIlCg IlIly() {
        return this.IlIlp;
    }

    @ApiStatus.Obsolete
    public void IlIlm(IlIlCg ilIlCg) {
        this.IlIlp = ilIlCg;
    }

    @Nullable
    public IlIlym IlIl_() {
        return IlIlym.IlIl_(this.IlIlp);
    }

    /*
     * Unable to fully structure code
     */
    public void IlIla(@Nullable IlIlym var1_1) {
        var2_2 = IlIlAt.a ^ 64100208732029L;
        var4_3 = IlIlAt.IlIlo();
        v0 = var1_1;
        if (var4_3 == 0) ** GOTO lbl9
        if (v0 == null) {
            v1 = null;
        } else {
            v0 = var1_1;
lbl9:
            // 2 sources

            v1 = v0.IlIlr();
        }
        this.IlIlK = v1;
    }

    @ApiStatus.Obsolete
    @Nullable
    public IlIlCg IlIlQ() {
        return this.IlIlK;
    }

    @ApiStatus.Obsolete
    public void IlIlS(@Nullable IlIlCg ilIlCg) {
        this.IlIlK = ilIlCg;
    }

    public IlIlCg IlIln() {
        return this.IlIlA;
    }

    public void IlIlM(IlIlCg ilIlCg) {
        this.IlIlA = ilIlCg;
    }

    public int IlIlV() {
        return this.IlIlV;
    }

    public void IlIlK(int n) {
        this.IlIlV = n;
    }

    public int IlIly() {
        return this.IlIlj;
    }

    public void IlIli(int n) {
        this.IlIlj = n;
    }

    public int IlIlc() {
        return this.IlIlo;
    }

    public void IlIlG(int n) {
        this.IlIlo = n;
    }

    public float IlIlR() {
        return this.IlIlL;
    }

    public void IlIlI(float f) {
        this.IlIlL = f;
    }

    public int IlIlg() {
        return this.IlIlE;
    }

    public void IlIlA(int n) {
        this.IlIlE = n;
    }

    public int IlIlW() {
        return this.IlIld;
    }

    public void IlIls(int n) {
        this.IlIld = n;
    }

    public boolean IlIle() {
        long l = a ^ 0xBC49DB23466L;
        int n = IlIlAt.IlIlo();
        int n2 = this.IlIlV;
        if (n != 0) {
            n2 = n2 >= this.IlIlj ? 1 : 0;
        }
        return n2 != 0;
    }

    public static void IlIlP(int n) {
        IlIlc = n;
    }

    public static int IlIlD() {
        return IlIlc;
    }

    public static int IlIlo() {
        int n = IlIlAt.IlIlD();
        if (n == 0) {
            return 61;
        }
        return 0;
    }

    static {
        a = IlIls.a(-924827583952646800L, 5028971903913229508L, MethodHandles.lookup().lookupClass()).a(50498297413127L);
        if (IlIlAt.IlIlD() != 0) {
            IlIlAt.IlIlP(32);
        }
    }
}

