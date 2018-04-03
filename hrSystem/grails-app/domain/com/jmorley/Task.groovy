package com.jmorley

class Task {

String taskName
int numberOfPeople
String sectionName
String department
String timeRequired
String description
String taskCompleted
static belongsTo = [Shift]
static hasMany = [Shift, Employee, Team]

    static constraints = {

taskName blank:false, nullable:false
numberOfPeople blank:false, nullable:false, maxSize:3
sectionName blank:false, nullable:false
timeRequired blank:false, nullable:false
description blank:false, nullable:false, maxSize:250
taskCompleted blank:false, nullable:false
    }
}
