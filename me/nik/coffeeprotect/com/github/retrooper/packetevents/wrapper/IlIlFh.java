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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIli1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlvM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlfn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIliM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlnR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlr6;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlrQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlxu;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlyh;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlFh
extends PacketWrapper<IlIlFh> {
    private String IlIlO;
    private IlIlnR IlIld;
    private Collection<String> IlIlI;
    private Optional<IlIlrQ> IlIls;
    private static PacketWrapper[] IlIlo;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String BnIJPNzmyy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFh(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFh(String string, IlIlnR ilIlnR, @Nullable IlIlrQ ilIlrQ, String ... stringArray) {
        this(string, ilIlnR, ilIlrQ, Arrays.asList(stringArray));
    }

    public IlIlFh(String string, IlIlnR ilIlnR, @Nullable IlIlrQ ilIlrQ, Collection<String> collection) {
        super(IlIlAG.TEAMS);
        this.IlIlO = string;
        this.IlIld = ilIlnR;
        this.IlIlI = collection;
        this.IlIls = Optional.ofNullable(ilIlrQ);
    }

    @Deprecated
    public IlIlFh(String string, IlIlnR ilIlnR, Optional<IlIlrQ> optional, String ... stringArray) {
        this(string, ilIlnR, optional, Arrays.asList(stringArray));
    }

    @Deprecated
    public IlIlFh(String string, IlIlnR ilIlnR, Optional<IlIlrQ> optional, Collection<String> collection) {
        super(IlIlAG.TEAMS);
        this.IlIlO = string;
        this.IlIld = ilIlnR;
        this.IlIlI = collection;
        this.IlIls = optional;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void IlIle() {
        block30: {
            block33: {
                block31: {
                    block32: {
                        block28: {
                            block29: {
                                block18: {
                                    block23: {
                                        block19: {
                                            block20: {
                                                block26: {
                                                    block27: {
                                                        block25: {
                                                            block24: {
                                                                block21: {
                                                                    block22: {
                                                                        block17: {
                                                                            block16: {
                                                                                var1_1 = IlIlFh.b ^ 37809191993783L;
                                                                                var3_2 = IlIlFh.IlIla();
                                                                                v0 /* !! */  = this.IlIlg.IlIlz(ServerVersion.V_1_18);
                                                                                if (var3_2 != null) {
                                                                                    v0 /* !! */  = (int)(v0 /* !! */  != 0 ? IlIlFh.b("c", (int)5546, (long)(5774869967096962088L ^ var1_1)) : IlIlFh.b("c", (int)16688, (long)(8009287436402821302L ^ var1_1)));
                                                                                }
                                                                                var4_3 = v0 /* !! */ ;
                                                                                this.IlIlO = this.IlIlp(var4_3);
                                                                                this.IlIld = IlIlnR.values()[this.IlIlE()];
                                                                                var5_4 = null;
                                                                                v1 = this.IlIld;
                                                                                v2 = IlIlnR.CREATE;
                                                                                if (var3_2 == null) break block16;
                                                                                if (v1 == v2) break block17;
                                                                                v1 = this.IlIld;
                                                                                v2 = IlIlnR.UPDATE;
                                                                            }
                                                                            if (v1 != v2) break block18;
                                                                        }
                                                                        var11_5 = null;
                                                                        v3 = this;
                                                                        if (var3_2 == null) break block19;
                                                                        if (!v3.IlIlg.IlIlS(ServerVersion.V_1_12_2)) break block20;
                                                                        var13_6 = this.IlIlq().IlIlg();
                                                                        var6_7 = var13_6.IlIlL(this.IlIlp((int)IlIlFh.b("c", (int)3567, (long)(1250070929817748591L ^ var1_1))));
                                                                        var7_9 /* !! */  = var13_6.IlIlL(this.IlIlp((int)IlIlFh.b("c", (int)16688, (long)(8009287436402821302L ^ var1_1))));
                                                                        var8_11 = var13_6.IlIlL(this.IlIlp((int)IlIlFh.b("c", (int)16688, (long)(8009287436402821302L ^ var1_1))));
                                                                        var9_12 = IlIlfn.values()[this.IlIlE()];
                                                                        v4 = this;
                                                                        if (var3_2 == null) break block21;
                                                                        if (!v4.IlIlg.IlIlS(ServerVersion.V_1_7_10)) break block22;
                                                                        var10_13 = IlIlr6.ALWAYS;
                                                                        var12_14 = IlIlxu.IlIlu;
                                                                        if (var3_2 != null) break block23;
                                                                    }
                                                                    v4 = this;
                                                                }
                                                                var10_13 = IlIlr6.IlIlE(v4.IlIlp((int)IlIlFh.b("c", (int)3567, (long)(1250070929817748591L ^ var1_1))));
                                                                v5 = this;
                                                                if (var3_2 == null) break block24;
                                                                if (!v5.IlIlg.IlIlz(ServerVersion.V_1_9)) break block25;
                                                                v5 = this;
                                                            }
                                                            var11_5 = IlIliM.IlIlj(v5.IlIlp((int)IlIlFh.b("c", (int)3567, (long)(1250070929817748591L ^ var1_1))));
                                                        }
                                                        v6 = this.IlIlg.IlIlz(ServerVersion.V_1_17);
                                                        if (var3_2 == null) break block26;
                                                        if (v6 == 0) break block27;
                                                        v7 = var14_15 = this.IlIlf();
                                                        if (var3_2 != null) {
                                                            if (v7 == IlIlFh.b("c", (int)5570, (long)(5571620542415985733L ^ var1_1))) {
                                                                var14_15 = -1;
                                                            }
                                                            v7 = var14_15;
                                                        }
                                                        var12_14 = IlIli1.IlIlt(v7);
                                                        if (var3_2 != null) break block23;
                                                    }
                                                    v6 = this.IlIlE();
                                                }
                                                var12_14 = IlIli1.IlIlt(v6);
                                                break block23;
                                            }
                                            v3 = this;
                                        }
                                        var6_7 = v3.IlIlJ();
                                        var9_12 = IlIlfn.IlIlY(this.IlIlE());
                                        v8 = this;
                                        if (var3_2 == null) ** GOTO lbl73
                                        if (v8.IlIlg.IlIlz(ServerVersion.V_1_21_5)) {
                                            var10_13 = this.IlIly(IlIlr6.class);
                                            var11_5 = this.IlIly(IlIliM.class);
                                        } else {
                                            v8 = this;
lbl73:
                                            // 2 sources

                                            var10_13 = IlIlr6.IlIlE(v8.IlIlp((int)IlIlFh.b("c", (int)11835, (long)(2260197621014489023L ^ var1_1))));
                                            var11_5 = IlIliM.IlIlj(this.IlIlp((int)IlIlFh.b("c", (int)11835, (long)(2260197621014489023L ^ var1_1))));
                                        }
                                        var12_14 = IlIli1.IlIlt(this.IlIlE());
                                        var7_9 /* !! */  = this.IlIlJ();
                                        var8_11 = this.IlIlJ();
                                    }
                                    var5_4 = new IlIlrQ(var6_7, var7_9 /* !! */ , var8_11, var10_13, var11_5 == null ? IlIliM.ALWAYS : var11_5, var12_14, var9_12);
                                }
                                this.IlIls = Optional.ofNullable(var5_4);
                                this.IlIlI = new ArrayList<String>();
                                v9 = this;
                                if (var3_2 == null) break block28;
                                if (v9.IlIld == IlIlnR.CREATE) break block29;
                                v9 = this;
                                if (var3_2 == null) break block28;
                                if (v9.IlIld == IlIlnR.ADD_ENTITIES) break block29;
                                v9 = this;
                                if (var3_2 == null) break block28;
                                if (v9.IlIld != IlIlnR.REMOVE_ENTITIES) break block30;
                            }
                            v9 = this;
                        }
                        v10 = v9.IlIlg.IlIlS(ServerVersion.V_1_7_10);
                        if (var3_2 == null) break block31;
                        if (v10 == 0) break block32;
                        var6_8 = this.IlIlG();
                        if (var3_2 != null) break block33;
                    }
                    v10 = this.IlIlf();
                }
                var6_8 = v10;
            }
            for (var7_10 = 0; var7_10 < var6_8; ++var7_10) {
                this.IlIlI.add(this.IlIlp((int)IlIlFh.b("c", (int)11835, (long)(2260197621014489023L ^ var1_1))));
                if (var3_2 != null) continue;
            }
        }
    }

    @Override
    public void IlIlJ() {
        block35: {
            PacketWrapper[] packetWrapperArray;
            long l;
            block38: {
                IlIlFh ilIlFh;
                block36: {
                    block37: {
                        block33: {
                            block34: {
                                IlIlnR ilIlnR;
                                IlIlnR ilIlnR2;
                                block19: {
                                    block20: {
                                        IlIlrQ ilIlrQ;
                                        block32: {
                                            IlIlFh ilIlFh2;
                                            block30: {
                                                block31: {
                                                    block29: {
                                                        IlIlFh ilIlFh3;
                                                        block27: {
                                                            block28: {
                                                                boolean bl;
                                                                block21: {
                                                                    block22: {
                                                                        block25: {
                                                                            IlIlFh ilIlFh4;
                                                                            block26: {
                                                                                boolean bl2;
                                                                                block23: {
                                                                                    block24: {
                                                                                        Object object;
                                                                                        block17: {
                                                                                            block18: {
                                                                                                l = b ^ 0x3B1E5E9C7F1FL;
                                                                                                packetWrapperArray = IlIlFh.IlIla();
                                                                                                Object object2 = this.IlIlg.IlIlz(ServerVersion.V_1_18);
                                                                                                if (packetWrapperArray != null) {
                                                                                                    object2 = object2 != 0 ? IlIlFh.b("c", (int)321, (long)(0x2407527430427661L ^ l)) : IlIlFh.b("c", (int)16581, (long)(0x28E542AF8007B7ECL ^ l));
                                                                                                }
                                                                                                int n = object2;
                                                                                                this.IlIlm(this.IlIlO, n);
                                                                                                this.IlIlu(this.IlIld.ordinal());
                                                                                                object = this.IlIld;
                                                                                                if (packetWrapperArray == null) break block17;
                                                                                                if (object == IlIlnR.CREATE) break block18;
                                                                                                ilIlnR2 = this.IlIld;
                                                                                                ilIlnR = IlIlnR.UPDATE;
                                                                                                if (packetWrapperArray == null) break block19;
                                                                                                if (ilIlnR2 != ilIlnR) break block20;
                                                                                            }
                                                                                            object = this.IlIls.orElse(new IlIlrQ(Component.empty(), Component.empty(), Component.empty(), IlIlr6.ALWAYS, IlIliM.ALWAYS, IlIlxu.IlIlu, IlIlfn.NONE));
                                                                                        }
                                                                                        ilIlrQ = (IlIlrQ)object;
                                                                                        bl = this.IlIlg.IlIlS(ServerVersion.V_1_12_2);
                                                                                        if (packetWrapperArray == null) break block21;
                                                                                        if (!bl) break block22;
                                                                                        IlIlyh object3 = this.IlIlq().IlIlg();
                                                                                        this.IlIlM(IlIlvM.IlIlQ(object3.IlIl_(IlIlrQ.IlIlZ(ilIlrQ)), (int)IlIlFh.b("c", (int)31388, (long)(0x7B4F712EF1758DBEL ^ l))));
                                                                                        this.IlIlM(IlIlvM.IlIlQ(object3.IlIl_(IlIlrQ.IlIlg(ilIlrQ)), (int)IlIlFh.b("c", (int)16688, (long)(0x6F26AD007B23361EL ^ l))));
                                                                                        this.IlIlM(IlIlvM.IlIlQ(object3.IlIl_(IlIlrQ.IlIld(ilIlrQ)), (int)IlIlFh.b("c", (int)16688, (long)(0x6F26AD007B23361EL ^ l))));
                                                                                        this.IlIlu(IlIlrQ.IlIlG(ilIlrQ).ordinal());
                                                                                        bl2 = this.IlIlg.IlIlS(ServerVersion.V_1_7_10);
                                                                                        if (packetWrapperArray == null) break block23;
                                                                                        if (!bl2) break block24;
                                                                                        this.IlIlm(IlIlr6.ALWAYS.IlIlA(), (int)IlIlFh.b("c", (int)3567, (long)(0x11593D9E4E3D7AC7L ^ l)));
                                                                                        this.IlIlu((int)IlIlFh.b("c", (int)18277, (long)(0x49C7B7462F6A304EL ^ l)));
                                                                                        if (packetWrapperArray != null) break block25;
                                                                                    }
                                                                                    this.IlIlm(IlIlr6.IlIlG(IlIlrQ.IlIlT(ilIlrQ)), (int)IlIlFh.b("c", (int)3567, (long)(0x11593D9E4E3D7AC7L ^ l)));
                                                                                    ilIlFh4 = this;
                                                                                    if (packetWrapperArray == null) break block26;
                                                                                    bl2 = ilIlFh4.IlIlg.IlIlz(ServerVersion.V_1_9);
                                                                                }
                                                                                if (bl2) {
                                                                                    this.IlIlm(IlIlrQ.IlIlO(ilIlrQ).IlIlV(), (int)IlIlFh.b("c", (int)3567, (long)(0x11593D9E4E3D7AC7L ^ l)));
                                                                                }
                                                                                ilIlFh4 = this;
                                                                            }
                                                                            ilIlFh4.IlIlu(IlIli1.IlIla(IlIlrQ.IlIlt(ilIlrQ)));
                                                                        }
                                                                        if (packetWrapperArray != null) break block20;
                                                                    }
                                                                    this.IlIlz(IlIlrQ.IlIlZ(ilIlrQ));
                                                                    this.IlIlu(IlIlrQ.IlIlG(ilIlrQ).IlIlH());
                                                                    ilIlFh3 = this;
                                                                    if (packetWrapperArray == null) break block27;
                                                                    bl = ilIlFh3.IlIlg.IlIlz(ServerVersion.V_1_21_5);
                                                                }
                                                                if (!bl) break block28;
                                                                this.IlIlw(IlIlrQ.IlIlT(ilIlrQ));
                                                                this.IlIlw(IlIlrQ.IlIlO(ilIlrQ));
                                                                if (packetWrapperArray != null) break block29;
                                                            }
                                                            this.IlIlM(IlIlr6.IlIlG(IlIlrQ.IlIlT(ilIlrQ)));
                                                            ilIlFh3 = this;
                                                        }
                                                        ilIlFh3.IlIlM(IlIlrQ.IlIlO(ilIlrQ).IlIlV());
                                                    }
                                                    ilIlFh2 = this;
                                                    if (packetWrapperArray == null) break block30;
                                                    if (!ilIlFh2.IlIlg.IlIlz(ServerVersion.V_1_17)) break block31;
                                                    int object = IlIli1.IlIla(IlIlrQ.IlIlt(ilIlrQ));
                                                    if (packetWrapperArray != null) {
                                                        CallSite callSite;
                                                        if (object < 0) {
                                                            callSite = IlIlFh.b("c", (int)28513, (long)(0x72EF75F8D5DB9842L ^ l));
                                                        }
                                                        this.IlIlJ((int)callSite);
                                                    }
                                                    if (packetWrapperArray != null) break block32;
                                                }
                                                ilIlFh2 = this;
                                            }
                                            ilIlFh2.IlIlu(IlIli1.IlIla(IlIlrQ.IlIlt(ilIlrQ)));
                                        }
                                        this.IlIlz(IlIlrQ.IlIlg(ilIlrQ));
                                        this.IlIlz(IlIlrQ.IlIld(ilIlrQ));
                                    }
                                    ilIlFh = this;
                                    if (packetWrapperArray == null) break block33;
                                    ilIlnR2 = ilIlFh.IlIld;
                                    ilIlnR = IlIlnR.CREATE;
                                }
                                if (ilIlnR2 == ilIlnR) break block34;
                                ilIlFh = this;
                                if (packetWrapperArray == null) break block33;
                                if (ilIlFh.IlIld == IlIlnR.ADD_ENTITIES) break block34;
                                ilIlFh = this;
                                if (packetWrapperArray == null) break block33;
                                if (ilIlFh.IlIld != IlIlnR.REMOVE_ENTITIES) break block35;
                            }
                            ilIlFh = this;
                        }
                        if (packetWrapperArray == null) break block36;
                        if (!ilIlFh.IlIlg.IlIlS(ServerVersion.V_1_7_10)) break block37;
                        this.IlIlG(this.IlIlI.size());
                        if (packetWrapperArray != null) break block38;
                    }
                    ilIlFh = this;
                }
                ilIlFh.IlIlJ(this.IlIlI.size());
            }
            for (String string : this.IlIlI) {
                this.IlIlm(string, (int)IlIlFh.b("c", (int)13617, (long)(0x6A97FDEA6C55C21CL ^ l)));
                if (packetWrapperArray != null) continue;
            }
        }
    }

    public void IlIlu(IlIlFh ilIlFh) {
        this.IlIlO = ilIlFh.IlIlO;
        this.IlIld = ilIlFh.IlIld;
        this.IlIlI = ilIlFh.IlIlI;
        this.IlIls = ilIlFh.IlIls;
    }

    public String IlIlT() {
        return this.IlIlO;
    }

    public void IlIl_(String string) {
        this.IlIlO = string;
    }

    public IlIlnR IlIli() {
        return this.IlIld;
    }

    public void IlIly(IlIlnR ilIlnR) {
        this.IlIld = ilIlnR;
    }

    public Collection<String> IlIly() {
        return this.IlIlI;
    }

    public void IlIlb(Collection<String> collection) {
        this.IlIlI = collection;
    }

    public Optional<IlIlrQ> IlIlA() {
        return this.IlIls;
    }

    public void IlIlj(@Nullable IlIlrQ ilIlrQ) {
        this.IlIls = Optional.ofNullable(ilIlrQ);
    }

    public static void IlIlp(PacketWrapper[] packetWrapperArray) {
        IlIlo = packetWrapperArray;
    }

    public static PacketWrapper[] IlIla() {
        return IlIlo;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                IlIlFh.b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(4941401830582818165L, 7646855958711990797L, MethodHandles.lookup().lookupClass()).a(217269000151288L);
                IlIlFh.h = new HashMap<K, V>(13);
                IlIlFh.IlIlp(new PacketWrapper[1]);
                var0 = IlIlFh.b ^ 91693549970163L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u0087\u00bc4o\u00fb\u00fco\u001e\u00e5\u0005\u007f\u00a0\u0085K\u001fSr\u00c9\u008a\u00148\u007fOOm\u00cfCs\u00f5\u00bf\u00d31\u00d2(\u001cW*\u00e1\u00da\u00c3c%\u00f7\u0010\u001d\u00c1\u00a58n\u00f6\u00e0\u00fc\u008eY\u00b5\u0002\u00cd\u00f3=\u001b\u0099v\u00a1Dr\u0011N>\u00c3d]\u001e";
                var7_6 = "\u0087\u00bc4o\u00fb\u00fco\u001e\u00e5\u0005\u007f\u00a0\u0085K\u001fSr\u00c9\u008a\u00148\u007fOOm\u00cfCs\u00f5\u00bf\u00d31\u00d2(\u001cW*\u00e1\u00da\u00c3c%\u00f7\u0010\u001d\u00c1\u00a58n\u00f6\u00e0\u00fc\u008eY\u00b5\u0002\u00cd\u00f3=\u001b\u0099v\u00a1Dr\u0011N>\u00c3d]\u001e".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00c07{WZ\u00cd\u00d1\u00e2\u00f9\u00db\u009c`1F]\t";
                    var7_6 = "\u00c07{WZ\u00cd\u00d1\u00e2\u00f9\u00db\u009c`1F]\t".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
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
        IlIlFh.c = var8_3;
        IlIlFh.g = new Integer[11];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x44F2;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlFh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlFh.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlFh.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlFh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlFh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

