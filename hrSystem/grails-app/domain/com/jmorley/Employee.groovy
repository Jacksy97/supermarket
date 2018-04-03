package com.jmorley

class Employee {

String fullName 
String dateOfBirth
String residence
String hourlyRate
String employeeID
String dateEmployed
String taxCode
String contract
static belongsTo = [tasks:Task]
static hasOne = [managers:Manager, teamLeaders:TeamLeader, shifts:Shift]
static hasMany = [teams:Team]


    static constraints = {

fullName blank:false, nullable:false
dateOfBirth blank:false, nullable:false
residence blank:false, nullable:false
hourlyRate blank:false, nullable:false
employeeID blank:false, nullable:false
taxCode blank:false, nullable:false
contract blank:false, nullable:false


    }
}
