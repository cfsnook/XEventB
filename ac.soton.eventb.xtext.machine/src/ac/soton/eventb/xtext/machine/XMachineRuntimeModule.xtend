/*
 * generated by Xtext 2.10.0
 */
package ac.soton.eventb.xtext.machine

import org.eclipse.xtext.conversion.IValueConverterService
import ac.soton.eventb.xtext.common.EventBValueConverter

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class XMachineRuntimeModule extends AbstractXMachineRuntimeModule {

	/* @htson Converting comments */
	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return typeof(EventBValueConverter);
	}

}
