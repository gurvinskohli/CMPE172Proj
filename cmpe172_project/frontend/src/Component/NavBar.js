import React from "react";

import Navbar from "react-bootstrap/Navbar";
import Nav from "react-bootstrap/Nav";

class navbar extends React.Component {
  render() {
    return (
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
          SpartanFoods
        </a>
        <button
          class="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarNavAltMarkup"
          aria-controls="navbarNavAltMarkup"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav">

            <a class="nav-item nav-link active" href="/Home">
              Home <span class="sr-only">(current)</span>
            </a>
            <a class="nav-item nav-link active" href="/Recipe">
              Recipe
            </a>

            <a class="nav-item nav-link active" href="/AddRecipe">
              Add Recipe
            </a>
	     <a class="nav-item nav-link active" href="/share">
              Share
            </a>
	    <a class="nav-item nav-link active" href="/suggestions">
              Suggestions
            </a>
        <a class="nav-item nav-link active" href="AboutUs">
              About Us
            </a>
      <a class="nav-item nav-link active" href="ContactUs">
              Contact Us
            </a>
          </div>
        </div>
      </nav>
    );
  }
}

export default navbar;
