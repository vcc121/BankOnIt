# BankOnIt
// Admin class
Admin:
    - Extends User, implements HasMenu
    - Main method: create Admin instance
    - Constructor: set admin credentials
    - menu(): display admin menu, return choice
    - start(): handled in Bank
    - getReport(): return admin info

// Bank class
Bank:
    - Implements HasMenu
    - Create Admin and CustomerList
    - Main method: create Bank instance
    - Constructor:
        - Load or create customers
        - Start system
        - Save customers
    - loadSampleCustomers(): add sample data
    - saveCustomers(): serialize customer data
    - loadCustomers(): deserialize or load sample data
    - loginAsCustomer(): authenticate customer
    - loginAsAdmin(): authenticate admin
    - menu(): display bank menu
    - adminStart(): admin actions loop
    - fullCustomerReport(): print all customer info
    - addUser(): add new customer
    - applyInterest(): apply savings interest
    - start(): system menu loop

// CheckingAccount class
CheckingAccount:
    - Implements HasMenu
    - balance: initial 0.0
    - menu(): display account options
    - start(): account actions loop
    - get/set balance: return or update balance
    - checkBalance(): print balance
    - getDouble(): parse user input as double
    - makeDeposit(): add valid amount to balance
    - makeWithdrawal(): subtract valid amount

// HasMenu interface
HasMenu:
    - menu(): return menu string
    - start(): start menu loop

// Customer class
Customer:
    - Extends User
    - Has Checking and Savings accounts
    - Constructor: init accounts
    - menu(): display customer menu
    - start(): customer actions loop
    - changePin(): update PIN
    - getReport(): return account summary

// SavingsAccount class
SavingsAccount:
    - Extends CheckingAccount
    - interestRate: default 0.5
    - setInterestRate(): update rate
    - calcInterest(): apply interest to balance
    - getInterestRate(): return rate

// User class
User:
    - Implements HasMenu, Serializable
    - userName, PIN
    - Constructor: set credentials
    - login(): validate user input
    - menu(), start(): abstract
