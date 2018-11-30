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

import java.util.Optional;

import org.eclipse.sirius.components.api.Component;
import org.eclipse.sirius.components.api.Element;

public class NodeComponent extends Component<NodeComponentProps> {

    public NodeComponent(NodeComponentProps props) {
        super(props);
    }

    @Override
    public Optional<Element> render() {
        // @formatter:off
        NodeStyle style = NodeRectandleStyle.newRectangleStyle()
                .backgroundColor("#FFFFFF")
                .borderColor("#000000")
                .labelColor("#000000")
                .build();
        
        NodeProps nodeProps = NodeProps.newProps()
                .label("Node")
                .x(20)
                .y(40)
                .width(200)
                .height(50)
                .style(style)
                .build();
        
        Element nodeElement = Element.newElement(NodeProps.NODE_TYPE, nodeProps)
                .build();
        // @formatter:on

        return Optional.of(nodeElement);
    }

}
