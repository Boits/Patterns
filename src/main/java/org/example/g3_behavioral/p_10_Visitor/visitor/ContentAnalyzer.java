package org.example.g3_behavioral.p_10_Visitor.visitor;

import org.example.g3_behavioral.p_10_Visitor.element.Article;
import org.example.g3_behavioral.p_10_Visitor.element.Image;
import org.example.g3_behavioral.p_10_Visitor.element.Video;

public class ContentAnalyzer implements ContentVisitor {
    @Override
    public void visit(Article article) {
        System.out.println("Analyzing article: " + article.title());
        // Здесь можно добавить логику анализа текста статьи
    }

    @Override
    public void visit(Image image) {
        System.out.println("Analyzing image at path: " + image.imagePath());
        // Здесь можно добавить логику анализа изображения
    }

    @Override
    public void visit(Video video) {
        System.out.println("Analyzing video at path: " + video.videoPath());
        // Здесь можно добавить логику анализа видео
    }
}
