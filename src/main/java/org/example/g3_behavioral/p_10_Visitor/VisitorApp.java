package org.example.g3_behavioral.p_10_Visitor;

import org.example.g3_behavioral.p_10_Visitor.element.Article;
import org.example.g3_behavioral.p_10_Visitor.element.Content;
import org.example.g3_behavioral.p_10_Visitor.element.Image;
import org.example.g3_behavioral.p_10_Visitor.element.Video;
import org.example.g3_behavioral.p_10_Visitor.visitor.ContentAnalyzer;
import org.example.g3_behavioral.p_10_Visitor.visitor.ContentPublisher;
import org.example.g3_behavioral.p_10_Visitor.visitor.ContentVisitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorApp {

    public static void call() {
        List<Content> contents = new ArrayList<>();
        contents.add(new Article("Design Patterns in Java", "Understanding the basics of design patterns."));
        contents.add(new Image("images/photo.jpg"));
        contents.add(new Video("videos/tutorial.mp4"));

        // Анализ контента
        ContentVisitor analyzerVisitor = new ContentAnalyzer();
        contents.forEach(c -> c.accept(analyzerVisitor));

        // Публикация контента
        ContentVisitor publisherVisitor = new ContentPublisher();
        contents.forEach(c -> c.accept(publisherVisitor));
    }
}
