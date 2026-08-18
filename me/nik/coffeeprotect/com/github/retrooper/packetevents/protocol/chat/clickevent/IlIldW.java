/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlAA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlAo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlG9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlXU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlfg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlio;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlq4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlrj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlui;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlvb;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.StaticClickEventAction;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlh4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlys;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIldW {
    private static final VersionedRegistry<IlIlrj<?>> IlIli;
    public static final IlIlrj<IlIlq4> IlIlk;
    public static final IlIlrj<IlIlw> IlIl_;
    public static final IlIlrj<IlIlAo> IlIlc;
    @ApiStatus.Obsolete
    public static final IlIlrj<IlIlfg> IlIlo;
    public static final IlIlrj<IlIlXU> IlIlR;
    public static final IlIlrj<IlIlG9> IlIlK;
    public static final IlIlrj<IlIlAA> IlIlp;
    public static final IlIlrj<IlIlvb> IlIlO;
    public static final IlIlrj<IlIlio> IlIlA;
    private static transient /* synthetic */ String ksgwoPipTR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIldW() {
    }

    @ApiStatus.Internal
    public static <T extends IlIlui> IlIlrj<T> IlIlS(String string, boolean bl, IlIlys<T> ilIlys, IlIlh4<T> ilIlh4) {
        return IlIli.define(string, typesBuilderData -> new StaticClickEventAction((TypesBuilderData)typesBuilderData, bl, ilIlys, ilIlh4));
    }

    public static VersionedRegistry<IlIlrj<?>> IlIlu() {
        return IlIli;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = IlIls.a(3599022919278369753L, 2741001647738540012L, MethodHandles.lookup().lookupClass()).a(276765325216635L) ^ 117480433805319L;
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
                var0_3 = new String[10];
                var6_4 = 0;
                var5_5 = "z\u0092\u00fa\u00fd\u00caD\u00c3\u0017\u0018\u009bL\u00a4\u001a\u00d5\u0098N\u0099\u00d4U\u00fd\u00fc\u00e4C\u008c\u00e2\u00a9\u009c\u008a\u0013\u00cf\u00bb:\\\u0010-[\u001e\u00f8\u008d\u001f\u00ef\u0094\u0003\u0095\u00a8b549G\u0018\u00b7\u00a1t\u001b\u0083\u0093d\u00c2b\u00dc\u00ad\u00a8\u00f9ot\u0095\u000b\u00c3\u0013\u00a76\u00f0e#\u0018@\u00bc\u00abMs\u00a8\u00c6\u0007j\u001e\u00f4]4\u00d8x}\u00b1\u0083!\u00f7i\u0004\u008c\u00e2\u0010\u00c6>\u00fff9L3\u009c\u00c2>X\u00dc\u00a0\u00ec\u00f1\u00b5\u0010\u00aa##{y\u00e5\u0094\u0004\u00f6k\u00a4\u0083\u00b2\u00ef\u00dai\u0010P\u00c4G\u0080\u00b5\u00b7\u00b0nk\u00b9\u00b8\u00b9`\u00fec\u00c6";
                var7_6 = "z\u0092\u00fa\u00fd\u00caD\u00c3\u0017\u0018\u009bL\u00a4\u001a\u00d5\u0098N\u0099\u00d4U\u00fd\u00fc\u00e4C\u008c\u00e2\u00a9\u009c\u008a\u0013\u00cf\u00bb:\\\u0010-[\u001e\u00f8\u008d\u001f\u00ef\u0094\u0003\u0095\u00a8b549G\u0018\u00b7\u00a1t\u001b\u0083\u0093d\u00c2b\u00dc\u00ad\u00a8\u00f9ot\u0095\u000b\u00c3\u0013\u00a76\u00f0e#\u0018@\u00bc\u00abMs\u00a8\u00c6\u0007j\u001e\u00f4]4\u00d8x}\u00b1\u0083!\u00f7i\u0004\u008c\u00e2\u0010\u00c6>\u00fff9L3\u009c\u00c2>X\u00dc\u00a0\u00ec\u00f1\u00b5\u0010\u00aa##{y\u00e5\u0094\u0004\u00f6k\u00a4\u0083\u00b2\u00ef\u00dai\u0010P\u00c4G\u0080\u00b5\u00b7\u00b0nk\u00b9\u00b8\u00b9`\u00fec\u00c6".length();
                var4_7 = 8;
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
                    var0_3[var6_4++] = IlIldW.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0081d\u00197>\u0099s\u00a2\u00ca\bt\u0091\u00de\u00ae\u00e9\u00e3\u0010\u008e\u00c8\u0083\u00bf\u0093R\u00ff\u0088j\u00be\u0012\u00f6i\u00c3H!";
                    var7_6 = "\u0081d\u00197>\u0099s\u00a2\u00ca\bt\u0091\u00de\u00ae\u00e9\u00e3\u0010\u008e\u00c8\u0083\u00bf\u0093R\u00ff\u0088j\u00be\u0012\u00f6i\u00c3H!".length();
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
                    var0_3[var6_4++] = IlIldW.a(var8_9).intern();
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
        IlIldW.IlIli = new VersionedRegistry<T>(var0_3[4]);
        IlIldW.IlIlk = IlIldW.IlIlS(var0_3[6], true, (IlIlys<IlIlq4>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, IlIlm(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlq4;)(), (IlIlh4<IlIlq4>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, IlIly(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlq4 ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlq4;)V)());
        IlIldW.IlIl_ = IlIldW.IlIlS(var0_3[2], false, (IlIlys<IlIlw>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, IlIlw(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlw;)(), (IlIlh4<IlIlw>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, IlIlL(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlw ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlw;)V)());
        IlIldW.IlIlc = IlIldW.IlIlS(var0_3[5], true, (IlIlys<IlIlAo>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, IlIll(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlAo;)(), (IlIlh4<IlIlAo>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, IlIlN(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlAo ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlAo;)V)());
        IlIldW.IlIlo = IlIldW.IlIlS(var0_3[3], false, (IlIlys<IlIlfg>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, IlIla(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlfg;)(), (IlIlh4<IlIlfg>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, IlIlm(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlfg ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlfg;)V)());
        IlIldW.IlIlR = IlIldW.IlIlS(var0_3[7], true, (IlIlys<IlIlXU>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, IlIlb(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlXU;)(), (IlIlh4<IlIlXU>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, IlIlC(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlXU ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlXU;)V)());
        IlIldW.IlIlK = IlIldW.IlIlS(var0_3[8], true, (IlIlys<IlIlG9>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, IlIlm(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlG9;)(), (IlIlh4<IlIlG9>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, IlIlH(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlG9 ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlG9;)V)());
        IlIldW.IlIlp = IlIldW.IlIlS(var0_3[1], true, (IlIlys<IlIlAA>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, IlIlJ(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlAA;)(), (IlIlh4<IlIlAA>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, IlIlu(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlAA ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlAA;)V)());
        IlIldW.IlIlO = IlIldW.IlIlS(var0_3[9], true, (IlIlys<IlIlvb>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, IlIlA(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlvb;)(), (IlIlh4<IlIlvb>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, IlIla(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlvb ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlvb;)V)());
        IlIldW.IlIlA = IlIldW.IlIlS(var0_3[0], true, (IlIlys<IlIlio>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, IlIlb(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlio;)(), (IlIlh4<IlIlio>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, IlIla(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.IlIlio ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/IlIlio;)V)());
        IlIldW.IlIli.unloadMappings();
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

