
/* global fetch */

var getMovie = document.getElementById("submit");
var movieID = document.getElementById("movieID").value;
var movies = document.getElementById("movies");
var url = "/api/xxx/all" + movieID;
fetch()
        .then(res => res.json()) //in flow1, just do it
        .then(data => {
            // Inside this callback, and only here, the response data is available
            movies.innerHTML = JSON.stringify(movieID);
            
        })
        
        
