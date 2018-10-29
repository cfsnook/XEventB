/**
 * generated by Xtext 2.14.0
 */
package ac.soton.xeventb.camillex;

import ac.soton.xeventb.camillex.AbstractEventBComponentRuntimeModule;
import ac.soton.xeventb.camillex.EventBValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class EventBComponentRuntimeModule extends AbstractEventBComponentRuntimeModule {
  /**
   * Bind the value converter service for Event-B values, e.g., converting comments,
   * labels, etc.
   * 
   * @see EventBValueConverter
   */
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return EventBValueConverter.class;
  }
}
