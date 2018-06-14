package Pruebas;

import Gestion.GestionAdmin;

public class CondGestionAdmin
{
    public static void main(String[] args)
    {
        GestionAdmin ga = new GestionAdmin();

        //AñadirPan
        ga.anadirPan("Prueba1",'Y',5,10);
        ga.anadirPan("Prueba2",'Y',4,1);
        ga.anadirPan("Prueba3",'Y',3,5);
        ga.anadirPan("Prueba4",'N',2,9);
        ga.anadirPan("Prueba5",'N',1,100);
        ga.anadirPan("Prueba6",'N',0,8);
        ga.anadirPan("Prueba7",'Y',5,10.9);

        //AñadirComp
        ga.anadirComp("Prueba1",10);
        ga.anadirComp("Prueba2",1);
        ga.anadirComp("Prueba3",0.2);
        ga.anadirComp("Prueba4",4);
        ga.anadirComp("Prueba5",9);

        //AñadirIngr
        ga.anadirIngr("Prueba1",10);
        ga.anadirIngr("Prueba2",1);
        ga.anadirIngr("Prueba3",0.2);
        ga.anadirIngr("Prueba4",4);
        ga.anadirIngr("Prueba5",9);

        //AñadirCliente
        ga.anadirCliente("Prueba","1","02-06-2018","Farso","123456789123456789123", "111222333");
        ga.anadirCliente("Prueba","2","02-06-2018","Farso","c/ Noseque", "111222333");
        ga.anadirCliente("Prueba","3","02-06-2018","Farso","c/ Noseque", "111222333");
        ga.anadirCliente("Prueba","4","02-06-2018","Farso","c/ Noseque", "111222333");
        ga.anadirCliente("Prueba","5","02-06-2018","Farso","c/ Noseque", "111222333");

        //BorrarPedido
        ga.borrarPedido(1);
        ga.borrarPedido(2);
        ga.borrarPedido(3);
        ga.borrarPedido(4);
        ga.borrarPedido(5);
        ga.borrarPedido(6);
        ga.borrarPedido(7);
        ga.borrarPedido(8);
    }
}
