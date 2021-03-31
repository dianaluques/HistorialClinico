/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretariasalud;


/**
 *
 * @author Nestor Luque
 */
public class Hija extends Padre {
    
    
    int edad;
    String sexo;
    String direccion;
    String motivConsult;
    String fecha;
    
    int edad1;
    String sexo1;
    String direccion1;
    String motivConsult1;
    String fecha1;
    
    //metodo sobrescrito
    @Override
    public void mostrar() {
        super.mostrar();
        
        edad=34;
        fecha ="Enero- 03- 2020";
        sexo ="Femenino";
        direccion="Aut. Medellin Km 2";
        motivConsult="Paciente femenino de 34 años de edad que acude al servicio del hospital Santa Ana por un cuadro caracterizado por un episodio \n"+
                    "de hematemesis de escasa intensidad, dos horas previas a la consulta, refiere almuerzo 3 horas antes y que la misma fue precedida \n"+
                    "de náuseas.\n" +
                    "Tres meses anteriores al vómito sanguinolento el paciente refiere dolor abdominal de intensidad creciente con el correr de los meses,\n"+
                    "de carácter quemante y opresivo en la región epigástrica que se irradia hacia hipocondrio izquierdo y espalda y que se alivia con la \n"+
                    "ingesta de alcalinos o antiácidos comerciales.\n" +
                    "Refiere además distensión abdominal del mismo tiempo de evolución.\n" +
                    "Niega fiebre, diarrea, constipación, disfagia, odinofagia, fiebre.\n" +
                    "Como antecedente de jerarquía el paciente refiere ser bebedor de 1 ½ litros de vino tinto por día desde hace más de 30 años.";
         
        edad1=18;
        fecha1 ="Febrero- 17- 2021";
        sexo1 ="Femenino";
        direccion1="Aut. Medellin Km 10";
        motivConsult1="Paciente femenino de 18 años de edad que acude al servicio del hospital Santa Ana por un cuadro caracterizado por un episodio \n"+
                    "de hematemesis de escasa intensidad, dos horas previas a la consulta, refiere almuerzo 3 horas antes y que la misma fue precedida \n"+
                    "de náuseas.\n" +
                    "Tres meses anteriores al vómito sanguinolento el paciente refiere dolor abdominal de intensidad creciente con el correr de los meses,\n"+
                    "de carácter quemante y opresivo en la región epigástrica que se irradia hacia hipocondrio izquierdo y espalda y que se alivia con la \n"+
                    "ingesta de alcalinos o antiácidos comerciales.\n" +
                    "Refiere además distensión abdominal del mismo tiempo de evolución.\n" +
                    "Niega fiebre, diarrea, constipación, disfagia, odinofagia, fiebre.\n" +
                    "Como antecedente de jerarquía el paciente refiere ser bebedor de 1 ½ litros de vino tinto por día desde hace más de 30 años.";
    }
}
