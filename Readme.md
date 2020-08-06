
## Code assignment Java developer

# Part -A
1. Can you implement the sing() method for the bird?  
a. How did you unit test it? **Completed**
b. How did you optimize the code for maintainability?  **For this created separate individual classes and established relation with respective interfaces**

2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound? 
a. A duck says: “Quack, quack”  **Completed**
b. A duck can swim **Completed**
c. A chicken says: “Cluck, cluck” **Completed**
d. A chicken cannot fly (assumption: its wings are clipped but ignore that) **Completed**

3. Now how would you model a rooster?
a. A rooster says: “Cock-a-doodle-doo” **Completed**
b. How is the rooster related to the chicken? **Rooster will extend the attributes of Chicken.**
c. Can you think of other ways to model a rooster without using inheritance? 
**In this case we can create Rooster as a separate mammal or animal with it's own attributes**

4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
a. A parrot living with dogs says: “Woof, woof”. **Completed**
b. A parrot living with cats says: “Meow”. **Completed**
c. A parrot living near the rooster says: “Cock-a-doodle-doo”. **Completed**
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?
**We can keep parrot maintainable by creating a configuration file. Please refer "myConfig.properties". In this file key is neighbor name of parrot and value is corresponding parrot sound.
In future if in case any neighbor increase/decrease then simple edit configuration and no change in code base thereby enhancing the maintainability of code.**


# Part -B
B. Model fish as well as other swimming animals
1. In addition to the birds, can you model a fish?
a. Fishes don’t sing **Completed**
b. Fishes don’t walk **Completed**
c. Fishes can swim **Completed**

2. Can you specialize the fish as a Shark and as a Clownfish?
a. Sharks are large and grey **Completed**
b. Clownfish are small and colourful (orange) **Completed**
c. Clownfish make jokes **Completed**
d. Sharks eat other fish **Completed**

3. Dolphins are not exactly fish, yet, they are good swimmers
a. Can you model a dolphin that swims without inheriting from a fish class?  **Completed, create a class Dolphin which will extend Animal**
b. How do you avoid duplicating code or introducing unneeded overhead?
**This can be avoided by allowing Dolphin to extend directly from Animal and implementing ISwimable**


# Part -D

D. Model animals that change their behaviour over time
1. Can you model a butterfly? 
a. A butterfly can fly  **Completed**
b. A butterfly does not make a sound **Completed**

2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
a. A caterpillar cannot fly **Completed**
b. A caterpillar can walk (crawl) **Completed**

## For Part-D, following is the concept :-
- First of all instead of extending old Animal class, we created a new UniqueAnimal class which will implement IFlyable, IWalkable, ISoundable
- Then we created a class Caterpillar which will extend UniqueAnimal
- Then created a class Butterfly which will further extend Caterpillar to account for the metamorphosis from caterpillar

# Part -E

E. Counting animals
Suppose you have an array of animals, e.g.
Animal[] animals = new Animal[]{
new Bird(),
new Duck(),
new Chicken(),
new Rooster(),
new Parrot(),
new Fish(),
new Shark(),
new Clownfish(),
new Dolhpin(),
new Frog(),
new Dog(),
new Butterfly(),
new Cat()
};
Note: The above instantiation may be different if you chose to set up your object model
differently… (hopefully you did)
1. Can you share the code to count:
a. how many of these animals can fly?
b. how many of these animals can walk?
c. how many of these animals can sing?
d. how many of these animals can swim?

## For Part-E, following is concept :-
- For this please refer class of "CountAnimal" of package "com.prateek.assignment.logic". 
- We're counting by checking instance of respective interfaces. 
- At end full count report is printed

# BONUS

BONUS
If you still have time left, please consider the following:
1. Can you add a second language (if you know a language other than English) Use the
rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds
differently depending on language. Please add the rooster sound in your native
tongue.
• Danish: kykyliky
• Dutch: kukeleku
• Finnish: kukko kiekuu
• French: cocorico
• German: kikeriki
• Greek: kikiriki
• Hebrew: coo-koo-ri-koo
• Hungarian: kukuriku
• Italian: chicchirichi
• Japanese: ko-ke-kok-ko-o
• Portuguese: cucurucu
• Russian: kukareku
• Swedish: kuckeliku
• Turkish: kuk-kurri-kuuu
• Urdu: kuklooku

## For 1.Bonus, following is concept :-
- Please refer class of Rooster of package com.prateek.assignment
- In order to cater future maintainability, we can make use of configuration file. In this file second language will be key and sound of second language will be value.
- Now, we created a parameterized constructor, which will accept second language as input parameter.
- Based on this input parameter as a key get sound as a value from configuration file of "myConfig.properties"

2. Can you design a RESTful API for querying these animals? **Time finished**

# Junit
**For Junit test case results please refer snapshots preset in folder junitResultsSnap**.
