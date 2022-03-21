import React, {useState} from "react";

function PostTweet({updateTweets}){
    const [tweet, setTweet] = useState({username:"", tweets:""});
    const updateTheTweet = e => {
        e.preventDefault();
        updateTweets(tweet);
    }

    return (
        <form onSubmit={updateTheTweet}>
            <div className='form-group'>
                <h2>Post your tweets</h2>
                <label htmlFor='tweet' id="tweet" name='tweet'></label>
                <input  style={{height:"100px", width:"900px"}} type="textarea" name="tweet" id="tweet"  onChange={ e=> setTweet({...tweet, tweets: e.target.value}) } value={tweet.tweets} />
                <input type="submit" value="submit"></input>           
            </div>

        </form>
    )

}

export default PostTweet;
