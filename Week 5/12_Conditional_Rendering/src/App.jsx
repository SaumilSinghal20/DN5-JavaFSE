import React, { useState } from 'react';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [hasMessages, setHasMessages] = useState(true);
  const [userRole, setUserRole] = useState('guest');

  // 1. Conditional Rendering using an element variable
  let roleMessage;
  if (userRole === 'admin') {
    roleMessage = <p style={{ color: 'red' }}>Admin Panel: Full Access</p>;
  } else if (userRole === 'user') {
    roleMessage = <p style={{ color: 'green' }}>User Dashboard: Standard Access</p>;
  } else {
    roleMessage = <p style={{ color: 'gray' }}>Guest View: Limited Access</p>;
  }

  return (
    <div className="App" style={{ padding: '40px' }}>
      <h1>Conditional Rendering</h1>
      
      {/* Controls to toggle states for testing */}
      <div style={{ marginBottom: '30px', padding: '10px', backgroundColor: '#f0f0f0' }}>
        <label>
          <input type="checkbox" checked={isLoggedIn} onChange={() => setIsLoggedIn(!isLoggedIn)} /> Logged In
        </label>
        <br />
        <label>
          <input type="checkbox" checked={hasMessages} onChange={() => setHasMessages(!hasMessages)} /> Has Messages
        </label>
        <br />
        <label>Role: 
          <select value={userRole} onChange={(e) => setUserRole(e.target.value)}>
            <option value="guest">Guest</option>
            <option value="user">User</option>
            <option value="admin">Admin</option>
          </select>
        </label>
      </div>

      <hr />

      {/* 2. Ternary Operator (condition ? true : false) */}
      <section>
        <h2>Ternary Operator (Login Status)</h2>
        {isLoggedIn ? (
          <div style={{ padding: '10px', backgroundColor: '#d4edda' }}>Welcome back, user!</div>
        ) : (
          <div style={{ padding: '10px', backgroundColor: '#f8d7da' }}>Please log in to continue.</div>
        )}
      </section>

      {/* 3. Logical && Operator (condition && element) */}
      <section>
        <h2>Logical && (Notifications)</h2>
        {isLoggedIn && hasMessages && (
          <div style={{ padding: '10px', backgroundColor: '#fff3cd' }}>
            You have unread messages! ✉️
          </div>
        )}
        {(!isLoggedIn || !hasMessages) && <p>No notifications.</p>}
      </section>

      {/* Rendering the element variable computed above */}
      <section>
        <h2>Element Variable (Role Check)</h2>
        {roleMessage}
      </section>

    </div>
  );
}

export default App;
