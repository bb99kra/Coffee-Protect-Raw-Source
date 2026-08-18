/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandlerContext
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.IlIlTj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIluW
implements IlIlTj {
    private static int[] IlIlM;
    private static final long a;
    private static transient /* synthetic */ String imiiwFjsMJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public SocketAddress IlIlp(Object object) {
        return ((Channel)object).remoteAddress();
    }

    @Override
    public SocketAddress IlIls(Object object) {
        return ((Channel)object).localAddress();
    }

    @Override
    public boolean IlIlz(Object object) {
        return ((Channel)object).isOpen();
    }

    @Override
    public Object IlIlg(Object object) {
        return ((Channel)object).close();
    }

    @Override
    public Object IlIlK(Object object, Object object2) {
        return ((Channel)object).write(object2);
    }

    @Override
    public Object IlIlB(Object object) {
        return ((Channel)object).flush();
    }

    @Override
    public Object IlIlX(Object object, Object object2) {
        return ((Channel)object).writeAndFlush(object2);
    }

    @Override
    public Object IlIlu(Object object, Object object2) {
        return ((Channel)object).pipeline().fireChannelRead(object2);
    }

    @Override
    public Object IlIlG(Object object, String string, Object object2) {
        return ((Channel)object).pipeline().context(string).write(object2);
    }

    @Override
    public Object IlIlT(Object object, String string) {
        return ((Channel)object).pipeline().context(string).flush();
    }

    @Override
    public Object IlIlQ(Object object, String string, Object object2) {
        long l = a ^ 0x4334E6132C70L;
        int[] nArray = IlIluW.IlIlA();
        ChannelFuture channelFuture = ((Channel)object).pipeline().context(string).writeAndFlush(object2);
        if (PacketWrapper.IlIlz() == null) {
            IlIluW.IlIlR(new int[1]);
        }
        return channelFuture;
    }

    @Override
    public Object IlIlq(Object object, String string, Object object2) {
        long l = a ^ 0x7E201B00B6EL;
        int[] nArray = IlIluW.IlIlA();
        ChannelHandlerContext channelHandlerContext = ((Channel)object).pipeline().context(string).fireChannelRead(object2);
        if (nArray == null) {
            PacketWrapper.IlIle(new int[2]);
        }
        return channelHandlerContext;
    }

    @Override
    public List<String> IlIlC(Object object) {
        return ((Channel)object).pipeline().names();
    }

    @Override
    public Object IlIlW(Object object, String string) {
        return ((Channel)object).pipeline().get(string);
    }

    @Override
    public Object IlIlK(Object object, String string) {
        return ((Channel)object).pipeline().context(string);
    }

    @Override
    public Object IlIlU(Object object) {
        return ((Channel)object).pipeline();
    }

    @Override
    public void IlIli(Object object, Runnable runnable) {
        ((Channel)object).eventLoop().execute(runnable);
    }

    @Override
    public Object IlIlp(Object object) {
        return ((Channel)object).alloc().buffer();
    }

    public static void IlIlR(int[] nArray) {
        IlIlM = nArray;
    }

    public static int[] IlIlA() {
        return IlIlM;
    }

    static {
        a = IlIls.a(1290224920289603352L, 657687568644328645L, MethodHandles.lookup().lookupClass()).a(121945407379328L);
        if (IlIluW.IlIlA() == null) {
            IlIluW.IlIlR(new int[5]);
        }
    }
}

