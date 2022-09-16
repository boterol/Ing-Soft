public class Main {
    public static void main(String[] args) {
        Objeto almacenamiento = new Objeto("almacenamiento", "acá se guarda absolutamente todo");
        Objeto cajon1=new Objeto("cajón grande", "se guardan objetos grandes tipo termos, balones, maletas...");
        Objeto cajon2=new Objeto("cajón tecnología", "se guardan equipos de tecnología como celulares, computadores, etc...");
        Objeto cajon3=new Objeto("cajón cosas pequeñas", "acá se guardan cosas grandes tipo llaves, tarjetas etc...");

        Objeto balon = new Objeto("balon", "golty gris");
        Objeto termo = new Objeto("termo", "gris, conserva la temperatura");
        Objeto celular = new Objeto("celular", "iphone 8 rojo");
        Objeto llaves= new Objeto("llaves de carro", "llaves renault negras con un solo boton");

        almacenamiento.contenido.add(cajon1);
        almacenamiento.contenido.add(cajon2);
        almacenamiento.contenido.add(cajon3);;

        cajon1.contenido.add(balon);
        cajon1.contenido.add(termo);

        cajon2.contenido.add(celular);

        cajon3.contenido.add(llaves);


        //mostrar

        System.out.println(almacenamiento.toString());

        for(Objeto obj1: almacenamiento.contenido)
        {
            System.out.println(obj1.toString());

            for(Objeto obj2: obj1.contenido)
            {
                System.out.println(obj2.toString2());
            }
        }

    }
}