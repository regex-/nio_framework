package com.dstrux.nio.buffer;

import java.nio.ByteOrder;

/**
 * @author regex-
 */
public class StandardIoBuffer implements IoBuffer {
    private int position;
    private int limit;
    private byte[] buffer;
    private ByteOrder order;

    StandardIoBuffer(int limit) {
        this(limit, ByteOrder.BIG_ENDIAN);
    }

    StandardIoBuffer(int limit, ByteOrder order) {
        position = 0;
        this.limit = limit;
        this.order = order;
        buffer = new byte[limit];
    }

    /**
     * Writes a single byte.
     *
     * @param b the data to write
     */
    public void put(byte b) {
        buffer[position++] = b;
    }

    /**
     * Writes an array of bytes.
     *
     * @param b the data to write
     */
    public void put(byte[] b) {
        for(byte bt : b) {
            put(bt);
        }
    }

    /**
     * Writes a single unsigned byte.
     *
     * @param b the data to write
     */
    public void putUnsigned(byte b) {
        put((byte) (b & 0xFF));
    }

    /**
     * Writes a single short.
     *
     * @param s the data to write
     */
    public void putShort(short s) {
        buffer[position++] = (byte) (s >> 8);
        buffer[position++] = (byte) s;
    }

    /**
     * Writes a single unsigned short.
     *
     * @param s the data to write
     */
    public void putUnsignedShort(short s) {
        putShort((short) (s & 0xFFFF));
    }

    /**
     * Writes a single integer.
     *
     * @param i the data to write
     */
    public void putInt(int i) {
        buffer[position++] = (byte) (i >> 24);
        buffer[position++] = (byte) (i >> 16);
        buffer[position++] = (byte) (i >> 8);
        buffer[position++] = (byte) i;
    }

    /**
     * Writes a single unsigned integer.
     *
     * @param i the data to write
     */
    public void putUnsignedInt(int i) {
        putInt((int) (i & 0xffffffffL));
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
        putLong(Double.doubleToLongBits(d));
    }

    /**
     * Writes a single float.
     *
     * @param f the data to write
     */
    public void putFloat(float f) {
        putInt(Float.floatToIntBits(f));
    }

    /**
     * Writes a single long.
     *
     * @param l the data to write
     */
    public void putLong(long l) {
        buffer[position++] = (byte) (l >> 56);
        buffer[position++] = (byte) (l >> 48);
        buffer[position++] = (byte) (l >> 40);
        buffer[position++] = (byte) (l >> 32);
        buffer[position++] = (byte) (l >> 24);
        buffer[position++] = (byte) (l >> 16);
        buffer[position++] = (byte) (l >> 8);
        buffer[position++] = (byte) l;
    }

    /**
     * Reads a single byte.
     *
     * @return the incoming data
     */
    public byte get() {
        return buffer[position++];
    }

    /**
     * Reads a single unsigned byte.
     *
     * @return the incoming data
     */
    public byte getUnsigned() {
        return (byte) (get() & 0xFF);
    }

    /**
     * Reads a single short.
     *
     * @return the incoming data
     */
    public short getShort() {
        return (short) ((short) (get() << 8) | get());
    }

    /**
     * Reads a single unsigned short.
     *
     * @return the incoming data
     */
    public short getUnsignedShort() {
        return (short) (getShort() & 0xFFFF);
    }

    /**
     * Reads a single integer.
     *
     * @return the incoming data
     */
    public int getInt() {
        return get() << 24 | get() << 16 | get() << 8 | get();
    }

    /**
     * Reads a single unsigned integer.
     *
     * @return the incoming data
     */
    public int getUnsignedInt() {
        return (int) (getInt() & 0xffffffffL);
    }

    /**
     * Reads a single 'medium'.
     *
     * @return the incoming data
     */
    public int getMedium() {
        int b1 = get();
        int ret = b1 << 16 & 0xff0000 | get() << 8 & 0xff00 | get() & 0xff;
        if ((b1 & 0x80) == 0x80) {
            ret |= 0xff000000;
        }
        return ret;
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
        return 0;
    }

    /**
     * Reads a single float.
     *
     * @return the incoming data
     */
    public float getFloat() {
        return 0;
    }

    /**
     * Reads a single char.
     *
     * @return the incoming data
     */
    public char getChar() {
        return 0;
    }

    /**
     * Reads a single long.
     *
     * @return the incoming data
     */
    public long getLong() {
        return 0;
    }

    /**
     * Reads a user defined byte.
     *
     * @param b the given data
     */
    public void get(byte b) {

    }

    /**
     * Reads a user defined array of bytes.
     *
     * @param b the given data
     */
    public void get(byte[] b) {

    }

    /**
     * Reads a user defined unsigned byte.
     *
     * @param b the given data
     */
    public void getUnsigned(byte b) {

    }

    /**
     * Reads a user defined short.
     *
     * @param s the given data
     */
    public void getShort(short s) {

    }

    /**
     * Reads a user defined unsigned short.
     *
     * @param s the given data
     */
    public void getUnsignedShort(short s) {

    }

    /**
     * Reads a user defined integer.
     *
     * @param i the given data
     */
    public void getInt(int i) {

    }

    /**
     * Reads a user defined unsigned integer.
     *
     * @param i the given data
     */
    public void getUnsignedInt(int i) {

    }

    /**
     * Reads a user defined 'medium'.
     *
     * @param i the given data
     */
    public void getMedium(int i) {

    }

    /**
     * Reads a user defined unsigned 'medium'..
     *
     * @param i the given data
     */
    public void getUnsignedMedium(int i) {

    }

    /**
     * Reads a user defined double.
     *
     * @param d the given data
     */
    public void getDouble(double d) {

    }

    /**
     * Reads a user defined float.
     *
     * @param f the given data
     */
    public void getFloat(float f) {

    }

    /**
     * Reads a user defined char.
     *
     * @param c the given data
     */
    public void getChar(char c) {

    }

    /**
     * Reads a user defined long.
     *
     * @param l the given data
     */
    public void getLong(long l) {

    }

    /**
     * The writer/reader position in the buffer.
     *
     * @return the position.
     */
    public int position() {
        return position;
    }

    /**
     * The writer/reader position in the buffer.
     *
     * @param i The new position in the buffer
     * @return The new position
     */
    public int position(int i) {
        return position = i;
    }

    /**
     * The amount of space left for writing/reading in the buffer
     *
     * @return the remaining space
     */
    public int remaining() {
        return limit - position;
    }

    /**
     * the buffer data.
     *
     * @return the buffer data.
     */
    public byte[] buffer() {
        return buffer;
    }

    /**
     * The {@link java.nio.ByteOrder}, being either big endian or little endian
     *
     * @return the {@link java.nio.ByteOrder}
     */
    public ByteOrder order() {
        return order;
    }
}
