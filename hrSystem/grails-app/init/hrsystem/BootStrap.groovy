package hrsystem

class BootStrap {

    def init = { servletContext ->
def manager1 = new 
Manager(
fullName:Jack Morley	
userName:JMorley
password:manager1
managerEmail:Jmorley97@email.com	
office:1
department:Head Office
).save()
def manager2 = new 
Manager(
fullName:Mack Jorley	
userName:MJorley
password:manager2
managerEmail:Mjorley97@email.com	
office:2
department:Head Office
).save()
def teamleader1 = new 
TeamLeader(
fullName: Sarah Macdonald
department: Grocery
employeeID: TL1111
sectionName: Bakery
officePhone: 01111777
leaderEmail: Smacdonald@email.com
password: secret2017
).save()
def teamleader2 = new 
TeamLeader(
fullName: Mary Berry
department: Grocery
employeeID: TL1112
sectionName: Bakery
officePhone: 01111778
leaderEmail: Mberry@email.com
password: ihatebakeoff
).save()
def employee1 = new 
Employee(
fullName: Tom Rivers
dateOfBirth: 05/05/1999
residence: Sheffield
hourlyRate: 7.50
dateEmployed: 26/02/2018
taxCode: TX345
contract: Full-time
).save()
def employee2 = new 
Employee(
fullName: Bob Stevenson
dateOfBirth: 05/05/1998
residence: Sheffield
hourlyRate: 7.50
dateEmployed: 26/02/2017
taxCode: TX346
contract: Full-time
).save()
def team1 = new 
Team(
teamName: Team Loading
numberOfEmployees: 10
sectionName: Bakery
description: Loading and unloading
).save()
def team2 = new 
Team(
teamName: Team Loading
numberOfEmployees: 20
sectionName: Butcher
description: Loading and unloading
).save()
def task1 = new 
Task(
taskName: Replenishing
numberOfPeople: 2
sectionName: Bakery
department: Grocery
timeRequired: 1 hour
description: Replenishing shelves
taskCompleted: true
def task2 = new 
Task(
taskName: Replenishing
numberOfPeople: 4
sectionName: Wear
department: Clothing
timeRequired: 2 hour
description: Replenishing shelves
taskCompleted: false
).save()
def task2 = new 
Task(
taskName: Replenishing
numberOfPeople: 4
sectionName: Wear
department: Clothing
timeRequired: 2 hour
description: Replenishing shelves
taskCompleted: false
).save()
def shift1 = new 
Shift(
timeOfDay: Morning
dayOfWeek: Monday
numberOfHours: 4
startingTime: 6:00am
).save()
def shift2 = new 
Shift(
timeOfDay: Afternoon
dayOfWeek: Tuesday
numberOfHours: 8
startingTime: 12:00pm
).save()




    }


    def destroy = {
    }
}
