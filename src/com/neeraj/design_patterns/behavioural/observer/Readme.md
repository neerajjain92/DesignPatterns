## Observer Design Pattern
<hr>

When state of an object changes it notifies other objects about this change. 

Think of an example where based on data in Sheet1 of Excel, the charts built on sheet2
are being modified. So until sheet1 broadcast this change to the interested objects, dependent
charts not being modified. Hence observer pattern comes to the rescue.

```
                        Publish-Subscribe Pattern.

+++++++++++++++++++++
+ Subject           + 
+ (abstract class)  +
+-------------------+
+ attach(observer)  +
+ detach(observer)  +
+ notify()          +
+++++++++++++++++++++
        /\
        ||
        ||
        ||
        ||
|-----------------|                                         |-----------------------|
| DataSource      |                                         | Observer(Interface)   |
|-----------------|                                         |-----------------------|
|value            |---------Composition---------------------> update()              |
|-----------------|                                         |                       |
|getValue()       |                                         |========================
|setValue(value)  |                                         |                        |
|-----------------|                                         |                        |
                                                            |                        |
                                                            |                        |
                                    ============================               ============================
                                    ||   Spreadsheet            ||            ||     PieCharts            ||              
                                    ||  Concrete implementation ||            || Concrete implementation  ||
                                    ||  update()                ||            || update()                 ||
                                     ============================             ============================
                                         
```

We should provide a way for our subscriber to attach themself as observer, so that we can notify them
