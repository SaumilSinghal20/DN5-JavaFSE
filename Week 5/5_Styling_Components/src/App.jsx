import React from 'react';
import styles from './Button.module.css';

function App() {
  // Inline styles object
  const inlineStyle = {
    backgroundColor: 'lightblue',
    color: 'darkblue',
    padding: '15px 30px',
    border: '2px solid darkblue',
    borderRadius: '5px',
    fontSize: '16px',
    fontWeight: 'bold',
    cursor: 'pointer',
    margin: '10px'
  };

  return (
    <div style={{ textAlign: 'center', padding: '50px' }}>
      <h1>Styling React Components</h1>
      
      <div>
        <h2>1. Inline Styles</h2>
        <p>This button uses a JavaScript object for styles.</p>
        <button style={inlineStyle}>Inline Styled Button</button>
      </div>

      <hr style={{ margin: '40px 0' }} />

      <div>
        <h2>2. CSS Modules</h2>
        <p>This button uses a locally scoped CSS module file.</p>
        <button className={styles.moduleButton}>CSS Module Button</button>
      </div>
    </div>
  );
}

export default App;
