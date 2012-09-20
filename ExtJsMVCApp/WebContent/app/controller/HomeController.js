Ext.define("ACI.controller.HomeController", {
	extend : "Ext.app.Controller",
	views : ["HomeView"],
	models : ["Theatre"],
	stores : ["TheatreStore"],
	refs : [
	    {ref : "settingsView", selector : "#settingsview"}
	],
	init : function() {
		this.control({
			"homeview button[id=settingsbutton]" : {
				click : this.onSettingsButtonClicked
			},
			"homeview" : {
				beforerender : this.onBeforeViewRender
			}
		});
	},
	onBeforeViewRender : function() {
		Ext.getStore("TheatreStore").load();
	},
	onSettingsButtonClicked : function() {
		if(!this.getSettingsView()) {
			Ext.create("ACI.view.SettingsView", {id : "settingsview"});
			alert("settings creating");
		}
		this.application.viewport.getLayout().setActiveItem(this.getSettingsView());
	}
});