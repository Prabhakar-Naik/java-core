package com.springboot.designpatterns.behavioral.memento;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class MementoDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Captures and externalizes an object's internal state so that the object can be restored to this state later.
                Example: An editor saving and restoring its text content.
                """);

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("First version of text.");
        history.addMemento(editor.save());

        editor.setContent("Second version with some changes.");
        history.addMemento(editor.save());

        editor.setContent("Third and final version.");
        // Don't save this one to show restoration

        System.out.println("\nCurrent editor content: \"" + editor.getContent() + "\"");

        editor.restore(history.getMemento(0)); // Restore to first version
        System.out.println("\nCurrent editor content after restore: \"" + editor.getContent() + "\"");

        editor.restore(history.getMemento(1)); // Restore to second version
        System.out.println("\nCurrent editor content after restore: \"" + editor.getContent() + "\"");
    }
}
