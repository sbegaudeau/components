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

public class LayerComponentProps implements Props {

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
         * Returns the layer component props.
         * 
         * @return The layer component props
         */
        public LayerComponentProps build() {
            return new LayerComponentProps();
        }
    }

}
