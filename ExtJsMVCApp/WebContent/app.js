Ext.Loader.setConfig({enabled : true});

Ext.application({
	name : "ACI",
	appFolder : "app", //default
	controllers : ["LoginController", "HomeController", "SettingsController"],
	launch : function() {
		this.viewport = 
			Ext.create("Ext.container.Viewport", {
			layout : "card",
			items : [
			     {xtype : "loginview", id : "loginview"}
			]
		});
	} 
});