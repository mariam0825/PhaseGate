       let number = "123456";
       let reverse = 0;
        let  digit = 0;

    while(number > 0){
        
        digit = number % 10;

        reverse = reverse *10 + digit;
        
       number = number/10;
 
  }

   console.log(reverse)


