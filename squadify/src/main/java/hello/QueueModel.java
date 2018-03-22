/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author morganradic
 */
public class QueueModel
{

    private String name;
    private String code;
    private ArrayList<SongModel> songs;
    private ArrayList<UserModel> users;

    public QueueModel(UserModel master, String n)
    {
        users = new ArrayList<UserModel>();
        users.add(master);
        name = n;
        code = generateCode();
    }

    public String generateCode()
    {
        Random r = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 4; i++)
        {
            builder.append((char) (r.nextInt(26) + 'a'));
        }
        return builder.toString();

    }

    public void addUser(UserModel user)
    {
        users.add(user);

    }
    
    public void addSong(SongModel song)
    {
        songs.add(song);
    }

    public String getCode()
    {
        return code;
    }
}