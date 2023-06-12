package com.keyon.design.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Editor {

    private String text;
    private Pair<Integer, Integer> selectedPos;

    public String getSelection() {
        return text.substring(selectedPos.first, selectedPos.second);
    }

    public void replaceSelection(String clipboard) {
        text = text.substring(0, selectedPos.first) +
                clipboard +
                text.substring(selectedPos.second);
    }

    public int getSelectionWidth() {
        return selectedPos.second - selectedPos.first;
    }

    static class Pair<T, K> {
        public T first;
        public K second;

        public Pair(T first, K second) {
            this.first = first;
            this.second = second;
        }
    }
}
