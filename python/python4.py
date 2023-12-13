magicians = ['alice', 'david', 'carolina'] 
for m in magicians:
    print(m)

    magicians = ['alice', 'david', 'carolina'] 
for magician in magicians: 
    print(magician.title() + ", that was a great trick!") 
#cuidao con tabular, el for coge lo tabulado

"""4-1. Pizzas: Think of at least three kinds of your favorite pizza. Store these 
pizza names in a list, and then use a for loop to print the name of each pizza.
•	 Modify your for loop to print a sentence using the name of the pizza 
instead of printing just the name of the pizza. For each pizza you should 
have one line of output containing a simple statement like I like pepperoni 
pizza.
•	 Add a line at the end of your program, outside the for loop, that states 
how much you like pizza. The output should consist of three or more lines 
about the kinds of pizza you like and then an additional sentence, such as 
I really love pizza!"""
pizzas = ['crispy', '4 quesos', 'carboara']
for p in pizzas:
    print(p.title() +" me guta")
print("ñam")

#number list
for value in range(1,5):
    print(value)
for value in range(1,6):
    print(value)

#el ultimo digito dice cada cuantos
even_numbers = list(range(2,11,2)) 
print(even_numbers)

even_numbers = list(range(2,11,3)) 
print(even_numbers)


squares = []
for value in range(1,11):
    square = value**2
    squares.append(square)
print(squares)

squares2 = []
for value in range(1,11):
    squares2.append(value**2)
print(squares2)


digits = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
print(min(digits))
print(max(digits))
print(sum(digits))

squares = [value**2 for value in range(1,11)]
print(squares)

"""4-3. Counting to Twenty: Use a for loop to print the numbers from 1 to 20, 
inclusive"""
numeros = [value for value in range (1,21)]
print(numeros)

"""4-4. One Million: Make a list of the numbers from one to one million, and then 
use a for loop to print the numbers. (If the output is taking too long, stop it by 
pressing ctrl-C or by closing the output window.)"""
#numeros2 = [value for value in range (1,1000001)]
#print(numeros2)

"""4-5. Summing a Million: Make a list of the numbers from one to one million, 
and then use min() and max() to make sure your list actually starts at one and 
ends at one million. Also, use the sum() function to see how quickly Python can 
add a million numbers."""
# print(min(numeros2))
# print(max(numeros2))

"""4-6. Odd Numbers: Use the third argument of the range() function to make a list 
of the odd numbers from 1 to 20. Use a for loop to print each number."""
for n in numeros:
    print(n)
"""4-7. Threes: Make a list of the multiples of 3 from 3 to 30. Use a for loop to 
print the numbers in your list."""
numeros3 = [value for value in range(3,30,3)]

for n in numeros3:
    print(n)
"""4-8. Cubes: A number raised to the third power is called a cube. For example, 
the cube of 2 is written as 2**3 in Python. Make a list of the first 10 cubes (that 
is, the cube of each integer from 1 through 10), and use a for loop to print out 
the value of each cube."""
numeros5 = []
for value in range(1,11):
    numero5 = value**3
    numeros5.append(numero5)
print(numeros5)


"""4-9. Cube Comprehension: Use a list comprehension to generate a list of the 
first 10 cubes."""
numeros4 = [value**3 for value in range(1,11)]
print(numeros4)

#parts of a list
players = ['charles', 'martina', 'michael', 'florence', 'eli'] 
print(players[0:3])

players = ['charles', 'martina', 'michael', 'florence', 'eli']
print(players[1:4])

#if u dont specify the first index willl be the start of the list
players = ['charles', 'martina', 'michael', 'florence', 'eli']
print(players[:4])

#and to the final
players = ['charles', 'martina', 'michael', 'florence', 'eli']
print(players[2:])

#the last 3 players will be:
players = ['charles', 'martina', 'michael', 'florence', 'eli']
print(players[-3:])

#loop in a slice of a list
players = ['charles', 'martina', 'michael', 'florence', 'eli']
for player in players[:3]:
    print(player.title())

my_foods = ['pizza', 'falafel', 'carrot cake']
friends_foods = my_foods[:]

print("My favourite foods are:")
print(my_foods)

print("My friend's favourite food is:")
print(friends_foods)

my_foods.append('carameloraro')
friends_foods.append('algorico')
print("My favourite foods are:")
print(my_foods)

print("My friend's favourite food is:")
print(friends_foods)

"""4-10. Slices: Using one of the programs you wrote in this chapter, add several
lines to the end of the program that do the following:
•	 Print the message, The first three items in the list are:. Then use a slice to
print the first three items from that program’s list.
•	 Print the message, Three items from the middle of the list are:. Use a slice
to print three items from the middle of the list.
•	 Print the message, The last three items in the list are:. Use a slice to print
the last three items in the list."""
marcas = ['nike', 'adidas', 'puma', 'reebok', 'jorfan', 'coco', 'no', 'si', 'algo', 'bmw']
print("Las tres primeras marcas serian: ", marcas[:3])
print("Las tres marcas del medio serian: ", marcas[3:6])
print("Las tres marcas finales serian: ", marcas[6:])

"""4-11. My Pizzas, Your Pizzas: Start with your program from Exercise 4-1
(page 60). Make a copy of the list of pizzas, and call it friend_pizzas.
Then, do the following:
•	 Add a new pizza to the original list.
•	 Add a different pizza to the list friend_pizzas.
•	 Prove that you have two separate lists. Print the message, My favorite
pizzas are:, and then use a for loop to print the first list. Print the message,
My friend’s favorite pizzas are:, and then use a for loop to print the second list. Make sure each new pizza is stored in the appropriate list."""
pizzas_mia = ['crispy', '4 quesos', 'carboara']
friends_pizzas = ['crispy', '4 quesos', 'carboara']
pizzas_mia.append('baebacoa')
friends_pizzas.append('vegan')

print("My favourite pizzas are: ")
for mpizza in pizzas_mia:
    print(mpizza)

print("My friend's favourite pizzas are: ")
for fpizza in friends_pizzas:
    print(fpizza)


#tuple, inmutable lists
dimensions = (200, 50)
print(dimensions[0])
print(dimensions[1])
for dimension in dimensions:
    print(dimension)


dimensions = (200, 50)
print("Original dimensions:")
for dimension in dimensions:
    print(dimension)

dimensions = (400, 100)
print("\nModified dimensions:")
for dimension in dimensions:
    print(dimension)

print(dimensions)

"""4-13. Buffet: A buffet-style restaurant offers only five basic foods. Think of five
simple foods, and store them in a tuple.
•	 Use a for loop to print each food the restaurant offers.
•	 Try to modify one of the items, and make sure that Python rejects the
change.
•	 The restaurant changes its menu, replacing two of the items with different
foods. Add a block of code that rewrites the tuple, and then use a for
loop to print each of the items on the revised menu."""
disses = ('macarronr', 'saladitos', 'pechugonas', 'sopichuela', 'monchis')
for diss in disses:
    print(diss)

# disses.append('spaguetone')
# print(disses)

disses = ('macarronr', 'saladitos', 'almendras', 'salchipapas', 'monchis')
for diss in disses:
    print(diss)