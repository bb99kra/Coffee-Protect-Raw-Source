/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.ComponentLike;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlAz;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlCr;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlGB;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlGI;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlR;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlX5;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIldz;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlyB;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlyv;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.event.IlIlnh;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.event.IlIlrV;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.key.Key;
import me.nik.coffeeprotect.libs.kyori.adventure.util.ARGBLike;

public interface IlIlAx<C extends Component>
extends Component {
    @NotNull
    default public C asComponent() {
        return (C)Component.super.asComponent();
    }

    @NotNull
    public C IlIlw(@NotNull List<? extends ComponentLike> var1);

    @NotNull
    public C IlIlB(@NotNull IlIldz var1);

    @NotNull
    default public C IlIlF(@NotNull Consumer<IlIlGI> consumer) {
        return (C)Component.super.IlIlF(consumer);
    }

    @NotNull
    default public C IlIlZ(@NotNull IlIlGI ilIlGI) {
        return (C)Component.super.IlIlZ(ilIlGI);
    }

    @NotNull
    default public C IlIlv(@NotNull Consumer<IlIlGI> consumer, @NotNull IlIlyB ilIlyB) {
        return (C)Component.super.IlIlv(consumer, ilIlyB);
    }

    @NotNull
    default public C IlIll(@NotNull Component component) {
        return (C)Component.super.IlIll(component);
    }

    @NotNull
    default public C IlIle(@NotNull Component component, IlIlAz ... ilIlAzArray) {
        return (C)Component.super.IlIle(component, ilIlAzArray);
    }

    @NotNull
    default public C IlIlv(@NotNull Component component) {
        return (C)Component.super.IlIlv(component);
    }

    @NotNull
    default public C IlIlI(@NotNull ComponentLike componentLike) {
        return (C)Component.super.IlIlI(componentLike);
    }

    @NotNull
    default public C IlIlZ(@NotNull IlIlR<?, ?> ilIlR) {
        return (C)Component.super.IlIlZ(ilIlR);
    }

    @NotNull
    default public C append(@NotNull List<? extends ComponentLike> list) {
        return (C)Component.super.append(list);
    }

    @NotNull
    default public C IlIle(ComponentLike ... componentLikeArray) {
        return (C)Component.super.IlIle(componentLikeArray);
    }

    @NotNull
    default public C IlIlU() {
        return (C)Component.super.IlIlU();
    }

    @NotNull
    default public C IlIlW() {
        return (C)Component.super.IlIlW();
    }

    @NotNull
    default public C IlIll(IlIlCr ... ilIlCrArray) {
        return (C)Component.super.IlIll(ilIlCrArray);
    }

    @NotNull
    default public C IlIlm(@NotNull IlIldz ilIldz) {
        return (C)Component.super.IlIlm(ilIldz);
    }

    @NotNull
    default public C IlIlw(@NotNull Component component, @NotNull Set<IlIlAz> set) {
        return (C)Component.super.IlIlw(component, set);
    }

    @NotNull
    default public C IlIlY(@Nullable IlIlX5 ilIlX5) {
        return (C)Component.super.IlIlY(ilIlX5);
    }

    @NotNull
    default public C IlIlt(@Nullable IlIlX5 ilIlX5) {
        return (C)Component.super.IlIlt(ilIlX5);
    }

    @NotNull
    default public C IlIly(@Nullable ARGBLike aRGBLike) {
        return (C)Component.super.IlIly(aRGBLike);
    }

    @NotNull
    default public C IlIlb(@Nullable ARGBLike aRGBLike) {
        return (C)Component.super.IlIlb(aRGBLike);
    }

    @NotNull
    default public C IlIlo(@NotNull IlIlyv ilIlyv) {
        return (C)Component.super.IlIlo(ilIlyv);
    }

    @NotNull
    default public C IlIlT(@NotNull IlIlyv ilIlyv, boolean bl) {
        return (C)Component.super.IlIlT(ilIlyv, bl);
    }

    @NotNull
    default public C IlIlC(@NotNull IlIlyv ilIlyv, @NotNull IlIlGB ilIlGB) {
        return (C)Component.super.IlIlC(ilIlyv, ilIlGB);
    }

    @NotNull
    default public C IlIly(@NotNull IlIlyv ilIlyv, @NotNull IlIlGB ilIlGB) {
        return (C)Component.super.IlIly(ilIlyv, ilIlGB);
    }

    @NotNull
    default public C IlIle(@NotNull Map<IlIlyv, IlIlGB> map) {
        return (C)Component.super.IlIle(map);
    }

    @NotNull
    default public C IlIll(@Nullable IlIlnh ilIlnh) {
        return (C)Component.super.IlIll(ilIlnh);
    }

    @NotNull
    default public C IlIlj(@Nullable IlIlrV<?> ilIlrV) {
        return (C)Component.super.IlIlj(ilIlrV);
    }

    @NotNull
    default public C IlIlN(@Nullable String string) {
        return (C)Component.super.IlIlN(string);
    }

    @NotNull
    default public C IlIlD(@Nullable Key key) {
        return (C)Component.super.IlIlD(key);
    }
}

