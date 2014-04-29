package edu.rpi

class LogoutTagLib {
	def grailsApplication
   
	def logoutUrl = { attrs, body ->
//		out << body() << ("<a href="+grailsApplication.config.grails.plugin.springsecurity.logout.afterLogoutUrl+" style=\"background-image:url(${resource(dir:'images',file:'Logout_0.png')});width:68px;height:34px;display:block;\"></a>")
		out << body() << ("<a href="+grailsApplication.config.grails.plugin.springsecurity.logout.afterLogoutUrl+">Log Out</a>")
	}


}
