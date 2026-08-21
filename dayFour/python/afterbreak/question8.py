add = 0

for number in range(1, 11):

    score = int(input ("Enter score : "))
    if(0 >= score <= 100):   

        add += score

print("The total sum of the :", add)
