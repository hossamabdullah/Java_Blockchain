/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;
import util.HashingUtility;

/**
 *
 * @author HossamEldeen
 */
public class Chain {
    List<Block> chain;
    public static String diff = "00";
    
    public Chain() {
        chain = new ArrayList<>();
        
        Block gensisBlock = new Block(1, 0, "Chain creation", "0000");
        String gensisBlockHash =HashingUtility.hash256(gensisBlock.toString());
        gensisBlock.setHash(gensisBlockHash);
        chain.add(gensisBlock);
    }
    
    
    public Block getLastBlock(){
        int lastIndex = chain.size();
        return chain.get(lastIndex - 1);
        
    }
    
    
    public int lengthOfChain(){
        return chain.size();
    }
    
}
