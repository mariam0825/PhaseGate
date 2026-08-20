add = 0

average = 0
for number in range(1, 11):

    score = int(input ("Enter score : "))
    
    if (score % 2 == 0):    
        add += score
        average = add/5;               

print("The total sum of the :", add)

print("The total average of the :", average)
