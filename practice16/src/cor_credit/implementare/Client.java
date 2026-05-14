package cor_credit.implementare;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Client
{
    private String nume;

    private int vechime;

    private double venit;
    private double gradIndatorare=0;
    private Stack<Credit> credite=new Stack<>();


    public void adaugaCredit(Credit credit){
        System.out.println("se proceseaza cererea de credit a clientului  "+nume);

        gradIndatorare= (int) (gradIndatorare+ venit/(credit.getSuma()/ credit.getNrLuni()));
        this.credite.add(credit);
//                Calculează rata lunară și verifică dacă gradul de îndatorare depășește un
//procent (ex: 40% din venit).
    }

    public Client(String nume, int vechime, double venit) {
        this.nume = nume;
        this.vechime = vechime;
        this.venit = venit;

    }

    public String getNume() {
        return nume;
    }

    public int getVechime() {
        return vechime;
    }

    public double getVenit() {
        return venit;
    }

    public double getGradIndatorare() {
        return gradIndatorare;
    }

    public Credit getCredit(){
        return credite.peek();
    }

    public void removeCredit(){
        credite.pop();
    }
}
