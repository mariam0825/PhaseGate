const scanner = require("prompt-sync")(); 
 

let sum = 0;
let average = 0;
  
    for( index = 1 ; index <=10; index ++){      
        let score = 0;
    console.log("Enter Score = ");
     if(score <= 100){
        sum +=score;
    average = sum/10
}
 }   

    console.log("The total sum of number is : ", sum);

    console.log ("The total avaerage is : ", average);
