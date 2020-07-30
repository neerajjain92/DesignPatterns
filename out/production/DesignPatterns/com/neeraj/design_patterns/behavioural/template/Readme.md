# Template Design pattern.

### Let's understand this problem via this example 

- In banking System, let's try to record all user actions for Audit Purpose, now either 
we can inject AuditService in all the Controllers/Service and invoke this audit, but this doesn't 
enforce all the developers to mandatorily call this AUDIT, User can choose to skip that.
  
   
#### Solution :

- We will use template design pattern to solve this issue. 

We will have a Parent Abstract class like Task, and respective task will override 
the doExecute method but for outside user all these details are abstracted... we will still call execute method
of Task.
