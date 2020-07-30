###Version 1:

- In version 1 we are implementing the mediator pattern using Dialog Box 
controlling entire orchestration and every component (ListBox, TextBox and Button) needs to be aware
of the Dialog Box

### Version 2:

- In this version we are implementing the Mediator Pattern using Observers. So Components act as a Subject 
of the Observer pattern and provide (attach, detach, and notifyAll()) behaviour and anyone can register
themselves who are interested in the change, In this way component need not be aware about the existence
of any Dialog Box.
