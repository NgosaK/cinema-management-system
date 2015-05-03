package za.ac.cput.ngosa.domain;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.*;

/**
 * Created by User on 2015/04/21.
 */
@Entity

public class Receipt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double price ;
    private String item;
    private int quantity;
    private double total ;
    private String cashierName;
    private List<Movie> movies;

    public long getId() {
        return id;
    }

    public List<Movie> getMovieTitle() {
        return movies;
    }

    private Receipt()

    {

    }

    public double getPrice() {
        return price;
    }

    public String getCashierName() {
        return cashierName;
    }

    public double getTotal() {
        return total;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItem() {
        return item;
    }

    public Receipt(Builder builder)
    {
        this.cashierName= builder.cashierName;
        this.price= builder.price;
        this.item= builder.item;
        this.total= builder.total;
        this.quantity= builder.quantity;
        this.id=builder.id;
        this.movies=builder.movies;
    }

    public static class Builder{

        private long id;
        private double price ;
        private String item;
        private int quantity;
        private double total ;
        private String cashierName;
        private List<Movie> movies;


        public Builder id(long idValue)
        {
            this.id= idValue;
            return this;
        }

        public Builder movieTitle(List<Movie> movieTitleValue)
        {
            this.movies=movieTitleValue;
            return this;
        }
        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public Builder item(String itemValue)
        {
            this.item= itemValue;
            return this;
        }

        public Builder quantity (int quantityValue)
        {
            this.quantity= quantityValue;
            return this;
        }

        public Builder total()
        {
            this.total=0;
            this.total= total + (price * quantity);
            return this;
        }

        public Builder cashierName(String name)
        {
            this.cashierName= name;
            return this;
        }

        /*public Builder copy(Receipt value)
        {
            this.price= value.price;
            this.item= value.item;
            this.quantity= value.quantity;
            this.total= value.quantity;
            this.cashierName= value.cashierName;
            return this;
        }*/

        public Receipt build()
        {
            return new Receipt(this);
        }
    }
}
