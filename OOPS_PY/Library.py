#class => Library
# Layers of abstractiob =>  display  available books, to lend a book , to add a book

class Library:
    def __init__(self , listOfBooks):
        self.availableBooks = listOfBooks
        print(self.availableBooks)

    def displayAvailableBooks(self):

        print()
        print("******************************")
        print("Available Books")
        print("******************************")
        for book in self.availableBooks:
            print(book)

# 🔹 3. Where is Abstraction in your code?

# 👉 Abstraction = Hiding internal logic and showing only functionality

# In your program:l

# User doesn’t know:

# How books are stored
# How removal happens

    def lendBook(self, requestedBook):
        if requestedBook in self.availableBooks:
            print("You have now borrowed the book")
            self.availableBooks.remove(requestedBook)
        else:
            print("Sorry, the book is not available in our list ")
        
    def addBook(self , returnedBook ):
        self.availableBooks.append(returnedBook)
        print("You have returned the Book. Thank You!")

# Class => Customer
# Layer of abstraction => request for a book , return a book
class Customer:

    def requestBook(self):

        print("Eneter the name of a book you would like to borrow")
        self.book = input()
        return self.book
        
    def returnBook(self):
        print("Enter the name of the book which you are returning ")
        self.book = input()
        return self.book
        

library = Library(['Atomic Habbit', 'Think and Grow Rich' , 'who will'])
customer = Customer()

print("Enter 1 to display the available books")
print("Enter 2 to request for a book ")
print("Enter 3 to return a book")
print("Enter 4 to exit")

while True:
    userChoice = int(input())
    if(userChoice == 1):
        library.displayAvailableBooks()
    elif userChoice == 2:
        requestedBook = customer.requestBook()
        library.lendBook(requestedBook)
    elif userChoice == 3:
        returnedBook = customer.returnBook()
        library.addBook(returnedBook)
    elif userChoice == 4:
        quit()


