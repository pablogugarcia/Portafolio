function $(el) {
    return document.getElementById(el);
}

/* $(one).nodeValue = one(); */
var qone = document.getElementById("one");
// var newEnlace= document.createElement("<p></p>");
var texto = document.createTextNode(one());
// qone.appendChild(texto);
let br = function () { return document.createElement('br') };
two();
function one() {
    let show = [];
    for (let line = "#"; line.length < 8; line += "#") {
        console.log(line);
        qone.appendChild(document.createTextNode(line));
        show.push(line);
    }

    return show;
}

function two() {
    let arr = [];
    for (let i = 1; i < 100; i++) {
        if (i % 3 === 0 && !(i % 5 === 0)) {
            arr.push('Fizz');
        } else if (i % 5 === 0 && !(i % 3 === 0)) {
            arr.push('Buzz');
        } else if (i % 5 === 0 && i % 3 === 0) {
            arr.push('FizzBuzz');
        } else { arr.push('' + i); }

    }
    
    return console.log(arr);
}

function tree() {

}
