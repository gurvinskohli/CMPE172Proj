import React, { Component } from "react";
import { Route, BrowserRouter as Router } from "react-router-dom";
import Browse from "./Component/Browse";
import Sidebar from "./Component/NavBar"
import Home from "./Component/Home"
import Saved from "./Component/Saved"
import AddRecipe from "./Component/AddRecipe";
class App extends Component {
  
  render() {
    return (
      <div id="App">
      <Sidebar/>
      <Router>
        <Route exact path="/Home" component={Home} />
        <Route exact path="/AddRecipe" component={AddRecipe} />
        <Route exact path="/Browse" component={Browse} />
        <Route exact path="/Saved" component={Saved} />
        <Route exact path="/" component={Home} />
      </Router>
      </div>
      
    );
  }
}

export default App;
