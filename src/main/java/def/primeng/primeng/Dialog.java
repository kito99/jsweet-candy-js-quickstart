package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.Renderer;
import def.primeng.components.dom.domhandler.DomHandler;

public class Dialog extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public String header;
    public Boolean draggable;
    public Boolean resizable;
    public double minWidth;
    public double minHeight;
    public Object width;
    public Object height;
    public Object contentHeight;
    public Boolean modal;
    public String showEffect;
    public Boolean closeOnEscape;
    public Boolean rtl;
    public Boolean closable;
    public Boolean responsive;
    public Object appendTo;
    public Object headerFacet;
    public EventEmitter<?> onBeforeShow;
    public EventEmitter<?> onAfterShow;
    public EventEmitter<?> onBeforeHide;
    public EventEmitter<?> onAfterHide;
    public EventEmitter<?> visibleChange;
    public Boolean _visible;
    public Boolean dragging;
    public Object documentDragListener;
    public Boolean resizing;
    public Object documentResizeListener;
    public Object documentResizeEndListener;
    public Object documentResponsiveListener;
    public Object documentEscapeListener;
    public double lastPageX;
    public double lastPageY;
    public Object mask;
    public Boolean shown;
    public Object contentContainer;
    public Boolean positionInitialized;
    public Dialog(ElementRef el, DomHandler domHandler, Renderer renderer){}
    public Boolean visible;
    native public void ngAfterViewInit();
    native public void ngAfterViewChecked();
    native public void center();
    native public void enableModality();
    native public void disableModality();
    native public void hide(Object event);
    native public void moveOnTop();
    native public void initDrag(Object event);
    native public void onDrag(Object event);
    native public void endDrag(Object event);
    native public void initResize(Object event);
    native public void onResize(Object event);
    native public void ngOnDestroy();
    protected Dialog(){}
}

