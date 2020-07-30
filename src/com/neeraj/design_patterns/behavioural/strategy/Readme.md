# Strategy Design Pattern.

### Let's understand this problem via this example 

- Ability to store images uploaded by users.
   We need to perform couple of tasks before uploading image to Cloud, such as compression
   encryption, apply filters to the image. Now we don't want to do this in a Single class
   which will break our SOLID principle 
   
   a) First it will break Single Responsibility Principle
   b) It will break open for extension and closed for modification.
   
   
#### Solution :

- We will use strategy design pattern to solve this issue. 


### Difference between State and Strategy design pattern

In state pattern the "Context" object will have just one state, and the object 
will behave based on that. Like our cellphone can be either in Ringer, Silent or Vibration state.

whereas in Strategy Design pattern, we don't have any single state, instead different behaviors are
present as composition as different strategy objects.
