// open a single window
var win = Ti.UI.createWindow({
	backgroundColor:'white'
});
win.open();

var noSeparator = require('de.hpm.noseparator');
Ti.API.info("module is => " + noSeparator);

var view = Ti.UI.createView({
	height: Ti.UI.FILL,
	width: Ti.UI.FILL,
	layout: 'vertical'
});
win.add(view);

var label = Ti.UI.createLabel({
	top: 10,
	text: 'noSeparator-Module'
});
view.add(label);

if (Ti.Platform.name == "android") {
	function createRow () {
		var row = Ti.UI.createTableViewRow({
			height: 20,
			title: row,
			backgroundColor: '#dedede'
		});
		return row;
	}
	
	var rows = [];
	for (var i = 5;i--;) {
		rows.push(createRow());
	}
	
	var tableViewWithSeparator = Ti.UI.createTableView({
		data: rows,
		headerTitle: 'With Separator',
		top: 0,
		width: Ti.UI.FILL,
		height: Ti.UI.SIZE,
		separatorColor: '#000000'
	});
	view.add(tableViewWithSeparator);
	
	var tableViewWithoutSeparator = Ti.UI.createTableView({
		data: rows,
		headerTitle: 'Without Separator',
		top: 0,
		width: Ti.UI.FILL,
		height: Ti.UI.SIZE,
		separatorColor: '#000000'
	});
	// remove the separator
	noSeparator.Takes(tableViewWithoutSeparator);
	view.add(tableViewWithoutSeparator);
	
} else {
	var label2 = Ti.UI.createLabel({
		top: 10,
		text: 'This module is Android only.'
	});
	view.add(label2);
}

