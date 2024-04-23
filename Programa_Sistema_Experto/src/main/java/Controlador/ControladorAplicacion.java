package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Modelo.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class ControladorAplicacion implements ActionListener{
    private Bienvenida VentanaPrincipal;
    private CreditosF CreditosF;
    private Tipo_E Tipos; 
    private Infecciosas Infecciosas;
    private Cardiovasculares Cardiovasculares;
    private Respiratorias respiratorias;
    private Neurologicas neurologicas;
    private Gastrointestinales gastrointestinales;
    private Endocrinas endocrinas;
    private Autoinmunes autoinmunes;
    private Geneticas geneticas;
    private Mentales mentales;
    private Musculoesqueletico musculoesqueletico;
    private Resultado resultado;
    

public ControladorAplicacion(Bienvenida bienvenida){
    this.VentanaPrincipal = bienvenida;
    this.VentanaPrincipal.jButtonCreditos.addActionListener(this);
    this.VentanaPrincipal.jButtonComenzar.addActionListener(this);
}

public ControladorAplicacion(Tipo_E tipos){
    this.Tipos = tipos;
    this.VentanaPrincipal = new Bienvenida();
    this.Tipos.jButtonRegresar.addActionListener(this);
    Tipos.jButtonContinuar.setActionCommand("Continuar1"); 
    Tipos.jButtonContinuar.addActionListener(this);
    this.Tipos.jCheckBox1.addActionListener(this);
    this.Tipos.jCheckBox2.addActionListener(this);
    this.Tipos.jCheckBox3.addActionListener(this);
    this.Tipos.jCheckBox4.addActionListener(this);
    this.Tipos.jCheckBox5.addActionListener(this);
    this.Tipos.jCheckBox6.addActionListener(this);
    this.Tipos.jCheckBox7.addActionListener(this);
    this.Tipos.jCheckBox8.addActionListener(this);
    this.Tipos.jCheckBox9.addActionListener(this);
    this.Tipos.jCheckBox10.addActionListener(this);
}  

public ControladorAplicacion(Infecciosas infecciosas){
    this.Infecciosas = infecciosas;
    this.resultado = new Resultado();
    Infecciosas.jButtonContinuar1.setActionCommand("Continuar2");
    Infecciosas.jButtonContinuar1.addActionListener(this);
    Infecciosas.jCheckBox1.addActionListener(this);
    Infecciosas.jCheckBox2.addActionListener(this);
    Infecciosas.jCheckBox3.addActionListener(this);
    Infecciosas.jCheckBox4.addActionListener(this);
    Infecciosas.jCheckBox5.addActionListener(this);
    Infecciosas.jCheckBox6.addActionListener(this);
    Infecciosas.jCheckBox7.addActionListener(this);
    Infecciosas.jCheckBox8.addActionListener(this);
    Infecciosas.jCheckBox9.addActionListener(this);
    Infecciosas.jCheckBox10.addActionListener(this);
    Infecciosas.jCheckBox11.addActionListener(this);
    Infecciosas.jCheckBox12.addActionListener(this);
    Infecciosas.jCheckBox13.addActionListener(this);
    Infecciosas.jCheckBox14.addActionListener(this);
    Infecciosas.jCheckBox15.addActionListener(this);
    Infecciosas.jCheckBox16.addActionListener(this);
    Infecciosas.jCheckBox17.addActionListener(this);
    Infecciosas.jCheckBox18.addActionListener(this);
    Infecciosas.jCheckBox19.addActionListener(this);
    Infecciosas.jCheckBox20.addActionListener(this);
    Infecciosas.jCheckBox21.addActionListener(this);
    Infecciosas.jCheckBox22.addActionListener(this);
    Infecciosas.jCheckBox23.addActionListener(this);
    Infecciosas.jCheckBox24.addActionListener(this);
    Infecciosas.jCheckBox25.addActionListener(this);
    Infecciosas.jCheckBox26.addActionListener(this);
    Infecciosas.jCheckBox27.addActionListener(this);
    Infecciosas.jCheckBox28.addActionListener(this);
    Infecciosas.jCheckBox29.addActionListener(this);
}

public ControladorAplicacion(Cardiovasculares cardiovasculares){
    this.Cardiovasculares = cardiovasculares;
    this.resultado = new Resultado();
    Cardiovasculares.jButtonContinuar1.setActionCommand("Continuar3");
    Cardiovasculares.jButtonContinuar1.addActionListener(this);
    Cardiovasculares.jCheckBox1.addActionListener(this);
    Cardiovasculares.jCheckBox2.addActionListener(this);
    Cardiovasculares.jCheckBox3.addActionListener(this);
    Cardiovasculares.jCheckBox4.addActionListener(this);
    Cardiovasculares.jCheckBox5.addActionListener(this);
    Cardiovasculares.jCheckBox5.addActionListener(this);
    Cardiovasculares.jCheckBox6.addActionListener(this);
    Cardiovasculares.jCheckBox7.addActionListener(this);
    Cardiovasculares.jCheckBox8.addActionListener(this);
    Cardiovasculares.jCheckBox10.addActionListener(this);
    Cardiovasculares.jCheckBox9.addActionListener(this);
    Cardiovasculares.jCheckBox10.addActionListener(this);
    Cardiovasculares.jCheckBox11.addActionListener(this);
    Cardiovasculares.jCheckBox14.addActionListener(this);
    Cardiovasculares.jCheckBox15.addActionListener(this);
    Cardiovasculares.jCheckBox13.addActionListener(this);
    Cardiovasculares.jCheckBox14.addActionListener(this);
    Cardiovasculares.jCheckBox15.addActionListener(this);
    Cardiovasculares.jCheckBox19.addActionListener(this);
    Cardiovasculares.jCheckBox20.addActionListener(this);
    
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Creditos")) {
            CreditosF newframe = new CreditosF();
            newframe.setVisible(true);
            newframe.setLocation(415, 0);
            newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            System.out.println("Creditos");
            
        }
         if(e.getActionCommand().equals("Comenzar")){           
            Tipo_E newframe = new Tipo_E();
            newframe.setVisible(true);
            VentanaPrincipal.dispose();
        }       
        if(e.getActionCommand().equals("Regresar")){           
            VentanaPrincipal.setVisible(true);
            Tipos.dispose();
            System.out.println("Regresar");
        }         
        
        if(e.getActionCommand().equals("Continuar1")){ 
            Tipos tp = new Tipos();
            boolean opcion1 = Tipos.jCheckBox1.isSelected();
            boolean opcion2 = Tipos.jCheckBox2.isSelected();
            boolean opcion3 = Tipos.jCheckBox3.isSelected();
            boolean opcion4 = Tipos.jCheckBox4.isSelected();
            boolean opcion5 = Tipos.jCheckBox5.isSelected();
            boolean opcion6 = Tipos.jCheckBox6.isSelected();
            boolean opcion7 = Tipos.jCheckBox7.isSelected();
            boolean opcion8 = Tipos.jCheckBox8.isSelected();
            boolean opcion9 = Tipos.jCheckBox9.isSelected();
            boolean opcion10 = Tipos.jCheckBox10.isSelected();
            boolean opcion11 = Tipos.jCheckBox11.isSelected();
            boolean opcion12 = Tipos.jCheckBox12.isSelected();
            boolean opcion13 = Tipos.jCheckBox13.isSelected();
            boolean opcion14 = Tipos.jCheckBox14.isSelected();
            boolean opcion15 = Tipos.jCheckBox15.isSelected();
            boolean opcion16 = Tipos.jCheckBox16.isSelected();
            boolean opcion17 = Tipos.jCheckBox17.isSelected();
            boolean opcion18 = Tipos.jCheckBox18.isSelected();
            boolean opcion19 = Tipos.jCheckBox19.isSelected();
            boolean opcion20 = Tipos.jCheckBox20.isSelected();
           
            String resultado = tp.SeleccionTipos(opcion1, opcion2, opcion3, opcion4, opcion5, opcion6, opcion7, opcion8, opcion9, opcion10, opcion11, opcion12, opcion13, opcion14, opcion15, opcion16, opcion17, opcion18, opcion19, opcion20);
            System.out.println(resultado);
            System.out.println("Continuar");
            
            if(resultado.equals("Enfermedades infecciosas")){
                Infecciosas newFrame = new Infecciosas();
                newFrame.setVisible(true);
                Tipos.dispose();
            }else if (resultado.equals("Enfermedades cardiovasculares")){
                Cardiovasculares newFrame = new Cardiovasculares();
                newFrame.setVisible(true);
                Tipos.dispose();
            }else if (resultado.equals("Enfermedades respiratorias")){
                Respiratorias newFrame = new Respiratorias();
                newFrame.setVisible(true);
                Tipos.dispose();
            }else if (resultado.equals("Enfermedades neurológicas")){
                Neurologicas newFrame = new Neurologicas();
                newFrame.setVisible(true);
                Tipos.dispose();
            }else if (resultado.equals("Enfermedades gastrointestinales")){
                Gastrointestinales newFrame = new Gastrointestinales();
                newFrame.setVisible(true);
                Tipos.dispose();
            }else if (resultado.equals("Enfermedades endocrinas")){
                Endocrinas newFrame = new Endocrinas();
                newFrame.setVisible(true);
                Tipos.dispose();
            }else if (resultado.equals("Enfermedades autoinmunes")){
                Autoinmunes newFrame = new Autoinmunes();
                newFrame.setVisible(true);
                Tipos.dispose();
            }else if (resultado.equals("Enfermedades genéticas")){
                Geneticas newFrame = new Geneticas();
                newFrame.setVisible(true);
                Tipos.dispose();
            }else if (resultado.equals("Enfermedades mentales")){
                Mentales newFrame = new Mentales();
                newFrame.setVisible(true);
                Tipos.dispose();
            }else if (resultado.equals("Enfermedades del sistema musculoesquelético")){
                Musculoesqueletico newFrame = new Musculoesqueletico();
                newFrame.setVisible(true);
                Tipos.dispose();
            }
        }
        if (e.getActionCommand().equals("Continuar2")) {
            Infecciosas.jButtonContinuar1.setEnabled(false);
            Infecciosas_M inf = new Infecciosas_M();
            Resultado r = new Resultado();
            boolean opcion1 = Infecciosas.jCheckBox1.isSelected();
            boolean opcion2 = Infecciosas.jCheckBox2.isSelected();
            boolean opcion3 = Infecciosas.jCheckBox3.isSelected();
            boolean opcion4 = Infecciosas.jCheckBox4.isSelected();
            boolean opcion5 = Infecciosas.jCheckBox5.isSelected();
            boolean opcion6 = Infecciosas.jCheckBox6.isSelected();
            boolean opcion7 = Infecciosas.jCheckBox7.isSelected();
            boolean opcion8 = Infecciosas.jCheckBox8.isSelected();
            boolean opcion9 = Infecciosas.jCheckBox9.isSelected();
            boolean opcion10 = Infecciosas.jCheckBox10.isSelected();
            boolean opcion11 = Infecciosas.jCheckBox11.isSelected();
            boolean opcion12 = Infecciosas.jCheckBox12.isSelected();
            boolean opcion13 = Infecciosas.jCheckBox13.isSelected();
            boolean opcion14 = Infecciosas.jCheckBox14.isSelected();
            boolean opcion15 = Infecciosas.jCheckBox15.isSelected();
            boolean opcion16 = Infecciosas.jCheckBox16.isSelected();
            boolean opcion17 = Infecciosas.jCheckBox17.isSelected();
            boolean opcion18 = Infecciosas.jCheckBox18.isSelected();
            boolean opcion19 = Infecciosas.jCheckBox19.isSelected();
            boolean opcion20 = Infecciosas.jCheckBox20.isSelected();
            boolean opcion21 = Infecciosas.jCheckBox21.isSelected();
            boolean opcion22 = Infecciosas.jCheckBox22.isSelected();
            boolean opcion23 = Infecciosas.jCheckBox23.isSelected();
            boolean opcion24 = Infecciosas.jCheckBox24.isSelected();
            boolean opcion25 = Infecciosas.jCheckBox25.isSelected();
            boolean opcion26 = Infecciosas.jCheckBox26.isSelected();
            boolean opcion27 = Infecciosas.jCheckBox27.isSelected();
            boolean opcion28 = Infecciosas.jCheckBox28.isSelected();
            boolean opcion29 = Infecciosas.jCheckBox29.isSelected();
            
            String resultado = inf.SeleccionInfecciosa(opcion1, opcion2, opcion3, opcion4, opcion5, opcion6, opcion7, opcion8, opcion9, opcion10, opcion11, opcion12, opcion13, opcion14, opcion15, opcion16, opcion17, opcion18, opcion19, opcion20, opcion21, opcion22, opcion23, opcion24, opcion25, opcion26, opcion27, opcion28, opcion29);
            System.out.println(resultado);
            
            if(resultado.equals("Gripe")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Gripe");
                newframe.jLabel6.setText("- Descansar mucho");
                newframe.jLabel7.setText("- Beber muchos líquidos");
                newframe.jLabel8.setText("- Tomar medicamentos de venta libre");
                newframe.jLabel9.setText("- Usar un humidificador");
                newframe.jLabel10.setText("- Realizar inhalaciones con eucalipto");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }else if(resultado.equals("Resfriado común")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Resfriado común");
                newframe.jLabel6.setText("- Descansar lo necesario para recuperarse");
                newframe.jLabel7.setText("- Consumir líquidos calientes como té o caldo");
                newframe.jLabel8.setText("- Evitar fumar y exposición al humo");
                newframe.jLabel9.setText("- Realizar lavados nasales con solución salina");
                newframe.jLabel10.setText("- Mantenerse abrigado y evitar cambios bruscos de temperatura");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
            }else if(resultado.equals("Tuberculosis")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Tuberculosis");
                newframe.jLabel6.setText("- Tomar la medicación recetada por el médico");
                newframe.jLabel7.setText("- Aislarse de otras personas");
                newframe.jLabel8.setText("- Seguir una dieta rica en proteínas y vitaminas");
                newframe.jLabel9.setText("- Mantener una buena ventilación en el hogar");
                newframe.jLabel10.setText("- Acudir a citas médicas regularmente");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
            }else if(resultado.equals("VIH/SIDA")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("VIH/SIDA");
                newframe.jLabel6.setText("- Tomar la medicación antirretroviral según prescripción médica");
                newframe.jLabel7.setText("- Mantener una alimentación balanceada y nutritiva");
                newframe.jLabel8.setText("- Evitar el consumo de alcohol y drogas");
                newframe.jLabel9.setText("- Realizar pruebas regulares para monitorear el estado de salud");
                newframe.jLabel10.setText("- Practicar sexo seguro y utilizar preservativos");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
            }else if(resultado.equals("Malaria")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Malaria");
                newframe.jLabel6.setText("- Tomar medicamentos antimaláricos según indicaciones médicas");
                newframe.jLabel7.setText("- Usar ropa que cubra la mayor parte del cuerpo");
                newframe.jLabel8.setText("- Dormir bajo mosquiteros tratados con insecticida");
                newframe.jLabel9.setText("- Aplicar repelente de insectos en la piel expuesta");
                newframe.jLabel10.setText("- Buscar atención médica inmediata en caso de fiebre alta");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
            }else if(resultado.equals("Hepatitis")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Hepatitis");
                newframe.jLabel6.setText("- Descansar lo suficiente");
                newframe.jLabel7.setText("- Evitar el consumo de alcohol");
                newframe.jLabel8.setText("- Seguir una dieta saludable y baja en grasas");
                newframe.jLabel9.setText("- Evitar medicamentos que puedan dañar el hígado");
                newframe.jLabel10.setText("- Vacunarse contra la hepatitis A y B");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Dengue")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Dengue");
                newframe.jLabel6.setText("- Descansar en cama");
                newframe.jLabel7.setText("- Beber líquidos para mantenerse hidratado");
                newframe.jLabel8.setText("- Evitar medicamentos que contengan ácido acetilsalicílico");
                newframe.jLabel9.setText("- Usar repelente de mosquitos");
                newframe.jLabel10.setText("- Eliminar criaderos de mosquitos en casa");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Sarampión")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Sarampión");
                newframe.jLabel6.setText("- Aislarse en casa durante la fase contagiosa");
                newframe.jLabel7.setText("- Mantenerse bien hidratado");
                newframe.jLabel8.setText("- Administrar medicamentos para reducir la fiebre");
                newframe.jLabel9.setText("- Consultar con un médico para el tratamiento");
                newframe.jLabel10.setText("- Vacunarse para prevenir futuros brotes");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Varicela")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Varicela");
                newframe.jLabel6.setText("- Mantenerse en reposo en casa");
                newframe.jLabel7.setText("- Mantener las uñas cortas para evitar rascarse");
                newframe.jLabel8.setText("- Tomar baños de avena para aliviar la picazón");
                newframe.jLabel9.setText("- Usar lociones calmantes para la piel");
                newframe.jLabel10.setText("- Evitar el contacto cercano con personas embarazadas o con sistemas inmunológicos debilitados");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Neumonía")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Neumonía");
                newframe.jLabel6.setText("- Descansar en cama y evitar esfuerzos físicos");
                newframe.jLabel7.setText("- Tomar los antibióticos según lo recetado por el médico");
                newframe.jLabel8.setText("- Mantenerse bien hidratado");
                newframe.jLabel9.setText("- Utilizar un humidificador para ayudar a respirar mejor");
                newframe.jLabel10.setText("- Seguir una dieta saludable rica en nutrientes");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
            }else if(resultado.equals("Fiebre tifoidea")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Fiebre tifoidea");
                newframe.jLabel6.setText("- Tomar los antibióticos recetados por el médico");
                newframe.jLabel7.setText("- Descansar lo suficiente");
                newframe.jLabel8.setText("- Mantenerse bien hidratado");
                newframe.jLabel9.setText("- Seguir una dieta suave y fácil de digerir");
                newframe.jLabel10.setText("- Evitar alimentos que puedan agravar los síntomas");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Estafilococos")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Estafilococos");
                newframe.jLabel6.setText("- Mantener limpia y seca el área afectada");
                newframe.jLabel7.setText("- Aplicar una compresa caliente para reducir el dolor");
                newframe.jLabel8.setText("- Seguir las indicaciones del médico para el tratamiento");
                newframe.jLabel9.setText("- Evitar reventar las lesiones para prevenir la propagación");
                newframe.jLabel10.setText("- Usar antibióticos según lo recetado");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Estreptococos")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Estreptococos");
                newframe.jLabel6.setText("- Tomar los antibióticos prescritos por el médico");
                newframe.jLabel7.setText("- Descansar lo necesario");
                newframe.jLabel8.setText("- Beber líquidos calientes para aliviar el dolor de garganta");
                newframe.jLabel9.setText("- Evitar el contacto cercano con personas enfermas");
                newframe.jLabel10.setText("- Lavarse las manos con frecuencia");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Sífilis")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Sífilis");
                newframe.jLabel6.setText("- Tomar la medicación prescrita por el médico");
                newframe.jLabel7.setText("- Abstenerse de tener relaciones sexuales hasta que se cure");
                newframe.jLabel8.setText("- Notificar a las parejas sexuales para que se hagan la prueba y reciban tratamiento si es necesario");
                newframe.jLabel9.setText("- Realizarse pruebas regulares para detectar y tratar la enfermedad");
                newframe.jLabel10.setText("- Evitar compartir objetos personales que puedan transmitir la infección");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Micosis")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Micosis");
                newframe.jLabel6.setText("- Mantener la piel limpia y seca");
                newframe.jLabel7.setText("- Evitar el contacto con áreas infectadas por hongos");
                newframe.jLabel8.setText("- Usar ropa limpia y transpirable");
                newframe.jLabel9.setText("- Aplicar cremas o lociones antifúngicas según lo recomendado");
                newframe.jLabel10.setText("- Mantener las uñas cortas y limpias");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Protozoos")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Protozoos");
                newframe.jLabel6.setText("- Tomar medicamentos antiparasitarios según lo recetado");
                newframe.jLabel7.setText("- Mantener una buena higiene personal");
                newframe.jLabel8.setText("- Evitar beber agua no tratada o de origen desconocido");
                newframe.jLabel9.setText("- Consumir alimentos bien cocidos y lavados");
                newframe.jLabel10.setText("- Usar repelente de insectos para prevenir picaduras");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Helmintos")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Helmintos");
                newframe.jLabel6.setText("- Tomar medicamentos antiparasitarios según lo recetado");
                newframe.jLabel7.setText("- Evitar el contacto con heces humanas o animales");
                newframe.jLabel8.setText("- Consumir alimentos bien cocidos y lavados");
                newframe.jLabel9.setText("- Mantener una buena higiene personal y del hogar");
                newframe.jLabel10.setText("- Realizar pruebas de diagnóstico regulares");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Rickettsias")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Rickettsias");
                newframe.jLabel6.setText("- Tomar los antibióticos prescritos por el médico");
                newframe.jLabel7.setText("- Evitar el contacto con garrapatas y otros insectos vectores");
                newframe.jLabel8.setText("- Usar ropa protectora al trabajar o realizar actividades al aire libre");
                newframe.jLabel9.setText("- Mantener el entorno limpio y libre de roedores");
                newframe.jLabel10.setText("- Realizar una evaluación médica regularmente");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Lyme")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Lyme");
                newframe.jLabel6.setText("- Tomar los antibióticos prescritos por el médico");
                newframe.jLabel7.setText("- Retirar la garrapata correctamente si se encuentra adherida a la piel");
                newframe.jLabel8.setText("- Mantener el área de la picadura limpia y seca");
                newframe.jLabel9.setText("- Monitorear cualquier cambio en la piel o síntomas");
                newframe.jLabel10.setText("- Consultar a un médico si aparecen síntomas persistentes");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }else if(resultado.equals("Ebola")){
                Resultado newframe = new Resultado();
                newframe.jLabel4.setText("Ebola");
                newframe.jLabel6.setText("- Aislarse en una unidad médica designada");
                newframe.jLabel7.setText("- Recibir tratamiento de apoyo para controlar los síntomas");
                newframe.jLabel8.setText("- Evitar el contacto con fluidos corporales de personas infectadas");
                newframe.jLabel9.setText("- Seguir estrictas medidas de control de infecciones");
                newframe.jLabel10.setText("- Realizar pruebas de laboratorio para confirmar la infección");
                newframe.setVisible(true); 
                newframe.setLocation(840, 0);
                newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            }

            Infecciosas.jButtonContinuar1.setEnabled(true);
        }        
        if (e.getActionCommand().equals("Continuar3")) {
            System.out.println("Si funciona el botón");
            Cardiovasculares_M car = new Cardiovasculares_M();
            Resultado r = new Resultado();
            boolean opcion1 = Cardiovasculares.jCheckBox1.isSelected();
            boolean opcion2 = Cardiovasculares.jCheckBox2.isSelected();
            boolean opcion3 = Cardiovasculares.jCheckBox3.isSelected();
            boolean opcion4 = Cardiovasculares.jCheckBox4.isSelected();
            boolean opcion5 = Cardiovasculares.jCheckBox5.isSelected();
            boolean opcion6 = Cardiovasculares.jCheckBox6.isSelected();
            boolean opcion7 = Cardiovasculares.jCheckBox7.isSelected();
            boolean opcion8 = Cardiovasculares.jCheckBox8.isSelected();
            boolean opcion9 = Cardiovasculares.jCheckBox9.isSelected();
            boolean opcion10 = Cardiovasculares.jCheckBox10.isSelected();
            boolean opcion11 = Cardiovasculares.jCheckBox11.isSelected();
            boolean opcion12 = Cardiovasculares.jCheckBox12.isSelected();
            boolean opcion13 = Cardiovasculares.jCheckBox13.isSelected();
            boolean opcion14 = Cardiovasculares.jCheckBox14.isSelected();
            boolean opcion15 = Cardiovasculares.jCheckBox15.isSelected();
            boolean opcion16 = Cardiovasculares.jCheckBox16.isSelected();
            boolean opcion17 = Cardiovasculares.jCheckBox17.isSelected();
            boolean opcion18 = Cardiovasculares.jCheckBox18.isSelected();
            boolean opcion19 = Cardiovasculares.jCheckBox19.isSelected();
            boolean opcion20 = Cardiovasculares.jCheckBox20.isSelected();

            
            String resultado = car.SeleccionInfecciosa(opcion1, opcion2, opcion3, opcion4, opcion5, opcion6, opcion7, opcion8, opcion9, opcion10, opcion11, opcion12, opcion13, opcion14, opcion15, opcion16, opcion17, opcion18, opcion19, opcion20);
            System.out.println(resultado);
            
            switch (resultado) {
                case "Coronarias":
                    Resultado newframe1 = new Resultado();
                    newframe1.jLabel4.setText("Enfermedad coronaria");
                    newframe1.jLabel6.setText("- Hacer ejercicio regularmente");
                    newframe1.jLabel7.setText("- Seguir una dieta baja en grasas");
                    newframe1.jLabel8.setText("- Controlar el estrés");
                    newframe1.jLabel9.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe1.jLabel10.setText("- Programar revisiones médicas periódicas");
                    newframe1.setVisible(true);
                    newframe1.setLocation(840, 0);
                    newframe1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Miocardio":
                    Resultado newframe2 = new Resultado();
                    newframe2.jLabel4.setText("Infarto de miocardio");
                    newframe2.jLabel6.setText("- Reposo absoluto");
                    newframe2.jLabel7.setText("- Seguir una dieta baja en sodio");
                    newframe2.jLabel8.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe2.jLabel9.setText("- Evitar situaciones estresantes");
                    newframe2.jLabel10.setText("- Seguir el plan de rehabilitación cardíaca");
                    newframe2.setVisible(true);
                    newframe2.setLocation(840, 0);
                    newframe2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Arteriales":
                    Resultado newframe3 = new Resultado();
                    newframe3.jLabel4.setText("Enfermedad arterial");
                    newframe3.jLabel6.setText("- Dejar de fumar");
                    newframe3.jLabel7.setText("- Seguir una dieta baja en sodio y grasas saturadas");
                    newframe3.jLabel8.setText("- Hacer ejercicio aeróbico regularmente");
                    newframe3.jLabel9.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe3.jLabel10.setText("- Controlar la presión arterial regularmente");
                    newframe3.setVisible(true);
                    newframe3.setLocation(840, 0);
                    newframe3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Cardíacas":
                    Resultado newframe4 = new Resultado();
                    newframe4.jLabel4.setText("Enfermedad cardíaca");
                    newframe4.jLabel6.setText("- Seguir una dieta baja en sodio");
                    newframe4.jLabel7.setText("- Hacer ejercicio bajo supervisión médica");
                    newframe4.jLabel8.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe4.jLabel9.setText("- Evitar el estrés");
                    newframe4.jLabel10.setText("- Realizar ejercicios de relajación");
                    newframe4.setVisible(true);
                    newframe4.setLocation(840, 0);
                    newframe4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Arritmia":
                    Resultado newframe5 = new Resultado();
                    newframe5.jLabel4.setText("Arritmia cardíaca");
                    newframe5.jLabel6.setText("- Evitar el consumo de cafeína y alcohol");
                    newframe5.jLabel7.setText("- Seguir una dieta equilibrada");
                    newframe5.jLabel8.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe5.jLabel9.setText("- Mantener un horario regular de sueño");
                    newframe5.jLabel10.setText("- Realizar ejercicios de relajación");
                    newframe5.setVisible(true);
                    newframe5.setLocation(840, 0);
                    newframe5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Endocarditis":
                    Resultado newframe6 = new Resultado();
                    newframe6.jLabel4.setText("Endocarditis");
                    newframe6.jLabel6.setText("- Seguir el plan de tratamiento recetado por el médico");
                    newframe6.jLabel7.setText("- Mantener una buena higiene dental");
                    newframe6.jLabel8.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe6.jLabel9.setText("- Evitar infecciones");
                    newframe6.jLabel10.setText("- Programar revisiones médicas regulares");
                    newframe6.setVisible(true);
                    newframe6.setLocation(840, 0);
                    newframe6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Cardiomiopatía":
                    Resultado newframe7 = new Resultado();
                    newframe7.jLabel4.setText("Cardiomiopatía");
                    newframe7.jLabel6.setText("- Evitar el alcohol y el tabaco");
                    newframe7.jLabel7.setText("- Seguir una dieta baja en sodio");
                    newframe7.jLabel8.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe7.jLabel9.setText("- Realizar actividad física bajo supervisión médica");
                    newframe7.jLabel10.setText("- Controlar la presión arterial regularmente");
                    newframe7.setVisible(true);
                    newframe7.setLocation(840, 0);
                    newframe7.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Aneurisma aórtico":
                    Resultado newframe8 = new Resultado();
                    newframe8.jLabel4.setText("Aneurisma aórtico");
                    newframe8.jLabel6.setText("- Mantener la presión arterial bajo control");
                    newframe8.jLabel7.setText("- Seguir una dieta baja en grasas y sodio");
                    newframe8.jLabel8.setText("- Evitar el estrés");
                    newframe8.jLabel9.setText("- No fumar");
                    newframe8.jLabel10.setText("- Realizar ejercicios de relajación");
                    newframe8.setVisible(true);
                    newframe8.setLocation(840, 0);
                    newframe8.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Embolia Pulmonar":
                    Resultado newframe9 = new Resultado();
                    newframe9.jLabel4.setText("Embolia pulmonar");
                    newframe9.jLabel6.setText("- Reposo absoluto");
                    newframe9.jLabel7.setText("- Seguir el tratamiento anticoagulante recetado por el médico");
                    newframe9.jLabel8.setText("- Elevar las piernas para mejorar la circulación");
                    newframe9.jLabel9.setText("- No fumar");
                    newframe9.jLabel10.setText("- Programar revisiones médicas regulares");
                    newframe9.setVisible(true);
                    newframe9.setLocation(840, 0);
                    newframe9.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Trombosis venosa profunda":
                    Resultado newframe10 = new Resultado();
                    newframe10.jLabel4.setText("Trombosis venosa profunda");
                    newframe10.jLabel6.setText("- Reposo absoluto");
                    newframe10.jLabel7.setText("- Seguir el tratamiento anticoagulante recetado por el médico");
                    newframe10.jLabel8.setText("- Elevar las piernas para mejorar la circulación");
                    newframe10.jLabel9.setText("- No fumar");
                    newframe10.jLabel10.setText("- Programar revisiones médicas regulares");
                    newframe10.setVisible(true);
                    newframe10.setLocation(840, 0);
                    newframe10.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Angina de pecho":
                    Resultado newframe11 = new Resultado();
                    newframe11.jLabel4.setText("Angina de pecho");
                    newframe11.jLabel6.setText("- Reposo relativo");
                    newframe11.jLabel7.setText("- Tomar nitroglicerina según las indicaciones del médico");
                    newframe11.jLabel8.setText("- Evitar el estrés");
                    newframe11.jLabel9.setText("- Seguir una dieta baja en grasas y sodio");
                    newframe11.jLabel10.setText("- Realizar actividad física bajo supervisión médica");
                    newframe11.setVisible(true);
                    newframe11.setLocation(840, 0);
                    newframe11.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Insuficiencia venosa":
                    Resultado newframe12 = new Resultado();
                    newframe12.jLabel4.setText("Insuficiencia venosa");
                    newframe12.jLabel6.setText("- Elevar las piernas para mejorar la circulación");
                    newframe12.jLabel7.setText("- Usar medias de compresión");
                    newframe12.jLabel8.setText("- Realizar ejercicio físico regularmente");
                    newframe12.jLabel9.setText("- Mantener un peso saludable");
                    newframe12.jLabel10.setText("- Evitar estar de pie o sentado durante largos períodos de tiempo");
                    newframe12.setVisible(true);
                    newframe12.setLocation(840, 0);
                    newframe12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Arteriosclerosis":
                    Resultado newframe13 = new Resultado();
                    newframe13.jLabel4.setText("Arteriosclerosis");
                    newframe13.jLabel6.setText("- Seguir una dieta baja en grasas saturadas");
                    newframe13.jLabel7.setText("- Hacer ejercicio aeróbico regularmente");
                    newframe13.jLabel8.setText("- No fumar");
                    newframe13.jLabel9.setText("- Controlar la presión arterial regularmente");
                    newframe13.jLabel10.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe13.setVisible(true);
                    newframe13.setLocation(840, 0);
                    newframe13.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Síndrome de Kawasaki":
                    Resultado newframe14 = new Resultado();
                    newframe14.jLabel4.setText("Síndrome de Kawasaki");
                    newframe14.jLabel6.setText("- Tratamiento con inmunoglobulina intravenosa");
                    newframe14.jLabel7.setText("- Seguir el tratamiento recetado por el médico");
                    newframe14.jLabel8.setText("- Controlar la fiebre");
                    newframe14.jLabel9.setText("- Programar revisiones médicas regulares");
                    newframe14.jLabel10.setText("- Mantener un registro de los síntomas");
                    newframe14.setVisible(true);
                    newframe14.setLocation(840, 0);
                    newframe14.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Miocardiopatía hipertrófica":
                    Resultado newframe15 = new Resultado();
                    newframe15.jLabel4.setText("Miocardiopatía hipertrófica");
                    newframe15.jLabel6.setText("- Reposo relativo");
                    newframe15.jLabel7.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe15.jLabel8.setText("- Evitar el ejercicio extenuante");
                    newframe15.jLabel9.setText("- Controlar la presión arterial regularmente");
                    newframe15.jLabel10.setText("- Seguir una dieta baja en sodio");
                    newframe15.setVisible(true);
                    newframe15.setLocation(840, 0);
                    newframe15.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Síndrome de Marfan":
                    Resultado newframe16 = new Resultado();
                    newframe16.jLabel4.setText("Síndrome de Marfan");
                    newframe16.jLabel6.setText("- Seguir el tratamiento recetado por el médico");
                    newframe16.jLabel7.setText("- Evitar el ejercicio extenuante");
                    newframe16.jLabel8.setText("- Controlar la presión arterial regularmente");
                    newframe16.jLabel9.setText("- Programar revisiones médicas regulares");
                    newframe16.jLabel10.setText("- Realizar ejercicios de estiramiento");
                    newframe16.setVisible(true);
                    newframe16.setLocation(840, 0);
                    newframe16.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Dislipidemia":
                    Resultado newframe17 = new Resultado();
                    newframe17.jLabel4.setText("Dislipidemia");
                    newframe17.jLabel6.setText("- Seguir una dieta baja en grasas saturadas");
                    newframe17.jLabel7.setText("- Hacer ejercicio aeróbico regularmente");
                    newframe17.jLabel8.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe17.jLabel9.setText("- Controlar el peso corporal");
                    newframe17.jLabel10.setText("- Realizar análisis de sangre periódicos");
                    newframe17.setVisible(true);
                    newframe17.setLocation(840, 0);
                    newframe17.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Enfermedad de Chagas":
                    Resultado newframe18 = new Resultado();
                    newframe18.jLabel4.setText("Enfermedad de Chagas");
                    newframe18.jLabel6.setText("- Evitar el contacto con heces de insectos triatominos");
                    newframe18.jLabel7.setText("- Seguir el tratamiento recetado por el médico");
                    newframe18.jLabel8.setText("- Mantener una buena higiene");
                    newframe18.jLabel9.setText("- Programar revisiones médicas regulares");
                    newframe18.jLabel10.setText("- Informar a los médicos sobre la enfermedad antes de cualquier procedimiento médico");
                    newframe18.setVisible(true);
                    newframe18.setLocation(840, 0);
                    newframe18.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Cardiopatía congénita":
                    Resultado newframe19 = new Resultado();
                    newframe19.jLabel4.setText("Cardiopatía congénita");
                    newframe19.jLabel6.setText("- Seguir el plan de tratamiento recetado por el médico");
                    newframe19.jLabel7.setText("- Realizar ejercicios de rehabilitación cardíaca");
                    newframe19.jLabel8.setText("- Tomar medicamentos recetados según las indicaciones del médico");
                    newframe19.jLabel9.setText("- Programar revisiones médicas regulares");
                    newframe19.jLabel10.setText("- Evitar infecciones");
                    newframe19.setVisible(true);
                    newframe19.setLocation(840, 0);
                    newframe19.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                case "Pericarditis":
                    Resultado newframe20 = new Resultado();
                    newframe20.jLabel4.setText("Pericarditis");
                    newframe20.jLabel6.setText("- Reposo absoluto");
                    newframe20.jLabel7.setText("- Tomar medicamentos antiinflamatorios recetados según las indicaciones del médico");
                    newframe20.jLabel8.setText("- Evitar actividades que empeoren el dolor");
                    newframe20.jLabel9.setText("- Realizar seguimiento médico regularmente");
                    newframe20.jLabel10.setText("- Seguir una dieta baja en sodio");
                    newframe20.setVisible(true);
                    newframe20.setLocation(840, 0);
                    newframe20.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    break;
                default:
                    break;
            }

        }        
    }
    
}
