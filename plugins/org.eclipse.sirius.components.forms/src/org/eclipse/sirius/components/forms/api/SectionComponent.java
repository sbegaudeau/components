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
package org.eclipse.sirius.components.forms.api;

import java.util.Optional;

import org.eclipse.sirius.components.api.Component;
import org.eclipse.sirius.components.api.Element;

public class SectionComponent extends Component<SectionProps> {

    public SectionComponent(SectionProps props) {
        super(props);
    }

    @Override
    public Optional<Element> render() {
        return Optional.empty();
    }

}
