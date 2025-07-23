import { Link, useNavigate } from 'react-router-dom';

function Navbar() {
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem('jwt');
    navigate('/');
  };

  return (
    <nav style={{ display: 'flex', gap: '1rem', padding: '1rem', backgroundColor: '#eee' }}>
      <Link to="/dashboard">📁 Projetos</Link>
      <Link to="/tasks">📋 Tarefas</Link>
      <button onClick={handleLogout} style={{ marginLeft: 'auto' }}>🔓 Logout</button>
    </nav>
  );
}

export default Navbar;
