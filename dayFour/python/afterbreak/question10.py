add = 0

average = 0

for number in range(1, 11):

    score = int(input ("Enter score : "))
    if( score <= 100):   

        add += score
        average = add/10;
print("The total average of the :",average)

print("The total sum of the :", add)
