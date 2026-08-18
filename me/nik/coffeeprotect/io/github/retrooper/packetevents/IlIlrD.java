/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.threadedregions.scheduler.AsyncScheduler
 *  io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Entity
 *  org.bukkit.event.Event
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitScheduler
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.papermc.paper.threadedregions.scheduler.AsyncScheduler;
import io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlLg;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlno;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;

@Deprecated
public class IlIlrD {
    private static boolean IlIly;
    private static BukkitScheduler IlIlI;
    private static AsyncScheduler IlIlz;
    private static GlobalRegionScheduler IlIlr;
    private static Class<? extends Event> IlIlM;
    private static final long a;
    private static transient /* synthetic */ String dQWjXSsbQc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public static boolean IlIlN() {
        return IlIly;
    }

    public static void IlIlh(Plugin plugin, Runnable runnable) {
        long l = a ^ 0x3B7E50E0D9DEL;
        PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
        if (packetWrapperArray == null) {
            if (!IlIly) {
                IlIlI.runTaskAsynchronously(plugin, runnable);
                return;
            }
            IlIlz.runNow(plugin, scheduledTask -> runnable.run());
        }
    }

    public static void IlIlO(Plugin plugin, Consumer<Object> consumer, long l, long l2) {
        long l3 = a ^ 0x5040B637297FL;
        PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
        if (packetWrapperArray == null) {
            if (!IlIly) {
                Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, () -> consumer.accept(null), l, l2);
                return;
            }
            IlIlr.runAtFixedRate(plugin, scheduledTask -> consumer.accept(null), l, l2);
        }
    }

    public static void IlIlG(Plugin plugin, Consumer<Object> consumer) {
        long l = a ^ 0x127908D6FAC2L;
        PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
        if (packetWrapperArray == null) {
            if (!IlIly) {
                Bukkit.getScheduler().runTask(plugin, () -> consumer.accept(null));
                return;
            }
            IlIlr.run(plugin, scheduledTask -> consumer.accept(null));
        }
    }

    public static void IlIlM(Plugin plugin, Runnable runnable) {
        long l = a ^ 0x72560BD1F2F9L;
        PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
        if (packetWrapperArray == null) {
            if (!IlIly) {
                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, runnable);
                return;
            }
            Bukkit.getServer().getPluginManager().registerEvent(IlIlM, (Listener)new IlIlno(), EventPriority.HIGHEST, (listener, event) -> runnable.run(), plugin);
        }
    }

    public static void IlIlq(Entity entity, Plugin plugin, Runnable runnable, Runnable runnable2, long l) {
        long l2 = a ^ 0x1191FA81B1AAL;
        PacketWrapper[] packetWrapperArray = IlIlLg.IlIlw();
        boolean bl = IlIly;
        if (packetWrapperArray == null) {
            if (!bl) {
                Bukkit.getScheduler().runTaskLater(plugin, runnable, l);
                return;
            }
            bl = entity.getScheduler().execute(plugin, runnable, runnable2, l);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        a = IlIls.a(9092165710674363801L, 8206578997656524240L, MethodHandles.lookup().lookupClass()).a(109971704862168L);
        long l = a ^ 0x75B354BD0314L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u0097h\u00b0\u00c2\u00dc[@\u00f6\u00f7\u00f7l,QK9\u0092L\u00e2(3\u0082\u00c4'\u009bN\u0001\nB\u0002\u0019\u009dD9|\u0012\u001dB\u00bd\u00a87\u00f4\u00d8\u00d2V\u00c3\u001f\u00f4%\u009c\u00aeh\u0017FZ\u00e3\u00e0@\u0097h\u00b0\u00c2\u00dc[@\u00f6\u00f7\u00f7l,QK9\u0092L\u00e2(3\u0082\u00c4'\u009bN\u0001\nB\u0002\u0019\u009dD9|\u0012\u001dB\u00bd\u00a87\u00f4\u00d8\u00d2V\u00c3\u001f\u00f4%\u00f5\b\u00bb\u00ec\r\u0098R\u0001R\u00ed\u00a28\u00cc\u001eK\u00e9";
        int n2 = "\u0097h\u00b0\u00c2\u00dc[@\u00f6\u00f7\u00f7l,QK9\u0092L\u00e2(3\u0082\u00c4'\u009bN\u0001\nB\u0002\u0019\u009dD9|\u0012\u001dB\u00bd\u00a87\u00f4\u00d8\u00d2V\u00c3\u001f\u00f4%\u009c\u00aeh\u0017FZ\u00e3\u00e0@\u0097h\u00b0\u00c2\u00dc[@\u00f6\u00f7\u00f7l,QK9\u0092L\u00e2(3\u0082\u00c4'\u009bN\u0001\nB\u0002\u0019\u009dD9|\u0012\u001dB\u00bd\u00a87\u00f4\u00d8\u00d2V\u00c3\u001f\u00f4%\u00f5\b\u00bb\u00ec\r\u0098R\u0001R\u00ed\u00a28\u00cc\u001eK\u00e9".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlrD.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        try {
            Class.forName(stringArray[0]);
            IlIly = true;
            IlIlz = Bukkit.getAsyncScheduler();
            IlIlr = Bukkit.getGlobalRegionScheduler();
            IlIlM = Class.forName(stringArray[1]);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            IlIly = false;
            IlIlI = Bukkit.getScheduler();
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

