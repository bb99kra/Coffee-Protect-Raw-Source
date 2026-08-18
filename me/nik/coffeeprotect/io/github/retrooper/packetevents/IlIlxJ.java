/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.threadedregions.scheduler.RegionScheduler
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitScheduler
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.papermc.paper.threadedregions.scheduler.RegionScheduler;
import java.lang.invoke.MethodHandles;
import java.util.function.Consumer;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlQ2;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlfO;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;

public class IlIlxJ {
    private BukkitScheduler IlIlq;
    private RegionScheduler IlIlV;
    private static final long a = IlIls.a(1361030964766101209L, -6161754699843797415L, MethodHandles.lookup().lookupClass()).a(80679620360839L);
    private static transient /* synthetic */ String YZtpauTndb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    protected IlIlxJ() {
        block4: {
            block3: {
                String[] stringArray;
                block2: {
                    long l = a ^ 0x36B004A7D99CL;
                    String[] stringArray2 = IlIlQ2.IlIlQ();
                    stringArray = stringArray2;
                    if (stringArray != null) break block2;
                    if (!IlIlQ2.IlIlK) break block3;
                    this.IlIlV = Bukkit.getRegionScheduler();
                }
                if (stringArray == null) break block4;
            }
            this.IlIlq = Bukkit.getScheduler();
        }
    }

    public void IlIlF(@NotNull Plugin plugin, @NotNull World world, int n, int n2, @NotNull Runnable runnable) {
        long l = a ^ 0x14584BA67BC0L;
        String[] stringArray = IlIlQ2.IlIlQ();
        if (stringArray == null) {
            if (!IlIlQ2.IlIlK) {
                this.IlIlq.runTask(plugin, runnable);
                return;
            }
            this.IlIlV.execute(plugin, world, n, n2, runnable);
        }
    }

    public void IlIlt(@NotNull Plugin plugin, @NotNull Location location, @NotNull Runnable runnable) {
        long l = a ^ 0x26DD1F285AC3L;
        String[] stringArray = IlIlQ2.IlIlQ();
        if (stringArray == null) {
            if (!IlIlQ2.IlIlK) {
                Bukkit.getScheduler().runTask(plugin, runnable);
                return;
            }
            this.IlIlV.execute(plugin, location, runnable);
        }
    }

    public IlIlfO IlIll(@NotNull Plugin plugin, @NotNull World world, int n, int n2, @NotNull Consumer<Object> consumer) {
        long l = a ^ 0x1B28C2C41FEFL;
        if (!IlIlQ2.IlIlK) {
            return new IlIlfO(Bukkit.getScheduler().runTask(plugin, () -> consumer.accept(null)));
        }
        return new IlIlfO(this.IlIlV.run(plugin, world, n, n2, scheduledTask -> consumer.accept(null)));
    }

    public IlIlfO IlIlY(@NotNull Plugin plugin, @NotNull Location location, @NotNull Consumer<Object> consumer) {
        long l = a ^ 0x668A42971893L;
        if (!IlIlQ2.IlIlK) {
            return new IlIlfO(Bukkit.getScheduler().runTask(plugin, () -> consumer.accept(null)));
        }
        return new IlIlfO(this.IlIlV.run(plugin, location, scheduledTask -> consumer.accept(null)));
    }

    public IlIlfO IlIll(@NotNull Plugin plugin, @NotNull World world, int n, int n2, @NotNull Consumer<Object> consumer, long l) {
        long l2 = a ^ 0x553F454E6C2DL;
        String[] stringArray = IlIlQ2.IlIlQ();
        long l3 = l - 1L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (stringArray == null) {
            if (l4 < 0) {
                l = 1L;
            }
            l4 = (long)IlIlQ2.IlIlK;
        }
        if (l4 == false) {
            return new IlIlfO(Bukkit.getScheduler().runTaskLater(plugin, () -> consumer.accept(null), l));
        }
        return new IlIlfO(this.IlIlV.runDelayed(plugin, world, n, n2, scheduledTask -> consumer.accept(null), l));
    }

    public IlIlfO IlIlF(@NotNull Plugin plugin, @NotNull Location location, @NotNull Consumer<Object> consumer, long l) {
        long l2 = a ^ 0x4D01CAD0E6FDL;
        String[] stringArray = IlIlQ2.IlIlQ();
        long l3 = l - 1L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (stringArray == null) {
            if (l4 < 0) {
                l = 1L;
            }
            l4 = (long)IlIlQ2.IlIlK;
        }
        if (l4 == false) {
            return new IlIlfO(Bukkit.getScheduler().runTaskLater(plugin, () -> consumer.accept(null), l));
        }
        return new IlIlfO(this.IlIlV.runDelayed(plugin, location, scheduledTask -> consumer.accept(null), l));
    }

    public IlIlfO IlIlX(@NotNull Plugin plugin, @NotNull World world, int n, int n2, @NotNull Consumer<Object> consumer, long l, long l2) {
        long l3 = a ^ 0x6D1F3B0D1FBL;
        String[] stringArray = IlIlQ2.IlIlQ();
        long l4 = l - 1L;
        long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (stringArray == null) {
            long l6;
            if (l5 < 0) {
                l = 1L;
            }
            l5 = (l6 = l2 - 1L) == 0L ? 0 : (l6 < 0L ? -1 : 1);
        }
        if (stringArray == null) {
            if (l5 < 0) {
                l2 = 1L;
            }
            l5 = (long)IlIlQ2.IlIlK;
        }
        if (l5 == false) {
            return new IlIlfO(Bukkit.getScheduler().runTaskTimer(plugin, () -> consumer.accept(null), l, l2));
        }
        return new IlIlfO(this.IlIlV.runAtFixedRate(plugin, world, n, n2, scheduledTask -> consumer.accept(null), l, l2));
    }

    public IlIlfO IlIlf(@NotNull Plugin plugin, @NotNull Location location, @NotNull Consumer<Object> consumer, long l, long l2) {
        long l3 = a ^ 0x198EF42A29BAL;
        String[] stringArray = IlIlQ2.IlIlQ();
        long l4 = l - 1L;
        long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (stringArray == null) {
            long l6;
            if (l5 < 0) {
                l = 1L;
            }
            l5 = (l6 = l2 - 1L) == 0L ? 0 : (l6 < 0L ? -1 : 1);
        }
        if (stringArray == null) {
            if (l5 < 0) {
                l2 = 1L;
            }
            l5 = (long)IlIlQ2.IlIlK;
        }
        if (l5 == false) {
            return new IlIlfO(Bukkit.getScheduler().runTaskTimer(plugin, () -> consumer.accept(null), l, l2));
        }
        return new IlIlfO(this.IlIlV.runAtFixedRate(plugin, location, scheduledTask -> consumer.accept(null), l, l2));
    }
}

