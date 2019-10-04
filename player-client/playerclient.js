const request = require('request');
const readline = require('readline');
const os = require('os');
var sortJsonArray = require('sort-json-array');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


function main(){
    
     rl.on('line', function(line) {
        switch (line.trim()) {
            case 'players':
                request('http://'+hostIP+':3333/api/players', (err, res, body) => {
                    if (err) {
                        return console.log(err);
                    }
                    json = JSON.parse(res.body);
                    sortJsonArray(json, 'goal', 'des'); // upptäckte efter ett tag att denna funktionen inte va som den skulle. men den sorterar "ish" 
                    console.log(json);
                });
                break;
            case 'playerId':
                rl.question('Type Id:', (player) => {
                    request('http://'+hostIP+':3333/api/players/' + player.trim(), (err, res, body) => {
                        if (err) {
                            return console.log(err);
                        }
                        if(res.body.length != 0){
                            json = JSON.parse(res.body); 
                            console.log(json);
                            
                        }else{
                            console.log("Player does not exist")
                        }
                        
                    });
                });
                
                break;
            case 'exit':
                process.exit(0);
                break;
            default:
                console.log('invalid command, Valid commands are: players, playersId`' + line.trim() + '`');
                break;
        }
        rl.prompt();
    })


}

var hostIP = process.env.DOCKER_HOST
main()

