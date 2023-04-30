package problema2;
class EquivalenteHora {
    //atributos
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;    
    //constuctor
    public EquivalenteHora(double horas){
        this.horas = horas;
    }
    //set
    public void setCalcularMinutos() {
        this.minutos = this.horas * 60;
    }
    public void setCalcularSegundos() {
        this.segundos = this.horas * 3600;
    }
    public void setCalcularDias() {
        this.dias = this.horas /24;
    }
    //get
    public double getHoras(){    
        return this.horas;
    }
    public double getMinutos() {    
        return this.minutos;
    }
    public double getSegundos() {
        return this.segundos;
    }
    public double getDias() {
        return this.dias;
    }
    public String toString(){
        String msj = String.format("         Equivalente en Horas"
                +"\n-------------------------------------"
                + "\nCantidad de horas Ingresadas: %.2f"
                + "\nEquivalente de horas a minutos es: %.2f"
                + "\nEquivalente de horas a segundos es: %.2f"
                + "\nEquivalente de horas a dias es: %.2f", this.getHoras(),
                 this.getMinutos(),this.getSegundos(),this.getDias()); 
        return msj;
    }
}

public class Problema2 {
    public static void main(String[] args) {
        EquivalenteHora equivalenteHora = new EquivalenteHora(96);
        equivalenteHora.setCalcularMinutos();
        equivalenteHora.setCalcularSegundos();
        equivalenteHora.setCalcularDias();
        System.out.println(equivalenteHora);    
    }      
}