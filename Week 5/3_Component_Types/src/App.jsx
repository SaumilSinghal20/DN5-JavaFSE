import React from 'react';
import './App.css';

// Header Component
const AppHeader = ({ title }) => {
  return (
    <header style={{ backgroundColor: '#282c34', padding: '20px', color: 'white' }}>
      <h1>{title}</h1>
    </header>
  );
};

// Article Component (Reusable)
const Article = ({ title, excerpt }) => {
  return (
    <article style={{ borderBottom: '1px solid #ccc', marginBottom: '15px', paddingBottom: '10px' }}>
      <h2>{title}</h2>
      <p>{excerpt}</p>
    </article>
  );
};

// Main Content Component
const MainContent = () => {
  return (
    <main style={{ padding: '20px' }}>
      <Article 
        title="Understanding React Components" 
        excerpt="Components let you split the UI into independent, reusable pieces." 
      />
      <Article 
        title="Why Composition Matters" 
        excerpt="By composing simple components together, you can build complex user interfaces effortlessly." 
      />
    </main>
  );
};

// Footer Component
const AppFooter = () => {
  return (
    <footer style={{ marginTop: '20px', padding: '10px', textAlign: 'center', backgroundColor: '#f1f1f1' }}>
      <p>&copy; 2026 Learning React</p>
    </footer>
  );
};

function App() {
  return (
    <div className="App">
      <AppHeader title="My Component Composition App" />
      <MainContent />
      <AppFooter />
    </div>
  );
}

export default App;
