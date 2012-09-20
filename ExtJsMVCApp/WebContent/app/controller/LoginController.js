Ext.define("ACI.controller.LoginController", {
	extend : "Ext.app.Controller",
	views : ["LoginView"],
	models : [],
	stores : [],
	refs : [
	    {ref : "userName", selector : "#usernametext"},
	    {ref : "password", selector : "#passwordtext"},
	    {ref : "homeView", selector : "#homeview"}
	],
	init : function() {
		this.control({
			"loginview button[id=loginbutton]" : {
				click : this.onLoginButtonClicked
			}
		});
	},
	onLoginButtonClicked : function() {
		if(this.getUserName().getValue() == "admin" &&
				this.getPassword().getValue() == "admin") {
			if(!this.getHomeView()) {
				Ext.create("ACI.view.HomeView", {id : "homeview"});
			}
			this.application.viewport.getLayout().setActiveItem(this.getHomeView());
		}
		else {
			alert("Invalid Credentials");
		}
	}
});