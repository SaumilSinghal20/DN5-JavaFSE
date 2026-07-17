import React, { useState } from 'react';
import './App.css';

function App() {
  // Array of data
  const initialFruits = [
    { id: 'f1', name: 'Apple', color: 'red' },
    { id: 'f2', name: 'Banana', color: 'yellow' },
    { id: 'f3', name: 'Cherry', color: 'darkred' }
  ];

  const [fruits, setFruits] = useState(initialFruits);

  const shuffleList = () => {
    const shuffled = [...fruits].sort(() => 0.5 - Math.random());
    setFruits(shuffled);
  };

  return (
    <div className="App" style={{ padding: '30px' }}>
      <h1>Rendering Lists and Keys</h1>
      <button onClick={shuffleList} style={{ marginBottom: '20px' }}>
        Shuffle List
      </button>

      <h2>List With Proper Keys</h2>
      <ul>
        {fruits.map((fruit) => (
          // The 'key' prop is crucial here. It must be unique and stable (like an ID)
          <li key={fruit.id} style={{ color: fruit.color, fontWeight: 'bold' }}>
            {fruit.name} 
            <input type="text" placeholder="Add a note..." style={{ marginLeft: '10px' }} />
          </li>
        ))}
      </ul>

      {/* 
        WHAT BREAKS IF KEYS ARE MISSING OR WRONG?
        If you don't provide keys, React will warn you in the console.
        If you use the array index as the key (e.g., `key={index}`), and then the list gets 
        reordered (like our shuffle button does), inserted, or deleted, React might reuse 
        the wrong DOM elements. 
        
        Try typing a note into one of the input fields above, then click "Shuffle List". 
        Notice how the note stays with the correct fruit? That's because React uses the 
        `fruit.id` key to track the element regardless of its position in the array. 
        If we used the array index as the key, the notes would stay in the same visual 
        position while the fruit names swapped around them, leading to UI bugs!
      */}
    </div>
  );
}

export default App;
