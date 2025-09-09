package org.example.g3_behavioral.p_10_Visitor.visitor;

import org.example.g3_behavioral.p_10_Visitor.element.Article;
import org.example.g3_behavioral.p_10_Visitor.element.Image;
import org.example.g3_behavioral.p_10_Visitor.element.Video;

public class ContentPublisher implements ContentVisitor {
    @Override
    public void visit(Article article) {
        System.out.println("Publishing article: " + article.title());
        // Здесь можно добавить логику для публикации статьи
    }

    @Override
    public void visit(Image image) {
        System.out.println("Publishing image at path: " + image.imagePath());
        // Здесь можно добавить логику для публикации изображения
    }

    @Override
    public void visit(Video video) {
        System.out.println("Publishing video at path: " + video.videoPath());
        // Здесь можно добавить логику для публикации видео
    }
}

