### Undoable Commands
<hr>

Let's say we are building HTML Editor.

We can implement the undoable mechanism using command pattern, which is basically 
putting a particular object to it's previous state, but one can agrument that you can also memento pattern for that,
but storing "state snapshot" of a large video file while editing is costly. 

Hence we just UNDO those commands, let's say we are resizing a particular video, we can store the dimension before
resizing so that whenever we undo the resize we just set dimension to that previous stored version.   

```
    Command Interface
        (execute())
        /\
        ||
        ||
        Extending
        ||
        ||
        ||
       UNDOABLE Interface
        (unexecute())
        /\
        ||
        ||
        Implementing
        ||
        ||
        ||
       Bold Command
        (Concrete implementation)
```

Why we are not putting un-execute method in the Command Interface itself, because by nature some commands are not undoable
such as Save a file, or Zoom-In/Zoom out, hence ths segregation.
