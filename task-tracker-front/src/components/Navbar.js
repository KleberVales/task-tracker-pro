import React from 'react';
import { useAuth } from './AuthContext'; // ajuste o caminho conforme sua estrutura
import { Link } from 'react-router-dom'; // para navegação sem recarregar a página

const Navbar = () => {
  const { user, logout, isAuthenticated } = useAuth();

  return (
    <nav style={styles.navbar}>
      <h2 style={styles.logo}>Meu App</h2>
      <ul style={styles.navList}>
        <li><Link style={styles.link} to="/">Home</Link></li>
        {isAuthenticated ? (
          <>
            <li style={styles.user}>Olá, <strong>{user.name}</strong>!</li>
            <li>
              <button style={styles.button} onClick={logout}>Logout</button>
            </li>
          </>
        ) : (
          <li><Link style={styles.link} to="/login">Login</Link></li>
        )}
      </ul>
    </nav>
  );
};

const styles = {
  navbar: {
    display: 'flex',
    justifyContent: 'space-between',
    alignItems: 'center',
    padding: '12px 24px',
    backgroundColor: '#242424',
    color: '#ffffff',
  },
  logo: {
    margin: 0,
  },
  navList: {
    display: 'flex',
    listStyle: 'none',
    gap: '16px',
    alignItems: 'center',
  },
  link: {
    color: '#ffffff',
    textDecoration: 'none',
  },
  button: {
    padding: '6px 12px',
    backgroundColor: '#ff5a5f',
    color: '#fff',
    border: 'none',
    borderRadius: '4px',
    cursor: 'pointer',
  },
  user: {
    color: '#ccc',
  },
};

export default Navbar;
