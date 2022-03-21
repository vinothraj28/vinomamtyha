import './App.css';
import React, {useState} from 'react';
import api from '../src/api/api';
import LoginForm from './Components/LoginForm';
import Homepage from './Components/Homepage';

function App() {
  const [user, setUser] = useState({username:""});

  const LoginUser = details => {
    api.post('/AuthenticateUser', details).then(res => {
      console.log(res);
      if(res.data=="User Authenticated" && res.status==200){
        setUser({username: details.username});
      }
    })
  }

  const Logout = () => {
    setUser({username:""});
  }

  return (
    <div className="App">
      {(user.username != "") ?
      (
        <Homepage Logout={Logout} user={user} />
      ) : (
        <LoginForm LoginUser = {LoginUser}/>
      )
      
      }
    </div>
  );
}

export default App;
