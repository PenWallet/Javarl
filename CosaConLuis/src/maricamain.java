public class maricamain
{
    public static void main(String[] args)
    {
        Animal y = new Yeray("tontito", 50, 60000);
        Animal d = new Dani("adasd", 31, 72);
        Animal a = new Animal("hola", 123);

        d.comer();
        d.dormir();

        y.comer();

        a.comer();

        Animal[] yarray = new Animal[3];
        yarray[0] = y;
        yarray[1] = d;
        yarray[2] = a;

        for(int i = 0; i < yarray.length; i++)
        {
            yarray[i].comer();
        }
    }
}
