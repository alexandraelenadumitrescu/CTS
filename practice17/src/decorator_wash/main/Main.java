package decorator_wash.main;

import decorator_wash.implementare.DecoratorPeriiFine;
import decorator_wash.implementare.ISpalatorie;
import decorator_wash.implementare.Spalatorie;

public class Main {
    public static void main(String[] args) {
//3 p. Aplicația aferentă spălătoriei auto rulează în permanență și nu poate fi oprită spre a fi
//recompilată. Având în vedere faptul că un program de spălare este derivat din interfața
//AbstractAutoWashOptions, utilizați un design pattern ce permite firmei să adauge posibilitatea de a
//avea opțiuni adiționale de spălare (spălare cu perii fine, spălare șasiu, spălare cu apă dedurizată, etc.)
//1.5 p. Testați în main implementarea prin crearea a minim 3 instanțe de astfel de clase demonstrând
//faptul că opțiunile adiționale pot fi selectate în orice combinație.

        ISpalatorie spalatorie=new Spalatorie();
        spalatorie.spala();
        DecoratorPeriiFine decoratorPeriiFine=new DecoratorPeriiFine(spalatorie);
        decoratorPeriiFine.spala();


    }
}
