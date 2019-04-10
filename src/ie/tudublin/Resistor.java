package ie.tudublin;

public class Resistor
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;
    public UI ui;

    public Resistor(int value, UI ui)
    {
        this.value = value;
        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
        this.ui = ui;
    }

    // Display the resistor on the UI
    public void render(int val)
    {
        float border = ui.height/15.0f;
        float height = UI.map(val, 0, 4, border, ui.height);

        ui.stroke(0);
        ui.strokeWeight(2);
        ui.noFill();
        ui.rect(ui.width*0.375f, height, ui.width*0.25f, ui.width*0.25f);
        ui.line(ui.width*0.375f, height + ui.width*0.125f, ui.width*0.25f, height + ui.width*0.125f);
        ui.line(ui.width*0.625f, height + ui.width*0.125f, ui.width*0.75f, height + ui.width*0.125f);
    }
}