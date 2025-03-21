# BankOnIt
User Class (Abstract)

    userName and PIN as strings.
    Constructor: Set userName and PIN.
    login()
        Prompt for userName and PIN.
        Check if both match.
        Return true if valid, false otherwise.
    setPIN(): Validate and set 4-digit PIN.
    getReport(): Abstract method.

HasMenu Interface

    menu() -> Display menu.
    start() -> Start user interaction.

CheckingAccount Class

    balance as double.
    menu() -> Display account options.
    start() -> Handle user choices:
        1 -> Check balance.
        2 -> Make deposit.
        3 -> Make withdrawal.
        0 -> Exit.
    checkBalance() -> Print balance.
    makeDeposit() -> Add valid amount to balance.
    makeWithdrawal() -> Deduct valid amount from balance.

SavingsAccount Class (Inherits CheckingAccount)

    interestRate as double.
    calcInterest() -> Calculate and apply interest.

Customer Class (Inherits User)

    checking and savings as account objects.
    menu() -> Display account options.
    start() -> Handle choices:
        1 -> Manage Checking.
        2 -> Manage Savings.
        3 -> Change PIN.
        0 -> Exit.
    changePin() -> Update PIN.
    getReport() -> Print user and account details.

Main Workflow

    Create Customer with username and PIN.
    Login:
        If success, start account management.
        If failure, prompt again.
