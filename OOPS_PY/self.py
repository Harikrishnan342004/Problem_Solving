class Employee:
    # def employeeDetails():
    #     pass

    def employeeDetails(self):
        self.name = "Mathew"
        print("Name = " , self.name)
        age = 30
        print("Age = ", age)
    
    def printEmployeeDetail(self):
        print("Printing in another method")
        print("Namr : ", self.name)
        # print("Age: ", age)
employee = Employee()
print("1" ,employee.employeeDetails())
print(employee.printEmployeeDetail())