package com.mycompany.aula12;
public class Aula12 {
    public static void main(String[] args) {
       // Animal n = new Animal();      // não é possível pq a classe Animal é abstrata
      /* Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       
       m.setPeso(35.3f);
       m.setCorPelo("Marrom");
       m.alimentar();
       m.lovomover();
       m.emitirSom();

       a.lovomover();
       p.lovomover();
       r.lovomover(); */
       
       Canguru c = new Canguru();
       Cachorro k = new Cachorro();
             
       c.lovomover();
       c.emitirSom();
       k.lovomover();
       k.emitirSom();
    }
}
