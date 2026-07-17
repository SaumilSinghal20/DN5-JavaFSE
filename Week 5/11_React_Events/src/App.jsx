import React, { useState } from 'react';
import './App.css';

function App() {
  const [inputText, setInputText] = useState('');
  const [clickCount, setClickCount] = useState(0);

  // Event handler for button click
  const handleButtonClick = (event) => {
    // 'event' is a React SyntheticEvent, a cross-browser wrapper around the browser's native event
    console.log('Button clicked! Event type:', event.type);
    setClickCount(prev => prev + 1);
  };

  // Event handler for input change
  const handleInputChange = (event) => {
    // Accessing the new value from the input field
    const newValue = event.target.value;
    setInputText(newValue);
  };

  return (
    <div className="App" style={{ padding: '30px' }}>
      <h1>Handling React Events</h1>
      
      <div style={{ marginBottom: '30px' }}>
        <h2>1. Click Event</h2>
        <button onClick={handleButtonClick} style={{ padding: '10px 20px', fontSize: '16px' }}>
          Click Me!
        </button>
        <p>Button clicked {clickCount} times.</p>
      </div>

      <div>
        <h2>2. Change Event</h2>
        <input 
          type="text" 
          placeholder="Type something here..." 
          value={inputText}
          onChange={handleInputChange} 
          style={{ padding: '10px', fontSize: '16px', width: '300px' }}
        />
        <p>You typed: <strong>{inputText}</strong></p>
      </div>
    </div>
  );
}

export default App;
