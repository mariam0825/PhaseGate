
let word = "My madam is nice";
let count = 0;
        for ( index = 0; index < word.length; index++) {
             text = word.charAt(index);
            if (Character.isLowerCase(text)) {
                count++;
            }
        }
        console.log(count);
