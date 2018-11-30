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
 * The component once rendered.
 * 
 * @author sbegaudeau
 */
public class RenderedComponent {
    /**
     * The current element.
     */
    private Element currentElement;

    /**
     * The component which is responsible of the element.
     */
    private Component<?> component;

    /**
     * The constructor.
     * 
     * @param currentElement
     *            The current element
     * @param component
     *            The component which is responsible of the element
     */
    public RenderedComponent(Element currentElement, Component<?> component) {
        this.currentElement = currentElement;
        this.component = component;
    }
}
