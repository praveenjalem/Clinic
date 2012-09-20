Ext.define("ACI.store.TheatreStore", {
	extend : "Ext.data.Store",
	model : "ACI.model.Theatre",
	autoLoad : false,
	proxy : {
		type : "ajax",
		url : "theatres.txt",
		reader : {
			type : "json",
			root : "theatres"
		}
	}
	
});