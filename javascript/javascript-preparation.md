
Java script
============

----------------------------

function f1() {
	console.log(a);
	a=1;
}

f1();

-----------------------------
-----------------------------
-----------------------------
-----------------------------
-----------------------------

difference between call, apply, bind
this in js? this inside of arrow function
	- https://blog.bloomca.me/2018/08/24/javascript-fundamentals-this.html
arrow function vs normal function
module pattern in javascript
scopes in javascript
	- global, function, block
spread operator and rest operator - their differences and usages
difference between map and foreach
code hoisting - variable and function
what is polyfill?
self invoked function or IIFE
anonymous functions
how to create a copy of a object in javascript? (shallow and deep copy)
	- let objClone = { ...obj }; (shallow)
	- var clone = JSON.parse(JSON.stringify(original)); (deep copy, but methods are lost. cannot be used for circular objects)
	- var clone = Object.assign({}, obj); (shallow)
	- custom code
	- using 3rd party libraries like jQuery, lodash, underscore, etc
Objects are sometimes called associative arrays. Why?
obj.hasOwnProperty(i)
Object.keys(o)
what is prototype inheritance?
Array.sort() -- how to override this function with custom implementation?
prototype and __proto__ difference
Function and variable hosting, which takes precedence?
mul(12)(3)(5);
how to implement singleton pattern?
	https://stackoverflow.com/questions/1479319/simplest-cleanest-way-to-implement-singleton-in-javascript
module patter in javascript
Property shadowing in JavaScript
Event loop, call stack, callback queue
How is asynch working in js since it is not supported?
observables are lazy - why?
observables vs promises
how GC works in javascript?
Compare 2 JavaScript objects for equality
Throttling and debouncing - differences and implementation
	username suggestion box example
Array.length -> how is it implemented?
uses of closures in javascript? 
Inheritance example - Parent - Person(name,age). Child - Employee(salary)
	https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Objects/Inheritance
	https://jsfiddle.net/vrhkpsLq/8/
setTimeout vs setInterval, how to clear an interval
Promises - how do you handle resolved, rejected and error scenarios?
is it possible to access parent property if it is shadowed by a child property? How?
how to identify whether a variable is an object in javascript (not an array, not a function)
null is an object in javascript?
Shadow DOM
ES6 class implementation and its internal working
how to make an object immutable? what properties are there on the object?
Object.freeze() and Object.seal()
what is currying and its implementation

ES6 additions
Functional programming

https://javascriptweblog.wordpress.com/2010/07/06/function-declarations-vs-function-expressions/
https://javascript.info/prototype-inheritance
https://javascript.info/function-prototype
https://2014.jsconf.eu/speakers/philip-roberts-what-the-heck-is-the-event-loop-anyway.html

https://medium.freecodecamp.org/function-hoisting-hoisting-interview-questions-b6f91dbc2be8
https://github.com/yangshun/front-end-interview-handbook/blob/master/questions/javascript-questions.md
https://www.codementor.io/nihantanu/21-essential-javascript-tech-interview-practice-questions-answers-du107p62z
https://github.com/ganqqwerty/123-Essential-JavaScript-Interview-Questions
https://www.toptal.com/javascript/interview-questions


Additional docs -
https://addyosmani.com/resources/essentialjsdesignpatterns/book/
https://codeburst.io/60-javascript-tutorials-walkthroughs-cb315cc1947e
http://dmitrysoshnikov.com/ecmascript/javascript-the-core/

***********************************

