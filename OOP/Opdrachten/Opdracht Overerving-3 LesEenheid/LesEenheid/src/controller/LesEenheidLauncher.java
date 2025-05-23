/**
 * Klasse Vak representeert een vak binnen een studieprogramma.
 * Het bevat informatie over naam, studiejaar, ECTS en het cijfer.
 * Deze klasse bepaalt ook of het vak is afgerond.
 *
 * Auteur: burhan
 * Doel: Model voor vakken met cijfers en afrondingsstatus
 */

package controller;


import model.LesEenheid;
import model.ProfessionalSkills;
import model.Project;
import model.Vak;

public class LesEenheidLauncher {
    public static void main(String[] args) {

        LesEenheid lesEenheid = new LesEenheid("Algemeen", 3 , 2);
        System.out.println(lesEenheid);

        Vak vak = new Vak(7.8, "OOP1", 3 , 1);
        System.out.println(vak);


        ProfessionalSkills skill = new ProfessionalSkills(false, "Personal Skills", 2 , 1);
        System.out.println(skill);
        skill.setGehaald(true);
        System.out.println(skill);


        Project project = new Project(7.4, 6.8, 8.0,
                "Fasten Your Seatbelts", 12 , 1);
        System.out.println(project);
        System.out.println();
        System.out.println();


        Vak nogEenVak = new Vak("Databases", 3, 1);
        System.out.println(nogEenVak.toString() + ", afgerond: " +
                nogEenVak.isAfgerond());

        nogEenVak.setCijfer(5.499999);
        System.out.println(nogEenVak.toString() + ", afgerond: " +
                nogEenVak.isAfgerond());
        nogEenVak.setCijfer(5.5);
        System.out.println(nogEenVak.toString() + ", afgerond: " +
                nogEenVak.isAfgerond());

        ProfessionalSkills nogEenSkill = new ProfessionalSkills("ICT Ethics", 2, 2 );
        System.out.println(nogEenSkill.toString() + ", afgerond: " +
                nogEenSkill.isAfgerond());
        nogEenSkill.setGehaald(true);
        System.out.println(nogEenSkill.toString() + ", afgerond: " +
                nogEenSkill.isAfgerond());

        Project nogEenProject = new Project("Agile Development", 12, 1);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setTechniekCijfer(5.499999);
        nogEenProject.setProcesCijfer(5.5);
        nogEenProject.setProductCijfer(5.5);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setTechniekCijfer(5.5);
        nogEenProject.setProcesCijfer(5.4999999);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setProcesCijfer(10);
        nogEenProject.setProductCijfer(5.499999);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setProductCijfer(10);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());
        nogEenProject.setTechniekCijfer(10);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());

    }
}
