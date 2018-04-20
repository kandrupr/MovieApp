package pr.kandru.movieapp;

import java.io.Serializable;

/**
 * Created by pkkan on 4/20/2018.
 */

public class Movie implements Serializable {
    String title;
    String poster;
    String rating;
    String mpaa;
    String runtime;
    String releaseDate;
    String overview;
    String genres;
    ResultHolder cast;
    ResultHolder similar;

    public Movie(String title, String poster, String rating, String mpaa, String runtime, String releaseDate, String overview, String genres, ResultHolder cast, ResultHolder similar) {
        this.title = title;
        this.poster = poster;
        this.rating = rating;
        this.mpaa = mpaa;
        this.runtime = runtime;
        this.releaseDate = releaseDate;
        this.overview = overview;
        this.genres = genres;
        this.cast = cast;
        this.similar = similar;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster() {
        return poster;
    }

    public String getRating() {
        return rating;
    }

    public String getMpaa() {
        return mpaa;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getOverview() {
        return overview;
    }

    public String getGenres() {
        return genres;
    }

    public ResultHolder getCast() {
        return cast;
    }

    public ResultHolder getSimilar() {
        return similar;
    }
}