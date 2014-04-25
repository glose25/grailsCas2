package edu.rpi

import grails.plugin.springsecurity.annotation.Secured

class TestcasController {

    def springSecurityService

    def index() {
        render '<p>You made it to index okay.  This is not a secure page.</p>'
        def authentication = springSecurityService.authentication
        def principal = authentication?.principal
        render "Testcas:: CAS has verified you as " + principal
    }

//    @Secured('ROLE_ADMIN')
    @Secured(['IS_AUTHENTICATED_FULLY'])
    def secured()  {
        render 'You made it to a secured page okay.'
    }

}