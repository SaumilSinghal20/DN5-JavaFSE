import React, { Component } from 'react';
import './App.css';

// Class Component
class GreetingClass extends Component {
  render() {
    return (
      <div style={{ border: '1px solid blue', padding: '10px', margin: '10px' }}>
        <h2>Hello from a Class Component!</h2>
        <p>I am defined using ES6 class syntax extending React.Component.</p>
      </div>
    );
  }
}

// Function Component
function GreetingFunction() {
  return (
    <div style={{ border: '1px solid green', padding: '10px', margin: '10px' }}>
      <h2>Hello from a Function Component!</h2>
      <p>I am defined using a simple JavaScript function.</p>
    </div>
  );
}

function App() {
  return (
    <div className="App">
      <h1>Class vs Function Components</h1>
      <GreetingClass />
      <GreetingFunction />
    </div>
  );
}

export default App;
