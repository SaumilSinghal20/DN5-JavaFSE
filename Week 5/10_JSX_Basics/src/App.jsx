import React from 'react';
import './App.css';

function App() {
  // 1. Creating an element manually using React.createElement()
  const rawReactElement = React.createElement(
    'div',
    { className: 'box', style: { padding: '10px', backgroundColor: '#e0e0e0', marginBottom: '20px' } },
    React.createElement('h2', null, 'Created with React.createElement()'),
    React.createElement('p', null, 'This is tedious and hard to read for complex UI.')
  );

  // 2. Creating the exact same element using JSX
  const jsxElement = (
    <div className="box" style={{ padding: '10px', backgroundColor: '#e0f7fa' }}>
      <h2>Created with JSX</h2>
      <p>This looks just like HTML! It is much easier to write and maintain.</p>
    </div>
  );

  return (
    <div className="App" style={{ padding: '40px' }}>
      <h1>JSX Basics</h1>
      <p>JSX is a syntax extension for JavaScript. It allows us to write HTML-like structures in our JS files.</p>
      
      {rawReactElement}
      {jsxElement}
      
      <p><em>Under the hood, tools like Babel convert the JSX code at the bottom into the <code>React.createElement</code> calls seen at the top!</em></p>
    </div>
  );
}

export default App;
