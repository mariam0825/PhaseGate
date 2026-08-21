number = 38;


 function add (number){
     sum = 0;
 
    while (number > 0) {
      digit = number % 10;  
            
           sum+=digit; 
            number /= 10;               
        }
        return sum;
    }
    
   console.log(add(number));
