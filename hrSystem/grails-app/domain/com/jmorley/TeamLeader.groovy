package com.jmorley

class TeamLeader {

String fullName
String department
String employeeID
String sectionName
int officePhone
String leaderEmail
String password
static hasOne = [manager:Manager, teams:Team]
static hasMany = [employees:Employee]

    static constraints = {

fullName blank:false, nullable:false
department blank:false, nullable:false
employeeID blank:false, nullable:false, maxSize:6
sectionName blank:false, nullable:false
officePhone blank:false, nullable:false, maxSize: 11
leaderEmail blank:false, nullable:false, email:true
password blank:false, nullable:false
    }
}
