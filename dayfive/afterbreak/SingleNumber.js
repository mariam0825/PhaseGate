let number = [2,2,1];

function isSingle( number){
     value = number[0];
    count = 0;
    
    for( index = 0; index < number.length; index++){
        if (number[index] == number[value]){
            count++;   
    }
     
   }

    return count;

}

console.log (isSingle(number));[]
