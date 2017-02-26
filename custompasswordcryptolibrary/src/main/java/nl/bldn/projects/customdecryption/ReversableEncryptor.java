package nl.bldn.projects.customdecryption;

import org.springframework.security.crypto.encrypt.TextEncryptor;

/**
 * Very, very unsafe version of a encryptor/decryptor. DON'T TRY THIS AT HOME!
 */
public class ReversableEncryptor implements TextEncryptor {
    @Override
    public String encrypt(String toEncrypt) {
        return new StringBuilder().append(toEncrypt).reverse().toString();
    }

    @Override
    public String decrypt(String toDecrypt) {
        return new StringBuilder().append(toDecrypt).reverse().toString();
    }
}
