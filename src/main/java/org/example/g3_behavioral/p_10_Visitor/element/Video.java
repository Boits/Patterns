package org.example.g3_behavioral.p_10_Visitor.element;

import org.example.g3_behavioral.p_10_Visitor.visitor.ContentVisitor;

public record Video(String videoPath) implements Content {

    @Override
    public void accept(ContentVisitor visitor) {
        visitor.visit(this);
    }
}