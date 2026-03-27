class Employee:
    def setNumberOfWorkingHours(self):
        self.workingHours = 40
    
    def displayNumberOfWorkingHours(self):
        print(self.workingHours)


class Trainee(Employee):
    def setNumberOfWorkingHours(self):
        self.workingHours = 45
    
    def resetNumberOfWorkingHours(self):
        super().setNumberOfWorkingHours()


# Employee object
employee = Employee()
employee.setNumberOfWorkingHours()
print("Number of working hours of Employee:", end=' ')
employee.displayNumberOfWorkingHours()

# Trainee object
trainee = Trainee()
trainee.setNumberOfWorkingHours()
print("Number of working hours of Trainee:", end=' ')
trainee.displayNumberOfWorkingHours()

# Reset trainee working hours using super()
trainee.resetNumberOfWorkingHours()
print("After reset (Trainee working hours):", end=' ')
trainee.displayNumberOfWorkingHours()