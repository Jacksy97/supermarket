package com.jmorley

class Team {

String teamName
int numberOfEmployees
String sectionName
String description
static belongsTo = [employees:Employee, tasks:Task, shifts:Shift]
static hasOne = [teamLeaders:TeamLeader]
static hasMany = [tasks:Task, shifts:Shift, employees:Employee, teams:Team]

    static constraints = {

teamName blank:false, nullable:false
numberOfEmployees blank:false, nullable:false, maxSize:2
sectionName blank:false, nullable:false
description blank:false, nullable:false, maxSize: 250

    }
}
