/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import data.Block;
import data.Chain;
import util.GeneralUtility;
import util.HashingUtility;

/**
 *
 * @author HossamEldeen
 */
public class App {
    static Chain ainShamsChain =  new Chain();
    
    public static void main(String[] args) {
        Block lastblock = ainShamsChain.getLastBlock();
        Block newBlock = new Block(ainShamsChain.lengthOfChain()+1, 0, "data of block"
                , lastblock.getHash());
        newBlock = mine(newBlock);
        System.out.println(newBlock.getHash());
        
    }
    
    /**
     * consensus
     * 
     * @param newBlock
     * @return 
     */
    public static Block mine(Block newBlock){
        String newBlockHash = "";
        boolean goldenNonceNotFound = true;
        
        while(goldenNonceNotFound){
            if(GeneralUtility.getCurrentTimeStamp()/1000 > newBlock.getTimestamp()/1000){
                newBlock.setTimestamp(GeneralUtility.getCurrentTimeStamp());
                newBlock.setNonce(0);
            }
            newBlockHash =  HashingUtility.hash256(newBlock.toString());
            if(newBlockHash.startsWith(ainShamsChain.diff)){
                goldenNonceNotFound = false;
                break;
            }
            newBlock.setNonce( newBlock.getNonce() + 1);
        }
        
        
        newBlock.setHash(newBlockHash);
        
        return newBlock;
    }
}
