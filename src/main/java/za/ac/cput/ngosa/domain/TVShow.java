package za.ac.cput.ngosa.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by User on 2015/04/21.
 */
@Entity

public class TVShow implements Serializable, Showing {

    @Id
    private long id;
    private String episode;
    private String season;
    private String duration;
    private String genre;
    private String title;
    private double price;


    public String getEpisode() {
        return episode;
    }

    public String getSeason() {
        return season;
    }


    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public long getId() {
        return id;
    }

    private TVShow()
    {

    }

    public TVShow(Builder build)
    {
        this.episode= build.episode;
        this.season= build.season;
        this.duration= build.duration;
        this.genre= build.genre;
        this.title=build.title;
        this.price=build.price;
        this.id=build.id;
    }


    public static class Builder
    {
        private String episode;
        private String season;
        private String duration;
        private String genre;
        private String title;
        private double price;
        private long id;

        public Builder id(long idValue)
        {
            this.id=idValue;
            return this;
        }


        public Builder episode(String episodeValue)
        {
            this.episode=episodeValue;
            return this;
        }

        public Builder season(String seasonValue)
        {
            this.season= seasonValue;
          return  this;
        }

        public Builder title(String titleValue)
        {
            this.title= titleValue;
            return this;
        }

        public Builder duration(String durationValue)
        {
            this.duration=durationValue;
            return this;
        }

        public Builder genre(String genreValue)
        {
            this.genre=genreValue;
            return this;
        }

        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public Builder copy(TVShow value)
        {
            this.episode=value.episode;
            this.title=value.title;
            this.price=value.price;
            this.genre=value.genre;
            this.season=value.season;
            this.duration=value.duration;
            this.genre=value.genre;
            this.id=value.id;

            return this;
        }


        public TVShow build()
        {
            return new TVShow(this);
        }

    }

}
