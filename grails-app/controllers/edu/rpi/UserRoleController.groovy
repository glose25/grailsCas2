package edu.rpi

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class UserRoleController {

    def scaffold = true
}
