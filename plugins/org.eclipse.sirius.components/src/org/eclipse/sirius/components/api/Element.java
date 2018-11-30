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
package org.eclipse.sirius.components.api;

/**
 * The building block of the data structure representing our applications.
 * 
 * @author sbegaudeau
 */
public final class Element {
    /**
     * The type.
     */
    private final Object type;

    /**
     * The properties.
     */
    private final Props props;

    /**
     * The constructor.
     * 
     * @param type
     *            The type
     * @param props
     *            The properties
     */
    private Element(Object type, Props props) {
        this.type = type;
        this.props = props;
    }

    /**
     * Returns the type.
     * 
     * @return The type
     */
    public Object getType() {
        return this.type;
    }

    /**
     * Returns the properties.
     * 
     * @return The properties
     */
    public Props getProps() {
        return this.props;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("{"); //$NON-NLS-1$
        builder.append(System.lineSeparator());
        builder.append("  type: "); //$NON-NLS-1$
        builder.append(this.type);
        builder.append(","); //$NON-NLS-1$
        builder.append(System.lineSeparator());
        builder.append("  props: {"); //$NON-NLS-1$
        builder.append(System.lineSeparator());
        builder.append("  }"); //$NON-NLS-1$
        builder.append(System.lineSeparator());
        builder.append("}"); //$NON-NLS-1$
        builder.append(System.lineSeparator());

        return builder.toString();
    }

    /**
     * Creates a new element.
     * 
     * @param type
     *            The component
     * @param props
     *            The properties
     * @return The builder used to create the new element
     */
    public static Builder newElement(Object type, Props props) {
        return new Builder(type, props);
    }

    /**
     * The builder used to create a new element.
     * 
     * @author sbegaudeau
     */
    @SuppressWarnings({ "checkstyle:HiddenField" })
    public static final class Builder {
        /**
         * The type.
         */
        private final Object type;

        /**
         * The properties.
         */
        private final Props props;

        /**
         * The constructor.
         * 
         * @param type
         *            The type
         * @param props
         *            The properties
         */
        private Builder(Object type, Props props) {
            this.type = type;
            this.props = props;
        }

        /**
         * Returns the element.
         * 
         * @return The element created
         */
        public Element build() {
            return new Element(this.type, this.props);
        }
    }
}
