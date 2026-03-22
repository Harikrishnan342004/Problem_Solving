class Employee:
    name = "Hari"
    designation = "Sales Executive"
    salesMadeThisWeek = 6

    def hasAchievedTarget(self):
        if(self.salesMadeThisWeek >= 5):
            print("Target has been achieved")
        else:
            print("Target has not been achieved")

# creating object
employeeOne = Employee()
# creating object2
employeeOne = Employee()
# calling Attributes
print(employeeOne.name)

# creating object 2 
# Calling Method
object2 = employeeOne.hasAchievedTarget()
print(object2)

