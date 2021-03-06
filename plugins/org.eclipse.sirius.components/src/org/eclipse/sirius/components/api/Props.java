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

import java.util.ArrayList;
import java.util.List;

/**
 * Common interface to be implemented by all the props.
 * 
 * @author sbegaudeau
 */
public interface Props {
    default List<Element> getChildren() {
        return new ArrayList<>();
    }
}
