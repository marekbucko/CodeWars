package kataLevel6;

public class Dubstep {

    /*
    * kata level 6
    * link https://www.codewars.com/kata/551dc350bf4e526099000ae5
    * */
    public String dubstep(String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }
}
