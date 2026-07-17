# React Events

## Concept Overview
Handling events in React is very similar to handling events on DOM elements, with a few syntactical differences:
1. React events are named using camelCase, rather than lowercase (e.g., `onClick` instead of `onclick`).
2. With JSX you pass a function as the event handler, rather than a string (e.g., `onClick={handleClick}`).
3. React normalizes events so that they have consistent properties across different browsers. It achieves this by wrapping the native browser event in a `SyntheticEvent`.

## What this Code Demonstrates
This component showcases two of the most common events: `onClick` (for buttons) and `onChange` (for text inputs). 
- The `handleButtonClick` function increments a counter every time the button is clicked. 
- The `handleInputChange` function captures keystrokes in the input field by reading `event.target.value` and updates the component's state so the UI reflects what the user is typing. Both handlers receive React's `SyntheticEvent` object as an argument.
