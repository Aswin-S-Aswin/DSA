foods = []
prices = []
total = 0

while True:
    food = input("Enter a food to buy (Q to quit): ")
    if food.lower() == "q":
        break
    else:
        foods.append(food)
        price = float(input(f"Enter the price of {food} ($): "))
        prices.append(price)

print("----- Your cart -----")
for food in foods:
    print(food, end=" ")
print()
for price in prices:
    total += price
print(f"Your total is: ${total}")
