package def.primeng.primeng;

import def.angular.core.*;
import def.primeng.components.dom.domhandler.DomHandler;
import jsweet.lang.Function;

public class Dropdown extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public SelectItem[] options;
    public EventEmitter<?> onChange;
    public String scrollHeight;
    public Boolean filter;
    public Object style;
    public String styleClass;
    public Boolean disabled;
    public Boolean autoWidth;
    public Boolean required;
    public Boolean editable;
    public Object appendTo;
    public TemplateRef<?> itemTemplate;
    public Dropdown(ElementRef el, DomHandler domHandler, Renderer renderer, IterableDiffers differs){}
    public SelectItem selectedOption;
    public Object value;
    public Function onModelChange;
    public Function onModelTouched;
    public SelectItem[] optionsToDisplay;
    public Boolean hover;
    public Boolean focus;
    public Object differ;
    public Boolean panelVisible;
    public Object documentClickListener;
    public Boolean optionsChanged;
    public Object panel;
    public Object container;
    public Object itemsWrapper;
    public Boolean initialized;
    public Boolean selfClick;
    public Boolean itemClick;
    public Object hoveredItem;
    public Boolean selectedOptionUpdated;
    native public void ngOnInit();
    native public void ngDoCheck();
    native public void ngAfterViewInit();
    public String label;
    native public void onItemClick(Object event, Object option);
    native public void selectItem(Object event, Object option);
    native public void ngAfterViewChecked();
    native public void writeValue(Object value);
    native public void updateSelectedOption(Object val);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    native public void updateDimensions();
    native public void onMouseenter(Object event);
    native public void onMouseleave(Object event);
    native public void onMouseclick(Object event, Object input);
    native public void onInputClick(Object event);
    native public void onInputChange(Object event);
    native public void show(Object panel, Object container);
    native public void hide();
    native public void onFocus(Object event);
    native public void onBlur(Object event);
    native public void onKeydown(Object event);
    native public Object findListItem(Object element);
    native public double findOptionIndex(Object val, SelectItem[] opts);
    native public SelectItem findOption(Object val, SelectItem[] opts);
    native public void onFilter(Object event);
    native public void ngOnDestroy();
    protected Dropdown(){}
}

