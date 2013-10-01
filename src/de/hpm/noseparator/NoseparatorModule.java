/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.hpm.noseparator;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import ti.modules.titanium.ui.TableViewProxy;
import ti.modules.titanium.ui.widget.TiUITableView;
import ti.modules.titanium.ui.widget.tableview.TiTableView;
import android.widget.ListView;

@Kroll.module(name="Noseparator", id="de.hpm.noseparator")
public class NoseparatorModule extends KrollModule
{

	// Standard Debugging variables
	private static final String TAG = "NoseparatorModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public NoseparatorModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(TAG, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}

	// Methods
	
	@Kroll.method
	public void hideTableRowSeparator(TableViewProxy tableViewProxy)
	{
	    ListView tableListView = tableViewProxy.getTableView().getListView();
	    tableListView.setDividerHeight(0);
	 
	    Log.d(TAG, "Divider height set to zero!");
	}
	
//	// Properties
//	@Kroll.getProperty
//	public String getExampleProp()
//	{
//		Log.d(TAG, "get example property");
//		return "hello world";
//	}
//	
//	
//	@Kroll.setProperty
//	public void setExampleProp(String value) {
//		Log.d(TAG, "set example property: " + value);
//	}

}
