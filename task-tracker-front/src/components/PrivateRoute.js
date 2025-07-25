import { Navigate } from 'react-router-dom';

function PrivateRoute({ children }) {
  const token = localStorage.getItem('token'); // 👈 certifica-se que bate com Login.js

  return token ? children : <Navigate to="/login" />;
}

export default PrivateRoute;
