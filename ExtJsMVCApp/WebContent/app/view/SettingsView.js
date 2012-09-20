Ext.define("ACI.view.SettingsView", {
	extend : "Ext.panel.Panel",
	xtype : "settingsview",
	title : "Settings Page",
	items : [
	    {
	    	xtype : "label",
	    	text : "Settings"
	    },
	    {
	    	xtype : "button",
	    	text : "Home",
	    	id : "homebutton"
	    }
	]
});