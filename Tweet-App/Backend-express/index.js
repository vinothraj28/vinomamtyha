const express = require("express");
const app = express();
const pool = require("./db");
const cors = require("cors");

app.use(cors(
    {
        origin: "http://localhost:3000"
    }
))

app.get("/", (req,res) => {
    console.log("Hi there");
    res.send("hello");
})

var date_ob = new Date();
var day = ("0"+date_ob.getDate()).slice(-2);
var month = ("0"+(date_ob.getMonth()+1)).slice(-2);
var year = date_ob.getFullYear();
var hours = date_ob.getHours();
var minutes = date_ob.getMinutes();
var seconds = date_ob.getSeconds();
var dateTime = year + "-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
console.log(dateTime);

app.listen(5000, () => {
    console.log("server is listening on port 5000");
})

app.use(express.json());

app.get("/tweets", async (req,res) => {
    try{
        const tweets = await pool.query(
            'select * from tweets order by timestamp DESC'
        )
            res.send(tweets.rows);
    }catch(err){
        console.log(err.msg);
    }
});

app.post("/tweets", async (req,res) => {
    const username = req.body.username;
    const tweets = req.body.tweets;
    try{
        var quer = `insert into tweets (username, tweets, timestamp) values ( '${username}', '${tweets}', '${dateTime}')`;
        console.log(quer);
        const update = await pool.query(`insert into tweets (username, tweets, timestamp) values ( '${username}', '${tweets}', '${dateTime}')`)
    }catch(err){
        console.log(err.msg);
    }
    res.send("Tweets Added");
});


app.post("/AuthenticateUser", async (req,res) => {
    var valid = false;
    const username = req.body.username;
    const password = req.body.password;
    console.log(username+" "+password);

    try{

        var quer = `select * from users where username='${username}'`;
        console.log(quer);

        const Authentication = await pool.query(
            `select * from users where username='${username}'`
        )
        console.log(Authentication.rows);
        const user = Authentication.rows;
        user.forEach( element => {
            var username_1 = element.username;
            var password_1 = element.password;
            console.log(username_1+" "+password_1);
            if(username===username_1){
                if(password===password_1){
                    valid = true;
                    console.log("value of valid is "+valid);
                }
            }
        })          	

    }catch(err){
        console.log(err.msg);
    }
    if(valid===true){
        res.send("User Authenticated");
    }else{
        res.send(401);
    }
});
