package org.example.g2_structural.p2_Composite.folderSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite объект.
 */
public class FolderComposite implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public FolderComposite(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        components.forEach(FileSystemComponent::showDetails); // Рекурсивно выводим детали всех компонентов
    }
}
