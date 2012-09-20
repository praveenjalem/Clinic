Ext.define("ACI.view.LoginView", {
	extend : "Ext.panel.Panel",
	xtype : "loginview",
	title : "Login",
	items : [
	    {
	    	xtype : "textfield",
	    	fieldLabel : "User Name",
	    	id : "usernametext"
	    },
	    {
	    	xtype : "textfield",
	    	fieldLabel : "Password",
	    	id : "passwordtext",
	    	inputType : "password"
	    },
	    {
	    	xtype : "button",
	    	text : "Login",
	    	id : "loginbutton"
	    }
	]
});