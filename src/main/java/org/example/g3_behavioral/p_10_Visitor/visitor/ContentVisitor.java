package org.example.g3_behavioral.p_10_Visitor.visitor;

import org.example.g3_behavioral.p_10_Visitor.element.Article;
import org.example.g3_behavioral.p_10_Visitor.element.Image;
import org.example.g3_behavioral.p_10_Visitor.element.Video;

public interface ContentVisitor {
    void visit(Article article);

    void visit(Image image);

    void visit(Video video);
}
