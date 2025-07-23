import { useEffect, useState } from 'react';
import axios from 'axios';

function Tasks() {
  const [tasks, setTasks] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(false);
  const token = localStorage.getItem('jwt');

  useEffect(() => {
    const fetchTasks = async () => {
      try {
        const res = await axios.get('http://localhost:8082/api/tasks', {
          headers: { Authorization: `Bearer ${token}` }
        });
        setTasks(res.data);
      } catch (err) {
        setError(true);
        console.error('Erro ao carregar tarefas:', err);
      } finally {
        setLoading(false);
      }
    };

    fetchTasks();
  }, [token]);

  return (
    <div style={{ padding: '2rem', fontFamily: 'Arial, sans-serif' }}>
      <h2>📋 Minhas Tarefas</h2>

      {loading && <p>Carregando tarefas...</p>}
      {error && <p style={{ color: 'red' }}>Erro ao conectar com o task-service.</p>}
      {!loading && !error && tasks.length === 0 && <p>Nenhuma tarefa encontrada.</p>}

      {!loading && !error && tasks.length > 0 && (
        <div style={{ display: 'grid', gap: '1rem', marginTop: '1rem' }}>
          {tasks.map((task) => (
            <div key={task.id} style={{
              border: '1px solid #ccc',
              borderRadius: '8px',
              padding: '1rem',
              backgroundColor: '#f0f8ff',
              boxShadow: '0 2px 4px rgba(0,0,0,0.1)'
            }}>
              <h3>{task.title}</h3>
              <p>{task.description}</p>
              <p>Status: <strong>{task.status}</strong></p>
            </div>
          ))}
        </div>
      )}
    </div>
  );
}

export default Tasks;
