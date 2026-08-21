def is_Single( number):
    value = number[0]
    count = 0;
    
    for index in number(len()):
        if (number[index] == number[value]):
            count+=1  

    return count

number = {2,2,1}
print(is_Single (number))
