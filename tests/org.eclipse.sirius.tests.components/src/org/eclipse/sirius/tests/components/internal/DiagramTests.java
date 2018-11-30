package org.eclipse.sirius.tests.components.internal;

import org.eclipse.sirius.components.api.Element;
import org.eclipse.sirius.components.api.RenderedComponent;
import org.eclipse.sirius.components.api.Renderer;
import org.eclipse.sirius.components.diagram.api.DiagramComponent;
import org.eclipse.sirius.components.diagram.api.DiagramComponentProps;
import org.junit.Test;

public class DiagramTests {
    @Test
    public void testDiagrams() {
        // @formatter:off
        DiagramComponentProps diagramComponentProps = DiagramComponentProps.newProps()
                .build();
        
        Element diagramComponentElement = Element.newElement(DiagramComponent.class, diagramComponentProps)
                .build();
        // @formatter:on

        RenderedComponent diagramRenderedComponent = new Renderer().render(diagramComponentElement);
    }
}
