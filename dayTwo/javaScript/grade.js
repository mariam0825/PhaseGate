    function gradeScore (scoreOne ,scoreTwo, scoreThree){

    const average = scoreOne + scoreTwo + scoreThree / 3;

       if (average >= 90) {
            return("A");
        }else {
          if (average >= 80) {
            return("B");
        }
        else {
        if (average >= 70) {
           return  ("C");
        }
         else {
            if (average >= 60) {
           return ("D");
        }
        else {
           return ("F");
}
}
}

}
}

console.log("The average of the three score grade is " + gradeScore(70, 65,88))

