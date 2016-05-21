package com.softtek.automation.actions;

import com.softtek.automation.ExecutionResult;
import com.softtek.automation.element.UIElement;

public interface UIActions extends Actions {

	public ExecutionResult ClickOnElement(UIElement element);

	public ExecutionResult ElementHasText(UIElement element, String text);

	public ExecutionResult ElementContainsText(UIElement element, String text);

	public ExecutionResult TypeTextOn(UIElement element, String text);

	public ExecutionResult SelectValueFromDropdownElement(UIElement createElement, String text);

	public ExecutionResult IsDisabled(UIElement element);
	
	public ExecutionResult VerifyMaxLengthText(UIElement element, int length);
	
	public ExecutionResult IsSelected(UIElement element);
	
	public ExecutionResult MoveFocusTo(UIElement element);
	
	public ExecutionResult ElementIsEnabled(UIElement element);

	public ExecutionResult ElementIsTypeOf(UIElement element, String tagType);

	public ExecutionResult MoveMouseOverElement(UIElement element);

	public ExecutionResult ElementHasFocus(UIElement element);
	
	public ExecutionResult SelectValueOnListElement(String value, UIElement element);

	public ExecutionResult ElementIsOrdered(UIElement element, String orderType);
	
	public ExecutionResult GetText(UIElement element);
	
	public ExecutionResult GetValue(UIElement element);	

	public ExecutionResult ElementNotExist(UIElement element);
	
	public ExecutionResult SelectElementFromtList(String selectedItem, UIElement element);
	
	public ExecutionResult GetSelectedValue(UIElement element);
	
	//public ExecutionResult GetRowValues(UIElement element);
	
	public ExecutionResult CountElements(UIElement element);
	
	public ExecutionResult VerifyUI(String UIView)throws Exception;
	
	/*
	 *Overload actions 
	 */

	public ExecutionResult ClickOnElement(String xpath, String[] params);
	
	public ExecutionResult ElementHasText(String xpath, String[] params, String text);
	
	public ExecutionResult ElementContainsText(String xpath, String[] params, String text);
	
	public ExecutionResult TypeTextOn(String xpath, String[] params, String text);
	
	public ExecutionResult IsDisabled(String xpath, String[] params);
	
	public ExecutionResult ElementIsEnabled(String xpath, String[] params);
	
	public ExecutionResult VerifyMaxLengthText(String xpath, String[] params, int length);
	
	public ExecutionResult ElementIsTypeOf(String xpath, String[] params, String tagType);
	
	public ExecutionResult SelectListElement(String selectedItem, String xpath, String[] params);
	
	public ExecutionResult MoveMouseOverElement(String xpath, String[] params);
	
	public ExecutionResult IsSelected(String xpath, String[] params);
	
	public ExecutionResult ElementHasFocus(String xpath, String[] params);
	
	public ExecutionResult MoveFocusTo(String xpath, String[] params);
	
	public ExecutionResult SelectValueOnList(String value, String xpath, String[] params);
	
	public ExecutionResult GetSelectedValue(String xpath, String[] params);
	
	public ExecutionResult GetText(String xpath, String[] params);
	
	public ExecutionResult GetValue(String xpath, String[] params);
	
	public ExecutionResult ElementIsOrdered(String xpath, String[] params, String orderType);
	
	public ExecutionResult PutElementValueInCacheContext(String xpath, String[] params);
	
	public ExecutionResult PutElementValueInVolatileContext(String xpath, String[] params);
	
	public ExecutionResult CountElements(String xpath, String[] params);
	
	public ExecutionResult GetColumnValues(String xpath, String[] params);
	
	public ExecutionResult GetRowValues(String xpath, String[] params);
	
	public ExecutionResult GetListValues(String xpath, String[] params);

	public ExecutionResult ElementNotExist(String xpath, String[] params);	
	
	public ExecutionResult ExecuteJS(String script, String ... args);

	public ExecutionResult SelectValueFromDropdownElement(String xpath,	String[] params, String value);

		
}
