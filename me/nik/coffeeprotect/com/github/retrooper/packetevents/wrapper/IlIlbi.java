/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.UnpooledByteBufAllocationHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlGa;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlLA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlPj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlQF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlTL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlTy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlX1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlXH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlZq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlh7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlig;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlje;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIloA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlOw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlQ9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbi
extends PacketWrapper<IlIlbi> {
    private static IlIloA IlIlb;
    private static IlIlCR IlIlx;
    private static IlIlQF IlIlQ;
    private static IlIlX1 IlIln;
    private static IlIlje IlIls;
    private IlIlPj IlIlc;
    private IlIlLA IlIlJ;
    private boolean IlIld;
    private static final long b;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static transient /* synthetic */ String rpRJRZtCla = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbi(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbi(IlIlPj ilIlPj) {
        this(ilIlPj, null, false);
    }

    public IlIlbi(IlIlPj ilIlPj, IlIlLA ilIlLA) {
        this(ilIlPj, ilIlLA, false);
    }

    public IlIlbi(IlIlPj ilIlPj, IlIlLA ilIlLA, boolean bl) {
        super(IlIlAG.CHUNK_DATA);
        this.IlIlc = ilIlPj;
        this.IlIlJ = ilIlLA;
        this.IlIld = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void IlIle() {
        block229: {
            block225: {
                block226: {
                    block224: {
                        block223: {
                            block222: {
                                block221: {
                                    block220: {
                                        block218: {
                                            block219: {
                                                block214: {
                                                    block215: {
                                                        block213: {
                                                            block202: {
                                                                block201: {
                                                                    block196: {
                                                                        block199: {
                                                                            block197: {
                                                                                block200: {
                                                                                    block198: {
                                                                                        block251: {
                                                                                            block250: {
                                                                                                block249: {
                                                                                                    block248: {
                                                                                                        block195: {
                                                                                                            block194: {
                                                                                                                block193: {
                                                                                                                    block192: {
                                                                                                                        block246: {
                                                                                                                            block190: {
                                                                                                                                block191: {
                                                                                                                                    block189: {
                                                                                                                                        block187: {
                                                                                                                                            block188: {
                                                                                                                                                block243: {
                                                                                                                                                    block186: {
                                                                                                                                                        block185: {
                                                                                                                                                            block184: {
                                                                                                                                                                block182: {
                                                                                                                                                                    block183: {
                                                                                                                                                                        block181: {
                                                                                                                                                                            block180: {
                                                                                                                                                                                block179: {
                                                                                                                                                                                    block178: {
                                                                                                                                                                                        block239: {
                                                                                                                                                                                            block177: {
                                                                                                                                                                                                block175: {
                                                                                                                                                                                                    block176: {
                                                                                                                                                                                                        block173: {
                                                                                                                                                                                                            block174: {
                                                                                                                                                                                                                block172: {
                                                                                                                                                                                                                    block236: {
                                                                                                                                                                                                                        block237: {
                                                                                                                                                                                                                            block170: {
                                                                                                                                                                                                                                block171: {
                                                                                                                                                                                                                                    block233: {
                                                                                                                                                                                                                                        block234: {
                                                                                                                                                                                                                                            var1_1 = IlIlbi.b ^ 104784521568750L;
                                                                                                                                                                                                                                            var4_2 = this.IlIlW();
                                                                                                                                                                                                                                            var5_3 = this.IlIlW();
                                                                                                                                                                                                                                            var3_4 = IlIlFh.IlIla();
                                                                                                                                                                                                                                            var6_5 = this.IlIlg.IlIlC(ServerVersion.V_1_17);
                                                                                                                                                                                                                                            v0 = var6_5;
                                                                                                                                                                                                                                            if (var3_4 == null) break block170;
                                                                                                                                                                                                                                            if (!v0) break block233;
                                                                                                                                                                                                                                            break block234;
                                                                                                                                                                                                                                            catch (RuntimeException v1) {
                                                                                                                                                                                                                                                throw IlIlbi.a(v1);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            block235: {
                                                                                                                                                                                                                                                v0 = this.IlIlK();
                                                                                                                                                                                                                                                if (var3_4 == null) break block170;
                                                                                                                                                                                                                                                break block235;
                                                                                                                                                                                                                                                catch (RuntimeException v2) {
                                                                                                                                                                                                                                                    throw IlIlbi.a(v2);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (!v0) break block171;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (RuntimeException v3) {
                                                                                                                                                                                                                                            throw IlIlbi.a(v3);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v0 = true;
                                                                                                                                                                                                                                    break block170;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                v0 = false;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var7_6 = v0;
                                                                                                                                                                                                                            v4 = this;
                                                                                                                                                                                                                            if (var3_4 == null) break block172;
                                                                                                                                                                                                                            if (v4.IlIlg == ServerVersion.V_1_16) break block236;
                                                                                                                                                                                                                            break block237;
                                                                                                                                                                                                                            catch (RuntimeException v5) {
                                                                                                                                                                                                                                throw IlIlbi.a(v5);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            block238: {
                                                                                                                                                                                                                                v6 = this.IlIlg;
                                                                                                                                                                                                                                v7 = ServerVersion.V_1_16_1;
                                                                                                                                                                                                                                if (var3_4 == null) break block173;
                                                                                                                                                                                                                                break block238;
                                                                                                                                                                                                                                catch (RuntimeException v8) {
                                                                                                                                                                                                                                    throw IlIlbi.a(v8);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (v6 != v7) break block174;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (RuntimeException v9) {
                                                                                                                                                                                                                            throw IlIlbi.a(v9);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v4 = this;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v4.IlIld = this.IlIlK();
                                                                                                                                                                                                            }
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                v10 = this;
                                                                                                                                                                                                                if (var3_4 == null) break block175;
                                                                                                                                                                                                                v6 = v10.IlIlg;
                                                                                                                                                                                                                v7 = ServerVersion.V_1_18;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (RuntimeException v11) {
                                                                                                                                                                                                                throw IlIlbi.a(v11);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            if (!v6.IlIlz(v7)) break block176;
                                                                                                                                                                                                            v12 = null;
                                                                                                                                                                                                            break block177;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (RuntimeException v13) {
                                                                                                                                                                                                            throw IlIlbi.a(v13);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v10 = this;
                                                                                                                                                                                                }
                                                                                                                                                                                                v12 = IlIlGa.IlIlO(v10);
                                                                                                                                                                                            }
                                                                                                                                                                                            var8_7 = v12;
                                                                                                                                                                                            var9_8 = this.IlIlg.IlIlz(ServerVersion.V_1_14);
                                                                                                                                                                                            var10_9 = null;
                                                                                                                                                                                            var11_10 = null;
                                                                                                                                                                                            v14 = var9_8;
                                                                                                                                                                                            if (var3_4 == null) break block178;
                                                                                                                                                                                            if (!v14) break block179;
                                                                                                                                                                                            break block239;
                                                                                                                                                                                            catch (RuntimeException v15) {
                                                                                                                                                                                                throw IlIlbi.a(v15);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            block240: {
                                                                                                                                                                                                v16 = this;
                                                                                                                                                                                                if (var3_4 == null) ** GOTO lbl108
                                                                                                                                                                                                break block240;
                                                                                                                                                                                                catch (RuntimeException v17) {
                                                                                                                                                                                                    throw IlIlbi.a(v17);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            v14 = v16.IlIlg.IlIlz(ServerVersion.V_1_21_5);
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (RuntimeException v18) {
                                                                                                                                                                                            throw IlIlbi.a(v18);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v14) {
                                                                                                                                                                                        var11_10 = this.IlIlc((IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlC(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlrw;)(), (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlJ(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)[J)());
                                                                                                                                                                                    } else {
                                                                                                                                                                                        v16 = this;
lbl108:
                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                        var10_9 = v16.IlIlS();
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var12_11 = null;
                                                                                                                                                                                v19 = this;
                                                                                                                                                                                if (var3_4 == null) break block180;
                                                                                                                                                                                try {
                                                                                                                                                                                    block241: {
                                                                                                                                                                                        if (!v19.IlIlg.IlIlS(ServerVersion.V_1_7_10)) break block181;
                                                                                                                                                                                        break block241;
                                                                                                                                                                                        catch (RuntimeException v20) {
                                                                                                                                                                                            throw IlIlbi.a(v20);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v19 = this;
                                                                                                                                                                                }
                                                                                                                                                                                catch (RuntimeException v21) {
                                                                                                                                                                                    throw IlIlbi.a(v21);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            var12_11 = IlIlGa.IlIlO(v19);
                                                                                                                                                                        }
                                                                                                                                                                        var13_12 /* !! */  = IlIlbi.d("y", (int)28520, (long)(83527587157575410L ^ var1_1));
                                                                                                                                                                        try {
                                                                                                                                                                            v22 = this.IlIlg.IlIlz(ServerVersion.V_1_17);
                                                                                                                                                                            if (var3_4 == null) break block182;
                                                                                                                                                                            if (v22 == 0) break block183;
                                                                                                                                                                        }
                                                                                                                                                                        catch (RuntimeException v23) {
                                                                                                                                                                            throw IlIlbi.a(v23);
                                                                                                                                                                        }
                                                                                                                                                                        var13_12 /* !! */  = (CallSite)(this.IlIlW.IlIlQ() >> 4);
                                                                                                                                                                    }
                                                                                                                                                                    v22 = var7_6;
                                                                                                                                                                }
                                                                                                                                                                if (var3_4 == null) break block184;
                                                                                                                                                                try {
                                                                                                                                                                    block242: {
                                                                                                                                                                        if (v22 == 0) break block185;
                                                                                                                                                                        break block242;
                                                                                                                                                                        catch (RuntimeException v24) {
                                                                                                                                                                            throw IlIlbi.a(v24);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v22 = this.IlIlg.IlIlC(ServerVersion.V_1_18);
                                                                                                                                                                }
                                                                                                                                                                catch (RuntimeException v25) {
                                                                                                                                                                    throw IlIlbi.a(v25);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                if (var3_4 == null) break block186;
                                                                                                                                                                if (v22 == 0) break block185;
                                                                                                                                                            }
                                                                                                                                                            catch (RuntimeException v26) {
                                                                                                                                                                throw IlIlbi.a(v26);
                                                                                                                                                            }
                                                                                                                                                            v22 = 1;
                                                                                                                                                            break block186;
                                                                                                                                                        }
                                                                                                                                                        v22 = 0;
                                                                                                                                                    }
                                                                                                                                                    var14_13 = v22;
                                                                                                                                                    var15_14 = this.IlIlg.IlIlC(ServerVersion.V_1_13);
                                                                                                                                                    var16_15 = null;
                                                                                                                                                    var17_16 = null;
                                                                                                                                                    v27 /* !! */  = var14_13;
                                                                                                                                                    if (var3_4 == null) break block187;
                                                                                                                                                    if (v27 /* !! */  == 0) break block188;
                                                                                                                                                    break block243;
                                                                                                                                                    catch (RuntimeException v28) {
                                                                                                                                                        throw IlIlbi.a(v28);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    block244: {
                                                                                                                                                        v27 /* !! */  = (int)this.IlIlg.IlIlz(ServerVersion.V_1_16_2);
                                                                                                                                                        if (var3_4 == null) break block187;
                                                                                                                                                        break block244;
                                                                                                                                                        catch (RuntimeException v29) {
                                                                                                                                                            throw IlIlbi.a(v29);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (v27 /* !! */  == 0) break block188;
                                                                                                                                                }
                                                                                                                                                catch (RuntimeException v30) {
                                                                                                                                                    throw IlIlbi.a(v30);
                                                                                                                                                }
                                                                                                                                                var16_15 = this.IlIlk();
                                                                                                                                                break block190;
                                                                                                                                            }
                                                                                                                                            v27 /* !! */  = var14_13;
                                                                                                                                        }
                                                                                                                                        if (var3_4 == null) break block189;
                                                                                                                                        try {
                                                                                                                                            block245: {
                                                                                                                                                if (v27 /* !! */  == 0) break block190;
                                                                                                                                                break block245;
                                                                                                                                                catch (RuntimeException v31) {
                                                                                                                                                    throw IlIlbi.a(v31);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v27 /* !! */  = (int)this.IlIlg.IlIlz(ServerVersion.V_1_15);
                                                                                                                                        }
                                                                                                                                        catch (RuntimeException v32) {
                                                                                                                                            throw IlIlbi.a(v32);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        if (var3_4 == null) break block191;
                                                                                                                                        if (v27 /* !! */  == 0) break block190;
                                                                                                                                    }
                                                                                                                                    catch (RuntimeException v33) {
                                                                                                                                        throw IlIlbi.a(v33);
                                                                                                                                    }
                                                                                                                                    v27 /* !! */  = (int)IlIlbi.d("y", (int)23574, (long)(4889310615106008458L ^ var1_1));
                                                                                                                                }
                                                                                                                                var16_15 = new int[v27 /* !! */ ];
                                                                                                                                for (var18_17 = false; var18_17 < var16_15.length; var18_17 += 1) {
                                                                                                                                    try {
                                                                                                                                        var16_15[var18_17] = this.IlIlW();
                                                                                                                                        if (var3_4 == null) break block192;
                                                                                                                                        if (var3_4 != null) continue;
                                                                                                                                    }
                                                                                                                                    catch (RuntimeException v34) {
                                                                                                                                        throw IlIlbi.a(v34);
                                                                                                                                    }
                                                                                                                                    PacketWrapper.IlIle(new int[2]);
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v35 = this.IlIlg.IlIlz(ServerVersion.V_1_16);
                                                                                                                            if (var3_4 == null) break block193;
                                                                                                                            if (v35) break block192;
                                                                                                                            break block246;
                                                                                                                            catch (RuntimeException v36) {
                                                                                                                                throw IlIlbi.a(v36);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            block247: {
                                                                                                                                v35 = this.IlIlg.IlIlC(ServerVersion.V_1_14);
                                                                                                                                if (var3_4 == null) break block193;
                                                                                                                                break block247;
                                                                                                                                catch (RuntimeException v37) {
                                                                                                                                    throw IlIlbi.a(v37);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (!v35) break block194;
                                                                                                                        }
                                                                                                                        catch (RuntimeException v38) {
                                                                                                                            throw IlIlbi.a(v38);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v35 = this.IlIlg.IlIlS(ServerVersion.V_1_8_8);
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (var3_4 == null) break block195;
                                                                                                                    if (v35) break block194;
                                                                                                                }
                                                                                                                catch (RuntimeException v39) {
                                                                                                                    throw IlIlbi.a(v39);
                                                                                                                }
                                                                                                                v35 = true;
                                                                                                                break block195;
                                                                                                            }
                                                                                                            v35 = false;
                                                                                                        }
                                                                                                        var18_17 = v35;
                                                                                                        v40 = this.IlIlg.IlIlz(ServerVersion.V_1_16);
                                                                                                        if (var3_4 == null) break block196;
                                                                                                        if (v40) break block197;
                                                                                                        break block248;
                                                                                                        catch (RuntimeException v41) {
                                                                                                            throw IlIlbi.a(v41);
                                                                                                        }
                                                                                                    }
                                                                                                    v40 = this.IlIlg.IlIlS(ServerVersion.V_1_8_8);
                                                                                                    if (var3_4 == null) break block196;
                                                                                                    break block249;
                                                                                                    catch (RuntimeException v42) {
                                                                                                        throw IlIlbi.a(v42);
                                                                                                    }
                                                                                                }
                                                                                                if (v40) break block197;
                                                                                                break block250;
                                                                                                catch (RuntimeException v43) {
                                                                                                    throw IlIlbi.a(v43);
                                                                                                }
                                                                                            }
                                                                                            v44 = this.IlIlW;
                                                                                            if (var3_4 == null) break block198;
                                                                                            break block251;
                                                                                            catch (RuntimeException v45) {
                                                                                                throw IlIlbi.a(v45);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block252: {
                                                                                                if (v44 == null) break block199;
                                                                                                break block252;
                                                                                                catch (RuntimeException v46) {
                                                                                                    throw IlIlbi.a(v46);
                                                                                                }
                                                                                            }
                                                                                            v44 = this.IlIlW;
                                                                                        }
                                                                                        catch (RuntimeException v47) {
                                                                                            throw IlIlbi.a(v47);
                                                                                        }
                                                                                    }
                                                                                    v40 = v44.IlIlR().hasSkyLight();
                                                                                    if (var3_4 == null) break block200;
                                                                                    try {
                                                                                        block253: {
                                                                                            if (!v40) break block199;
                                                                                            break block253;
                                                                                            catch (RuntimeException v48) {
                                                                                                throw IlIlbi.a(v48);
                                                                                            }
                                                                                        }
                                                                                        v40 = this.IlIlg.IlIlC(ServerVersion.V_1_14);
                                                                                    }
                                                                                    catch (RuntimeException v49) {
                                                                                        throw IlIlbi.a(v49);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (var3_4 == null) break block196;
                                                                                    if (!v40) break block199;
                                                                                }
                                                                                catch (RuntimeException v50) {
                                                                                    throw IlIlbi.a(v50);
                                                                                }
                                                                            }
                                                                            v40 = true;
                                                                            break block196;
                                                                        }
                                                                        v40 = false;
                                                                    }
                                                                    var19_18 = v40;
                                                                    var20_19 = this.IlIlS;
                                                                    try {
                                                                        v51 = this.IlIlg.IlIlS(ServerVersion.V_1_7_10);
                                                                        if (var3_4 == null) break block201;
                                                                        if (v51 != 0) {
                                                                        }
                                                                        ** GOTO lbl341
                                                                    }
                                                                    catch (RuntimeException v52) {
                                                                        throw IlIlbi.a(v52);
                                                                    }
                                                                    var22_20 /* !! */  = this.IlIlQ(this.IlIll(), var8_7, var7_6);
                                                                    this.IlIlS = UnpooledByteBufAllocationHelper.IlIlz(var22_20 /* !! */ );
                                                                    var21_21 = var22_20 /* !! */ .length;
                                                                    try {
                                                                        if (var3_4 != null) break block202;
lbl341:
                                                                        // 2 sources

                                                                        v51 = this.IlIlf();
                                                                    }
                                                                    catch (RuntimeException v53) {
                                                                        throw IlIlbi.a(v53);
                                                                    }
                                                                }
                                                                var21_21 = v51;
                                                            }
                                                            try {
                                                                block212: {
                                                                    block209: {
                                                                        block204: {
                                                                            block211: {
                                                                                block210: {
                                                                                    block207: {
                                                                                        block208: {
                                                                                            block206: {
                                                                                                block205: {
                                                                                                    block203: {
                                                                                                        var23_22 = ByteBufHelper.readerIndex(this.IlIlS) + var21_21;
                                                                                                        var22_20 /* !! */  = (byte[])this.IlIlL().IlIlZ(this.IlIlW.IlIlR(), var8_7, var12_11, var7_6, var18_17, var19_18, (int)var13_12 /* !! */ , var21_21, this);
                                                                                                        v54 = var14_13;
                                                                                                        if (var3_4 == null) break block203;
                                                                                                        try {
                                                                                                            block254: {
                                                                                                                if (v54 == 0) break block204;
                                                                                                                break block254;
                                                                                                                catch (RuntimeException v55) {
                                                                                                                    throw IlIlbi.a(v55);
                                                                                                                }
                                                                                                            }
                                                                                                            v54 = (int)this.IlIlg.IlIlC(ServerVersion.V_1_15);
                                                                                                        }
                                                                                                        catch (RuntimeException v56) {
                                                                                                            throw IlIlbi.a(v56);
                                                                                                        }
                                                                                                    }
                                                                                                    if (var3_4 == null) break block205;
                                                                                                    try {
                                                                                                        block255: {
                                                                                                            if (v54 == 0) break block204;
                                                                                                            break block255;
                                                                                                            catch (RuntimeException v57) {
                                                                                                                throw IlIlbi.a(v57);
                                                                                                            }
                                                                                                        }
                                                                                                        v54 = (int)this.IlIlg.IlIlz(ServerVersion.V_1_13);
                                                                                                    }
                                                                                                    catch (RuntimeException v58) {
                                                                                                        throw IlIlbi.a(v58);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (var3_4 == null) break block206;
                                                                                                    if (v54 != 0) {
                                                                                                    }
                                                                                                    ** GOTO lbl391
                                                                                                }
                                                                                                catch (RuntimeException v59) {
                                                                                                    throw IlIlbi.a(v59);
                                                                                                }
                                                                                                var16_15 = new int[IlIlbi.d("y", (int)23693, (long)(8921051643697083664L ^ var1_1))];
                                                                                                for (var24_23 = 0; var24_23 < var16_15.length; ++var24_23) {
                                                                                                    var16_15[var24_23] = this.IlIlW();
                                                                                                    if (var3_4 != null) continue;
                                                                                                }
                                                                                                try {
                                                                                                    if (var3_4 != null) break block204;
lbl391:
                                                                                                    // 2 sources

                                                                                                    v54 = (int)this.IlIlg.IlIlz(ServerVersion.V_1_9);
                                                                                                }
                                                                                                catch (RuntimeException v60) {
                                                                                                    throw IlIlbi.a(v60);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (var3_4 == null) break block207;
                                                                                                if (v54 == 0) break block208;
                                                                                            }
                                                                                            catch (RuntimeException v61) {
                                                                                                throw IlIlbi.a(v61);
                                                                                            }
                                                                                            var17_16 = new byte[IlIlbi.d("y", (int)12291, (long)(835928970224327066L ^ var1_1))];
                                                                                            for (var24_23 = 0; var24_23 < var17_16.length; ++var24_23) {
                                                                                                try {
                                                                                                    var17_16[var24_23] = this.IlIlE();
                                                                                                    if (var3_4 == null) break block209;
                                                                                                    if (var3_4 != null) continue;
                                                                                                    break block204;
                                                                                                }
                                                                                                catch (RuntimeException v62) {
                                                                                                    throw IlIlbi.a(v62);
                                                                                                }
                                                                                            }
                                                                                            break block204;
                                                                                        }
                                                                                        v54 = var21_21;
                                                                                    }
                                                                                    try {
                                                                                        if (var3_4 == null) break block210;
                                                                                        if (v54 != 0) break block211;
                                                                                    }
                                                                                    catch (RuntimeException v63) {
                                                                                        throw IlIlbi.a(v63);
                                                                                    }
                                                                                    v54 = 0;
                                                                                }
                                                                                var17_16 = new byte[v54];
                                                                                break block204;
                                                                            }
                                                                            var17_16 = this.IlIlW((int)IlIlbi.d("y", (int)12291, (long)(835928970224327066L ^ var1_1)));
                                                                        }
                                                                        var24_23 = ByteBufHelper.readerIndex(this.IlIlS);
                                                                    }
                                                                    v64 = var23_22;
                                                                    v65 = var24_23;
                                                                    if (var3_4 == null) break block212;
                                                                    try {
                                                                        block256: {
                                                                            if (v64 == v65) break block213;
                                                                            break block256;
                                                                            catch (RuntimeException v66) {
                                                                                throw IlIlbi.a(v66);
                                                                            }
                                                                        }
                                                                        v64 = var23_22;
                                                                        v65 = var24_23;
                                                                    }
                                                                    catch (RuntimeException v67) {
                                                                        throw IlIlbi.a(v67);
                                                                    }
                                                                }
                                                                try {
                                                                    if (v64 < v65) {
                                                                        throw new RuntimeException((String)IlIlbi.b("h", (int)19307, (long)(9030472201583807195L ^ var1_1)) + var4_2 + " " + var5_3 + (String)IlIlbi.b("h", (int)16771, (long)(8917636305652990002L ^ var1_1)) + var23_22 + (String)IlIlbi.b("h", (int)27143, (long)(7500933386384436149L ^ var1_1)) + var24_23);
                                                                    }
                                                                }
                                                                catch (RuntimeException v68) {
                                                                    throw IlIlbi.a(v68);
                                                                }
                                                                ByteBufHelper.readerIndex(this.IlIlS, var23_22);
                                                            }
                                                            catch (Throwable var25_25) {
                                                                block217: {
                                                                    block216: {
                                                                        try {
                                                                            try {
                                                                                v69 = this.IlIlS;
                                                                                if (var3_4 == null) break block216;
                                                                                if (v69 == var20_19) break block217;
                                                                            }
                                                                            catch (RuntimeException v70) {
                                                                                throw IlIlbi.a(v70);
                                                                            }
                                                                            v69 = this.IlIlS;
                                                                        }
                                                                        catch (RuntimeException v71) {
                                                                            throw IlIlbi.a(v71);
                                                                        }
                                                                    }
                                                                    ByteBufHelper.release(v69);
                                                                    this.IlIlS = var20_19;
                                                                }
                                                                throw var25_25;
                                                            }
                                                        }
                                                        v72 = this;
                                                        if (var3_4 == null) break block214;
                                                        try {
                                                            block257: {
                                                                if (v72.IlIlS == var20_19) break block215;
                                                                break block257;
                                                                catch (RuntimeException v73) {
                                                                    throw IlIlbi.a(v73);
                                                                }
                                                            }
                                                            ByteBufHelper.release(this.IlIlS);
                                                            this.IlIlS = var20_19;
                                                        }
                                                        catch (RuntimeException v74) {
                                                            throw IlIlbi.a(v74);
                                                        }
                                                    }
                                                    v72 = this;
                                                }
                                                try {
                                                    try {
                                                        if (var3_4 == null) break block218;
                                                        if (!v72.IlIlg.IlIlC(ServerVersion.V_1_9)) break block219;
                                                    }
                                                    catch (RuntimeException v75) {
                                                        throw IlIlbi.a(v75);
                                                    }
                                                    v76 = 0;
                                                    break block220;
                                                }
                                                catch (RuntimeException v77) {
                                                    throw IlIlbi.a(v77);
                                                }
                                            }
                                            v72 = this;
                                        }
                                        v76 = v72.IlIlf();
                                    }
                                    var23_22 = v76;
                                    var24_24 = new IlIlTy[var23_22];
                                    try {
                                        v78 = this.IlIlg.IlIlz(ServerVersion.V_1_18);
                                        if (var3_4 == null) break block221;
                                        if (v78 != 0) {
                                        }
                                        ** GOTO lbl529
                                    }
                                    catch (RuntimeException v79) {
                                        throw IlIlbi.a(v79);
                                    }
                                    for (var25_26 = 0; var25_26 < var24_24.length; ++var25_26) {
                                        try {
                                            var24_24[var25_26] = new IlIlTy(this.IlIlE(), this.IlIlG(), this.IlIlf(), this.IlIlS());
                                            if (var3_4 != null) {
                                                if (var3_4 != null) continue;
                                                break;
                                            }
                                            break block222;
                                        }
                                        catch (RuntimeException v80) {
                                            throw IlIlbi.a(v80);
                                        }
                                    }
                                    try {
                                        if (var3_4 != null) break block222;
lbl529:
                                        // 2 sources

                                        v78 = 0;
                                    }
                                    catch (RuntimeException v81) {
                                        throw IlIlbi.a(v81);
                                    }
                                }
                                for (var25_26 = v913438; var25_26 < var24_24.length; ++var25_26) {
                                    try {
                                        var24_24[var25_26] = new IlIlTy(this.IlIlS());
                                        if (var3_4 != null) {
                                            if (var3_4 != null) continue;
                                            break;
                                        }
                                        break block223;
                                    }
                                    catch (RuntimeException v82) {
                                        throw IlIlbi.a(v82);
                                    }
                                }
                            }
                            try {
                                try {
                                    v83 = this.IlIlg.IlIlz(ServerVersion.V_1_18);
                                    if (var3_4 == null) break block224;
                                    if (v83 == 0) break block223;
                                }
                                catch (RuntimeException v84) {
                                    throw IlIlbi.a(v84);
                                }
                                this.IlIlJ = IlIlLA.IlIlN(this);
                            }
                            catch (RuntimeException v85) {
                                throw IlIlbi.a(v85);
                            }
                        }
                        v83 = var14_13;
                    }
                    try {
                        block227: {
                            try {
                                block228: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var3_4 == null) break block225;
                                                        if (v83 != 0) {
                                                        }
                                                        ** GOTO lbl617
                                                    }
                                                    catch (RuntimeException v86) {
                                                        throw IlIlbi.a(v86);
                                                    }
                                                    v87 = var9_8;
                                                    if (var3_4 == null) break block226;
                                                }
                                                catch (RuntimeException v88) {
                                                    throw IlIlbi.a(v88);
                                                }
                                                if (!v87) break block227;
                                            }
                                            catch (RuntimeException v89) {
                                                throw IlIlbi.a(v89);
                                            }
                                            if (!var15_14) break block228;
                                        }
                                        catch (RuntimeException v90) {
                                            throw IlIlbi.a(v90);
                                        }
                                        this.IlIlc = new IlIlPj(var4_2, var5_3, true, (IlIlCV[])var22_20 /* !! */ , var24_24, var10_9, var17_16);
                                        if (var3_4 != null) break block229;
                                    }
                                    catch (RuntimeException v91) {
                                        throw IlIlbi.a(v91);
                                    }
                                }
                                this.IlIlc = new IlIlPj(var4_2, var5_3, true, (IlIlCV[])var22_20 /* !! */ , var24_24, var10_9, var16_15);
                                if (var3_4 != null) break block229;
                            }
                            catch (RuntimeException v92) {
                                throw IlIlbi.a(v92);
                            }
                        }
                        v87 = var15_14;
                    }
                    catch (RuntimeException v93) {
                        throw IlIlbi.a(v93);
                    }
                }
                try {
                    try {
                        block230: {
                            try {
                                if (!v87) break block230;
                                this.IlIlc = new IlIlPj(var4_2, var5_3, true, (IlIlCV[])var22_20 /* !! */ , var24_24, var17_16);
                                if (var3_4 != null) break block229;
                            }
                            catch (RuntimeException v94) {
                                throw IlIlbi.a(v94);
                            }
                        }
                        this.IlIlc = new IlIlPj(var4_2, var5_3, true, (IlIlCV[])var22_20 /* !! */ , var24_24, var16_15);
                        if (var3_4 != null) break block229;
                    }
                    catch (RuntimeException v95) {
                        throw IlIlbi.a(v95);
                    }
lbl617:
                    // 2 sources

                    v83 = (int)var9_8;
                }
                catch (RuntimeException v96) {
                    throw IlIlbi.a(v96);
                }
            }
            try {
                block231: {
                    try {
                        block232: {
                            try {
                                try {
                                    if (v83 == 0) break block231;
                                    if (var11_10 == null) break block232;
                                }
                                catch (RuntimeException v97) {
                                    throw IlIlbi.a(v97);
                                }
                                this.IlIlc = new IlIlPj(var4_2, var5_3, var7_6, (IlIlCV[])var22_20 /* !! */ , var24_24, var11_10);
                                if (var3_4 != null) break block229;
                            }
                            catch (RuntimeException v98) {
                                throw IlIlbi.a(v98);
                            }
                        }
                        this.IlIlc = new IlIlPj(var4_2, var5_3, var7_6, (IlIlCV[])var22_20 /* !! */ , var24_24, var10_9);
                        if (var3_4 != null) break block229;
                    }
                    catch (RuntimeException v99) {
                        throw IlIlbi.a(v99);
                    }
                }
                this.IlIlc = new IlIlPj(var4_2, var5_3, var7_6, (IlIlCV[])var22_20 /* !! */ , var24_24);
            }
            catch (RuntimeException v100) {
                throw IlIlbi.a(v100);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Could not resolve type clashes
     */
    private byte[] IlIlQ(byte[] byArray, BitSet bitSet, boolean bl) {
        int n;
        block15: {
            int n2;
            block16: {
                int n3;
                int n4;
                PacketWrapper[] packetWrapperArray;
                block12: {
                    long l = b ^ 0x45A95022A15EL;
                    int n5 = 0;
                    packetWrapperArray = IlIlFh.IlIla();
                    for (n2 = 0; n2 < IlIlbi.d("y", (int)15205, (long)(0x344C43B445B524EL ^ l)); ++n2) {
                        int n6;
                        block13: {
                            block14: {
                                n4 = n5;
                                n3 = bitSet.get(n2);
                                if (packetWrapperArray == null) break block12;
                                try {
                                    block18: {
                                        if (packetWrapperArray == null) break block13;
                                        break block18;
                                        catch (DataFormatException dataFormatException) {
                                            throw IlIlbi.a(dataFormatException);
                                        }
                                    }
                                    if (n3 == 0) break block14;
                                }
                                catch (DataFormatException dataFormatException) {
                                    throw IlIlbi.a(dataFormatException);
                                }
                                n6 = 1;
                                break block13;
                            }
                            n6 = 0;
                        }
                        n5 = n4 + n6;
                        if (packetWrapperArray != null) continue;
                    }
                    n4 = IlIlbi.d("y", (int)2839, (long)(0x712C1843FDE0E23FL ^ l));
                    n3 = n5;
                }
                n2 = n4 * n3;
                try {
                    n = bl;
                    if (packetWrapperArray == null) break block15;
                    if (n == 0) break block16;
                }
                catch (DataFormatException dataFormatException) {
                    throw IlIlbi.a(dataFormatException);
                }
                n2 += 256;
            }
            n = n2;
        }
        byte[] byArray2 = new byte[n];
        Inflater inflater = new Inflater();
        inflater.setInput(byArray, 0, byArray.length);
        try {
            inflater.inflate(byArray2);
        }
        catch (DataFormatException dataFormatException) {
            dataFormatException.printStackTrace();
        }
        finally {
            inflater.end();
        }
        return byArray2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void IlIlJ() {
        block172: {
            block173: {
                block171: {
                    block170: {
                        block169: {
                            block167: {
                                block168: {
                                    block161: {
                                        block166: {
                                            block162: {
                                                block164: {
                                                    block183: {
                                                        block165: {
                                                            block163: {
                                                                block157: {
                                                                    block158: {
                                                                        block159: {
                                                                            block155: {
                                                                                block156: {
                                                                                    block151: {
                                                                                        block152: {
                                                                                            block154: {
                                                                                                block153: {
                                                                                                    block149: {
                                                                                                        block143: {
                                                                                                            block147: {
                                                                                                                block148: {
                                                                                                                    block146: {
                                                                                                                        block144: {
                                                                                                                            block142: {
                                                                                                                                block141: {
                                                                                                                                    block176: {
                                                                                                                                        block175: {
                                                                                                                                            block139: {
                                                                                                                                                block140: {
                                                                                                                                                    var1_1 = IlIlbi.b ^ 77173881216838L;
                                                                                                                                                    v0 = IlIlFh.IlIla();
                                                                                                                                                    this.IlIla(this.IlIlc.IlIlG());
                                                                                                                                                    this.IlIla(this.IlIlc.IlIlx());
                                                                                                                                                    var3_2 = v0;
                                                                                                                                                    var4_3 = this.IlIlg.IlIlz(ServerVersion.V_1_18);
                                                                                                                                                    var5_4 = this.IlIlg.IlIlz(ServerVersion.V_1_17);
                                                                                                                                                    var6_5 = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                                                                                                                                                    var7_6 = this.IlIlg.IlIlz(ServerVersion.V_1_8);
                                                                                                                                                    v1 = var5_4;
                                                                                                                                                    if (var3_2 == null) break block139;
                                                                                                                                                    try {
                                                                                                                                                        block174: {
                                                                                                                                                            if (v1) break block140;
                                                                                                                                                            break block174;
                                                                                                                                                            catch (RuntimeException v2) {
                                                                                                                                                                throw IlIlbi.a(v2);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        this.IlIla(this.IlIlc.IlIlP());
                                                                                                                                                    }
                                                                                                                                                    catch (RuntimeException v3) {
                                                                                                                                                        throw IlIlbi.a(v3);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v1 = false;
                                                                                                                                            }
                                                                                                                                            var8_7 = v1;
                                                                                                                                            v4 = this;
                                                                                                                                            if (var3_2 == null) break block141;
                                                                                                                                            if (v4.IlIlg == ServerVersion.V_1_16) ** GOTO lbl48
                                                                                                                                            break block175;
                                                                                                                                            catch (RuntimeException v5) {
                                                                                                                                                throw IlIlbi.a(v5);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v4 = this;
                                                                                                                                        if (var3_2 == null) break block141;
                                                                                                                                        break block176;
                                                                                                                                        catch (RuntimeException v6) {
                                                                                                                                            throw IlIlbi.a(v6);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        block177: {
                                                                                                                                            if (v4.IlIlg != ServerVersion.V_1_16_1) break block142;
                                                                                                                                            break block177;
                                                                                                                                            catch (RuntimeException v7) {
                                                                                                                                                throw IlIlbi.a(v7);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v4 = this;
                                                                                                                                    }
                                                                                                                                    catch (RuntimeException v8) {
                                                                                                                                        throw IlIlbi.a(v8);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v4.IlIla(this.IlIld);
                                                                                                                            }
                                                                                                                            var9_8 = new BitSet();
                                                                                                                            var10_9 = this.IlIlc.IlIlZ();
                                                                                                                            try {
                                                                                                                                v9 = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                                                                                                                                if (var3_2 == null) break block143;
                                                                                                                                if (v9) {
                                                                                                                                }
                                                                                                                                ** GOTO lbl148
                                                                                                                            }
                                                                                                                            catch (RuntimeException v10) {
                                                                                                                                throw IlIlbi.a(v10);
                                                                                                                            }
                                                                                                                            var12_10 = this.IlIlS;
                                                                                                                            this.IlIlS = var11_12 = ByteBufHelper.IlIlw(this.IlIlS);
                                                                                                                            for (var13_13 = 0; var13_13 < var10_9.length; ++var13_13) {
                                                                                                                                block145: {
                                                                                                                                    block179: {
                                                                                                                                        block178: {
                                                                                                                                            var14_18 /* !! */  = (byte[])var10_9[var13_13];
                                                                                                                                            v11 = var4_3;
                                                                                                                                            if (var3_2 == null) break block144;
                                                                                                                                            if (var3_2 == null) break block145;
                                                                                                                                            break block178;
                                                                                                                                            catch (RuntimeException v12) {
                                                                                                                                                throw IlIlbi.a(v12);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (v11 == 0) ** GOTO lbl91
                                                                                                                                        break block179;
                                                                                                                                        catch (RuntimeException v13) {
                                                                                                                                            throw IlIlbi.a(v13);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        block180: {
                                                                                                                                            IlIlZq.IlIlx(this, (IlIlZq)var14_18 /* !! */ );
                                                                                                                                            if (var3_2 != null) continue;
                                                                                                                                            break block180;
                                                                                                                                            catch (RuntimeException v14) {
                                                                                                                                                throw IlIlbi.a(v14);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v15 = var6_5;
                                                                                                                                    }
                                                                                                                                    catch (RuntimeException v16) {
                                                                                                                                        throw IlIlbi.a(v16);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!v15) continue;
                                                                                                                                try {
                                                                                                                                    block181: {
                                                                                                                                        if (var14_18 /* !! */  == null) continue;
                                                                                                                                        break block181;
                                                                                                                                        catch (RuntimeException v17) {
                                                                                                                                            throw IlIlbi.a(v17);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var9_8.set(var13_13);
                                                                                                                                    IlIlh7.IlIlg(this, (IlIlh7)var14_18 /* !! */ );
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                catch (RuntimeException v18) {
                                                                                                                                    throw IlIlbi.a(v18);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            this.IlIlS = var12_10;
                                                                                                                            v11 = this.IlIlg.IlIlC(ServerVersion.V_1_21_6);
                                                                                                                        }
                                                                                                                        if (var3_2 == null) break block146;
                                                                                                                        try {
                                                                                                                            block182: {
                                                                                                                                if (v11 == 0) break block147;
                                                                                                                                break block182;
                                                                                                                                catch (RuntimeException v19) {
                                                                                                                                    throw IlIlbi.a(v19);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v11 = this.IlIlg.IlIlz(ServerVersion.V_1_21_5);
                                                                                                                        }
                                                                                                                        catch (RuntimeException v20) {
                                                                                                                            throw IlIlbi.a(v20);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var3_2 == null) break block148;
                                                                                                                        if (v11 == 0) break block147;
                                                                                                                    }
                                                                                                                    catch (RuntimeException v21) {
                                                                                                                        throw IlIlbi.a(v21);
                                                                                                                    }
                                                                                                                    var13_13 = IlIlje.IlIlM(var10_9);
                                                                                                                    v11 = ByteBufHelper.writerIndex(var11_12) + var13_13;
                                                                                                                }
                                                                                                                var14_19 = v11;
                                                                                                                try {
                                                                                                                    if (var14_19 > ByteBufHelper.IlIlO(var11_12)) {
                                                                                                                        ByteBufHelper.IlIlU(var11_12, var14_19);
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (RuntimeException v22) {
                                                                                                                    throw IlIlbi.a(v22);
                                                                                                                }
                                                                                                                ByteBufHelper.writerIndex(var11_12, var14_19);
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var3_2 != null) break block149;
lbl148:
                                                                                                                // 2 sources

                                                                                                                v9 = var7_6;
                                                                                                            }
                                                                                                            catch (RuntimeException v23) {
                                                                                                                throw IlIlbi.a(v23);
                                                                                                            }
                                                                                                        }
                                                                                                        if (v9) {
                                                                                                            var12_10 = IlIlCR.IlIlf((IlIlTL[])var10_9, this.IlIlc.IlIlL());
                                                                                                            this.IlIlG(var12_10.IlIlD());
                                                                                                            this.IlIlU(var12_10.IlIlV());
                                                                                                            return;
                                                                                                        }
                                                                                                        var12_10 = IlIloA.IlIls((IlIlig[])var10_9, this.IlIlc.IlIlL());
                                                                                                        var13_14 = new Deflater(-1);
                                                                                                        var14_18 /* !! */  = new byte[var12_10.IlIlV().length];
                                                                                                        try {
                                                                                                            var13_14.setInput(var12_10.IlIlV(), 0, var12_10.IlIlV().length);
                                                                                                            var13_14.finish();
                                                                                                            var15_25 = var13_14.deflate(var14_18 /* !! */ );
                                                                                                        }
                                                                                                        finally {
                                                                                                            var13_14.end();
                                                                                                        }
                                                                                                        this.IlIlG(var12_10.IlIlD());
                                                                                                        this.IlIlG(var12_10.IlIlA());
                                                                                                        this.IlIla(var15_25);
                                                                                                        ByteBufHelper.IlIlS(this.IlIlS, var14_18 /* !! */ , 0, var15_25);
                                                                                                        return;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        v24 = this.IlIlc.IlIlP();
                                                                                                                        if (var3_2 == null) break block151;
                                                                                                                        if (v24 == 0) break block152;
                                                                                                                    }
                                                                                                                    catch (RuntimeException v25) {
                                                                                                                        throw IlIlbi.a(v25);
                                                                                                                    }
                                                                                                                    v24 = (int)this.IlIlg.IlIlC(ServerVersion.V_1_15);
                                                                                                                    if (var3_2 == null) break block151;
                                                                                                                }
                                                                                                                catch (RuntimeException v26) {
                                                                                                                    throw IlIlbi.a(v26);
                                                                                                                }
                                                                                                                if (v24 == 0) break block152;
                                                                                                            }
                                                                                                            catch (RuntimeException v27) {
                                                                                                                throw IlIlbi.a(v27);
                                                                                                            }
                                                                                                            v28 = this;
                                                                                                            if (var3_2 == null) break block153;
                                                                                                        }
                                                                                                        catch (RuntimeException v29) {
                                                                                                            throw IlIlbi.a(v29);
                                                                                                        }
                                                                                                        if (v28.IlIlg.IlIlz(ServerVersion.V_1_13)) {
                                                                                                        }
                                                                                                        ** GOTO lbl217
                                                                                                    }
                                                                                                    catch (RuntimeException v30) {
                                                                                                        throw IlIlbi.a(v30);
                                                                                                    }
                                                                                                    for (Object var15_26 : (Object)this.IlIlc.IlIlP()) {
                                                                                                        try {
                                                                                                            ByteBufHelper.IlIlJ(var11_12, (int)var15_26);
                                                                                                            if (var3_2 != null) {
                                                                                                                if (var3_2 != null) continue;
                                                                                                                break;
                                                                                                            }
                                                                                                            break block154;
                                                                                                        }
                                                                                                        catch (RuntimeException v31) {
                                                                                                            throw IlIlbi.a(v31);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        if (var3_2 != null) break block154;
lbl217:
                                                                                                        // 2 sources

                                                                                                        v28 = this;
                                                                                                    }
                                                                                                    catch (RuntimeException v32) {
                                                                                                        throw IlIlbi.a(v32);
                                                                                                    }
                                                                                                }
                                                                                                for (Object var15_26 : (Object)v28.IlIlc.IlIlL()) {
                                                                                                    try {
                                                                                                        ByteBufHelper.IlIls(var11_12, (int)var15_26);
                                                                                                        if (var3_2 != null) {
                                                                                                            if (var3_2 != null) continue;
                                                                                                            break;
                                                                                                        }
                                                                                                        break block152;
                                                                                                    }
                                                                                                    catch (RuntimeException v33) {
                                                                                                        throw IlIlbi.a(v33);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var8_7 = true;
                                                                                        }
                                                                                        v24 = var4_3;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var3_2 == null) break block155;
                                                                                            if (v24 != 0) break block156;
                                                                                        }
                                                                                        catch (RuntimeException v34) {
                                                                                            throw IlIlbi.a(v34);
                                                                                        }
                                                                                        IlIlGa.IlIlZ(this, var9_8);
                                                                                    }
                                                                                    catch (RuntimeException v35) {
                                                                                        throw IlIlbi.a(v35);
                                                                                    }
                                                                                }
                                                                                v24 = (int)this.IlIlg.IlIlz(ServerVersion.V_1_14);
                                                                            }
                                                                            var12_11 = v24;
                                                                            try {
                                                                                block160: {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v36 = var12_11;
                                                                                                    if (var3_2 == null) break block157;
                                                                                                    if (v36 == 0) break block158;
                                                                                                }
                                                                                                catch (RuntimeException v37) {
                                                                                                    throw IlIlbi.a(v37);
                                                                                                }
                                                                                                v38 = this;
                                                                                                if (var3_2 == null) break block159;
                                                                                            }
                                                                                            catch (RuntimeException v39) {
                                                                                                throw IlIlbi.a(v39);
                                                                                            }
                                                                                            if (!v38.IlIlg.IlIlz(ServerVersion.V_1_21_5)) break block160;
                                                                                        }
                                                                                        catch (RuntimeException v40) {
                                                                                            throw IlIlbi.a(v40);
                                                                                        }
                                                                                        this.IlIla(this.IlIlc.IlIlA(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIl_(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlrw ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlrw;)V)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIls(long[] ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;[J)V)());
                                                                                        if (var3_2 != null) break block158;
                                                                                    }
                                                                                    catch (RuntimeException v41) {
                                                                                        throw IlIlbi.a(v41);
                                                                                    }
                                                                                }
                                                                                v38 = this;
                                                                            }
                                                                            catch (RuntimeException v42) {
                                                                                throw IlIlbi.a(v42);
                                                                            }
                                                                        }
                                                                        v38.IlIlc(this.IlIlc.IlIlK());
                                                                    }
                                                                    v36 = (int)this.IlIlc.IlIlg();
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var3_2 == null) break block161;
                                                                                    if (v36 == 0) break block162;
                                                                                }
                                                                                catch (RuntimeException v43) {
                                                                                    throw IlIlbi.a(v43);
                                                                                }
                                                                                v36 = (int)this.IlIlg.IlIlz(ServerVersion.V_1_15);
                                                                                if (var3_2 == null) break block161;
                                                                            }
                                                                            catch (RuntimeException v44) {
                                                                                throw IlIlbi.a(v44);
                                                                            }
                                                                            if (v36 == 0) break block162;
                                                                        }
                                                                        catch (RuntimeException v45) {
                                                                            throw IlIlbi.a(v45);
                                                                        }
                                                                        v36 = var4_3;
                                                                        if (var3_2 == null) break block161;
                                                                    }
                                                                    catch (RuntimeException v46) {
                                                                        throw IlIlbi.a(v46);
                                                                    }
                                                                    if (v36 != 0) break block162;
                                                                }
                                                                catch (RuntimeException v47) {
                                                                    throw IlIlbi.a(v47);
                                                                }
                                                                var13_13 = (int)this.IlIlg.IlIlC(ServerVersion.V_1_13);
                                                                var14_21 = this.IlIlc.IlIlP();
                                                                var15_27 = this.IlIlc.IlIlL();
                                                                try {
                                                                    v48 = var13_13;
                                                                    if (var3_2 == null) break block163;
                                                                    if (v48 != 0) {
                                                                    }
                                                                    ** GOTO lbl337
                                                                }
                                                                catch (RuntimeException v49) {
                                                                    throw IlIlbi.a(v49);
                                                                }
                                                                for (Object var19_37 : (IlIlTy)var15_27) {
                                                                    try {
                                                                        this.IlIlu((int)var19_37);
                                                                        if (var3_2 != null) {
                                                                            if (var3_2 != null) continue;
                                                                            break;
                                                                        }
                                                                        break block164;
                                                                    }
                                                                    catch (RuntimeException v50) {
                                                                        throw IlIlbi.a(v50);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var3_2 != null) break block164;
lbl337:
                                                                        // 2 sources

                                                                        v51 = this;
                                                                        if (var3_2 == null) break block165;
                                                                    }
                                                                    catch (RuntimeException v52) {
                                                                        throw IlIlbi.a(v52);
                                                                    }
                                                                    v48 = (int)v51.IlIlg.IlIlz(ServerVersion.V_1_16_2);
                                                                }
                                                                catch (RuntimeException v53) {
                                                                    throw IlIlbi.a(v53);
                                                                }
                                                            }
                                                            if (v48 == 0) break block183;
                                                            v51 = this;
                                                        }
                                                        v51.IlIlW(var14_21);
                                                        if (var3_2 != null) break block164;
                                                    }
                                                    for (Object var19_37 : (IlIlTy)var14_21) {
                                                        try {
                                                            this.IlIla((int)var19_37);
                                                            if (var3_2 != null) {
                                                                if (var3_2 != null) continue;
                                                                break;
                                                            }
                                                            break block166;
                                                        }
                                                        catch (RuntimeException v54) {
                                                            throw IlIlbi.a(v54);
                                                        }
                                                    }
                                                }
                                                var8_7 = true;
                                            }
                                            this.IlIlJ(ByteBufHelper.IlIlH(var11_12));
                                            ByteBufHelper.IlIlu(this.IlIlS, var11_12);
                                            ByteBufHelper.release(var11_12);
                                        }
                                        v36 = (int)this.IlIlc.IlIlg();
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var3_2 == null) break block167;
                                                if (v36 == 0) break block168;
                                            }
                                            catch (RuntimeException v55) {
                                                throw IlIlbi.a(v55);
                                            }
                                            v36 = (int)var8_7;
                                            if (var3_2 == null) break block167;
                                        }
                                        catch (RuntimeException v56) {
                                            throw IlIlbi.a(v56);
                                        }
                                        if (v36 != 0) break block168;
                                    }
                                    catch (RuntimeException v57) {
                                        throw IlIlbi.a(v57);
                                    }
                                    var13_15 = new byte[IlIlbi.d("y", (int)12291, (long)(835920780302018354L ^ var1_1))];
                                    var14_22 = this.IlIlc.IlIlP();
                                    for (var15_28 = 0; var15_28 < var13_15.length; ++var15_28) {
                                        try {
                                            var13_15[var15_28] = (byte)var14_22[var15_28];
                                            if (var3_2 != null) {
                                                if (var3_2 != null) continue;
                                                break;
                                            }
                                            break block168;
                                        }
                                        catch (RuntimeException v58) {
                                            throw IlIlbi.a(v58);
                                        }
                                    }
                                    this.IlIlU(var13_15);
                                }
                                v36 = (int)this.IlIlg.IlIlz(ServerVersion.V_1_18);
                            }
                            try {
                                if (var3_2 == null) break block169;
                                if (v36 != 0) {
                                }
                                ** GOTO lbl427
                            }
                            catch (RuntimeException v59) {
                                throw IlIlbi.a(v59);
                            }
                            this.IlIlJ(this.IlIlc.IlIld().length);
                            for (IlIlTy var16_32 : this.IlIlc.IlIld()) {
                                try {
                                    this.IlIlu(var16_32.IlIlW());
                                    this.IlIlG(var16_32.IlIlD());
                                    this.IlIlJ(var16_32.IlIln());
                                    this.IlIlc(var16_32.IlIlu());
                                    if (var3_2 != null) {
                                        if (var3_2 != null) continue;
                                        break;
                                    }
                                    break block170;
                                }
                                catch (RuntimeException v60) {
                                    throw IlIlbi.a(v60);
                                }
                            }
                            try {
                                if (var3_2 != null) break block170;
lbl427:
                                // 2 sources

                                v36 = (int)this.IlIlg.IlIlz(ServerVersion.V_1_9);
                            }
                            catch (RuntimeException v61) {
                                throw IlIlbi.a(v61);
                            }
                        }
                        try {
                            if (var3_2 == null) break block171;
                            if (v36 == 0) break block170;
                        }
                        catch (RuntimeException v62) {
                            throw IlIlbi.a(v62);
                        }
                        var13_17 = this.IlIlc.IlIld();
                        this.IlIlJ(var13_17.length);
                        for (IlIlTy var17_35 : var13_17) {
                            try {
                                this.IlIlc(var17_35.IlIlu());
                                if (var3_2 != null) {
                                    if (var3_2 != null) continue;
                                    break;
                                }
                                break block172;
                            }
                            catch (RuntimeException v63) {
                                throw IlIlbi.a(v63);
                            }
                        }
                    }
                    try {
                        v64 = this;
                        if (var3_2 == null) break block173;
                        v36 = (int)v64.IlIlg.IlIlz(ServerVersion.V_1_18);
                    }
                    catch (RuntimeException v65) {
                        throw IlIlbi.a(v65);
                    }
                }
                if (v36 == 0) break block172;
                v64 = this;
            }
            IlIlLA.IlIl_(v64, this.IlIlJ);
        }
    }

    public void IlIlK(IlIlbi ilIlbi) {
        IlIlLA ilIlLA;
        block4: {
            block5: {
                long l = b ^ 0x4EA50BC871B1L;
                this.IlIlc = ilIlbi.IlIlc;
                PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                try {
                    try {
                        IlIlbi ilIlbi2 = this;
                        ilIlLA = ilIlbi.IlIlJ;
                        if (packetWrapperArray == null) break block4;
                        if (ilIlLA == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw IlIlbi.a(runtimeException);
                    }
                    ilIlLA = ilIlbi.IlIlJ.IlIlo();
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw IlIlbi.a(runtimeException);
                }
            }
            ilIlLA = null;
        }
        ilIlbi2.IlIlJ = ilIlLA;
        this.IlIld = ilIlbi.IlIld;
    }

    public IlIlPj IlIlq() {
        return this.IlIlc;
    }

    public void IlIlC(IlIlPj ilIlPj) {
        this.IlIlc = ilIlPj;
    }

    public IlIlLA IlIlO() {
        return this.IlIlJ;
    }

    public void IlIlO(IlIlLA ilIlLA) {
        this.IlIlJ = ilIlLA;
    }

    public boolean IlIlU() {
        return this.IlIld;
    }

    public void IlIlV(boolean bl) {
        this.IlIld = bl;
    }

    private IlIlXH IlIlL() {
        boolean bl;
        block19: {
            block20: {
                PacketWrapper[] packetWrapperArray;
                block17: {
                    block18: {
                        block15: {
                            block16: {
                                long l = b ^ 0xCF1CBF035F9L;
                                packetWrapperArray = IlIlFh.IlIla();
                                try {
                                    try {
                                        bl = this.IlIlg.IlIlz(ServerVersion.V_1_18);
                                        if (packetWrapperArray == null) break block15;
                                        if (!bl) break block16;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw IlIlbi.a(runtimeException);
                                    }
                                    return IlIls;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw IlIlbi.a(runtimeException);
                                }
                            }
                            bl = this.IlIlg.IlIlz(ServerVersion.V_1_16);
                        }
                        try {
                            try {
                                if (packetWrapperArray == null) break block17;
                                if (!bl) break block18;
                            }
                            catch (RuntimeException runtimeException) {
                                throw IlIlbi.a(runtimeException);
                            }
                            return IlIln;
                        }
                        catch (RuntimeException runtimeException) {
                            throw IlIlbi.a(runtimeException);
                        }
                    }
                    bl = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                }
                try {
                    try {
                        if (packetWrapperArray == null) break block19;
                        if (!bl) break block20;
                    }
                    catch (RuntimeException runtimeException) {
                        throw IlIlbi.a(runtimeException);
                    }
                    return IlIlQ;
                }
                catch (RuntimeException runtimeException) {
                    throw IlIlbi.a(runtimeException);
                }
            }
            bl = this.IlIlg.IlIlz(ServerVersion.V_1_8);
        }
        try {
            if (bl) {
                return IlIlx;
            }
        }
        catch (RuntimeException runtimeException) {
            throw IlIlbi.a(runtimeException);
        }
        return IlIlb;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    IlIlbi.b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(-149481664338784919L, 7469114704662123989L, MethodHandles.lookup().lookupClass()).a(144486788397038L);
                    IlIlbi.h = new HashMap<K, V>(13);
                    var11 = IlIlbi.b ^ 122056529909346L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var20_3 = new String[3];
                    var18_4 = 0;
                    var17_5 = "\u00e1 RU\u00a2}\u0081\u00017'N\u00bd\u008a0\u00d6,\u00d8\u007f\u00a2\u0019C\u00b6\u0082n\u00fa\u0002hO\u008d\u00ebo\u00b5w\u0001S\u0018\u00a9\u007f+=\u00bcN\u009fB\u000e\u0082\u00ad\u00bf\u00ff\u0012\u0082\u00c0\u0007h!b88\u0012,\u008d5?\u00aa\u00cc+\u0088\u009e\u00b3\u009cFD\u00ce\u00f58\u00aa\u0017\u00a6J\u00d5\u001a\u009c>g\u00c5\b\u00a7\u00d7F\u0092Z\\(\u0092\u0092\u00c2\u0093\u0097`\u0005:\u00f2\u0086\u00ea7\u00e4;\u00a8r\u00fd*\u00bdu\u0010\u00bc\u0089G\u008d\u001b\u0092\u00a9\u0099P\u00b0\"1\u000e\u00b19j";
                    var19_6 = "\u00e1 RU\u00a2}\u0081\u00017'N\u00bd\u008a0\u00d6,\u00d8\u007f\u00a2\u0019C\u00b6\u0082n\u00fa\u0002hO\u008d\u00ebo\u00b5w\u0001S\u0018\u00a9\u007f+=\u00bcN\u009fB\u000e\u0082\u00ad\u00bf\u00ff\u0012\u0082\u00c0\u0007h!b88\u0012,\u008d5?\u00aa\u00cc+\u0088\u009e\u00b3\u009cFD\u00ce\u00f58\u00aa\u0017\u00a6J\u00d5\u001a\u009c>g\u00c5\b\u00a7\u00d7F\u0092Z\\(\u0092\u0092\u00c2\u0093\u0097`\u0005:\u00f2\u0086\u00ea7\u00e4;\u00a8r\u00fd*\u00bdu\u0010\u00bc\u0089G\u008d\u001b\u0092\u00a9\u0099P\u00b0\"1\u000e\u00b19j".length();
                    var16_7 = 56;
                    var15_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = IlIlbi.b(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                IlIlbi.c = var20_3;
                IlIlbi.g = new String[3];
                IlIlbi.n = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "\u00b3\u00bcb\u0086-\u00a4G.\u00d6\u0089J\u008buHC\u00fc\u00bb|r3\u0007M7\u007f\u00f4E\u00a1{8\"\u00a5\u00b5";
                var5_15 = "\u00b3\u00bcb\u0086-\u00a4G.\u00d6\u0089J\u008buHC\u00fc\u00bb|r3\u0007M7\u007f\u00f4E\u00a1{8\"\u00a5\u00b5".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00a5s\u00b2\u001f2\u000e\u00fb\u00eb$\u00d7\u008a\u00c0\u0097\u00b9\u00a5I";
                    var5_15 = "\u00a5s\u00b2\u001f2\u000e\u00fb\u00eb$\u00d7\u008a\u00c0\u0097\u00b9\u00a5I".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl84:
                // 1 sources

                ** continue;
            }
        }
        IlIlbi.l = var6_12;
        IlIlbi.m = new Integer[6];
        IlIlbi.IlIlb = new IlIloA();
        IlIlbi.IlIlx = new IlIlCR();
        IlIlbi.IlIlQ = new IlIlQF();
        IlIlbi.IlIln = new IlIlX1();
        IlIlbi.IlIls = new IlIlje();
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xCC0;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbi", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            IlIlbi.g[n2] = IlIlbi.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlbi.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x64E8;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = IlIlbi.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])IlIlbi.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    IlIlbi.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlbi.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlbi.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlbi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlbi.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

