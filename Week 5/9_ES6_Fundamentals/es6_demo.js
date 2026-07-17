// ==========================================
// 1. let, const vs var
// ==========================================

// 'var' is function-scoped (or globally scoped). It can be re-declared and updated.
var oldWay = "I am a var";
var oldWay = "I was re-declared!"; 

// 'let' is block-scoped. It can be updated but NOT re-declared in the same scope.
let newWay = "I am a let";
newWay = "I can be updated, but not re-declared.";

// 'const' is block-scoped. It cannot be updated or re-declared. It must be initialized immediately.
const fixedValue = 42;
// fixedValue = 100; // This would throw a TypeError if uncommented.

// Note: If const holds an object or array, the contents can still be mutated.
const myArray = [1, 2];
myArray.push(3); // This is perfectly fine.

// ==========================================
// 2. Arrow Functions
// ==========================================

// Traditional Function Expression
const traditionalAdd = function(a, b) {
    return a + b;
};

// Arrow Function Syntax
// Shorter syntax, and does not bind its own 'this', making it great for callbacks.
const arrowAdd = (a, b) => {
    return a + b;
};

// Implicit return (if the function body is a single expression)
const quickAdd = (a, b) => a + b;

// ==========================================
// 3. Classes
// ==========================================

// ES6 introduced a clearer, more standard syntax for Object-Oriented Programming.
class Animal {
    // The constructor is a special method for initializing the object.
    constructor(name) {
        this.name = name;
    }

    // A method on the class
    speak() {
        console.log(`${this.name} makes a noise.`);
    }
}

// Inheritance using the 'extends' keyword
class Dog extends Animal {
    constructor(name, breed) {
        super(name); // Must call super() to initialize the parent class.
        this.breed = breed;
    }

    // Overriding the parent's method
    speak() {
        console.log(`${this.name} barks!`);
    }
}

const myDog = new Dog("Buddy", "Golden Retriever");
myDog.speak(); // Logs: "Buddy barks!"
