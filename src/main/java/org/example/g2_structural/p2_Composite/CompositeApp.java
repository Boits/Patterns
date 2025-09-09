package org.example.g2_structural.p2_Composite;

import org.example.g2_structural.p2_Composite.letterSystem.Messenger;
import org.example.g2_structural.p2_Composite.folderSystem.File;
import org.example.g2_structural.p2_Composite.folderSystem.FolderComposite;

public class CompositeApp {

    public static void call() {
        //Letter System
        letterSystem();

        //Folder System
//        folderSystem();
    }

    private static void folderSystem() {
        // Создание файлов
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        // Создание папок
        FolderComposite folder1 = new FolderComposite("Folder1");
        FolderComposite folder2 = new FolderComposite("Folder2");
        FolderComposite rootFolder = new FolderComposite("RootFolder");

        // Добавление файлов и папок в другие папки
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        folder2.addComponent(file3);

        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        // Вывод структуры файловой системы
        rootFolder.showDetails();
    }

    private static void letterSystem() {
        Messenger messenger = new Messenger();

        System.out.println("Message from the orcs: ");
        messenger.messageFromOrcs().print();

    }
}
