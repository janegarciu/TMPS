### Author: *Garciu Eugenia*
# Topic: *Behavioral Design Patterns*

## Theory :
Behavioral design patterns are :
   *Interpreter
   *Template Method/Pattern
   *Chain of Responsibility
   *Command
   *Iterator
   *Mediator
   *Memento
   *Observer
   *State
   *Strategy
   *Visitor
   
## Implementation :
In this project I've implemented 3 behavioral design patterns i.e. (Template pattern, Iterator and Strategy).
The idea of the project remained the same. The main object of attention remained human being. 

__1. Template__ 

For the _**Template**_ pattern I have an interface:  _**Human**_ that provides predefined ways to run its methods. I have taken human lifecycle as a main idea to implement this pattern. These two classes
 _**FirstTypeOfHumanLifecycle**_ and _**SecondTypeOfHumanLifecycle**_ define two types of lifecycle that a human can have(of course this is an abstraction of human's life).
 These two people live a different life, but follow my defined template: grow up, find a job, become a parent, retire.

Below you can see the illustration of the point of this pattern:

![](/Lab3/screenshots/Template.png)

__2. Iterator__ 

For the Iterator pattern I have two interfaces defined: _**Iterator**_ and _**Sector**_, Iteartor is stored in the container of sorts, in our case person's working sector:
```java
package Iterator;

public interface Sector {
    public Iterator getIterator();
}
```
In  _**HumanRepository**_ class I have the basic implementation of an iterator which iterates through an array of predefined people that I have identified here:
```java
 public String[] people = {"Hina", "Scott", "Josh", "Andrew", "Jessica"};
```
while our array has the next element. I check this with has hasNext() method.
As you can see on the screenshot, here I create an ordinary human being and add specified human type characteristics.

![](/Lab3/screenshots/Iterator.png)

__3. Strategy__ 

For the Strategy design pattern I have a _**Strategy**_ interface which is implemented in the following three classes _**Adolescent**_, _**Adult**_ and _**Senior**_. 
The strategy defined in the _**Strategy**_ class will be used to build different types of people, of different age:
```java
public class Adolescent implements Strategy{
    @Override
    public String build(Integer age) {
        return "Returning an adolescent of age of:" + age;
    }
}
public class Adult implements Strategy{
    @Override
    public String build(Integer age) {
        return "Returning an adult of age of:" + age;
    }
}
public class Senior implements Strategy{
    @Override
    public String build(Integer age) {
        return "Returning a senior of age of:" + age;
    }
}
```
A _**BuildContext**_ class will use the strategy that I have already defined:
```java
public class BuildContext {
    private Strategy strategy;

    public BuildContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(Integer age) {
        return strategy.build(age);
    }
}
```
And to see the output:

![](/Lab3/screenshots/Strategy.png)
