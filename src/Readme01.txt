What is wrong with the approach to override methods to do nothing?

1) from a 'client-programmer' perspective in terms of the expected 'interface'

For a 'client-programmer' point of view the problem would be related to a wrong misconception of what
a Duck interface should be doing (where the system design does not agree with the actual implementation).
In the context of a collaborative development effort (which could be either a large team or a small team)
the developers in charge of implementing the interfaces of the program, for example, a front-end developer,
would be creating Duck implementations thinking that all of them share the same set of behaviors.

Take a look at this part of the code of the Runner class:

Duck[] ducks = new Duck[] {
               new MallardDuck()
               , new RedHeadDuck()
               , new RubberDuck()
               , new DecoyDuck()
};

for (Duck d : duckArray) {
    d.display();
    System.out.print("\t, then it swims like this: ");
    d.swim();
    System.out.print("\t, and makes a ");
    d.quack();
    System.out.print("\t, and flys off: ");
    d.fly();
}

In this case the client-programmer only has access to the type of the reference, so he would expect
that a Duck actually implements the behaviors described in its interface: fly, quack, and swim, in other
words he would be expecting that the methods of the reference type do something instead of printing nothing.

2) from an 'end-user' perspective

The main problem with this approach from an 'end-user' perspective is that it would ultimately lead to
confusion among the end-users as the system behavior would not be the one that is being expected from
the initial design.

Take a look at this part of the output of the program:

RedHeadDuck shows its feathers
	, then it swims like this: <<RedHeadDuck swim style>>
	, and makes a <<RedHeadDuck quack sound>>
	, and flys off: <<RedHeadDuck fly style>>

DecoyDuck floats on the water
	, then it swims like this: <<DecoyDuck swim style>>
	, and makes a 	, and flys off:

This is an example of unexpected behavior in a system. The blank empty spaces on the output messages
for the DecoyDuck leaves the end-user expecting an appropriate behavior from the system, which in this
case would be a piece of information in the message that is missing. As a programmer, you cannot inherently
expect that this omitted piece of information would be understood by the end-user. Think of it as an
online form that has some fields of information empty or display blank messages on the screen, it just would
not be understandable for an end-user.