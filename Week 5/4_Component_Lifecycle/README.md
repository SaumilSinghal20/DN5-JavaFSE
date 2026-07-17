# Component Lifecycle

## Concept Overview
In React, components go through a series of phases known as a "lifecycle". These phases include:
1. **Mounting**: When the component is first created and inserted into the DOM.
2. **Updating**: When the component re-renders due to changes in its state or props.
3. **Unmounting**: When the component is removed from the DOM.
Class components provide specific methods (like `componentDidMount`, `componentDidUpdate`, and `componentWillUnmount`) that allow developers to run specific code at these exact moments. (Note: In modern React, functional components handle these phases using the `useEffect` hook).

## What this Code Demonstrates
This project contains a class component called `LifecycleDemo`. It features `console.log` statements in its constructor, `render`, `componentDidMount`, `componentDidUpdate`, and `componentWillUnmount` methods. The parent `App` component includes a toggle button that conditionally renders the `LifecycleDemo`. By interacting with the app and watching the browser console, you can clearly see the exact order in which these lifecycle methods are fired.
