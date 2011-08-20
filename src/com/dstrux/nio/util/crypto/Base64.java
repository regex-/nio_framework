package com.dstrux.nio.util.crypto;

import com.dstrux.nio.buffer.IoBuffer;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * @author regex-
 */
public class Base64 {
    private static final BASE64Encoder ENCODER = new BASE64Encoder();
    private static final BASE64Decoder DECODER = new BASE64Decoder();

    public static String encode(ByteBuffer b) {
        return encode(b.array());
    }

    public static String encode(byte[] b) {
        return ENCODER.encode(b);
    }

    public static String encode(IoBuffer buf) {
        return encode(buf.buffer());
    }

    public static String encode(String s) {
        return encode(s.getBytes());
    }

    public static byte[] decode(String s) {
        try {
            return DECODER.decodeBuffer(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
