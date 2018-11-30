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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;

/**
 * Common superclass of all the renderers.
 * 
 * @author sbegaudeau
 */
public class Renderer {
    /**
     * Renders the given element and return the rendered components.
     * 
     * @param element
     *            The element
     * @return The rendered component for this element
     */
    public RenderedComponent render(Element element) {
        Object type = element.getType();
        Props props = element.getProps();

        if (type instanceof Class<?>) {
            Class<?> componentClass = (Class<?>) type;
            Constructor<?>[] constructors = componentClass.getConstructors();
            if (constructors.length == 1) {
                Constructor<?> constructor = constructors[0];
                try {
                    Object componentInstance = constructor.newInstance(props);
                    if (componentInstance instanceof Component<?>) {
                        Component<?> component = (Component<?>) componentInstance;
                        Optional<Element> optionalElement = component.render();
                        if (optionalElement.isPresent()) {
                            Element renderedElement = optionalElement.get();
                            Props renderedElementProps = renderedElement.getProps();

                            List<Element> children = renderedElementProps.getChildren();
                            for (Element childElement : children) {
                                RenderedComponent renderedChildComponent = this.render(childElement);

                            }

                            return new RenderedComponent(renderedElement, component);
                        }
                    }
                } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        } else if (type instanceof String) {
            List<Element> children = props.getChildren();

            return new RenderedComponent(element, null);
        }
        throw new RuntimeException("Invalid type"); //$NON-NLS-1$
    }

}
