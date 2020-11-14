# Topic: *Creational Design Patterns*
### Author: *Garciu Eugenia*
------
## Theory :
Creational design patterns are :

   * Singleton
   * Builder
   * Prototype
   * Factory Method
   * Abstract Factory
   
## Implementation :
In this project I've implemented 5 creational design patterns i.e. (Singleton, Builder, Prototype, Factory Method and Abstract Factory) with the emphasis on the fundamental object _**Player**_. The player class contains 4 attributes and the *get* and *set* methods as you can see in *Player.java* file. Also in that file is a method called *clone()* which is used to return a clone of the object if it exists in the *HashMap* which I'm maintaining in _**AbstractFactory**_ class.

The simplest DP, Singleton I've implemented in _**FactoryCreator**_ class. Then I declare the constructor as private so that the class could be instantiated only from _getInstance()_ method which is a static one and by a simple if i.e. : 
~~~
if (instance == null) {
    synchronized (FactoryCreator.class) {
        if (instance == null) {
            instance = new FactoryCreator();
        }
    }
 }
 ~~~
*The builder DP ensures that a program can create different objects by the same creational process. In my project there are 2 stages to create the player. First is chosen the factory by human type and then in the coresponding factory is chosen a builder class. 

*Prototype DP I have implemented in Abstract Factory class and invoke it in Main class checking whether I have such a prototype already created and just clone it, in my case I don't create any, so it returns null pointer exception.

*The factory methods that I've used in my project are in _**HumanBuilder**_ class. There are multiple classes which inherit the top one.Then depending on human type specification parameter it is chosen one of them.

*I have the factories which get the corresponding builder for each human type. These factories extend the _**AbstractFactory**_ which is being used in _**FactoryCreator**_ class. 

The process from _**FactoryCreator**_ is in the following lines in _**Main**_:
~~~
 FactoryCreator creator = FactoryCreator.getInstance();
         AbstractFactory humanFactory = creator.getHumanTypeBuilder(HumanType.African);
         HumanBuilder humanBuilder = humanFactory.getHumanBuilder(HumanTypeSpecifications.negroidBrownEyes);
~~~

## Screenshot
![](/Users/janegarciu/Documents/TMPS/Lab2/screenshots/screenshot.png)

# Topic: *Structural Design Patterns*

## Theory :
Structural design patterns are :

   * Adapter
   * Bridge
   * Composite
   * Filter
   * Decorator
   * Facade
   * Fly-weight
   * Proxy
## Implementation :
In this project I've implemented 4 structural design patterns i.e. (Adapter, Composite, Decorator and Proxy).
The idea of the project remained the same. The main object of attention remained human being. 

__1. Adapter__ 

For the _**Adapter**_ pattern I have 2 main classes:  _**HumanAdapter**_ and _**HumanBuilderImplementation**_ . In the _**HumanBuilderImplementation**_ class I check whether the specified human gender is correct, if yes, I create an adapter and invoke build method implemented in _**HumanAdapter**_ class. In the adapter class based on gender I create an object of one of the specified classes _**ManBuilder**_ and _**WomanBuilder**_. Based on gender provided, using _**AdvancedHumanBuilder**_ interface implemented in Man and Woman builder classes, I define his or her eye color: 

Below you can see how the builder is used by the output of a program:

![](/Users/janegarciu/Documents/TMPS/Lab2/screenshots/Adapter.png)

__2. Decorator__ 

Here I have the _**IHuman**_ interface in which I specify that all human beings should implement the  _**create()**_ method. In  _**OrdinaryHuman**_ class I have the basic implementation, but to be able to modify it at runtime I've added the  _**HumanDecorator**_ abstract class which then is extended by  _**AfricanHuman**_ and _**EuropeanHuman**_ classes. There I kind of add some appropriate characteristics of a specified human type to an ordinary human being. 

As you can see on the screenshot, here I create an ordinary human being and add specified human type characteristics.

![](/Users/janegarciu/Documents/TMPS/Lab2/screenshots/Adapter.png)

__3. Proxy__ 

For the proxy design pattern I have _**HumanPassportDetails**_ interface which is implemented in both _**PassportDetailsAnnouncement**_ and _**ProxyPassportDetailsAnnouncement**_ classes. So, once instantiated in Main, _**ProxyPassportDetailsAnnouncement**_ class ensures that the client can't do anything out of order with the original class since all of his requests pass through our proxy class. Here we have that passport details once loaded can be displayed immediately without being loaded again.

Screenshot of the output:

![](/Users/janegarciu/Documents/TMPS/Lab2/screenshots/Proxy.png)

__4. Composite__

The last attribute in _**HumanInfo**_ class which is the list of group members is used in the _**Composite Pattern**_. The _**Composite Pattern**_ is used when we need a way to treat a whole group of objects in a similar manner. In my case I have people of different age which can be grouped and treated in a simmilar way, I have created age groups in which are present those people defined in a common list, depending on age criteria.

Screenshot of an output is presented below: 

![](/Users/janegarciu/Documents/TMPS/Lab2/screenshots/Composite.png)