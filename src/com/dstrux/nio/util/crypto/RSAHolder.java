package com.dstrux.nio.util.crypto;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author regex-
 */
public class RSAHolder {
    private PublicKey pub_key;
    private PrivateKey priv_key;

    public RSAHolder(PublicKey pub_key, PrivateKey priv_key) {
        this.pub_key = pub_key;
        this.priv_key = priv_key;
    }

    public PublicKey getPublicKey() {
        return pub_key;
    }

    public PrivateKey getPrivateKey() {
        return priv_key;
    }
}
