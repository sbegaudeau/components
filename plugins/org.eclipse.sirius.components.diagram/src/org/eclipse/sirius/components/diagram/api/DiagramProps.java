/*******************************************************************************
 * Copyright (c) 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.components.diagram.api;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.components.api.Element;
import org.eclipse.sirius.components.api.Props;

/**
 * The props of the diagram element.
 * 
 * @author sbegaudeau
 */
public class DiagramProps implements Props {

    /**
     * The type of the diagram element.
     */
    public static final String DIAGRAM_TYPE = "diagram";

    /**
     * The title.
     */
    private String title;

    /**
     * The children.
     */
    private List<Element> children = new ArrayList<>();

    /**
     * The constructor.
     * 
     * @param title
     *            The title
     * @param children
     *            The children
     */
    public DiagramProps(String title, List<Element> children) {
        this.title = title;
        this.children = children;
    }

    /**
     * Returns the title.
     * 
     * @return The title
     */
    public String getTitle() {
        return this.title;
    }

    @Override
    public List<Element> getChildren() {
        return this.children;
    }

    /**
     * Creates the new props.
     * 
     * @return The new props created
     */
    public static Builder newProps() {
        return new Builder();
    }

    /**
     * The builder used to create the new props.
     * 
     * @author sbegaudeau
     */
    public static class Builder {
        /**
         * The title.
         */
        private String title;

        /**
         * The children.
         */
        private List<Element> children = new ArrayList<>();

        /**
         * Sets the title.
         * 
         * @param title
         *            The title
         * @return The current builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder children(List<Element> children) {
            this.children = children;
            return this;
        }

        /**
         * Returns the diagram props.
         * 
         * @return The diagram props
         */
        public DiagramProps build() {
            return new DiagramProps(this.title, this.children);
        }
    }

}
