# Styling Components

## Concept Overview
In React, there are several ways to apply CSS styles to components. Two common approaches are:
1. **Inline Styles**: Passing a JavaScript object directly to the `style` attribute of an element. The keys of the object correspond to camelCased CSS properties (e.g., `backgroundColor` instead of `background-color`).
2. **CSS Modules**: Writing normal CSS in a separate file ending in `.module.css`, and importing it into your component as an object. The CSS class names become properties of that object and are uniquely scoped to the component, preventing class name collisions across your application.

## What this Code Demonstrates
This project renders two buttons. The first button is styled using the inline styling approach, where a JavaScript object defines its look. The second button is styled using a CSS module (`Button.module.css`). By using CSS modules, we get the benefit of standard CSS features like hover effects (which are harder to do with pure inline styles) while keeping the styles completely scoped to this specific component.
