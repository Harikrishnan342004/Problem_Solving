class Apple:  # Base class
    manufacture = "Apple Inc."
    contactWebsite = "WWW.apple.com/conatact"

    def contactDetails(self):
        print("To connect is, log on to", self.contactWebsite)

class MacBook(Apple):   # Sub class
    def __init__(self):
        self.yearOfManufacture = 2017
    
    def manufactureDetails(self):
        print("This MacBook was Manufactured in the year {} by {}".format(self.yearOfManufacture, self.manufacture))

macBook = MacBook()
print(macBook.manufactureDetails())
print(macBook.contactDetails())