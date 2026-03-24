# Public => memberName
# Protected => _memberName
# Private => __memberName

class Car:
    numberOfWheels = 4  #Public attributes
    _color = "Black"    # Procted Attributes
    ___yearOFManufacture = 2017  # Private Attribute

class Bmw(Car):
    def __init__(self):
        print("Protected attribute color: ", self._color)

car = Car()
bmw = Bmw()
print("Public Attribute numberOfWheel : ", car.numberOfWheels)
print("Protected attribute color 1 : ", bmw._color)
print("Private attribute yearOfManufacture : ", car.___yearOFManufacture)