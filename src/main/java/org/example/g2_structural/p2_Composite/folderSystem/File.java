package org.example.g2_structural.p2_Composite.folderSystem;

import lombok.RequiredArgsConstructor;

/**
 * Leaf (лист)
 */
@RequiredArgsConstructor
public class File implements FileSystemComponent {

    private final String name;

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
