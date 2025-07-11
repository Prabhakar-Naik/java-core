package com.springboot.designpatterns.behavioral.memento;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Originator (the object whose state needs to be saved)
public class Editor {

    private String content;

    public void setContent(String content) {
        this.content = content;
        System.out.println("Editor content set to: \"" + content + "\"");
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {
        System.out.println("Saving editor state...");
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
        System.out.println("Restoring editor state to: \"" + content + "\"");
    }

}
