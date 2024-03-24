import Footer from "./components/footer/Footer";
import Header from "./components/header/Header";
import './App.css';
import { BrowserRouter as Router, Route, Routes as Switcher } from "react-router-dom";
import AddTrainer from "./components/Trainer/AddTrainer";
import ListTrainers from "./components/Trainer/ListTrainers";
import UpdateTrainer from "./components/Trainer/UpdateTrainer";

function App() {
  return (
    <div>
      <Header />
      
      <Router>
        <div className="app-container">
          <Switcher>
            <Route path="/trainer/add" Component={AddTrainer}></Route>
            <Route path="/trainer/all" Component={ListTrainers}></Route>
            <Route path="/trainer/update/:id" Component={UpdateTrainer}></Route>
          </Switcher>
        </div> 
      </Router>
      <Footer />
    </div>
  );
}

export default App;