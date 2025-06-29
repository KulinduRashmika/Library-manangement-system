/* eslint-disable jsx-a11y/anchor-is-valid */
import React, { useState } from 'react';
import './Login.css';

function Login({ onLogin }) {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const [message, setMessage] = useState('');

  const VALID_EMAIL = 'example123@gmail.com';
  const VALID_PASSWORD = '1234';

  const handleSubmit = (e) => {
    e.preventDefault();
    setError('');
    setMessage('');

    if (!email || !password) {
      setError('Please enter both email and password.');
      return;
    }

    if (email === VALID_EMAIL && password === VALID_PASSWORD) {
      setMessage('✅ Login successful! Redirecting...');
      setTimeout(() => {
        onLogin(); // Call parent App's login handler
      }, 1000);
    } else {
      setError('❌ Invalid email or password. Please try again.');
    }
  };

  return (
    <div className="login-overlay">
      <h2>Welcome to Library Hub</h2>
      <p>Sign in to your account</p>

      {error && <div className="message error">{error}</div>}
      {message && <div className="message success">{message}</div>}

      <form onSubmit={handleSubmit}>
        <label htmlFor="email">Email Address</label>
        <input
          type="email"
          id="email"
          placeholder="E-MAIL"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />

        <label htmlFor="password">Password</label>
        <input
          type="password"
          id="password"
          placeholder="PASSWORD"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />

        {/* Optional: Uncomment if needed */}
        {/* <div className="forgot-password">
          <a href="#">Forgot your password?</a>
        </div> */}

        <button type="submit">Sign In</button>
      </form>

      {/* Optional: Uncomment if needed */}
      {/* <div className="register">
        Not a member? <a href="#">Register now</a>
      </div> */}
    </div>
  );
}

export default Login;