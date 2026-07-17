# ES6 Fundamentals

## Concept Overview
Before diving deep into React, it's essential to understand the modern features of JavaScript introduced in ES6 (ECMAScript 2015). React relies heavily on these features.
- **let and const**: Modern alternatives to `var` for variable declaration, providing block-scoping and (in the case of `const`) protection against reassignment.
- **Arrow Functions**: A shorter syntax for writing functions. Crucially, they don't have their own `this` context, which makes them highly predictable when used as callbacks (e.g., in React event handlers).
- **Classes**: Syntactical sugar over JavaScript's existing prototype-based inheritance. It makes object-oriented programming patterns cleaner and more intuitive, which was heavily used in traditional React Class Components.

## What this Code Demonstrates
This directory contains a plain JavaScript file (`es6_demo.js`) that is not a React project. The file includes thoroughly commented, standalone code snippets demonstrating the differences between `var`, `let`, and `const`, showing how to write traditional vs. arrow functions, and defining a simple class hierarchy using `class` and `extends`. You can run this file directly using Node.js (`node es6_demo.js`) to see the results.
