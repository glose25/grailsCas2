package edu.rpi

import grails.plugin.springsecurity.annotation.Secured


class SecureController {

    def index() { 
        render 'hi jay secure: Secure access only'
    }
    
    @Secured(['ROLE_ADMIN'])
    def whatup() {
        render ' you should not be getting here'
    }
}
