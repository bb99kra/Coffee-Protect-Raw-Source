/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.renderer;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlAz;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlL1;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlL_;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlO5;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlR;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlXM;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlZR;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlc;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIldn;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlfU;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlhF;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIliK;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlnf;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIloE;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlou;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlqt;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlrS;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlu8;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlup;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlx6;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlyn;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.TextComponent;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.TranslatableComponent;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.event.IlIlh_;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.renderer.IlIljM;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.renderer.IlIljs;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.translation.Translator;

public abstract class TranslatableComponentRenderer<C>
extends IlIljM<C> {
    private static final Set<IlIlAz> IlIlf;
    private static final long b;
    private static final String d;

    @NotNull
    public static TranslatableComponentRenderer<Locale> usingTranslationSource(@NotNull Translator translator) {
        long l = b ^ 0x1ECF802ACD25L;
        Objects.requireNonNull(translator, d);
        return new IlIljs(translator);
    }

    @Nullable
    protected MessageFormat IlIlh(@NotNull String string, @NotNull C c) {
        return null;
    }

    @Nullable
    protected MessageFormat IlIlC(@NotNull String string, @Nullable String string2, @NotNull C c) {
        return this.IlIlh(string, c);
    }

    @Override
    @NotNull
    protected Component IlIlA(@NotNull IlIlrS ilIlrS, @NotNull C c) {
        IlIlou ilIlou = this.IlIlW(c, Component.IlIlx(), ilIlrS).IlIla(ilIlrS.IlIlx());
        return this.IlIlc(ilIlrS, ilIlou, c);
    }

    @Override
    @NotNull
    protected Component IlIlR(@NotNull IlIlhF ilIlhF, @NotNull C c) {
        IlIldn ilIldn = this.IlIlW(c, Component.IlIlM(), ilIlhF).IlIlf(ilIlhF.IlIl_());
        return this.IlIlc(ilIlhF, ilIldn, c);
    }

    @Override
    @NotNull
    protected Component IlIlZ(@NotNull IlIlnf ilIlnf, @NotNull C c) {
        IlIlL1 ilIlL1 = this.IlIlW(c, Component.IlIlZ(), ilIlnf).IlIlf(ilIlnf.IlIlk());
        return this.IlIlc(ilIlnf, ilIlL1, c);
    }

    protected <O extends IlIlXM<O, B>, B extends IlIlx6<O, B>> B IlIlW(@NotNull C c, B b, O o) {
        long l = TranslatableComponentRenderer.b ^ 0x7CD4412D69DDL;
        b.IlIll(o.IlIlv()).IlIln(o.IlIlw());
        Component component = o.IlIlH();
        if (component != null) {
            b.IlIlq(this.render(component, c));
        }
        return b;
    }

    @Override
    @NotNull
    protected Component IlIlf(@NotNull IlIlqt ilIlqt, @NotNull C c) {
        IlIlfU ilIlfU = Component.IlIlG().IlIlS(ilIlqt.IlIlG());
        return this.IlIlc(ilIlqt, ilIlfU, c);
    }

    @Override
    @NotNull
    protected Component IlIlq(@NotNull IlIlup ilIlup, @NotNull C c) {
        long l = b ^ 0x32533FF91721L;
        IlIlL_ ilIlL_ = Component.IlIlH().IlIlc(ilIlup.IlIld()).IlIll(ilIlup.IlIlZ()).IlIlb(ilIlup.IlIlO());
        String[] stringArray = IlIljM.IlIlg();
        Object o = this.IlIlc(ilIlup, ilIlL_, c);
        if (stringArray == null) {
            PacketWrapper.IlIle(new int[2]);
        }
        return o;
    }

    @Override
    @NotNull
    protected Component IlIlQ(@NotNull IlIlyn ilIlyn, @NotNull C c) {
        IlIlu8 ilIlu8 = Component.IlIlp().IlIlZ(ilIlyn.IlIlM());
        return this.IlIlc(ilIlyn, ilIlu8, c);
    }

    @Override
    @NotNull
    protected Component IlIlU(@NotNull TextComponent textComponent, @NotNull C c) {
        IlIloE ilIloE = Component.IlIlB().IlIld(textComponent.IlIlF());
        return this.IlIlc(textComponent, ilIloE, c);
    }

    @Override
    @NotNull
    protected Component IlIlP(@NotNull TranslatableComponent translatableComponent, @NotNull C c) {
        block10: {
            IlIliK ilIliK;
            block7: {
                String[] stringArray;
                List<IlIlc> list;
                block9: {
                    boolean bl;
                    block8: {
                        long l = b ^ 0x1AD577D9D953L;
                        list = translatableComponent.IlIlr();
                        List<Component> list2 = translatableComponent.children();
                        stringArray = IlIljM.IlIlg();
                        bl = list.isEmpty();
                        if (stringArray == null) break block8;
                        if (!bl) break block9;
                        bl = list2.isEmpty();
                    }
                    if (bl) break block10;
                }
                ilIliK = (IlIliK)translatableComponent.IlIlz();
                if (!list.isEmpty()) {
                    ArrayList<IlIlc> arrayList = new ArrayList<IlIlc>(list);
                    int n = 0;
                    while (n < arrayList.size()) {
                        IlIlc ilIlc = (IlIlc)arrayList.get(n);
                        if (stringArray != null) {
                            if (stringArray != null) {
                                if (ilIlc.IlIlx() instanceof Component) {
                                    Object object = ilIlc.IlIlx();
                                    if (stringArray != null && !(object instanceof IlIlO5)) {
                                        object = arrayList.set(n, IlIlc.IlIlw(this.render((Component)ilIlc.IlIlx(), c)));
                                    }
                                }
                                ++n;
                            }
                            if (stringArray != null) continue;
                        }
                        break block7;
                    }
                    ilIliK.IlIlu(arrayList);
                }
            }
            translatableComponent = (TranslatableComponent)ilIliK.IlIlX();
        }
        return this.IlIll(translatableComponent, c);
    }

    @NotNull
    protected Component IlIll(@NotNull TranslatableComponent translatableComponent, @NotNull C c) {
        long l = b ^ 0x1CF0D143A20FL;
        MessageFormat messageFormat = this.IlIlC(translatableComponent.key(), translatableComponent.IlIlk(), c);
        String[] stringArray = IlIljM.IlIlg();
        if (messageFormat == null) {
            return this.IlIle(translatableComponent, c);
        }
        List<IlIlc> list = translatableComponent.IlIlr();
        IlIloE ilIloE = Component.IlIlB();
        this.IlIlo(translatableComponent, ilIloE, c);
        int n = list.isEmpty();
        if (stringArray != null) {
            if (n != 0) {
                ilIloE.IlIld(messageFormat.format(null, new StringBuffer(), null).toString());
                return this.IlIlf(translatableComponent.children(), ilIloE, c);
            }
            n = list.size();
        }
        Object[] objectArray = new Object[n];
        StringBuffer stringBuffer = messageFormat.format(objectArray, new StringBuffer(), (FieldPosition)null);
        AttributedCharacterIterator attributedCharacterIterator = messageFormat.formatToCharacterIterator(objectArray);
        while (attributedCharacterIterator.getIndex() < attributedCharacterIterator.getEndIndex()) {
            int n2;
            block9: {
                block8: {
                    Object object;
                    block7: {
                        n2 = attributedCharacterIterator.getRunLimit();
                        Integer n3 = (Integer)attributedCharacterIterator.getAttribute(MessageFormat.Field.ARGUMENT);
                        object = n3;
                        if (stringArray == null) break block7;
                        if (object == null) break block8;
                        object = list.get(n3);
                    }
                    IlIlc ilIlc = (IlIlc)object;
                    ilIloE.IlIlt(ilIlc.asComponent());
                    if (stringArray != null) break block9;
                }
                ilIloE.IlIlt(Component.text(stringBuffer.substring(attributedCharacterIterator.getIndex(), n2)));
            }
            attributedCharacterIterator.setIndex(n2);
            if (stringArray != null) continue;
        }
        return this.IlIlf(translatableComponent.children(), ilIloE, c);
    }

    protected Component IlIle(Component component2, C c) {
        List<Component> list;
        long l = b ^ 0x2C5DDFFBC860L;
        IlIlh_<?> ilIlh_ = component2.IlIlB();
        if (ilIlh_ != null) {
            component2 = component2.IlIlj(ilIlh_.IlIly(this, c));
        }
        if ((list = component2.children()).isEmpty()) {
            return component2;
        }
        ArrayList arrayList = new ArrayList(list.size());
        list.forEach(component -> arrayList.add(this.render((Component)component, c)));
        return component2.IlIlw(arrayList);
    }

    protected <O extends IlIlZR<O, B>, B extends IlIlR<O, B>> O IlIlc(Component component, B b, C c) {
        this.IlIlo(component, b, c);
        return this.IlIlf(component.children(), b, c);
    }

    protected <O extends IlIlZR<O, B>, B extends IlIlR<O, B>> O IlIlf(List<Component> list, B b, C c) {
        block3: {
            List<Component> list2;
            block2: {
                long l = TranslatableComponentRenderer.b ^ 0x63F638C42440L;
                String[] stringArray = IlIljM.IlIlg();
                list2 = list;
                if (stringArray == null) break block2;
                if (list2.isEmpty()) break block3;
                list2 = list;
            }
            list2.forEach(component -> b.IlIlt(this.render((Component)component, c)));
        }
        return b.IlIlX();
    }

    protected <B extends IlIlR<?, ?>> void IlIlo(Component component, B b, C c) {
        long l = TranslatableComponentRenderer.b ^ 0x3C5784B96E25L;
        b.IlIlK(component, IlIlf);
        b.IlIlU(component.IlIlo());
        IlIlh_<?> ilIlh_ = component.IlIlB();
        String[] stringArray = IlIljM.IlIlg();
        if (ilIlh_ != null) {
            b.IlIlY(ilIlh_.IlIly(this, c));
        }
        if (PacketWrapper.IlIlz() == null) {
            IlIljM.IlIlL(new String[5]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = IlIls.a(-4394756440348881078L, 14396315585317232L, MethodHandles.lookup().lookupClass()).a(278323868208444L);
        long l = b ^ 0x1884BB605DC4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("~d\u00f8\u00c1\u00bcXB\u00d9".getBytes("ISO-8859-1"));
                d = TranslatableComponentRenderer.a(byArray3).intern();
                EnumSet<IlIlAz> enumSet = EnumSet.allOf(IlIlAz.class);
                enumSet.remove((Object)IlIlAz.EVENTS);
                IlIlf = Collections.unmodifiableSet(enumSet);
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

