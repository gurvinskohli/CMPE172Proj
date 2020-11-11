import React, { Component } from "react";

import AddProduct from "./Component/AddProduct";

import { Route, BrowserRouter as Router } from "react-router-dom";

import Product from "./Component/Product";
import Sidebar from "./Component/NavBar"
import Home from "./Component/Home"

class App extends Component {
  
  render() {
    return (
      <div id="App">
      <Sidebar/>
      <Router>
        <Route exact path="/Home" component={Home} />
       
        <Route exact path="/AddProduct" component={AddProduct} />
        
        <Route exact path="/product" component={Product} />
        <Route exact path="/" component={Home} />
      </Router>
      </div>
      
    );
  }
}

export default App;
