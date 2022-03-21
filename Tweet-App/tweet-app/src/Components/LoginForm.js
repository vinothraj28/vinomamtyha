import React, {useState} from 'react';

function LoginForm({LoginUser}) {
 const [details, setDetails] = useState({username:"", password:""});

const submitHandler = e => {
    console.log("inside submit Handler");
    e.preventDefault();
    LoginUser(details);
}

return(
    <form onSubmit={submitHandler}>
        <div className='form-inner'>
            <h2>Login</h2>
            <div className='form-group'>
                <label htmlFor='name' id="username" name='username'></label>
                <input type="text" name="username" id="username"  onChange={ e=> setDetails({...details, username: e.target.value}) } value={details.username} />
            </div>
            <div className='form-group'>
                <label htmlFor='password' id="password" name='password'></label>
                <input type="password" name="password" id="password"  onChange={ e=> setDetails({...details, password: e.target.value}) } value={details.password} />
            </div>
            <input type="submit" value="Login"/>
        </div>
    </form>
)


}
export default LoginForm;