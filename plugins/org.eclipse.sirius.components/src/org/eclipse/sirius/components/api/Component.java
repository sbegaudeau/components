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

import java.util.Optional;

/**
 * Common superclass of all the components.
 * 
 * @author sbegaudeau
 *
 * @param <T>
 *            The type of the props supported.
 */
public abstract class Component<T extends Props> {

    /**
     * The props.
     */
    protected final T props;

    /**
     * The constructor.
     * 
     * @param props
     *            The props
     */
    public Component(T props) {
        this.props = props;
    }

    /**
     * Render the component.
     * 
     * @return The element composing the component
     */
    public abstract Optional<Element> render();
}
