import React, { useState } from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import "./styles.css";

const Auth = () => {
  const [isLogin, setIsLogin] = useState(true);

  return (
    <div className="container">
      <h1>Tentation Chat</h1>
      <div className="auth-box">
        <h2>{isLogin ? "Iniciar Sesión" : "Registrarse"}</h2>
        <form>
          {!isLogin && <input type="text" placeholder="Nombre" required />}
          <input type="email" placeholder="Correo" required />
          <input type="password" placeholder="Contraseña" required />
          {!isLogin && <input type="password" placeholder="Confirmar Contraseña" required />}
          <button type="submit">{isLogin ? "Ingresar" : "Registrarse"}</button>
        </form>
        <p>
          {isLogin ? "¿No tienes cuenta? " : "¿Ya tienes cuenta? "}
          <button onClick={() => setIsLogin(!isLogin)}>
            {isLogin ? "Regístrate" : "Inicia sesión"}
          </button>
        </p>
      </div>
    </div>
  );
};

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Auth />} />
      </Routes>
    </Router>
  );
}

export default App;
  