
import React, { Component } from "react";
//import logo from '../Component/img/Home.png'
import "../../src/Background.css";




class ContactUs extends Component{
    render() {
        return (
            <div className="background">
        <div className="gen">
        <center> <h1> Contact Us </h1>
        <br></br>
            <h2>
             	Hours of operation: Monday - Friday 9 A.M. - 5 P.M.
            </h2>
          <h2>
            Phone: (510)-386-9887
            24 x 7 phone assistance avaliable
          </h2>
          <h2>
            Email: SpartanFoods@sjsu.edu
          </h2>
            <h2>
            Address: 9935 Waime Ln, Elk Grove (Sacramento), CA 95624
          </h2>
          <h2>
            We respond to emails within 48 hours
          </h2>
          </center>
        </div>
      </div>


        )
      }

}

export default ContactUs;
