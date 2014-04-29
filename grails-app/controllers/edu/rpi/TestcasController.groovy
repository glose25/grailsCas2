package edu.rpi

import grails.plugin.springsecurity.annotation.Secured

class TestcasController {

    def springSecurityService


	def index() {
        def authentication = springSecurityService.authentication
        def principal = authentication?.principal
		[principal: principal]
    }

//    @Secured('ROLE_ADMIN')
    @Secured(['IS_AUTHENTICATED_FULLY'])
    def secured()  {
        def authentication = springSecurityService.authentication
        def principal = authentication?.principal
		[principal: principal]
    }

}