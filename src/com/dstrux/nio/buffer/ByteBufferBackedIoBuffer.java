package com.dstrux.nio.buffer;

import java.nio.ByteBuffer;

/**
 * @author regex-
 */
public final class ByteBufferBackedIoBuffer implements IoBuffer {
    /**
     * The backend {@link ByteBuffer}
     */
    private ByteBuffer buffer;

    public ByteBufferBackedIoBuffer(ByteBuffer buffer) {
        this.buffer = buffer;
    }

    /**
     * Writes a single byte.
     *
     * @param b the data to write
     */
    public void put(byte b) {
        buffer.put(b);
    }

    /**
     * Writes an array of bytes.
     *
     * @param b the data to write
     */
    public void put(byte[] b) {
        buffer.put(b);
    }

    /**
     * Writes a single unsigned byte.
     *
     * @param b the data to write
     */
    public void putUnsigned(byte b) {
        buffer.put((byte) (b & 0xFF));
    }

    /**
     * Writes a single short.
     *
     * @param s the data to write
     */
    public void putShort(short s) {
        buffer.putShort(s);
    }

    /**
     * Writes a single unsigned short.
     *
     * @param s the data to write
     */
    public void putUnsignedShort(short s) {
        buffer.putShort((short) (s & 0xFFFF));
    }

    /**
     * Writes a single integer.
     *
     * @param i the data to write
     */
    public void putInt(int i) {
        buffer.putInt(i);
    }

    /**
     * Writes a single unsigned integer.
     *
     * @param i the data to write
     */
    public void putUnsignedInt(int i) {
        buffer.putInt(i & 0xFFFFFF);
    }

    /**
     * Writes a single 'medium'.
     *
     * @param i the data to write
     */
    public void putMedium(int i) {
        //todo
    }

    /**
     * Writes a single unsigned 'medium'..
     *
     * @param i the data to write
     */
    public void putUnsignedMedium(int i) {
        //todo
    }

    /**
     * Writes a single double.
     *
     * @param d the data to write
     */
    public void putDouble(double d) {
        buffer.putLong(Double.doubleToLongBits(d));
    }

    /**
     * Writes a single float.
     *
     * @param f the data to write
     */
    public void putFloat(float f) {
        buffer.putInt(Float.floatToIntBits(f));
    }

    /**
     * Writes a single long.
     *
     * @param l the data to write
     */
    public void putLong(long l) {
        buffer.putLong(l);
    }

    /**
     * Reads a single byte.
     *
     * @return the incoming data
     */
    public byte get() {
        return buffer.get();
    }

    /**
     * Reads a single unsigned byte.
     *
     * @return the incoming data
     */
    public byte getUnsigned() {
        return (byte) (buffer.get() & 0xFF);
    }

    /**
     * Reads a single short.
     *
     * @return the incoming data
     */
    public short getShort() {
        return buffer.getShort();
    }

    /**
     * Reads a single unsigned short.
     *
     * @return the incoming data
     */
    public short getUnsignedShort() {
        return (short) (buffer.getShort() & 0xFF);
    }

    /**
     * Reads a single integer.
     *
     * @return the incoming data
     */
    public int getInt() {
        return buffer.getInt();
    }

    /**
     * Reads a single unsigned integer.
     *
     * @return the incoming data
     */
    public int getUnsignedInt() {
        return buffer.getInt() & 0xFFFFFF;
    }

    /**
     * Reads a single 'medium'.
     *
     * @return the incoming data
     */
    public int getMedium() {
        return 0;
    }

    /**
     * Reads a single unsigned 'medium'..
     *
     * @return the incoming data
     */
    public int getUnsignedMedium() {
        return 0;
    }

    /**
     * Reads a single double.
     *
     * @return the incoming data
     */
    public double getDouble() {
        return Double.longBitsToDouble(buffer.getLong());
    }

    /**
     * Reads a single float.
     *
     * @return the incoming data
     */
    public float getFloat() {
        return Float.intBitsToFloat(buffer.getInt());
    }

    /**
     * Reads a single char.
     *
     * @return the incoming data
     */
    public char getChar() {
        return (char) getShort();
    }

    /**
     * Reads a single long.
     *
     * @return the incoming data
     */
    public long getLong() {
        return buffer.getLong();
    }

    /**
     * Reads a user defined byte.
     *
     * @param b the given data
     */
    public void get(byte b) {
        buffer.get(b);
    }

    /**
     * Reads a user defined array of bytes.
     *
     * @param b the given data
     */
    public void get(byte[] b) {
        buffer.get(b);
    }

    /**
     * Reads a user defined unsigned byte.
     *
     * @param b the given data
     */
    public void getUnsigned(byte b) {
        buffer.get(b & 0xFF);
    }

    /**
     * Reads a user defined short.
     *
     * @param s the given data
     */
    public void getShort(short s) {
        buffer.getShort(s);
    }

    /**
     * Reads a user defined unsigned short.
     *
     * @param s the given data
     */
    public void getUnsignedShort(short s) {
        buffer.getShort(s & 0xFFFF);
    }

    /**
     * Reads a user defined integer.
     *
     * @param i the given data
     */
    public void getInt(int i) {
        buffer.getInt(i);
    }

    /**
     * Reads a user defined unsigned integer.
     *
     * @param i the given data
     */
    public void getUnsignedInt(int i) {
        buffer.get(i & 0xFFFFFF);
    }

    /**
     * Reads a user defined 'medium'.
     *
     * @param i the given data
     */
    public void getMedium(int i) {
        //todo
    }

    /**
     * Reads a user defined unsigned 'medium'..
     *
     * @param i the given data
     */
    public void getUnsignedMedium(int i) {
        //todo
    }

    /**
     * Reads a user defined double.
     *
     * @param d the given data
     */
    public void getDouble(double d) {
        buffer.getDouble((int) d);
    }

    /**
     * Reads a user defined float.
     *
     * @param f the given data
     */
    public void getFloat(float f) {
        buffer.getFloat((int) f);
    }

    /**
     * Reads a user defined char.
     *
     * @param c the given data
     */
    public void getChar(char c) {
        buffer.getChar(c);
    }

    /**
     * Reads a user defined long.
     *
     * @param l the given data
     */
    public void getLong(long l) {
        buffer.getLong((int) l);
    }

    /**
     * The writer/reader index/offset.
     *
     * @return the offset.
     */
    public int offset() {
        return 0;
    }

    /**
     * The amount of space left for writing/reading in the buffer
     *
     * @return the remaining space
     */
    public int remaining() {
        return 0;
    }

    /**
     * the buffer data.
     *
     * @return the buffer data.
     */
    public byte[] buffer() {
        return buffer.array();
    }
}
