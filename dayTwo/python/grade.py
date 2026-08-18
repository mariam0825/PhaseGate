def gradeScore(score_one, score_two, score_three):

    average = score_one + score_two + score_three / 3
    
    if (average >= 90):
        return("A")
    elif(average >= 80):
        return("B") 
    elif(average >= 70):
        return  ("C")
    elif(average >= 60):
        return ("D");
    else:
        return ("F")



print("The average of the three score grade is " + gradeScore(70, 65,88))
