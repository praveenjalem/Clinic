Ext.define("ACI.controller.SettingsController", {
	extend : "Ext.app.Controller",
	views : ["SettingsView"],
	models : [],
	stores : [],
	refs : [
	    {ref : "homeView", selector : "#homeview"}
	],
	init : function() {
		this.control({
			"settingsview button[id=homebutton]" : {
				click : this.onHomeButtonClicked
			}
		});
	},
	onHomeButtonClicked : function() {
		if(!this.getHomeView()) {
			Ext.create("ACI.view.HomeView", {id : "homeview"});
		}
		this.application.viewport.getLayout().setActiveItem(this.getHomeView());
	}
});