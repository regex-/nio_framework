package com.dstrux.nio.util.crypto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.*;

/**
 * @author regex-
 */
public class RSAKeyGen {

    public static RSAHolder create(boolean to_file) {
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            KeyPair pair = generator.generateKeyPair();
            PublicKey pubkey = pair.getPublic();
            PrivateKey privkey = pair.getPrivate();
            if(to_file) {
                write(pubkey, privkey);
            }
            return new RSAHolder(pubkey, privkey);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void write(PublicKey pubkey, PrivateKey privkey) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(new File("key_pair.txt")));
            writer.write(String.format("public=%s\nprivate=%s", pubkey, privkey));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
