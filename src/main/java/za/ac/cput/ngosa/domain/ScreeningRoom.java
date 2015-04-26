package za.ac.cput.ngosa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 2015/04/21.
 */
@Entity

public class ScreeningRoom implements Serializable{

    @Id
    private int numberID;
    private int size;
    private String type;


    public int getSize() {
        return size;
    }

    public int getNumberID() {
        return numberID;
    }

    public String getType() {
        return type;
    }

    private ScreeningRoom()
    {

    }

    public ScreeningRoom(Builder build)
    {
        this.size= build.size;
        this.type= build.type;
        this.numberID=build.numberID;
    }

    public static class Builder
    {
        private int size;
        private String type;
        private int numberID;

        public Builder size(int sizeValue)
        {
            this.size= sizeValue;
            return this;
        }

        public Builder type(String typeValue)
        {
            this.type= typeValue;
            return this;
        }

        public Builder numberID(int numberIDValue)
        {
            this.numberID=numberIDValue;
            return this;
        }

     /*   public Builder copy(ScreeningRoom value)
        {
            this.size= value.size;
            this.type= value.type;
            this.numberID= value.numberID;
            return this;
        }*/

        public ScreeningRoom build()
        {
            return new ScreeningRoom(this);
        }

    }
}
