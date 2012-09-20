Ext.define("ACI.view.HomeView", {
	extend : "Ext.panel.Panel",
	xtype : "homeview",
	title : "Home Page",
	items : [
	    {
	    	xtype : "label",
	    	text : "Welcome"
	    },
	    {
	    	xtype : "button",
	    	text : "Settings",
	    	id : "settingsbutton"
	    },
	    {
	    	xtype : "grid",
	    	title : "Theatres",
	    	store : "TheatreStore",
	    	columns : [
	    	    {text : "Name", dataIndex : "name"},
	    	    {text : "Location", dataIndex : "location"}
	    	]
	    }
	]
});