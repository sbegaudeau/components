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

import org.eclipse.sirius.components.api.Props;

public class NodeProps implements Props {
    /**
     * The type of the node element.
     */
    public static final String NODE_TYPE = "diagram:node";

    /**
     * The label.
     */
    private String label;

    /**
     * The X-axis.
     */
    private int x;

    /**
     * The Y-axis.
     */
    private int y;

    /**
     * The width.
     */
    private int width;

    /**
     * The height.
     */
    private int height;

    /**
     * The style.
     */
    private NodeStyle style;

    /**
     * The constructor.
     * 
     * @param label
     *            The label
     * @param x
     *            The X-axis
     * @param y
     *            The Y-axis
     * @param width
     *            The width
     * @param height
     *            The height
     * @param style
     */
    public NodeProps(String label, int x, int y, int width, int height, NodeStyle style) {
        this.label = label;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.style = style;
    }

    /**
     * Returns the label.
     * 
     * @return The label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Returns the X-axis.
     * 
     * @return The X-axis
     */
    public int getX() {
        return this.x;
    }

    /**
     * Returns the Y-axis.
     * 
     * @return The Y-axis
     */
    public int getY() {
        return this.y;
    }

    /**
     * Returns the width.
     * 
     * @return The width
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Returns the height.
     * 
     * @return The height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Returns the style.
     * 
     * @return The style
     */
    public NodeStyle getStyle() {
        return this.style;
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
         * The label.
         */
        private String label;

        /**
         * The X-axis.
         */
        private int x;

        /**
         * The Y-axis.
         */
        private int y;

        /**
         * The width.
         */
        private int width;

        /**
         * The height.
         */
        private int height;

        private NodeStyle style;

        /**
         * Sets the label.
         * 
         * @param label
         *            the label
         * @return The current builder
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Sets the X-axis.
         * 
         * @param x
         *            The X-axis
         * @return The current builder
         */
        public Builder x(int x) {
            this.x = x;
            return this;
        }

        /**
         * Sets the Y-axis.
         * 
         * @param y
         *            The Y-axis
         * @return the current builder
         */
        public Builder y(int y) {
            this.y = y;
            return this;
        }

        /**
         * Sets the width.
         * 
         * @param width
         *            The width
         * @return The current builder
         */
        public Builder width(int width) {
            this.width = width;
            return this;
        }

        /**
         * Sets the height.
         * 
         * @param height
         *            The height
         * @return The current builder
         */
        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder style(NodeStyle style) {
            this.style = style;
            return this;
        }

        /**
         * Returns the node props.
         * 
         * @return The node props
         */
        public NodeProps build() {
            return new NodeProps(this.label, this.x, this.y, this.width, this.height, this.style);
        }
    }
}
