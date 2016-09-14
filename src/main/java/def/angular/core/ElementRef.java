package def.angular.core;

public class ElementRef {

	/**
	 * The underlying native element or `null` if direct access to native
	 * elements is not supported (e.g. when the application runs in a web
	 * worker).
	 *
	 * <div class="callout is-critical"> <header>Use with caution</header>
	 * <p>
	 * Use this API as the last resort when direct access to DOM is needed. Use
	 * templating and data-binding provided by Angular instead. Alternatively
	 * you take a look at {@link Renderer} which provides API that can safely be
	 * used even when direct access to native elements is not supported.
	 * </p>
	 * <p>
	 * Relying on direct DOM access creates tight coupling between your
	 * application and rendering layers which will make it impossible to
	 * separate the two and deploy your application into a web worker.
	 * </p>
	 * </div>
	 * 
	 * @stable
	 */
	public Object nativeElement;

	public ElementRef(Object nativeElement) {
	}

}
