package com.keyon.chain_resp;

public class HeaderTextProcessing extends ProcessingObject<String> {
    @Override
    protected String handleWork(String input) {
        return "[ " + input;
    }
}
