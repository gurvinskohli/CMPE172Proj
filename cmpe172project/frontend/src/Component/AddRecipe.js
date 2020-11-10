import React from "react";
import Avatar from "@material-ui/core/Avatar";
import Button from "@material-ui/core/Button";
import CssBaseline from "@material-ui/core/CssBaseline";
import TextField from "@material-ui/core/TextField";
import { Link } from "react-router-dom";
import Grid from "@material-ui/core/Grid";
import GroupIcon from "@material-ui/icons/Group";
import Typography from "@material-ui/core/Typography";
import { makeStyles } from "@material-ui/core/styles";
import Container from "@material-ui/core/Container";



const useStyles = makeStyles(theme => ({
  paper: {
    marginTop: theme.spacing(7),
    display: "flex",
    flexDirection: "column",
    alignItems: "center"
  },
  avatar: {
    margin: theme.spacing(1),
    backgroundColor: theme.palette.secondary.main
  },
  form: {
    width: "100%", 
    marginTop: theme.spacing(3)
  },
  submit: {
    margin: theme.spacing(3, 0, 2)
  },
  textField: {
    marginLeft: theme.spacing(1),
    marginRight: theme.spacing(1),
    width: "100%"
  }
}));

export default function AddRecipe() {
  const classes = useStyles();
  const [firstLoad, setLoad] = React.useState(true);


  const [name, setName] = React.useState("");
  const [ingredients, setIngr] = React.useState("");
  const [allergens, setAllergens] = React.useState("");


  const handleNameChange = event => setName(event.target.value);
  const handleIngrChange = event => setIngr(event.target.value);
  const handleAllergensChange = event => setAllergens(event.target.value);

  const [message, setMessage] = React.useState("Nothing saved in the session");

  async function sampleFunc(toInput) {
    const response = await fetch("/api/product", {
      method: "POST",
      mode: "cors", 
      cache: "no-cache", 
      credentials: "same-origin", 
      headers: {
        "Content-Type": "application/json"
      
      },
      redirect: "follow", 
      referrerPolicy: "no-referrer", 
      body: JSON.stringify(toInput) 
    });
    let body = await response.json();
    console.log(body.product_ID);
    setMessage(body.product_ID ? "Data sucessfully updated" : "Data updation failed");
  }

  const handleSubmit = variables => {
    const toInput = { name, ingredients, allergens };
    sampleFunc(toInput);
    setName("");
    setIngr("");
    setAllergens("");
  };

  if (firstLoad) {

    setLoad(false);
  }

  return (
    <Container component="main" maxWidth="sm">
         
      <CssBaseline />
      <div className={classes.paper}>
        <Avatar className={classes.avatar}>
          <GroupIcon />
        </Avatar>
        <Typography component="h1" variant="h5">
          Add a Recipe
        </Typography>
        <form className={classes.form} noValidate>
          <Grid container spacing={2}>
            <Grid item xs={12}>
              <TextField
                variant="outlined"
                required
                fullWidth
                id="name"
                value={name}
                label="Name"
                name="name"
                autoComplete="name"
                onChange={handleNameChange}
              />
            </Grid>
            <Grid item xs={12}>
              <TextField
                autoComplete="Ingredients"
                name="Ingredients"
                variant="outlined"
                required
                fullWidth
                value={ingredients}
                id="Ingredients"
                label="Ingredients"
                onChange={handleIngrChange}
              />
              
            </Grid>
            
            <Grid item xs={12}>
              <TextField
                variant="outlined"
                required
                fullWidth
                id="Allergens"
                value={allergens}
                label="Allergens"
                name="Allergens"
                autoComplete="Allergens"
                onChange={handleAllergensChange}
              />
            </Grid>
            {}
          </Grid>
          <Button
            fullWidth
            variant="contained"
            color="primary"
            preventDefault
            className={classes.submit}
            onClick={handleSubmit}
          >
            Add
          </Button>

          <Grid container justify="center">
            <Grid item>
              <Link to="/Browse">View Recipes</Link>
            </Grid>
          </Grid>
        </form>
      </div>
    </Container>
  );
}