add = 0
average = 0

for number in range(1, 11):

    score = int(input ("Enter score : "))
    
    add += score
    average = add /10

print ("The total sum  of the :" , add)

print("The total average of the :", average)
