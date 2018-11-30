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

public class NodeRectandleStyle implements NodeStyle {
    public static final String RECTANGLE_KIND = "rectangle";

    private String backgroundColor;

    private String borderColor;

    private String labelColor;

    public NodeRectandleStyle(String backgroundColor, String borderColor, String labelColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.labelColor = labelColor;
    }

    @Override
    public String getKind() {
        return RECTANGLE_KIND;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getBorderColor() {
        return this.borderColor;
    }

    public String getLabelColor() {
        return this.labelColor;
    }

    public static Builder newRectangleStyle() {
        return new Builder();
    }

    public static class Builder {
        private String backgroundColor;

        private String borderColor;

        private String labelColor;

        public Builder backgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Builder borderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Builder labelColor(String labelColor) {
            this.labelColor = labelColor;
            return this;
        }

        public NodeRectandleStyle build() {
            return new NodeRectandleStyle(this.backgroundColor, this.borderColor, this.labelColor);
        }

    }
}
