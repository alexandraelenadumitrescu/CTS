package flyweight.implementare;

public interface IRecomandare {
    void printare(Reteta reteta);
}


//Managementul spitalului dorește implementarea unei modul de printare a rețetelor pe care le
//primesc pacienții alături de diagnosticul lor principal cu care ies din spital. Alături de aceste
//informații, pentru a facilita accesul la informații ce vizează sătătatea populației, rețetele printate
//conțin și un set aleatoriu selectat de recomandări de sănătate generală, de ex: consumul de
//minim 2 litri de apă pe zi, numărul de ore de somn, evitarea consumului de sare și zahăr, etc.
//Cunoscându-se faptul că există un număr limitat de seturi de recomandări generale privind
//sănătatea în comparație cu numărul mare de rețete ce se tipăresc în spital, să se implementeze
//un modul ce optimizează spațiul de memorie ocupat privind listarea rețetelor.