#conditionals
cars = ['audi', 'bmw', 'subaru', 'toyota']

for car in cars:
    if car == 'bmw':
        print(car.upper())
    else:
        print(car.title())

for car in cars:
    if car.lower() == 'audi':
        print(car.title())
    else:
        print(car)

requested_topping = 'mushrooms'
if requested_topping != 'anchovies':
    print("Hold the anchovies!")

answer = 17
if answer != 42:
    print("That is not the correct answer. Please try again!")


age1 = 22
age2 = 15
boolean = age1 = 22 and age2 > 12
print(boolean)

#para ver si un elemento esta dentro de un array especifico
requested_toppings = ['mushrooms', 'onions', 'pineapple']
b = 'mushrooms' in requested_topping
print(b)

#para ver si esta libre algo
banned_users = ['andrew', 'carolina', 'david']
user = 'marie'
if user not in banned_users:
    print(user.title() + ", you can post a response if you wish.")


"""5-1. Conditional Tests: Write a series of conditional tests. Print a statement
describing each test and your prediction for the results of each test. Your code
should look something like this:
car = 'subaru'
print("Is car == 'subaru'? I predict True.")
print(car == 'subaru')
print("\nIs car == 'audi'? I predict False.")
print(car == 'audi')
•	 Look closely at your results, and make sure you understand why each line
evaluates to True or False.
•	 Create at least 10 tests. Have at least 5 tests evaluate to True and another
5 tests evaluate to False."""
car = 'subaru'
print("Is car == 'subaru'? I predict True.")
print(car == 'subaru')
print("\nIs car == 'audi'? I predict False.")
print(car == 'audi')

if car == 'subaru':
    print("q guapo le " + car + " nino")
else:
    print("tus ganas del " + car)
coches = ('c1', 'c2', 'c3', 'c4')

car2 = 'bmw'
if car2 != 'almudena':
    print("no")

for coche in coches:
    if coche == 'c3':
        print("su coche es " + coche)
    else:
        print("su coche no es " + coches[2] + " y es " + coche)

c = 'c2' in coches
print(c)

d = 'algo' in coches
print(d)

if c not in coches:
    print("Si")
else:
    print("no")

"""5-2. More Conditional Tests: You don’t have to limit the number of tests you
create to 10. If you want to try more comparisons, write more tests and add
them to conditional_tests.py. Have at least one True and one False result for
each of the following:
•	 Tests for equality and inequality with strings
•	 Tests using the lower() function
•	 Numerical tests involving equality and inequality, greater than and
less than, greater than or equal to, and less than or equal to
•	 Tests using the and keyword and the or keyword
•	 Test whether an item is in a list
•	 Test whether an item is not in a list"""
car22 = 'AkaChucHu'
car21 = 'akachuchu'
car23 = 'AKACHUCHU'
if car22.lower() ==car21:
    print("si")
else:
    print("no")

if car22.lower() == car21 and car22.upper() == car23:
    print("yes")
if car22.lower() != car21 or car22.upper() == car23:
    print("no")
else:
    print("yes")




if car22.lower() != car21:
    print("no")
elif car22.upper() != car23:
    print("yes")
else: 
    print(car22 + " not campitibilibili")


"""5-6. Stages of Life: Write an if-elif-else chain that determines a person’s
stage of life. Set a value for the variable age, and then:
•	 If the person is less than 2 years old, print a message that the person is
a baby.
•	 If the person is at least 2 years old but less than 4, print a message that
the person is a toddler.
•	 If the person is at least 4 years old but less than 13, print a message that
the person is a kid.
•	 If the person is at least 13 years old but less than 20, print a message that
the person is a teenager.
•	 If the person is at least 20 years old but less than 65, print a message that
the person is an adult.
•	 If the person is age 65 or older, print a message that the person is an
elder."""
person_age = 13
if person_age < 2:
    print("baby")
elif person_age >= 2 and person_age < 4:
    print("toddler")
elif person_age >= 4 and person_age < 13:
    print("kid")
elif person_age >= 13 and person_age < 20:
    print("teenager")
elif person_age >= 20 and person_age < 65:
    print("adult")
elif person_age > 65:
    print("elder")

