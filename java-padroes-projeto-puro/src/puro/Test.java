package puro;

import puro.facade.Facade;
import puro.singleton.SingletonEager;
import puro.singleton.SingletonLazy;
import puro.singleton.SingletonLazyHolder;
import puro.strategy.Comportamento;
import puro.strategy.ComportamentoAgressivo;
import puro.strategy.ComportamentoDefensivo;
import puro.strategy.ComportamentoNormal;
import puro.strategy.Robo;

public class Test {

    // Testes relacionados ao Design Pattern Singleton
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
    
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);        

        // Testes relacionados ao Design Pattern Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Testes relacionados ao Design Pattern Facade
        Facade facade = new Facade();
        facade.migrarCliente("Rian Lucas", "12345-678");

        
    }
    
}
