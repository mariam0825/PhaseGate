add = 0

for number in range(1, 11):

    score = int(input ("Enter score : "))
    
    if (score % 2 == 0):    
        add += score
               


print("The total sum of the :", add)
