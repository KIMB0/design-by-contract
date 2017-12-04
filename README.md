# Design by contract - Discrete Mathematics
> Created by Alexander Falk and edited by Kim Meyer Albrechtsen, CPHBusiness, Software Development BA, group E

This simple program is written in java, 
which can be used to create an application by the principle; Design By Contract.  


In the class Account you'll find attributes above variables and methods. 
These attributes are JML keywords to be interpreted by other developers.  
Those who are used in this application are as follows:  
* `requires` Defines a precondition on the method that follows
* `ensures` - Defines a postcondition on the method that follows
* `signals_only` - Defines what exception to be thrown if a precondition holds
* `assignable` - Defines which fields are allowed to be assigned to by the method that follows
* `pure` - Define a method to have no side effects. Will terminate normally or throw an exception
* `invariant` - Define an invariant ("constant") property of a class
* `also` - Combine specification cases. 
* `spec_public` - Declares a private or protected variable public for specification purposes
* `\result` - Identifier for return value of the method that follows
* `\old<expression>` - Identifier which refers to the value of the expression

As an example you can go into the `Account.class` and find the method `withdraw()`. Above that it is specified as 
an requirement that the `account_balance > amount`. This is to ensure you can't withdraw more than you own.