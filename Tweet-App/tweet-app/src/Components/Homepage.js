import React, {Component} from "react";
import api from "../api/api";
import PostTweet from "./PostTweets";

class Homepage extends Component {
    state = {
        tweets : []
    }
    constructor(){
        super();
        api.get('/tweets').then(res => {
            console.log(res.data);
            this.setState({tweets:res.data});
        })
    }

    updateTweets = async (tweet) => {
        tweet.username = this.props.user.username;
        console.log(tweet);
        api.post("/tweets", tweet).then( async res => {
            await api.get('/tweets').then(res => {
                console.log(res.data);
                this.setState({tweets:res.data});
            })
        } );
        
    }

     RenderFeeds = () => {
         return(
            <div className="welcome">
                <div>
                <span><button onClick={this.props.Logout} style={{float:"right"}}>Logout</button></span>
                <PostTweet updateTweets={this.updateTweets}/>
                </div>
                {this.state.tweets.map( tweet => 
                <div style={{border:"1px solid black"}}>
                    <div><div style={{height:"30px", width:"200px"}}>User : {tweet.username}</div><span style={{float:"right"}}> {tweet.timestamp}</span></div>
                    <div style={{height:"50px", textAlign:"left", padding:"10px"}}>tweet : {tweet.tweets}</div>
                </div>
                )} 
            </div>
         )
     }

    render(){
        return(
           <div>{this.RenderFeeds()}</div> 
        )
    }

}

export default Homepage;