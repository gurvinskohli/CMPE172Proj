import React, { Component } from "react";
import AddCustomer from "./Component/AddCustomer"
import AddProduct from "./Component/AddProduct";
import AddSale from "./Component/AddSale";
import { Route, BrowserRouter as Router } from "react-router-dom";
import Customer from "./Component/Customer";
import Product from "./Component/Product";
import Sale from "./Component/Sale";
import Sidebar from "./Component/NavBar"
import Home from "./Component/Home"
import Analytics from "./Component/Analytics"
class App extends Component {
  
  render() {
    return (
      <div id="App">
      <Sidebar/>
      <Router>
        <Route exact path="/Home" component={Home} />
       
        <Route exact path="/AddProduct" component={AddProduct} />
        
        <Route exact path="/product" component={Product} />
        
        <Route exact path="/Analytics" component={Analytics} />
        <Route exact path="/" component={Home} />
      </Router>
      </div>
      
    );
  }
}

export default App;
