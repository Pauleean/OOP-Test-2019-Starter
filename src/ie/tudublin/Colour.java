package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String name;
    public float R;
    public float G;
    public float B;
    public int value;

    public Colour(TableRow row)
    {
        name = row.getString("colour");
        R = row.getFloat("r");
        G = row.getFloat("g");
        B = row.getFloat("b");
        value = row.getInt("value");
    }

    public String toString()
    {
        return name + "\t" + R + "\t" + G + "\t" + B + "\t" + value;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

}