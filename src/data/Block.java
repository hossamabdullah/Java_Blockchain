/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import util.GeneralUtility;

/**
 *
 * @author HossamEldeen
 */
public class Block {
    int blockNumber;
    long timestamp;
    int nonce;
    String data;
    String prevHash;
    String hash;

    public Block(int blockNumber, int nonce, String data, String prevHash) {
        this.blockNumber = blockNumber;
        this.timestamp = GeneralUtility.getCurrentTimeStamp();
        this.nonce = nonce;
        this.data = data;
        this.prevHash = prevHash;
    }
    
    public int getBlockNumber() {
        return blockNumber;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getNonce() {
        return nonce;
    }

    public String getData() {
        return data;
    }

    public String getPrevHash() {
        return prevHash;
    }

    public String getHash() {
        return hash;
    }

    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPrevHash(String prevHash) {
        this.prevHash = prevHash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return (this.blockNumber+""+this.timestamp+""+this.nonce+
                ""+this.data+""+this.prevHash);
    }
}
