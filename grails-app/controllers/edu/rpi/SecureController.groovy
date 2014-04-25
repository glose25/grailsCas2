package edu.rpi

import grails.plugin.springsecurity.annotation.Secured


class SecureController {

    def index() { 
        render 'hello. this is a public page. all are welcome.'
    }
    
    @Secured(['ROLE_ADMIN'])
    def whatup() {
        render ' you should not be getting here unless you have the ADMIN role.'
    }
}
