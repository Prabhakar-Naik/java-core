package com.springboot.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Caretaker (manages the Mementos)
public class History {

    private List<EditorMemento> mementos = new ArrayList<>();

    public void addMemento(EditorMemento memento) {
        mementos.add(memento);
    }

    public EditorMemento getMemento(int index) {
        return mementos.get(index);
    }

}

// Usage
// import java.util.ArrayList;
// import java.util.List;
//
// public class MementoDemo {
//     public static void main(String[] args) {
//         Editor editor = new Editor();
//         History history = new History();
//
//         editor.setContent("First version of text.");
//         history.addMemento(editor.save());
//
//         editor.setContent("Second version with some changes.");
//         history.addMemento(editor.save());
//
//         editor.setContent("Third and final version.");
//         // Don't save this one to show restoration
//
//         System.out.println("\nCurrent editor content: \"" + editor.getContent() + "\"");
//
//         editor.restore(history.getMemento(0)); // Restore to first version
//         System.out.println("\nCurrent editor content after restore: \"" + editor.getContent() + "\"");
//
//         editor.restore(history.getMemento(1)); // Restore to second version
//         System.out.println("\nCurrent editor content after restore: \"" + editor.getContent() + "\"");
//     }
// }
