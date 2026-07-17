import React, { Component, useState } from 'react';
import './App.css';

class LifecycleDemo extends Component {
  constructor(props) {
    super(props);
    this.state = { counter: 0 };
    console.log("1. Constructor - Initialization");
  }

  componentDidMount() {
    console.log("3. componentDidMount - Component is inserted into the DOM");
  }

  componentDidUpdate(prevProps, prevState) {
    console.log("componentDidUpdate - State or props changed. Counter went from", prevState.counter, "to", this.state.counter);
  }

  componentWillUnmount() {
    console.log("componentWillUnmount - Component is about to be removed from the DOM");
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  render() {
    console.log("2. Render - Drawing the UI");
    return (
      <div style={{ border: '2px solid purple', padding: '20px' }}>
        <h2>Lifecycle Demo Component</h2>
        <p>Current Count: {this.state.counter}</p>
        <button onClick={this.increment}>Increment Count</button>
      </div>
    );
  }
}

function App() {
  const [showDemo, setShowDemo] = useState(true);

  return (
    <div className="App">
      <h1>React Class Component Lifecycle</h1>
      <button onClick={() => setShowDemo(!showDemo)}>
        {showDemo ? "Unmount Demo Component" : "Mount Demo Component"}
      </button>
      <hr />
      {showDemo && <LifecycleDemo />}
      <p style={{ fontStyle: 'italic', color: 'gray' }}>
        Open your browser's Developer Tools Console to see the lifecycle logs!
      </p>
    </div>
  );
}

export default App;
