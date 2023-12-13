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
