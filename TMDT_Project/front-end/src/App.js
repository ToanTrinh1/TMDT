
import Header from "./Shared/Header/Header";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Register from "./Page/Register/Register";
import Login from "./Page/Login/Login";
import Homepage from "./Page/Homepage/Homepage";
import Lol from "./Page/LMHT/Lol";
import Genshin from "./Page/GenshinImpact/Genshin";
import Freefire from "./Page/Freefire/Freefire";

function App() {
  return (
      <Router>
          <Header />
        <Routes>
            <Route path="/home" element={<Homepage />} />
            <Route path="/Lmht" element={<Lol />} />
            <Route path="/Genshin" element={<Genshin />} />
            <Route path="/Freefire" element={<Freefire />} />
            <Route path="/Register" element={<Register />} />
            <Route path="/Login" element={<Login />} />
        </Routes>

      </Router>
  );
}

export default App;
