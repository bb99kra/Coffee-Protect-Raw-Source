/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.block.data.BlockData
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Pose
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.MainHand
 *  org.bukkit.material.MaterialData
 *  org.bukkit.potion.PotionEffectType
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.IlIlqX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.IlIlnm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.type.IlIlGt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.type.IlIlQP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.type.IlIlLo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlOh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIljY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.IlIlQL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.IlIlXx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlPu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIliP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIliN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlnq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.IlIld_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.SimpleTypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlLg;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pose;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffectType;

public final class IlIlqC {
    private static final long a = IlIls.a(-4066280008938196712L, -2400664892051433931L, MethodHandles.lookup().lookupClass()).a(202189980878356L);
    private static final String b;
    private static transient /* synthetic */ String hmgiolfKKs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlqC() {
    }

    public static IlIliP IlIlg(Location location) {
        return new IlIliP(location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
    }

    public static Location IlIlp(World world, IlIliP ilIliP) {
        return new Location(world, ilIliP.IlIlm(), ilIliP.IlIlh(), ilIliP.IlIlR(), ilIliP.IlIlH(), ilIliP.IlIlP());
    }

    public static IlIlQL IlIlD(PotionEffectType potionEffectType) {
        long l = a ^ 0xB6ED74C1B21L;
        ServerVersion serverVersion = IlIlr7.IlIlb().IlIlq().IlIlF();
        PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
        int n = potionEffectType.getId();
        int n2 = serverVersion.IlIlz(ServerVersion.V_1_20_2);
        if (packetWrapperArray == null) {
            if (n2 != 0) {
                // empty if block
            }
            n2 = --n;
        }
        return IlIlXx.IlIlz(n2, serverVersion);
    }

    public static PotionEffectType IlIlD(IlIlQL ilIlQL) {
        long l = a ^ 0x212AABC4CABFL;
        ClientVersion clientVersion = IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE();
        PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
        int n = ilIlQL.IlIlH(clientVersion);
        int n2 = clientVersion.IlIlw(ClientVersion.V_1_20_2);
        if (packetWrapperArray == null) {
            if (n2 != 0) {
                // empty if block
            }
            n2 = ++n;
        }
        return PotionEffectType.getById((int)n2);
    }

    public static IlIljY IlIlj(GameMode gameMode) {
        return IlIljY.IlIlE(gameMode.getValue());
    }

    public static GameMode IlIlS(IlIljY ilIljY) {
        return GameMode.getByValue((int)ilIljY.IlIli());
    }

    public static IlIld_ IlIlA(BlockData blockData) {
        String string = blockData.getAsString(false);
        return IlIld_.IlIlE(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE(), string);
    }

    public static BlockData IlIlo(IlIld_ ilIld_) {
        return Bukkit.createBlockData((String)ilIld_.toString());
    }

    public static IlIlGt IlIlJ(EntityType entityType) {
        long l = a ^ 0x4448C1650555L;
        ServerVersion serverVersion = IlIlr7.IlIlb().IlIlq().IlIlF();
        PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
        int n = serverVersion.IlIlz(ServerVersion.V_1_14);
        if (packetWrapperArray == null) {
            if (n != 0) {
                return IlIlQP.IlIls(entityType.getKey().toString());
            }
            n = serverVersion.IlIlz(ServerVersion.V_1_13);
        }
        if (packetWrapperArray == null) {
            if (n != 0) {
                return IlIlQP.IlIls(b + entityType.getName());
            }
            n = entityType.getTypeId();
        }
        if (n == -1) {
            return null;
        }
        return IlIlQP.IlIlP(serverVersion.IlIlE(), entityType.getTypeId());
    }

    public static EntityType IlIlI(IlIlGt ilIlGt) {
        long l = a ^ 0xF81D38B902BL;
        ServerVersion serverVersion = IlIlr7.IlIlb().IlIlq().IlIlF();
        PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
        int n = serverVersion.IlIlz(ServerVersion.V_1_13);
        if (packetWrapperArray == null) {
            if (n != 0) {
                return EntityType.fromName((String)ilIlGt.getName().getKey());
            }
            n = ilIlGt.IlIlH(serverVersion.IlIlE());
        }
        return EntityType.fromId((int)n);
    }

    public static ItemType IlIlF(Material material) {
        ItemStack itemStack = new ItemStack(material);
        IlIlCg ilIlCg = IlIlqC.IlIln(itemStack);
        return ilIlCg.IlIlJ();
    }

    public static Material IlIlv(ItemType itemType) {
        IlIlCg ilIlCg = IlIlCg.IlIlq().IlIlC(itemType).IlIlD();
        ItemStack itemStack = IlIlqC.IlIlm(ilIlCg);
        return itemStack.getType();
    }

    public static IlIld_ IlIlY(MaterialData materialData) {
        int n = IlIlLg.IlIlY(materialData);
        ServerVersion serverVersion = IlIlr7.IlIlb().IlIlq().IlIlF();
        return IlIld_.IlIlW(serverVersion.IlIlE(), n);
    }

    public static MaterialData IlIlU(IlIld_ ilIld_) {
        return IlIlLg.IlIl_(ilIld_.IlIls());
    }

    public static IlIlCg IlIln(ItemStack itemStack) {
        return IlIlLg.IlIlc(itemStack);
    }

    public static ItemStack IlIlm(IlIlCg ilIlCg) {
        return IlIlLg.IlIls(ilIlCg);
    }

    public static IlIlnq IlIll(World world) {
        Object object;
        ServerVersion serverVersion;
        block6: {
            boolean bl;
            block5: {
                long l = a ^ 0x614F538E0F05L;
                serverVersion = IlIlr7.IlIlb().IlIlq().IlIlF();
                PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
                bl = serverVersion.IlIlC(ServerVersion.V_1_14);
                if (packetWrapperArray != null) break block5;
                if (bl) {
                    int n = world.getEnvironment().getId();
                    return IlIliN.IlIlQ().getById(serverVersion.IlIlE(), n);
                }
                object = serverVersion;
                if (packetWrapperArray != null) break block6;
                bl = ((ServerVersion)((Object)object)).IlIlC(ServerVersion.V_1_16);
            }
            if (bl) {
                Object object2 = IlIlLg.IlIlK(world);
                int n = IlIlLg.IlIlZ(object2);
                return IlIliN.IlIlQ().getById(serverVersion.IlIlE(), n);
            }
            object = IlIlLg.IlIlK(world);
        }
        Object object3 = object;
        Object object4 = IlIlLg.IlIlB(object3);
        NBTCompound nBTCompound = IlIlLg.IlIlQ(object4);
        ResourceLocation resourceLocation = new ResourceLocation(IlIlLg.IlIlg(object3));
        int n = IlIlLg.IlIlZ(object3);
        return (IlIlnq)((IlIlnq)IlIlnq.IlIlY.IlIlA(nBTCompound, PacketWrapper.IlIlE(serverVersion.IlIlE()))).copy(new SimpleTypesBuilderData(resourceLocation, n));
    }

    @Deprecated
    public static IlIlPu IlIlF(World world) {
        Object object;
        PacketWrapper[] packetWrapperArray;
        ServerVersion serverVersion;
        block8: {
            boolean bl;
            block7: {
                long l = a ^ 0x4739CB9805F1L;
                serverVersion = IlIlr7.IlIlb().IlIlq().IlIlF();
                packetWrapperArray = IlIlLg.IlIlw();
                bl = serverVersion.IlIlC(ServerVersion.V_1_14);
                if (packetWrapperArray != null) break block7;
                if (bl) {
                    return new IlIlPu(world.getEnvironment().getId());
                }
                object = serverVersion;
                if (packetWrapperArray != null) break block8;
                bl = ((ServerVersion)((Object)object)).IlIlC(ServerVersion.V_1_16);
            }
            if (bl) {
                Object object2 = IlIlLg.IlIlK(world);
                return new IlIlPu(IlIlLg.IlIlZ(object2));
            }
            object = IlIlLg.IlIlK(world);
        }
        Object object3 = object;
        Object object4 = IlIlLg.IlIlB(object3);
        IlIlPu ilIlPu = new IlIlPu(IlIlLg.IlIlQ(object4));
        if (packetWrapperArray == null) {
            if (serverVersion.IlIlC(ServerVersion.V_1_16_2)) {
                ilIlPu.IlIlC(IlIlLg.IlIlg(object3));
            }
            ilIlPu.IlIll(IlIlLg.IlIlZ(object3));
        }
        return ilIlPu;
    }

    public static IlIlLo<?> IlIlL(Enum<?> enum_) {
        return IlIlLg.IlIlC(enum_);
    }

    public static Enum<?> IlIlz(IlIlLo<?> ilIlLo) {
        return IlIlLg.IlIlj(ilIlLo);
    }

    public static @Nullable Entity IlIls(@Nullable World world, int n) {
        return IlIlLg.IlIli(world, n);
    }

    public static Pose IlIlg(IlIlqX ilIlqX) {
        return Pose.values()[ilIlqX.ordinal()];
    }

    public static IlIlqX IlIle(Pose pose) {
        return IlIlqX.values()[pose.ordinal()];
    }

    public static MainHand IlIlv(IlIlOh ilIlOh) {
        return MainHand.values()[ilIlOh.ordinal()];
    }

    public static List<IlIlnm<?>> IlIlU(Entity entity) {
        return IlIlLg.IlIlO(entity);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x4E26D8963124L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ed@\u00f96\u00c7\u00a1nc\u0098x\f\u00ee\u0097:\u00d8\u00de".getBytes("ISO-8859-1"));
                b = IlIlqC.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

