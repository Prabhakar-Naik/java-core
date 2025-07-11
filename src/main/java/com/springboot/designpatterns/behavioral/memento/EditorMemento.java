package com.springboot.designpatterns.behavioral.memento;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Memento.java
// Memento (stores the state)
public class EditorMemento {

    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
