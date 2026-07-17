# Conditional Rendering

## Concept Overview
In React, you can create distinct components that encapsulate behavior you need. Then, you can render only some of them depending on the state of your application. Conditional rendering in React works the same way conditions work in JavaScript. 

The three most common patterns for conditional rendering are:
1. **Element Variables**: Using `if/else` statements outside of the JSX to conditionally assign elements to a variable, and then rendering that variable inside the JSX.
2. **Ternary Operator**: Using the `condition ? true : false` syntax right inside the JSX for simple inline conditionals.
3. **Logical && Operator**: Using the `condition && expression` syntax to render an element only if a condition is true, and render nothing otherwise.

## What this Code Demonstrates
This app includes three interactive toggles (simulating a user login state, a message notification state, and a user role). Below the toggles, it demonstrates all three conditional rendering techniques:
- **Ternary Operator**: Shows a welcome message if logged in, or a login prompt if not.
- **Logical &&**: Shows a notification alert only if the user is logged in AND has messages.
- **Element Variable**: Renders a different message based on the selected role using a standard `if/else if/else` block outside the `return` statement.
