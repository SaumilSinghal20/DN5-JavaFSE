# Components: Class vs Function

## Concept Overview
In React, components are the building blocks of the UI. There are two main ways to define them:
1. **Class Components**: The older, more traditional way. They require extending `React.Component` and implementing a `render()` method. Before hooks were introduced, classes were the only way to use state and lifecycle methods.
2. **Function Components**: The modern, simpler way. They are just regular JavaScript functions that return JSX. With the introduction of React Hooks, functional components can now do everything class components can, making them the standard choice for new React code.

## What this Code Demonstrates
This project renders two components side-by-side: `GreetingClass` and `GreetingFunction`. Both components visually achieve the exact same result on the screen, but their underlying syntax highlights the structural difference between the two approaches.