"""5-7. Favorite Fruit: Make a list of your favorite fruits, and then write a series of
independent if statements that check for certain fruits in your list.
•	 Make a list of your three favorite fruits and call it favorite_fruits.
•	 Write five if statements. Each should check whether a certain kind of fruit
is in your list. If the fruit is in your list, the if block should print a statement,
such as You really like bananas!"""
favorite_fruits = ['banana', 'apple', 'watermelon']
if 'oranges' in favorite_fruits:
    print("i love oranges")
elif 'peach' in favorite_fruits:
    print("i love peaches")
elif 'banana' in favorite_fruits:
    print("i love bananas")
elif 'pineapple' in favorite_fruits:
    print("i love pineapples")
elif 'apple' in favorite_fruits:
    print("i love apples")


available_toppings = ['mushrooms', 'olives', 'green peppers',
 'pepperoni', 'pineapple', 'extra cheese']
requested_toppings = ['mushrooms', 'french fries', 'extra cheese']

for requested_topping in requested_toppings:
    if requested_topping in available_toppings:
        print("adding " + requested_topping)
    else:
        print("sorry, we haven't " + requested_topping)


"""5-8. Hello Admin: Make a list of five or more usernames, including the name
'admin'. Imagine you are writing code that will print a greeting to each user
after they log in to a website. Loop through the list, and print a greeting to
each user:
•	 If the username is 'admin', print a special greeting, such as Hello admin,
would you like to see a status report?
•	 Otherwise, print a generic greeting, such as Hello Eric, thank you for logging in again."""

usernames = ['manolo', 'grekas', 'admin', 'martins', 'tusmu']
for username in usernames:
    if username == 'admin':
        print("Hello "+ username +", would you like to see a status report?")
    else:
        print("holiwi")


"""5-9. No Users: Add an if test to hello_admin.py to make sure the list of users is
not empty.
•	 If the list is empty, print the message We need to find some users!
•	 Remove all of the usernames from your list, and make sure the correct
message is printed."""
usernames2 = []
if usernames2:
    for username2 in usernames2:
        if username2 == '1':
            print("Necesitamos 6541")
        else:
            print("Necesitamos gente")
else:
    print("We need to find some users!")


"""5-10. Checking Usernames: Do the following to create a program that simulates 
how websites ensure that everyone has a unique username.
•	 Make a list of five or more usernames called current_users.
•	 Make another list of five usernames called new_users. Make sure one or 
two of the new usernames are also in the current_users list.
•	 Loop through the new_users list to see if each new username has already 
been used. If it has, print a message that the person will need to enter a 
new username. If a username has not been used, print a message saying 
that the username is available.
•	 Make sure your comparison is case insensitive. If 'John' has been used, 
'JOHN' should not be accepted."""
current_users = ['manolo', 'grekas', 'admin', 'martins', 'tusmu']
new_usernames = ['manolo', 'si33', 'admin', 'kakaolat', 'tusmu']
for new_username in new_usernames:
    if new_username in current_users:
        print("Nombre no disponible locuelo")
    else:
        print("nombre disponible ")


"""5-11. Ordinal Numbers: Ordinal numbers indicate their position in a list, such 
as 1st or 2nd. Most ordinal numbers end in th, except 1, 2, and 3.
•	 Store the numbers 1 through 9 in a list.
•	 Loop through the list.
•	 Use an if-elif-else chain inside the loop to print the proper ordinal ending for each number. Your output should read "1st 2nd 3rd 4th 5th 6th 
7th 8th 9th", and each result should be on a separate line."""
nums = [1,2,3,4,5,6,7,8,9]
for num in nums:
    if num == 1:
        print(num," st")
    elif num == 2:
        print(num," nd")
    elif num == 3:
        print(num, " thrd")
    else:
        print(num, " nd")


"""5-12. Styling if statements: Review the programs you wrote in this chapter, and 
make sure you styled your conditional tests appropriately."""


"""5-13. Your Ideas: At this point, you’re a more capable programmer than you 
were when you started this book. Now that you have a better sense of how 
real-world situations are modeled in programs, you might be thinking of some 
problems you could solve with your own programs. Record any new ideas you 
have about problems you might want to solve as your programming skills continue to improve. Consider games you might want to write, data sets you might 
want to explore, and web applications you’d like to create"""