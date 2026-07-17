# Component Types & Composition

## Concept Overview
React is all about composing complex user interfaces out of smaller, simpler building blocks called components. Instead of writing one massive file for an entire webpage, you break the page down into logical sections (like a header, a footer, and main content). You can also create highly reusable components (like a specific button or article card) that can be rendered multiple times with different data.

## What this Code Demonstrates
This app is composed of several nested functional components: `AppHeader`, `MainContent`, `Article`, and `AppFooter`. The `App` component acts as the root, bringing them all together. Furthermore, the `Article` component demonstrates reusability by being rendered twice within `MainContent`, accepting different `title` and `excerpt` data via props each time.
