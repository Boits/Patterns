package org.example.g3_behavioral.p_10_Visitor.element;

import org.example.g3_behavioral.p_10_Visitor.visitor.ContentVisitor;

/**
 * Element
 */
public interface Content {
    void accept(ContentVisitor visitor);
}
