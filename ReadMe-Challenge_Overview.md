Module 1 Challenge

    Due May 7 by 12:59am Points 100 Submitting a text entry box or a website url

Application Overview

This challenge consists of several coding exercises that evaluate your understanding of object-oriented programming in Java.

This challenge might look familiar, because it is an extension of an exercise from earlier in the course. However, several differences and additions exist, so make sure to read and follow the challenge instructions carefully!
Goals

    Demonstrate your knowledge of polymorphism by coding alternate implementations using the same interface.

    Use composition as a code reuse mechanism, constructing one object from another.

    Implement JUnit test cases to unit-test functionality for each exercise.

Instructions

Complete the following instructions for this Challenge.
Challenge Setup

    Code must reside in one directory called M1-Challenge-Lastname-Firstname.

    Solutions must reside in their own IntelliJ project as specified next.

Exercise 1: Converter Interface

    Create your solution in an IntelliJ project called ConverterInterface.

    Create two implementations of the following interface.

    The first implementation must use "if"/"else if"/"else" statements and be called ConverterIf.

    The second implementation must use switch statements and be called ConverterSwitch.

    Create a class called ConverterApplication, which has your main method.

    Instantiate and use both the ConverterIf and ConverterSwitch classes in that main method.

    Implement the interface of ConverterIf and ConverterSwitch classes by using the following code:

public interface Converter {

    /**
     * This method converts the given number into its corresponding month.
     * @param monthNumber&mdash;the number you wish to convert to a month
     * @return&mdash;the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
     */
    String convertMonth(int monthNumber);

    /**
     * This method converts the given number into its corresponding day of the week.
     * @param dayNumber&mdash;number you wish to convert to a day of the week
     * @return&mdash;the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
     * The first day of the week is Sunday
     */
    String convertDay(int dayNumber);

}

    Using JUnit, implement test cases to verify the functionality of your ConverterIf and ConverterSwitch classes.

Exercise 2: Calculate Object
Requirements

    In this exercise, you will create a class that has a set of methods that does addition, subtraction, multiplication, and division for two integer parameters and a separate set of methods that does the same for two double parameters.

    You will then instantiate the class and use it to perform the following calculations.

    You must print out the calculation being performed and the result of the calculation. For example: 2 + 2 = 4.

Instructions

    Create your solution in an IntelliJ project called CalculatorObject.

    Perform the following calculations:

    1 + 1
    23 - 52
    34 * 2
    12/3
    12/7
    3.4 + 2.3
    6.7 * 4.4
    5.5 - 0.5
    10.8/2.2

    Using JUnit, implement test cases to verify the functionality of your calculator class. Include test cases for integers and doubles, using each of the four operations (addition, subtraction, multiplication, and division).

Exercise 3: Ice Cream Design
Requirements

    In this exercise, you will model the attributes of two different IceCream classes.

    The first class will represent ice cream as it might be modeled in the point-of-sale system in an ice cream shop. The second class will represent ice cream as it might be modeled in an ice cream factory.

    Each class must have at least three data members and at least three methods.

Instructions

    Create your solution in an IntelliJ project called IceCreamClassDesign.

    Using JUnit, implement test cases to verify the functionality of your two IceCream classes.

Because you will be testing two different IceCream classes with the same name, you will need to use the "fully qualified" names of the classes instead of importing them.

For example, if the paths of your two IceCream classes are "com.company.factory" and "com.company.pointofsale":

    Example code to create the "factory" version of the IceCream class might look like:

com.company.factory.IceCream iceCream =
new com.company.factory.IceCream(flavor, salePrice, productionCost, productionTime, ingredients);

    Example code to create the "pointofsale" version of the IceCream class might look like:

com.company.pointofsale.IceCream iceCream =
new com.company.pointofsale.IceCream(flavor, price, quantity);

Exercise 4: RPGInheritance
Requirements

In this exercise, you will design an inheritance hierarchy for characters in a video game. Your design must include a common base class for the following three character types:

    Farmer

    Constable

    Warrior

Instructions

    Create your solution in an IntelliJ project called RPGInheritance.

    Create the following three classes, each deriving from a common base class:

    Farmer

        Properties:

        name

        strength (initial value = 75)

        health (initial value = 100)

        stamina (initial value = 75)

        speed (initial value = 10)

        attackPower (initial value = 1)

        running (initial value = false)

        arrested (initial value = false)

        plowing (initial value = false)

        harvesting (initial value = false)

        Abilities:

        attack another character

    Constable

        Properties

        name

        strength (initial value = 60)

        health (initial value = 100)

        stamina (initial value = 60)

        speed (initial value = 20)

        attackPower (initial value = 5)

        running (initial value = false)

        arrested (initial value = false)

        jurisdiction

        Abilities:

        arrest another character

        attack another character

    Warrior

        Properties

        name

        strength (initial value = 75)

        health (initial value = 100)

        stamina (initial value = 100)

        speed (initial value = 50)

        attackPower (initial value = 10)

        shieldStrength (initial value = 100)

        running (initial value = false)

        arrested (initial value = false)

        Abilities:

        attack another character

    Using JUnit, implement test cases to verify the functionality of the three classes.

