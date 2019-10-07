package com.playtech.player.data;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import java.io.*;

@Service
public class PlayerService {

    private List<Player> players;

    public PlayerService() {
        players = new ArrayList<Player>();
    }

    @PostConstruct
    public void init(){
            InputStream filePath = this.getClass().getResourceAsStream("/players.csv");
            System.out.println(filePath);
            //System.out.println("Working Directory = " + System.getProperty("user.dir"));
            players = new CsvToBeanBuilder(new InputStreamReader(filePath)).withType(Player.class).build().parse();
        
    }

    public List<Player> getPlayers () {
        return players;
    }

    public Player getPlayer (Integer id) {
        for(Player player: players){
            if (id.equals(player.getPlayerId())){
                return player;
            }
        }
        return null;
    }

}
