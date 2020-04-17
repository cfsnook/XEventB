/**
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.ui;

import org.eclipse.core.resources.IFile;

/**
 * Common interface for of an XEvent-B navigator object.
 * 
 * @author htson
 * @version 1.0
 * @since 0.1
 * @see AbstractXEventBNavigatorObject
 */
@SuppressWarnings("all")
public interface IXEventBNavigatorObject {
  /**
   * Returns the resource of the XEvent-B navigator object.
   * 
   * @return the resource of the XEvent-B navigator object.
   */
  IFile getResource();
}
