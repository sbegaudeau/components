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
import java.util.Optional;

import org.eclipse.sirius.components.api.Component;
import org.eclipse.sirius.components.api.Element;

public class DiagramComponent extends Component<DiagramComponentProps> {

    public DiagramComponent(DiagramComponentProps props) {
        super(props);
    }

    @Override
    public Optional<Element> render() {
        // @formatter:off
        DiagramProps diagramProps = DiagramProps.newProps()
                .title("New Diagram")
                .children(this.getLayerElements())
                .build();
        
        Element diagramElement = Element.newElement(DiagramProps.DIAGRAM_TYPE, diagramProps)
                .build();
        // @formatter:on

        return Optional.of(diagramElement);
    }

    private List<Element> getLayerElements() {
        List<Element> layerElements = new ArrayList<>();

        // @formatter:off
        LayerComponentProps layerComponentProps = LayerComponentProps.newProps()
                .build();
        
        Element layerComponentElement = Element.newElement(LayerComponent.class, layerComponentProps)
                .build();
        // @formatter:on

        layerElements.add(layerComponentElement);
        return layerElements;
    }

}
