# Lists and Keys

## Concept Overview
In React, you will often need to render a list of items dynamically from an array of data. The standard way to do this is using the JavaScript `Array.prototype.map()` function to transform an array of data objects into an array of React elements.

Whenever you render a list of elements, React requires you to provide a special string attribute called a `key` on each list item. Keys help React identify which items have changed, been added, or been removed. 
- A key should be a unique identifier from your data (like a database ID).
- You should avoid using the array index as a key if the order of items may change, as this can negatively impact performance and cause state issues with component internals.

## What this Code Demonstrates
This project renders a list of fruits using the `.map()` function. Each `<li>` element is given a proper `key` using the fruit's unique `id`. 

To illustrate *why* keys are important, each list item includes a text input. If you type a note into one of the inputs and then click the "Shuffle List" button, you will see that the text you typed follows the correct fruit, even as its position changes. If we had used the array index as the key instead, React would get confused and leave the text inputs exactly where they were, attaching them to the wrong fruits after the shuffle!
