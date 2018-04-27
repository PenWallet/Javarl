public class Yeray extends Animal
{
    private String nombre;
    private int peso;
    private int gilipollismo;

    public Yeray(String n, int p, int g)
    {
        super(n, p);
        this.gilipollismo = g;
    }

    public void hacerElYeray()
    {
        System.out.println("Holasoytonto y comocomo");
    }

    @Override
    public void comer()
    {
        System.out.println("holanocomo");
    }

}
