/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HossamEldeen
 */
public class HashingUtility {

    public static String hash256(String data) {
        MessageDigest digest;
        byte[] hash = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(HashingUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        String s = new String(hash);
        return s;
    }

}
