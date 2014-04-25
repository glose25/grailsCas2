package edu.rpi

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class UserController {

    def scaffold = true
}
