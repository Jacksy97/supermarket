package com.jmorley

class Shift {

String timeOfDay
String dayOfWeek
int numberOfHours
String startingTime
static hasMany = [teams:Team, employees:Employee, tasks:Task]

    static constraints = {

timeOfDay blank:false, nullable:false
dayOfWeek blank:false, nullable:false
numberOfHours blank:false, nullable:false, maxSize:2
startingTime blank:false, nullable:false

    }
}
