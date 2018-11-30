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

public class Fiber {
    private Object type;

    private Fiber child;

    private Fiber sibling;

    private Fiber parent;

    private int index;

    private Object pendingProps;

    private Object memoizedProps;

    private int pendingWorkPriority;

    private Fiber alternate;

    private Object output;
}
