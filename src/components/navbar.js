/* eslint-disable jsx-a11y/anchor-is-valid */
import React from 'react';
import './navbar.css';
import { Link, useNavigate } from 'react-router-dom';

function Navbar({ onLogout }) {
  const navigate = useNavigate();

  const handleLogoutClick = () => {
    onLogout();          // Calls the logout handler in App.js
    navigate('/');       // Redirect to login
  };

  return (
    <nav className="navbar">
      <div className="navbar-container">
        <div className="navbar-logo">📚 Library System</div>
        <ul className="navbar-links">
          <li><Link to="/" className="navbar-link">Home</Link></li>

          <li className="dropdown">
            <span className="navbar-link">Books ▾</span>
            <ul className="dropdown-menu">
              {/* <li><Link to="#" className="dropdown-item">Add Books</Link></li> */}
              <li><Link to="/viewBooks" className="dropdown-item">Add/View Books</Link></li>
            </ul>
          </li>

          <li className="dropdown">
            <span className="navbar-link">Members ▾</span>
            <ul className="dropdown-menu">
              {/* <li><Link to="AddMember" className="dropdown-item">Add Members</Link></li> */}
              <li><Link to="/viewMembers" className="dropdown-item">Add/View Members</Link></li>
            </ul>
          </li>

          <li><Link to="/issued" className="navbar-link">Issued/Borrowed</Link></li>
        </ul>

        <button onClick={handleLogoutClick} className="logout-button">Logout</button>
      </div>
    </nav>
  );
}

export default Navbar;
