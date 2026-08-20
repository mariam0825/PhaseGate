add = 0

for number in range(1, 11):

    if (number % 2 == 0):

        score = int(input ("Enter score : "))
    
        add += score

print("The total sum of the :", add)
