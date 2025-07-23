import { useEffect, useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

function Dashboard() {
  const [projects, setProjects] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(false);
  const token = localStorage.getItem('jwt');
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem('jwt');
    navigate('/');
  };

  useEffect(() => {
    const fetchProjects = async () => {
      try {
        const res = await axios.get('http://localhost:8081/api/projects', {
          headers: { Authorization: `Bearer ${token}` }
        });
        setProjects(res.data);
      } catch (err) {
        setError(true);
        console.error('Erro ao carregar projetos:', err);
      } finally {
        setLoading(false);
      }
    };

    fetchProjects();
  }, [token]);

  return (
    <div style={{ padding: '2rem', fontFamily: 'Arial, sans-serif' }}>
      <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
        <h2>📁 Meus Projetos</h2>
        <button onClick={handleLogout} style={{ backgroundColor: '#e53935', color: 'white', border: 'none', padding: '0.5rem 1rem', borderRadius: '4px', cursor: 'pointer' }}>
          🔓 Logout
        </button>
      </div>

      {loading && <p>Carregando projetos...</p>}
      {error && <p style={{ color: 'red' }}>Erro ao conectar com o project-service.</p>}

      {!loading && !error && projects.length === 0 && (
        <p>Nenhum projeto encontrado.</p>
      )}

      {!loading && !error && projects.length > 0 && (
        <div
          style={{
            display: 'grid',
            gridTemplateColumns: 'repeat(auto-fill, minmax(250px, 1fr))',
            gap: '1rem',
            marginTop: '1rem'
          }}
        >
          {projects.map((proj) => (
            <div
              key={proj.id}
              style={{
                border: '1px solid #ccc',
                borderRadius: '8px',
                padding: '1rem',
                backgroundColor: '#f9f9f9',
                boxShadow: '0 2px 4px rgba(0,0,0,0.1)'
              }}
            >
              <h3 style={{ marginBottom: '0.5rem' }}>{proj.name}</h3>
              <p style={{ margin: 0 }}>{proj.description}</p>
            </div>
          ))}
        </div>
      )}
    </div>
  );
}

export default Dashboard;
