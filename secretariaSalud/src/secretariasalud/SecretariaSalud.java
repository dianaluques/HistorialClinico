/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretariasalud;

import javax.swing.JOptionPane;

/**
 *
 * @author Nestor Luque
 */
public class SecretariaSalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hija h = new Hija();
        h.mostrar();
        
       
        JOptionPane.showMessageDialog(null ,"Fecha:  " + h.fecha+"\n"+"\n"+"nombre del paciente: " +h.nomPacient+"           Apellido del Paciente : " + h.apelliPaciente +"\n"+"Sexo: " +h.sexo+"         Edad:"+h.edad+"\n"+"ID: "+h.codigPaciente+"             Direccion: " + h.direccion+"\n"+"Nombre del Medico :  "+ h.nomMedico +"             Apellido del Medico:  " +h.apelliMedico+"\n"+"ID: "+h.codigMedico+"\n"+"\n"+"Nombre del centro medico : " + h.centroMedico +"\n"+"Motivo de consulta:  "+ h.motivConsult , "HISTORIAL MEDICO PACIENTE 1 ",JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showMessageDialog(null ,"Fecha:  " + h.fecha1+"\n"+"\n"+"nombre del paciente: " +h.nomPacient1+"           Apellido del Paciente : " + h.apelliPaciente1 +"\n"+"Sexo: " +h.sexo1+"         Edad:"+h.edad+"\n"+"ID: "+h.codigPaciente1+"             Direccion: " + h.direccion1+"\n"+"Nombre del Medico :  "+ h.nomMedico1 +"             Apellido del Medico:  " +h.apelliMedico1+"\n"+"ID: "+h.codigMedico1+"\n"+"\n"+"Nombre del centro medico : " + h.centroMedico1 +"\n"+"Motivo de consulta:  "+ h.motivConsult1 , "HISTORIAL MEDICO PACIENTE 2",JOptionPane.INFORMATION_MESSAGE );
    }
    
}
