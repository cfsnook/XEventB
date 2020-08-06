/*******************************************************************************
 * Copyright (c) 2018 University of Southampton.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.ui

import org.eclipse.jface.viewers.ILabelProvider
import org.eclipse.jface.viewers.ILabelProviderListener
import org.eclipse.swt.graphics.Image

/**
 * Abstract implementation for of a label provider for XEvent-B
 * navigator objects.
 * 
 * @author htson
 * @version 1.0
 * @since 0.1
 * @see IXEventBNavigatorObject
 */
abstract class AbstractXEventBNavigatorLabelProvider
	implements ILabelProvider {

	/**
	 * Return the key to get the image from the image registry of this
	 * XEvent-B UI plugin.
	 * 
	 * @return the key to retrieve the image from the registry
	 */
	def abstract String getImageKey()
	
	
	/**
	 * Do nothing at the moment.
	 */
	override void addListener(ILabelProviderListener listener) { 
		// Do nothing
	}

	/**
	 * Do nothing at the moment.
	 */
	override void dispose() {
		// Do nothing
	}

	/**
	 * Do nothing at the moment.
	 */
	override boolean isLabelProperty(Object element, String property) {
		// Always return false
		return false
	}

	/**
	 * Do nothing at the moment.
	 */
	override void removeListener(ILabelProviderListener listener) {
		// Do nothing
	}

	/**
	 * Returns the image corresponding to the image key.
	 * 
	 * @param element
	 *          The input element.
	 * @return the image corresponding to the image key.
	 */
	override Image getImage(Object element) {
		if (element instanceof IXEventBNavigatorObject) {
			val registry = XEventBUIPlugin.^default.imageRegistry
			return registry.get(getImageKey)
		}
		return null
	}

	/**
	 * Returns the file name of the resource of the XEvent-B navigator
	 * object.
	 * 
	 * @param element
	 *          The input element.
	 * @return the file name of the resource of the input navigator
	 *          object. 
	 */
	override String getText(Object element) {
		if (element instanceof IXEventBNavigatorObject) {
			return element.resource.name 
		}
		return null
	}
}
