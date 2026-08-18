/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.netty.buffer.ByteBuf;
import java.nio.charset.Charset;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.IlIlGe;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlX
implements IlIlGe {
    private static boolean IlIlN;
    private static transient /* synthetic */ String NFfbZGeZwD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public int IlIlV(Object object) {
        return ((ByteBuf)object).capacity();
    }

    @Override
    public Object IlIlu(Object object, int n) {
        return ((ByteBuf)object).capacity(n);
    }

    @Override
    public int IlIlv(Object object) {
        return ((ByteBuf)object).readerIndex();
    }

    @Override
    public Object IlIlA(Object object, int n) {
        return ((ByteBuf)object).readerIndex(n);
    }

    @Override
    public int IlIlk(Object object) {
        return ((ByteBuf)object).writerIndex();
    }

    @Override
    public Object IlIly(Object object, int n) {
        return ((ByteBuf)object).writerIndex(n);
    }

    @Override
    public int IlIlo(Object object) {
        return ((ByteBuf)object).readableBytes();
    }

    @Override
    public int IlIlA(Object object) {
        return ((ByteBuf)object).writableBytes();
    }

    @Override
    public Object IlIlJ(Object object) {
        return ((ByteBuf)object).clear();
    }

    @Override
    public byte IlIlj(Object object) {
        return ((ByteBuf)object).readByte();
    }

    @Override
    public short IlIlU(Object object) {
        return ((ByteBuf)object).readShort();
    }

    @Override
    public int IlIlQ(Object object) {
        return ((ByteBuf)object).readMedium();
    }

    @Override
    public int IlIlD(Object object) {
        return ((ByteBuf)object).readInt();
    }

    @Override
    public long IlIlD(Object object) {
        return ((ByteBuf)object).readUnsignedInt();
    }

    @Override
    public long IlIlk(Object object) {
        return ((ByteBuf)object).readLong();
    }

    @Override
    public void IlIlJ(Object object, int n) {
        ((ByteBuf)object).writeByte(n);
    }

    @Override
    public void IlIla(Object object, int n) {
        ((ByteBuf)object).writeShort(n);
    }

    @Override
    public void IlIlY(Object object, int n) {
        ((ByteBuf)object).writeShortLE(n);
    }

    @Override
    public void IlIlQ(Object object, int n) {
        ((ByteBuf)object).writeMedium(n);
    }

    @Override
    public void IlIlV(Object object, int n) {
        ((ByteBuf)object).writeInt(n);
    }

    @Override
    public void IlIlt(Object object, long l) {
        ((ByteBuf)object).writeLong(l);
    }

    @Override
    public Object IlIlg(Object object, int n, byte[] byArray) {
        return ((ByteBuf)object).getBytes(n, byArray);
    }

    @Override
    public short IlIlW(Object object, int n) {
        return ((ByteBuf)object).getUnsignedByte(n);
    }

    @Override
    public boolean IlIlG(Object object) {
        return ((ByteBuf)object).isReadable();
    }

    @Override
    public Object IlIlI(Object object) {
        return ((ByteBuf)object).copy();
    }

    @Override
    public Object IlIlD(Object object) {
        return ((ByteBuf)object).duplicate();
    }

    @Override
    public boolean IlIlo(Object object) {
        return ((ByteBuf)object).hasArray();
    }

    @Override
    public byte[] IlIlj(Object object) {
        return ((ByteBuf)object).array();
    }

    @Override
    public Object IlIlX(Object object) {
        return ((ByteBuf)object).retain();
    }

    @Override
    public Object IlIlR(Object object) {
        return ((ByteBuf)object).retainedDuplicate();
    }

    @Override
    public Object IlIlN(Object object, int n) {
        return ((ByteBuf)object).readSlice(n);
    }

    @Override
    public Object IlIlf(Object object, byte[] byArray, int n, int n2) {
        return ((ByteBuf)object).readBytes(byArray, n, n2);
    }

    @Override
    public Object IlIlK(Object object, int n) {
        return ((ByteBuf)object).readBytes(n);
    }

    @Override
    public Object IlIlC(Object object, Object object2) {
        return ((ByteBuf)object).writeBytes((ByteBuf)object2);
    }

    @Override
    public Object IlIlH(Object object, byte[] byArray) {
        return ((ByteBuf)object).writeBytes(byArray);
    }

    @Override
    public Object IlIlw(Object object, byte[] byArray, int n, int n2) {
        return ((ByteBuf)object).writeBytes(byArray, n, n2);
    }

    @Override
    public void IlIlA(Object object, byte[] byArray) {
        ((ByteBuf)object).readBytes(byArray);
    }

    @Override
    public boolean IlIlN(Object object) {
        return ((ByteBuf)object).release();
    }

    @Override
    public int IlIlS(Object object) {
        return ((ByteBuf)object).refCnt();
    }

    @Override
    public Object IlIls(Object object, int n) {
        return ((ByteBuf)object).skipBytes(n);
    }

    @Override
    public String IlIlt(Object object, int n, int n2, Charset charset) {
        return ((ByteBuf)object).toString(n, n2, charset);
    }

    @Override
    public Object IlIlF(Object object) {
        return ((ByteBuf)object).markReaderIndex();
    }

    @Override
    public Object IlIly(Object object) {
        return ((ByteBuf)object).resetReaderIndex();
    }

    @Override
    public Object IlIlM(Object object) {
        return ((ByteBuf)object).markWriterIndex();
    }

    @Override
    public Object IlIlW(Object object) {
        return ((ByteBuf)object).resetWriterIndex();
    }

    @Override
    public Object IlIlj(Object object) {
        return ((ByteBuf)object).alloc().buffer();
    }

    public static void IlIlT(boolean bl) {
        IlIlN = bl;
    }

    public static boolean IlIlb() {
        return IlIlN;
    }

    public static boolean IlIld() {
        boolean bl = IlIlX.IlIlb();
        return !bl;
    }

    static {
        if (!IlIlX.IlIld()) {
            IlIlX.IlIlT(true);
        }
    }
}

