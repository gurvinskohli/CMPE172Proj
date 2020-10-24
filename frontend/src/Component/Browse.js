import React from "react";
import MUIDataTable from "mui-datatables";
import "bootstrap/dist/css/bootstrap.css";



export default function recipeTable() {

  return (

    <div className="container">
      
      <MUIDataTable
        title={"Recipes"}
      />
    </div>
  );
  
}
