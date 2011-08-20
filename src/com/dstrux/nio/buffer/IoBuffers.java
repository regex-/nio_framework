package com.dstrux.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author regex-
 */
public final class IoBuffers {

    public static IoBuffer directBuffer(int size) {
        return new ByteBufferBackedIoBuffer(ByteBuffer.allocateDirect(size).order(ByteOrder.BIG_ENDIAN));
    }
}