Exercise 5: Customer Composition
Requirements

    In this exercise, you will design and implement a class that represents a customer based on the following specifications.

    Use composition for maximum code reuse.

Instructions

    Create your solution in an IntelliJ project called CustomerComposition.

    Design a Customer class that keeps track of:

        First name

        Last name

        Email

        Phone number

        Shipping address:

        Street 1

        Street 2

        City

        State

        Zip

        Billing address:

        Street 1

        Street 2

        City

        State

        Zip

        Whether or not the customer is a Rewards Member.

    Using JUnit, implement test cases to verify the functionality of your customer class.

Submission

Great job completing your first Challenge! Now it’s time to submit. It may seem intimidating to look at, but these steps will become second nature before you know it. Make sure to double-check that your submission is completed.

    Create and clone a working Java repo: on Github.com, create a repository called YourFirstName_YourLastName_Java. Clone the repository onto your machine.

    Copy your folder: when you have completed your Challenge assessment, copy your completed M1-Challenge-Lastname-Firstname folder (located inside in your Working Folder Java) into your personal GitHub repository folder located on your desktop.

    Complete the commands: once the M1-Challenge-Lastname-Firstname folder has been copied into the GitHub repository folder, navigate into your GitHub repository in either your terminal (Mac) or Git Bash (Windows). Once you have navigated to the appropriate repository, complete the following commands (which should be familiar):
        git add -A
        git commit-m"< commit message >" where < commit message > is your commit message for the commit
        git push origin master

    Navigate: open your personal account on Github.com. Navigate to the YourFirstName_YourLastName_Java repository.

    Confirm: click on the M1-Challenge-Lastname-Firstname folder that you created and uploaded. Confirm that ALL of the expected projects have been included inside that folder. Again, the folder name should be related to the module associated with the Challenge.

    Copy the URL: copy the URL of the Challenge folder from the browser address bar.

    Paste the URL: log in to BootCampSpot, and paste the URL for this specific Challenge in the appropriate location.

Grading Requirements

In this challenge, your grade will consist of a combination of general setup and format requirements and your actual code. See the following criteria for more detailed information.
Exercise 1 Code: 20%

    Your solution must reside in an IntelliJ project called ConverterInterface.

    The first implementation uses "if"/"else if"/"else" statements and is called ConverterIf.

    The second implementation uses switch statements and is called ConverterSwitch.

    You create a class called ConverterApplication, which has your main method. In that main method, you instantiate and use both the ConverterIf and ConverterSwitch classes.

    You create JUnit test cases to verify your ConverterIf and ConverterSwitch functionality.

Exercise 2 Code: 20%

    You create a solution in an IntelliJ project called CalculatorObject.

    Your program prints out the calculation being performed and the result of the calculation.
        1 + 1
        23 - 52
        34 * 2
        12/3
        12/7
        3.4 + 2.3
        6.7 * 4.4
        5.5 - 0.5
        10.8/2.2

    You create JUnit test cases to verify your calculator functionality.

Exercise 3 Code: 20%

    You create your solution in an IntelliJ project called IceCreamClassDesign.

    Your first class represents ice cream as it might be modeled in the point-of-sale system in an ice cream shop.

    Your second class represents ice cream as it might be modeled in an ice cream factory.

    Each class must have at least three data members and at least three methods.

    You create JUnit test cases to verify the functionality of the two ice cream classes.

Exercise 4 Code: 20%

    You create your solution in an IntelliJ project called RPGInheritance.

    Your design must include a common base class for the following three character types:

        Farmer

        Properties:
            name
            strength (initial value = 75)
            health (initial value = 100)
            stamina (initial value = 75)
            speed (initial value = 10)
            attackPower (initial value = 1)
            running (initial value = false)
            arrested (initial value = false)
            plowing (initial value = false)
            harvesting (initial value = false)

        Abilities:
            attack another character

        Constable

        Properties
            name
            strength (initial value = 60)
            health (initial value = 100)
            stamina (initial value = 60)
            speed (initial value = 20)
            attackPower (initial value = 5)
            running (initial value = false)
            arrested (initial value = false)
            jurisdiction

        Abilities:
            arrest another character
            attack another character

        Warrior

        Properties
            name
            strength (initial value = 75)
            health (initial value = 100)
            stamina (initial value = 100)
            speed (initial value = 50)
            attackPower (initial value = 10)
            shieldStrength (initial value = 100)
            running (initial value = false)
            arrested (initial value = false)

        Abilities:
            attack another character

    You create JUnit test cases to verify the functionality of each of the three classes.

Exercise 5 Code: 20%

    You create your solution in an IntelliJ project called CustomerComposition.

    You design a Customer class which must keep track of:

        First name

        Last name

        Email

        Phone number

        Shipping address:

        Street 1

        Street 2

        City

        State

        Zip

        Billing address:

        Street 1

        Street 2

        City

        State

        Zip

        Whether or not the customer is a Rewards Member

    You create JUnit test cases to verify the functionality of your Customer class.
