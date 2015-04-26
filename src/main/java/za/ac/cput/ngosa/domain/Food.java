package za.ac.cput.ngosa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 2015/04/21.
 */
@Entity

public class Food implements Serializable, Consumables {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int code;
    private String name;
    private String category;
    private double price;
    private double weight;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public Food(Builder builder)
    {
        this.category=builder.category;
        this.code=builder.code;
        this.name=builder.name;
        this.price=builder.price;
        this.weight=builder.weight;
    }


    public static class Builder
    {
        private int code;
        private String name;
        private String category;
        private double price;
        private double weight;

        public Builder code(int codeValue)
        {
            this.code=codeValue;
            return this;
        }

        public Builder name(String nameValue)
        {
            this.name=nameValue;
            return this;
        }

        public Builder category(String cateValue)
        {
            this.category=cateValue;
            return this;
        }

        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public Builder weight(double weightValue)
        {
            this.weight=weightValue;
            return this;
        }

        public Food build()
        {
            return new Food(this);
        }
    }

}
