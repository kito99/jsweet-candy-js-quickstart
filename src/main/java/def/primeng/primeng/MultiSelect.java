package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.IterableDiffers;
import def.angular.core.Renderer;
import def.primeng.components.dom.domhandler.DomHandler;
import jsweet.lang.Function;

public class MultiSelect extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public SelectItem[] options;
    public EventEmitter<?> onChange;
    public String scrollHeight;
    public String defaultLabel;
    public Object style;
    public String styleClass;
    public Boolean disabled;
    public Boolean overlayVisible;
    public Object[] value;
    public Function onModelChange;
    public Function onModelTouched;
    public String valuesAsString;
    public Boolean hover;
    public Boolean focus;
    public Object documentClickListener;
    public Object panel;
    public Object container;
    public Boolean selfClick;
    public Boolean panelClick;
    public String filterValue;
    public SelectItem[] visibleOptions;
    public Boolean filtered;
    public Object differ;
    public MultiSelect(ElementRef el, DomHandler domHandler, Renderer renderer, IterableDiffers differs){}
    native public void ngOnInit();
    native public void ngAfterViewInit();
    native public void ngAfterViewChecked();
    native public void ngDoCheck();
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    native public void onItemClick(Object event, Object value);
    native public Boolean isSelected(Object value);
    native public double findSelectionIndex(Object val);
    native public void toggleAll(Object event, Object checkbox);
    native public Boolean isAllChecked();
    native public void show();
    native public void hide();
    native public void close(Object event);
    native public void onMouseenter(Object event);
    native public void onMouseleave(Object event);
    native public void onMouseclick(Object event, Object input);
    native public void onFocus(Object event);
    native public void onBlur(Object event);
    native public void updateLabel();
    native public String findLabelByValue(Object val);
    native public void onFilter(Object event);
    native public Boolean isItemVisible(SelectItem option);
    native public SelectItem[] getVisibleOptions();
    native public void ngOnDestroy();
    protected MultiSelect(){}
}

