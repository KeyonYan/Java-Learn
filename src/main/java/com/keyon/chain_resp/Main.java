package com.keyon.chain_resp;

public class Main {

    public static void main(String[] args) {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckProcessing();
        p1.setSuccessor(p2);
        String res = p1.handle("labda aaaaaaa bbbbbb");
        System.out.println(res);
    }

}
