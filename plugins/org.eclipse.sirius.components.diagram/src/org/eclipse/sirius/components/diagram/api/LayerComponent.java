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

public class LayerComponent extends Component<LayerComponentProps> {

    public LayerComponent(LayerComponentProps props) {
        super(props);
    }

    @Override
    public Optional<Element> render() {
        // @formatter:off
        LayerProps layerProps = LayerProps.newProps()
                .title("Default Layer")
                .children(this.getNodeElements())
                .build();
        
        Element layerElement = Element.newElement(LayerProps.LAYER_TYPE, layerProps)
                .build();
        // @formatter:on

        return Optional.of(layerElement);
    }

    private List<Element> getNodeElements() {
        List<Element> nodeElements = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            // @formatter:off
            NodeComponentProps nodeComponentProps = NodeComponentProps.newProps()
                    .build();
            
            Element nodeComponentElement = Element.newElement(NodeComponent.class, nodeComponentProps)
                    .build();
            // @formatter:on

            nodeElements.add(nodeComponentElement);
        }

        return nodeElements;
    }

}
