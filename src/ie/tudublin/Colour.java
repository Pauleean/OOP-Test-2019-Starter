package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String name;
    private float R;
    private float G;
    private float B;
    private int value;

    public Colour(TableRow row)
    {
        name = row.getString("colour");
        R = row.getFloat("r");
        G = row.getFloat("g");
        B = row.getFloat("b");
        value = row.getInt("value");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the r
     */
    public float getR() {
        return R;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        R = r;
    }

    /**
     * @return the g
     */
    public float getG() {
        return G;
    }

    /**
     * @param g the g to set
     */
    public void setG(float g) {
        G = g;
    }

    /**
     * @return the b
     */
    public float getB() {
        return B;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        B = b;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
}