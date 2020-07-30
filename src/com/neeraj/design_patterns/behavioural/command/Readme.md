## Command Patterns.
<hr>

### Let's understand this problem via this example.

Design GUI framework, where we have some initial components like Button, Checkbox, and text-box, but 
during the development of this framework developers don't have the knowledge how this button, or other components being used.

We have 4  important components here :
```
INVOKER --------------------------------> COMMAND (Interface)
(BUtton)                                    ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
(Customer Service)                          ||
RECEIVER<--------------------------------> Concrete Command. (AddCustomer)
```

Here Invoker has no clue who the Receiver is, Concrete Command will take care of delegating that task to who-over the receiver is.

This seems to be an overkill for such a small feature but becomes really helpful in situation where we have to run combined commands.
Like take an example of Video editing we can peform certain action, like `crop ---> apply filter --> make fast.` we can replay these actions
and also perform undo operations.
 
