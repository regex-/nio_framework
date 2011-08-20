package com.dstrux.nio.buffer;

import java.nio.ByteOrder;

/**
 * This class contains all methods for network i/o
 * this allows for reading data from a client and writing
 * data to it.
 *
 * @author dstrux
 */
public interface IoBuffer {
    /**
     * Writes a single byte.
     *
     * @param b the data to write
     */
    void put(byte b);

    /**
     * Writes an array of bytes.
     *
     * @param b the data to write
     */
    void put(byte[] b);

    /**
     * Writes a single unsigned byte.
     *
     * @param b the data to write
     */
    void putUnsigned(byte b);

    /**
     * Writes a single short.
     *
     * @param s the data to write
     */
    void putShort(short s);

    /**
     * Writes a single unsigned short.
     *
     * @param s the data to write
     */
    void putUnsignedShort(short s);

    /**
     * Writes a single integer.
     *
     * @param i the data to write
     */
    void putInt(int i);

    /**
     * Writes a single unsigned integer.
     *
     * @param i the data to write
     */
    void putUnsignedInt(int i);

    /**
     * Writes a single 'medium'.
     *
     * @param i the data to write
     */
    void putMedium(int i);

    /**
     * Writes a single unsigned 'medium'..
     *
     * @param i the data to write
     */
    void putUnsignedMedium(int i);

    /**
     * Writes a single double.
     *
     * @param d the data to write
     */
    void putDouble(double d);

    /**
     * Writes a single float.
     *
     * @param f the data to write
     */
    void putFloat(float f);

    /**
     * Writes a single long.
     *
     * @param l the data to write
     */
    void putLong(long l);

    /**
     * Reads a single byte.
     *
     * @return the incoming data
     */
    byte get();

    /**
     * Reads a single unsigned byte.
     *
     * @return the incoming data
     */
    byte getUnsigned();

    /**
     * Reads a single short.
     *
     * @return the incoming data
     */
    short getShort();

    /**
     * Reads a single unsigned short.
     *
     * @return the incoming data
     */
    short getUnsignedShort();

    /**
     * Reads a single integer.
     *
     * @return the incoming data
     */
    int getInt();

    /**
     * Reads a single unsigned integer.
     *
     * @return the incoming data
     */
    int getUnsignedInt();

    /**
     * Reads a single 'medium'.
     *
     * @return the incoming data
     */
    int getMedium();

    /**
     * Reads a single unsigned 'medium'..
     *
     * @return the incoming data
     */
    int getUnsignedMedium();

    /**
     * Reads a single double.
     *
     * @return the incoming data
     */
    double getDouble();

    /**
     * Reads a single float.
     *
     * @return the incoming data
     */
    float getFloat();

    /**
     * Reads a single char.
     *
     * @return the incoming data
     */
    char getChar();

    /**
     * Reads a single long.
     *
     * @return the incoming data
     */
    long getLong();

    /**
     * Reads a user defined byte.
     *
     * @param b the given data
     */
    void get(byte b);

    /**
     * Reads a user defined array of bytes.
     *
     * @param b the given data
     */
    void get(byte[] b);

    /**
     * Reads a user defined unsigned byte.
     *
     * @param b the given data
     */
    void getUnsigned(byte b);

    /**
     * Reads a user defined short.
     *
     * @param s the given data
     */
    void getShort(short s);

    /**
     * Reads a user defined unsigned short.
     *
     * @param s the given data
     */
    void getUnsignedShort(short s);

    /**
     * Reads a user defined integer.
     *
     * @param i the given data
     */
    void getInt(int i);

    /**
     * Reads a user defined unsigned integer.
     *
     * @param i the given data
     */
    void getUnsignedInt(int i);

    /**
     * Reads a user defined 'medium'.
     *
     * @param i the given data
     */
    void getMedium(int i);

    /**
     * Reads a user defined unsigned 'medium'..
     *
     * @param i the given data
     */
    void getUnsignedMedium(int i);

    /**
     * Reads a user defined double.
     *
     * @param d the given data
     */
    void getDouble(double d);

    /**
     * Reads a user defined float.
     *
     * @param f the given data
     */
    void getFloat(float f);

    /**
     * Reads a user defined char.
     *
     * @param c the given data
     */
    void getChar(char c);

    /**
     * Reads a user defined long.
     *
     * @param l the given data
     */
    void getLong(long l);

    /**
     * The writer/reader position in the buffer.
     *
     * @return  the position in the buffer.
     */
    int position();

    /**
     * sets a new writer/reader position in the buffer.
     *
     * @param i The new position in the buffer
     * @return  The new position in the buffer.
     */
    int position(int i);

    /**
     * The amount of space left for writing/reading in the buffer
     *
     * @return  the remaining space
     */
    int remaining();

    /**
     * the buffer data.
     *
     * @return  the buffer data.
     */
    byte[] buffer();

    /**
     * The {@link ByteOrder}, being either big endian or little endian
     *
     * @return  the {@link ByteOrder}
     */
    ByteOrder order();
}
