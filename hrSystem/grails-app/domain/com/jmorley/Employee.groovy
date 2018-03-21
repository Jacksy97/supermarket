package com.jmorley

class Employee {

String fullName 
Date dateOfBirth
String residence
double hourlyRate
String employeeID
Date dateEmployed
String taxCode
String contract
static belongsTo = [task:Task]
static hasOne = [manager:Manager, teamleader:TeamLeader, shifts:Shift]
static hasMany = [teams:Team]


    static constraints = {

fullName blank:false, nullable:false
dateofBirth blank:false, nullable:false
residence blank:false, nullable:false
hourlyRate blank:false, nullable:false
employeeID blank:false, nullable:false
taxcode blank:false, nullable:false
contract blank:false, nullable:false


    }
}
