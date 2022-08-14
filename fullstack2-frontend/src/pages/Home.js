import React, { useState } from "react";
// import axios from "axios";
import { Link } from "react-router-dom";
import { useNavigate } from "react-router-dom";

//will need many more imports including useEffect and useState

// export default function Home ()  {
  

  const Login = () => {
    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");
    const [passConfirm, setPassConfirm] = useState("");
    const [error, setError] = useState("");
    const navigate = useNavigate();
    class User {
      constructor(userName, password) {
        this.userName = userName;
        this.password = password;
      }
    }
    const handleSubmit = async (e) => {
      e.preventDefault();
      setError("");
      if (userName === "" || password === "" || passConfirm === "") {
        setError("Please enter a username and password");
      } else if (password !== passConfirm) {
        setError("Passwords do not match");
      } else {
        setError(null);
        let user = new User(userName, password);
        // bcrypt.hash(user.password, 10, (err, hash) => {})
        // ^^ this is where i would encode the password, unless server side encryption becomes my chosen solution
        await fetch("http://localhost:3000/user/add", {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify(user),
        }).catch((error) => {
          window.alert(error);
          return;
        });
        window.alert("User created, returning to login");
        setUserName("");
        setPassword("");
        setPassConfirm("");
        navigate("/");
      }
    };

  return (
    <div>
    <div className="container">
      <div className="py-4">
      <h1 className="text-center font-weight-light mt-5">
          
          </h1>
          <img id="image"
            src="https://keyin.com/assets/img/logo-keyin.svg"
            alt="fridge"
          />
          </div>
          <div> <img id="image"
            src="https://pbs.twimg.com/media/CeVuxsXUIAAuH2T.jpg"
            alt="fridge"/>
      </div>
    </div>
  
    
      <h1>Login</h1>
      <form id="registerForm" onSubmit={handleSubmit}>
        <label>Username:</label>
        <input
          type="text"
          name="username"
          value={userName}
          onChange={(e) => setUserName(e.target.value)}
        />
        <br />
        <label>Password:</label>
        <input
          type="password"
          name="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <br />
        <input id="submit" type="submit" value="Login" />
      </form>
      {error ? <p className="error">{error}</p> : null}
      <div>
        <p>
          Don't have an account? <Link to="/User_Registry"> Register here.</Link>
        </p>
      </div>
    </div>
    
  );
  };

//}


  
    
export default Login;