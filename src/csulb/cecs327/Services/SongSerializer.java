package csulb.cecs327.Services;

import com.google.gson.Gson;
import csulb.cecs327.Models.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class SongSerializer {

    private Gson gson;
    private String path;
    private RootObject[] rootObjects;
    private BufferedReader br;

    public SongSerializer() {
        try {
            gson = new Gson();
            path = "src/csulb/cecs327/Models/music.json";
            br = new BufferedReader(new FileReader(path));
            rootObjects = gson.fromJson(br, RootObject[].class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public RootObject[] getRootObjects() {
        return rootObjects;
    }
}