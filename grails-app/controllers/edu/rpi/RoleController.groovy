package edu.rpi


import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class RoleController {

    def scaffold = true
}
